CREATE DATABASE  IF NOT EXISTS `refugioanimales` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `refugioanimales`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: refugioanimales
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `animales`
--

DROP TABLE IF EXISTS `animales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `animales` (
  `idanimales` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `edad` varchar(45) NOT NULL,
  `castrado` tinyint(4) NOT NULL,
  `idcolor` int(11) NOT NULL,
  `idraza` int(11) DEFAULT NULL,
  `idtipo` int(11) NOT NULL,
  `idsexo` int(11) NOT NULL,
  `fechaAdopcion` date DEFAULT NULL,
  `idusuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idanimales`),
  KEY `FK_animales_color_idx` (`idcolor`),
  KEY `FK_animales_raza_idx` (`idraza`),
  KEY `FK_animales_sexo_idx` (`idsexo`),
  KEY `FK_animales_tipo_idx` (`idtipo`),
  KEY `FK_animales_usuario_idx` (`idusuario`),
  CONSTRAINT `FK_animales_color` FOREIGN KEY (`idcolor`) REFERENCES `color` (`idcolor`),
  CONSTRAINT `FK_animales_raza` FOREIGN KEY (`idraza`) REFERENCES `raza` (`idraza`),
  CONSTRAINT `FK_animales_sexo` FOREIGN KEY (`idsexo`) REFERENCES `sexo` (`idsexo`),
  CONSTRAINT `FK_animales_tipo` FOREIGN KEY (`idtipo`) REFERENCES `tipoanimal` (`idtipo`),
  CONSTRAINT `FK_animales_usuario` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animales`
--

LOCK TABLES `animales` WRITE;
/*!40000 ALTER TABLE `animales` DISABLE KEYS */;
INSERT INTO `animales` VALUES (14,'t','1',1,1,1,1,1,'2018-12-13',NULL),(15,'rony','12 años',1,3,11,2,2,'2018-12-13',NULL),(17,'Mari','25 años',0,2,3,1,1,'2018-12-13',NULL),(18,'Sansa','2 meses',1,1,1,1,1,'2015-03-15',1),(19,'Mar','1 año',1,1,1,1,1,'2016-05-01',2),(20,'ornitorrinco','7 meses',0,4,21,1,1,'2018-12-13',NULL),(21,'aa','a años',1,1,1,1,1,'2018-12-13',NULL),(22,'Mari','5 años',0,1,1,1,1,'2018-12-13',NULL),(23,'aa','a años',1,1,1,1,1,'2018-12-17',2),(25,'juan','a años',0,1,1,1,1,'2018-12-17',2),(26,'Mari','s',0,1,1,1,1,'2018-12-17',2),(27,'dssdf','sdf',0,1,1,1,1,'2018-12-17',2),(28,'dfsdffs','ssss',0,1,1,1,1,'2018-12-17',2),(29,'aaaaa','15',0,1,1,1,1,'2018-12-17',2),(30,'Mara','1 mes',0,1,1,1,1,NULL,NULL),(31,'roco','4 meses',1,1,1,1,1,NULL,NULL),(33,'layca','2 años',1,1,1,1,1,'2018-12-17',2),(34,'nora','15 dias',0,1,1,1,1,'2018-12-17',2);
/*!40000 ALTER TABLE `animales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `color`
--

DROP TABLE IF EXISTS `color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `color` (
  `idcolor` int(11) NOT NULL AUTO_INCREMENT,
  `color` varchar(45) NOT NULL,
  PRIMARY KEY (`idcolor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color`
--

LOCK TABLES `color` WRITE;
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
INSERT INTO `color` VALUES (1,'marron'),(2,'negro'),(3,'blanco'),(4,'gris');
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `raza`
--

DROP TABLE IF EXISTS `raza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `raza` (
  `idraza` int(11) NOT NULL AUTO_INCREMENT,
  `raza` varchar(45) NOT NULL,
  PRIMARY KEY (`idraza`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raza`
--

LOCK TABLES `raza` WRITE;
/*!40000 ALTER TABLE `raza` DISABLE KEYS */;
INSERT INTO `raza` VALUES (1,'angora'),(2,'bengala'),(3,'americano'),(4,'escoces'),(5,'siames'),(6,'egipcio'),(7,'persa'),(8,'tigre'),(9,'galgo'),(10,'terrier'),(11,'cocker'),(12,'pero de agua'),(13,'pastor aleman'),(14,'buldog frances'),(15,'chihuahua'),(16,'chow chow'),(17,'perro salchicha'),(18,'doberman'),(19,'husky siberiano'),(20,'yorsike'),(21,'sin raza');
/*!40000 ALTER TABLE `raza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sexo`
--

DROP TABLE IF EXISTS `sexo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sexo` (
  `idsexo` int(11) NOT NULL AUTO_INCREMENT,
  `sexo` varchar(45) NOT NULL,
  PRIMARY KEY (`idsexo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sexo`
--

LOCK TABLES `sexo` WRITE;
/*!40000 ALTER TABLE `sexo` DISABLE KEYS */;
INSERT INTO `sexo` VALUES (1,'macho'),(2,'hembra');
/*!40000 ALTER TABLE `sexo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoanimal`
--

DROP TABLE IF EXISTS `tipoanimal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tipoanimal` (
  `idtipo` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`idtipo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoanimal`
--

LOCK TABLES `tipoanimal` WRITE;
/*!40000 ALTER TABLE `tipoanimal` DISABLE KEYS */;
INSERT INTO `tipoanimal` VALUES (1,'gato'),(2,'perro');
/*!40000 ALTER TABLE `tipoanimal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tipousuario` (
  `idtipo` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`idtipo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipousuario`
--

LOCK TABLES `tipousuario` WRITE;
/*!40000 ALTER TABLE `tipousuario` DISABLE KEYS */;
INSERT INTO `tipousuario` VALUES (1,'administrador'),(2,'voluntario/adoptante');
/*!40000 ALTER TABLE `tipousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `numsocio` int(30) DEFAULT NULL,
  `idtipo` int(11) NOT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE KEY `user_UNIQUE` (`user`),
  KEY `FK_usuario_tipoUsuario_idx` (`idtipo`),
  CONSTRAINT `FK_usuario_tipoUsuario` FOREIGN KEY (`idtipo`) REFERENCES `tipousuario` (`idtipo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'marikar','marikar93','20225052w','Mari Carmen','marikar_93@hotmail.com',638162833,'c/Franz kafka',123456,1),(2,'maria','msperez','25635481x','Maria','mssibaja@hotmail.com',655485216,'c/la union',NULL,2),(3,'a','a','aaaaa','a','a',634561235,'a',NULL,2);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-17 19:29:59
