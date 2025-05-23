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
-- Table structure for table `recarga`
--

DROP TABLE IF EXISTS `recarga`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recarga` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `fecha_hora` datetime(6) DEFAULT NULL,
  `monto` double DEFAULT NULL,
  `tarjeta_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2gxg3p1yrrpst8k8wf0i7bdx9` (`tarjeta_id`),
  CONSTRAINT `FK2gxg3p1yrrpst8k8wf0i7bdx9` FOREIGN KEY (`tarjeta_id`) REFERENCES `tarjeta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recarga`
--

LOCK TABLES `recarga` WRITE;
/*!40000 ALTER TABLE `recarga` DISABLE KEYS */;
INSERT INTO `recarga` VALUES (1,'2025-02-10 08:00:00.000000',100,1),(2,'2025-02-11 09:30:00.000000',150,2),(3,'2025-02-12 10:15:00.000000',200,3),(4,'2025-02-13 11:45:00.000000',120,4),(5,'2025-02-14 12:20:00.000000',180,5),(6,'2025-02-15 13:50:00.000000',160,6),(7,'2025-02-16 14:25:00.000000',140,7),(8,'2025-02-17 15:55:00.000000',130,8),(9,'2025-02-18 16:30:00.000000',170,9),(10,'2025-02-19 17:05:00.000000',110,10),(11,'2025-05-11 08:17:19.092509',100,14);
/*!40000 ALTER TABLE `recarga` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-12 12:47:02
