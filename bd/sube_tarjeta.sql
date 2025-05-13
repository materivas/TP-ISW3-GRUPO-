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
-- Table structure for table `tarjeta`
--

DROP TABLE IF EXISTS `tarjeta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarjeta` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `codigo` varchar(255) DEFAULT NULL,
  `fecha_emision` datetime(6) DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `usuario_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKlnkiul1vcdklkvb9wf6xnotrt` (`codigo`),
  KEY `fk_tarjeta_usuario_idx` (`usuario_id`),
  CONSTRAINT `fk_tarjeta_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarjeta`
--

LOCK TABLES `tarjeta` WRITE;
/*!40000 ALTER TABLE `tarjeta` DISABLE KEYS */;
INSERT INTO `tarjeta` VALUES (1,'1000000001','2025-02-10 08:00:00.000000',500,'ACTIVA',1),(2,'1000000002','2025-02-10 08:00:00.000000',300,'ACTIVA',2),(3,'1000000003','2025-02-10 08:00:00.000000',450,'ACTIVA',3),(4,'1000000004','2025-02-10 08:00:00.000000',600,'ACTIVA',4),(5,'1000000005','2025-02-10 08:00:00.000000',350,'ACTIVA',5),(6,'1000000006','2025-02-10 08:00:00.000000',400,'ACTIVA',6),(7,'1000000007','2025-02-10 08:00:00.000000',550,'ACTIVA',7),(8,'1000000008','2025-02-10 08:00:00.000000',200,'ACTIVA',8),(9,'1000000009','2025-02-10 08:00:00.000000',750,'ACTIVA',9),(10,'1000000010','2025-02-10 08:00:00.000000',650,'ACTIVA',10),(14,'0600 0222 0444 0999','2025-02-10 08:00:00.000000',100,NULL,1);
/*!40000 ALTER TABLE `tarjeta` ENABLE KEYS */;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_recarga_insert` BEFORE UPDATE ON `tarjeta` FOR EACH ROW BEGIN
  IF OLD.saldo <> NEW.saldo OR OLD.estado <> NEW.estado THEN
    INSERT INTO AuditLog(tabla, accion, registro_id, datos_previos, datos_nuevos, usuario)
    VALUES(
      'Tarjeta',
      'UPDATE',
      OLD.id,
      JSON_OBJECT('saldo', OLD.saldo, 'estado', OLD.estado),
      JSON_OBJECT('saldo', NEW.saldo, 'estado', NEW.estado),
      (SELECT email FROM Usuario U JOIN Tarjeta T ON U.id_usuario = T.usuario_id WHERE T.id = OLD.id)
    );
  END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trg_tarjeta_update` BEFORE UPDATE ON `tarjeta` FOR EACH ROW BEGIN
  IF OLD.saldo <> NEW.saldo OR OLD.estado <> NEW.estado THEN
    INSERT INTO AuditLog(tabla, accion, registro_id, datos_previos, datos_nuevos, usuario)
    VALUES(
      'Tarjeta',
      'UPDATE',
      OLD.id,
      JSON_OBJECT('saldo', OLD.saldo, 'estado', OLD.estado),
      JSON_OBJECT('saldo', NEW.saldo, 'estado', NEW.estado),
      (SELECT email FROM Usuario U JOIN Tarjeta T ON U.id = T.id WHERE T.id = OLD.id)
    );
  END IF;
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
