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
-- Table structure for table `transaccion`
--

DROP TABLE IF EXISTS `transaccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaccion` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `importe` double DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `fecha_hora` datetime(4) DEFAULT NULL,
  `recarga_id` bigint DEFAULT NULL,
  `viaje_id` bigint DEFAULT NULL,
  `tarjeta_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKrmasj7vy9ppd6yo66ua456k7v` (`recarga_id`),
  UNIQUE KEY `UKh8g5fx69p4vrshcgl840dv4lt` (`viaje_id`),
  KEY `fk_transaccion_tarjeta_idx` (`tarjeta_id`),
  CONSTRAINT `fk_transaccion_tarjeta` FOREIGN KEY (`tarjeta_id`) REFERENCES `tarjeta` (`id`),
  CONSTRAINT `FKa5yaeuhohtyy6eker8dyni2oi` FOREIGN KEY (`recarga_id`) REFERENCES `recarga` (`id`),
  CONSTRAINT `FKpkghv8606my93g1oxk95wirsh` FOREIGN KEY (`viaje_id`) REFERENCES `viaje` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaccion`
--

LOCK TABLES `transaccion` WRITE;
/*!40000 ALTER TABLE `transaccion` DISABLE KEYS */;
INSERT INTO `transaccion` VALUES (1,-25,'Viaje','2025-02-20 08:10:00.0000',1,1,1),(2,-30,'Viaje','2025-02-20 09:20:00.0000',2,2,2),(3,-20,'Viaje','2025-02-20 10:30:00.0000',3,3,3),(4,-15,'Viaje','2025-02-20 11:40:00.0000',4,4,4),(5,-35,'Viaje','2025-02-20 12:50:00.0000',5,5,5),(6,-40,'Viaje','2025-02-20 14:00:00.0000',6,6,6),(7,-22,'Viaje','2025-02-20 15:10:00.0000',7,7,7),(8,-28,'Viaje','2025-02-20 16:20:00.0000',8,8,8),(9,-18,'Viaje','2025-02-20 17:30:00.0000',9,9,9),(10,-26,'Viaje','2025-02-20 18:40:00.0000',10,10,10);
/*!40000 ALTER TABLE `transaccion` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_transaccion_insert` AFTER INSERT ON `transaccion` FOR EACH ROW BEGIN
  INSERT INTO AuditLog(tabla, accion, registro_id, datos_nuevos, usuario)
  VALUES(
    'Transaccion',
    'INSERT',
    NEW.id,
    JSON_OBJECT('viaje_id', NEW.viaje_id, 'recarga_id', NEW.recarga_id, 'tarjeta_id', NEW.tarjeta_id, 'importe', NEW.importe, 'fecha', NEW.fecha_hora),
    (SELECT email FROM Usuario U JOIN Tarjeta T ON U.id= T.usuario_id WHERE T.id = NEW.id)
  );
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-12 12:47:02
