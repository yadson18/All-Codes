#!/bin/bash
# yadson20@hotmail.com
#

srcToDir=$(pwd);

clear

Menu(){
   echo -e "\n********     Menu System      ********";
   echo "** (1) Regras Iptables              **";
   echo "** (2) Update and Upgrade System    **";
   echo "** (3) Install PHP from source code **";
   echo "** (0) Exit                         **";
   echo "**************************************";
   echo "***    Choose one alternative       **";
   read option;

   case $option in
     1) MenuIpTables ;;
     2) UpdateSystem ;;
     3) InstallPhp ;;
     0) echo -e "\nBye!\n"; exit;;
   esac 
}

#----------------------------------
# Códigos de automação do IPTABLES.
#----------------------------------

MenuIpTables(){
   echo -e "\n******* IpTables configs *******";
   echo "** (1) Start                  **";
   echo "** (2) Stop                   **";
   echo "** (3) Restart                **";
   echo "** (0) Exit                   **";
   echo "********************************";
   echo "*** Choose one alternative    **";
   read option;

   case $option in
     1) Start ;;
     2) Stop ;;
     3) Restart ;;
     0) Menu ;;
   esac
}
Start(){
   echo -e "\nArquivos:";
   cd /etc/iptablesFiles
   ls

   echo -e "\nDigite o nome do arquivo de configuracao:";
   read file;
   iptables-restore '/etc/iptablesFiles/'$file 2> /dev/null;

   if [ $? -eq 1 ];
   then
      echo -e "\nO arquivo nao existe ou foi digitado incorretamente.\n"
   else
      echo -e "\nO arquivo "$file" foi carregado com sucesso.\n"
      echo -e "\nRegras atuais.\n";
      iptables -nvL --line-numbers
   fi 
   Menu
}
Stop(){
   /etc/iptablesFiles/.stop/stop-regras-iptables;
   echo -e "\nAs regras do iptables foram reiniciadas (ALL ACCEPT).\n";
   Menu
}
Restart(){
   # Stop function.
   /etc/iptablesFiles/.stop/stop-regras-iptables;
   echo -e "\nAs regras do iptables foram reiniciadas (ALL ACCEPT).\n";

   # Start function.
   echo -e "\nArquivos:";
   cd /etc/iptablesFiles
   ls

   echo -e "\nDigite o nome do arquivo de configuracao:";
   read file;
   iptables-restore '/etc/iptablesFiles/'$file 2> /dev/null;

   if [ $? -eq 1 ];
   then
      echo -e "\nO arquivo nao existe ou foi digitado incorretamente.\n"
   else
      echo -e "\nO arquivo "$file" foi carregado com sucesso.\n"
      echo -e "\nRegras atuais.\n";
      iptables -nvL --line-numbers
   fi
   Menu
}

#-----------------------------
# Fim dos códigos do IPTABLES.
#-----------------------------

#------------------------------------------------
# Codigos de automaçao da atualização do sistema.
#------------------------------------------------

UpdateSystem(){
   touch $srcToDir/log/update_log/update\_`date +%d-%m-%Y`.log

   cp /usr/share/doc/apt/examples/sources.list /etc/apt

   if [ $? -eq 0 ]
     echo -e "\nAguarde um momento..."
   then
     echo -e "\nO arquivo sources.list foi copiado para /etc/apt...\n" >> $srcToDir/log/update_log/update\_`date +%d-%m-%Y`.log
     apt-get update >> $srcToDir/log/update_log/update\_`date +%d-%m-%Y`.log
     apt-get upgrade -y >> $srcToDir/log/update_log/update\_`date +%d-%m-%Y`.log
     apt-get dist-upgrade -y >> $srcToDir/log/update_log/update\_`date +%d-%m-%Y`.log
   else
     echo -e "\nO arquivo sources.list não pode ser copiado...\n" >> $srcToDir/log/update_log/update\_`date +%d-%m-%Y`.log
   fi
   Menu
}

#-------------------------------------------
# Fim dos códigos da atualização do sistema.
#-------------------------------------------

#------------------------------------------------------------------
# Código de automação da instalação do PHP apartir do código-fonte.
#------------------------------------------------------------------

InstallPhp(){
   php -v 2> /dev/null;
   if [ $? -eq 0 ]
   then 
      php -v
      echo -e "\nO PHP já encontra-se instalado, deseja realmente continuar? (y/n)";
      read confirm;
      case $confirm in
         n) Menu ;;
	 N) Menu ;;
	 y) StartInstall ;;
	 Y) StartInstall ;;
      esac
   else
      StartInstall;
   fi
   Menu
}

StartInstall(){
   echo -e "\nDigite a URL do repositório onde encontra-se o código fonte.";
   read url;

   touch $srcToDir/log/install_php_log/log_install\_`date +%d-%m-%Y`.log
   srcToLog=$srcToDir/log/install_php_log/log_install\_`date +%d-%m-%Y`.log;

   mkdir php-source-code;
   cd php-source-code;

   wget $url;
   fileName=$(ls);
   newName="source-code";
   mv $fileName $newName;
   tar -jxpf $newName;
   rm $newName;
   fileName=$(ls);
   cd $fileName;

   echo -e "\nEsta operação pode levar alguns minutos, aguarde por favor...\n";
   apt-get update >> $srcToLog;
   apt-get install build-essential >> $srcToLog;
   apt-get update >> $srcToLog;
   apt-get install libxml2-dev >> $srcToLog;
   ./configure >> $srcToLog;
   make >> $srcToLog;
   make install >> $srcToLog;
}

#-------------------------------------------------
# Fim do código de automação da instalação do PHP.
#-------------------------------------------------

Menu
