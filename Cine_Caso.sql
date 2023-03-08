CREATE DATABASE Caso1;
use Caso1;

CREATE TABLE `sala` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `capacidad` int(6) NOT NULL,
  `rodajes` varchar(50) NOT NULL,
  
  PRIMARY KEY (`id`)
);

INSERT INTO `sala` VALUES (1,100,'Titanic'),(2,100,'Hunger Games'),(3,100,'Fight Club'),(4,100,'Wallstreet'),(5,100,'Love');

CREATE TABLE `peliculas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `costo` int(5) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `rodajes_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`rodajes_id`),
  KEY `fk_peliculas_sala_idx` (`rodajes_id`),
  CONSTRAINT `fk_peliculas_sala` FOREIGN KEY (`rodajes_id`) REFERENCES `sala` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;

INSERT INTO `peliculas` VALUES (1,"Titanic",5000,'23/11/2023',1);
INSERT INTO `peliculas` VALUES (2,"Hunger Games",5000,'23/11/2023',2);
INSERT INTO `peliculas` VALUES (3,"Fight Club",5000,'23/11/2023',3);
INSERT INTO `peliculas` VALUES (4,"Wallstreet",5000,'23/11/2023',4);
INSERT INTO `peliculas` VALUES (5,"Love",5000,'23/11/2023',5);

