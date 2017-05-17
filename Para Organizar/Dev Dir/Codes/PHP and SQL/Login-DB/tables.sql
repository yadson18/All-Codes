CREATE TABLE login(
	codigo INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	login VARCHAR(40) NOT NULL,
	senha VARCHAR(40) NOT NULL
);

CREATE TABLE tarefas(
	codigo INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	tarefa VARCHAR(45) NOT NULL,
	tf_lg_cod INTEGER NOT NULL,
	constraint tf_lg_fk foreign key (tf_lg_cod) references login (codigo)
);