-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sube
-- ------------------------------------------------------
-- Server version	9.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `viaje`
--

DROP TABLE IF EXISTS `viaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viaje` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `fecha_hora` datetime(6) DEFAULT NULL,
  `estacion_destino_id` bigint NOT NULL,
  `estacion_origen_id` bigint NOT NULL,
  `tarjeta_id` bigint NOT NULL,
  `usuario_id` bigint NOT NULL,
  `medio_transporte_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5kn45hv7de34nviiih31vngjh` (`tarjeta_id`),
  KEY `FK1vwvlckldgr0p6ddomf5nuyfe` (`estacion_destino_id`),
  KEY `FKbd3mqdh2ins3sxricry4cacf2` (`estacion_origen_id`),
  KEY `fk_viaje_usuario_idx` (`usuario_id`),
  KEY `fk_viaje_medio_transporte_idx` (`medio_transporte_id`),
  CONSTRAINT `FK1vwvlckldgr0p6ddomf5nuyfe` FOREIGN KEY (`estacion_destino_id`) REFERENCES `estacion` (`id`),
  CONSTRAINT `FK5kn45hv7de34nviiih31vngjh` FOREIGN KEY (`tarjeta_id`) REFERENCES `tarjeta` (`id`),
  CONSTRAINT `fk_viaje_medio_transporte` FOREIGN KEY (`medio_transporte_id`) REFERENCES `medio_transporte` (`id`),
  CONSTRAINT `fk_viaje_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`),
  CONSTRAINT `FKbd3mqdh2ins3sxricry4cacf2` FOREIGN KEY (`estacion_origen_id`) REFERENCES `estacion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viaje`
--

LOCK TABLES `viaje` WRITE;
/*!40000 ALTER TABLE `viaje` DISABLE KEYS */;
INSERT INTO `viaje` VALUES (1,'2025-02-21 08:15:00.000000',2,1,1,1,1),(2,'2025-02-21 09:25:00.000000',3,2,2,2,2),(3,'2025-02-21 10:35:00.000000',4,3,3,3,3),(4,'2025-02-21 11:45:00.000000',5,4,4,4,4),(5,'2025-02-21 12:55:00.000000',6,5,5,5,5),(6,'2025-02-21 14:05:00.000000',7,6,6,6,6),(7,'2025-02-21 15:15:00.000000',8,7,7,7,7),(8,'2025-02-21 16:25:00.000000',9,8,8,8,8),(9,'2025-02-21 17:35:00.000000',10,9,9,9,9),(10,'2025-02-21 18:45:00.000000',1,10,10,10,10);
/*!40000 ALTER TABLE `viaje` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-12 12:47:01
