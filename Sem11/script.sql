CREATE DATABASE universidad;

CREATE TABLE universidad.profesores(
idprofesor INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
mail VARCHAR(50) NULL,
PRIMARY KEY (idprofesor)
);

INSERT INTO universidad.profesores(nombre,mail)
VALUES('Pedro Gonzalez', 'prueba@fidelitas.org')