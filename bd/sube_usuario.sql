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
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `fecha_alta` datetime(6) DEFAULT NULL,
  `rol` varchar(255) DEFAULT NULL,
  `dni` bigint unsigned DEFAULT NULL,
  `tipo_dni` varchar(255) DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK5171l57faosmj8myawaucatdw` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Juan','Pérez','juan.perez@example.com','$2a$10$MNpruyNa2lLgomYNFKNNmeof0t/mKtMwiBPXcT6/KPlELUKD7dBN6','2025-01-10 08:30:00.000000','USUARIO',1,'DNI','MASCULINO','11 1111-1111'),(2,'María','Gómez','maria.gomez@example.com','$2a$10$mBcgmUmGvHai.O77U2QK8eK38fJPPXw.QA0De0qj36uCYk6.jglkC','2025-01-12 09:15:00.000000','USUARIO',2,'DNI','MASCULINO','11 1111-1112'),(3,'Carlos','López','carlos.lopez@example.com','$2a$10$hTbqpSUIgEzshoG6I2dAVOXrtbUlkPb1dkvEmfz62z.d0T0Y03M8i','2025-01-15 10:45:00.000000','USUARIO',3,'DNI','MASCULINO','11 1111-1113'),(4,'Ana','Martínez','ana.martinez@example.com','$2a$10$IYGV8yU9zr63qIVKMmSsiOYMGp6wOkYPRX2V.xsbERYXgwdK1huai','2025-01-18 11:20:00.000000','USUARIO',4,'DNI','MASCULINO','11 1111-1114'),(5,'Luis','Rodríguez','luis.rodriguez@example.com','$2a$10$S/O4rEEUAJran0bY4LoiOuTGD2PWX500j.8h5D9F7IYKgV/4AiD26','2025-01-20 12:00:00.000000','USUARIO',5,'DNI','MASCULINO','11 1111-1115'),(6,'Laura','Fernández','laura.fernandez@example.com','$2a$10$Cah5L80wq.mayakI8HnhL.URnn6UVM.gx5N..zbzAoQCqMpzhHWBi','2025-01-22 13:30:00.000000','USUARIO',6,'DNI','MASCULINO','11 1111-1116'),(7,'Pedro','García','pedro.garcia@example.com','$2a$10$fG38DhRDDqKXKKZn01UJ4OLZtCU54Oz.KaAL9aiyHAU5.eVAUf3o.','2025-01-25 14:15:00.000000','USUARIO',7,'DNI','MASCULINO','11 1111-1117'),(8,'Sofía','Sánchez','sofia.sanchez@example.com','$2a$10$khaWDSqnbfAPdA5f6fAW7uRGKuYAQwN.I8do8ejdRjWsRtcMzj1Ni','2025-01-28 15:45:00.000000','USUARIO',8,'DNI','MASCULINO','11 1111-1118'),(9,'Diego','Ramírez','diego.ramirez@example.com','$2a$10$Ybtvmhlid/PME0v9VGOPqOyKYQc5.waoIro48xOzZphPlvAToJuZy','2025-01-30 16:20:00.000000','USUARIO',9,'DNI','MASCULINO','11 1111-1119'),(10,'Lucía','Torres','lucia.torres@example.com','$2a$10$cJGYma9gtsqxnI57VvRBJu6I2AwHE7/fGIGp/JA2usZ0ERKAo9g2K','2025-02-02 17:00:00.000000','USUARIO',10,'DNI','MASCULINO','11 1111-1110');
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

-- Dump completed on 2025-05-12 12:47:03
