CREATE TABLE users(
	us_codigo INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	us_login VARCHAR(40) NOT NULL,
	us_senha VARCHAR(40) NOT NULL
);

CREATE TABLE tarefas(
	tf_codigo INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	tf_nome VARCHAR(40) NOT NULL, 
	tf_data VARCHAR(10) NOT NULL,
	tf_hora VARCHAR(5) NOT NULL,
	tf_status BOOLEAN NOT NULL,
	tf_us_cod INTEGER NOT NULL,
	constraint tf_us_fk foreign key (tf_us_cod) references users (us_codigo)
);