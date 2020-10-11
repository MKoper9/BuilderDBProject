CREATE DATABASE builder_db
character set utf8 collate utf8_polish_ci;

set @@global.time_zone='+2:00';

CREATE USER 'builder_db_user'@'localhost' identified by 'Marik1234';
grant
	create, drop, alter, insert, update, select, delete, references
on
	builder_db.*
to
	'builder_db_user'@'localhost';