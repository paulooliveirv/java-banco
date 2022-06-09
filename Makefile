mysqlrun:
	# MYSQL_ROOT_PASSWORD senha do usuario 'root'
	# MYSQL_USER adiciona um superusuario ao banco
	# MYSQL_PASSWORD senha do superusuario
	docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=persistent-bank -e MYSQL_USER=calindra -e MYSQL_PASSWORD=4321 mysql:8.0.29