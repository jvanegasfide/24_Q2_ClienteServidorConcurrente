CREATE DATABASE universidad;

CREATE TABLE universidad.profesores(
idprofesor INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
mail VARCHAR(50) NULL,
PRIMARY KEY (idprofesor)
);

#Insercion
INSERT INTO universidad.profesores(nombre,mail)
VALUES('Pedro Gonzalez', 'prueba@fidelitas.org');
INSERT INTO universidad.profesores(nombre,mail)
VALUES('Pedro Gonzalez', 'prueba@fidelitas.org');

#Seleccion
SELECT * FROM universidad.profesores where idprofesor = 1;

#Actualizacion
UPDATE profesores SET nombre = 'nombre', mail = 'correo' WHERE idprofesor = 2;

#Borrado 
DELETE FROM profesores WHERE idprofesor = 2;

