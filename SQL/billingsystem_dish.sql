-- MySQL dump 10.13  Distrib 8.0.44, for Win64 (x86_64)
--
-- Host: localhost    Database: billingsystem
-- ------------------------------------------------------
-- Server version	8.0.44

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
-- Table structure for table `dish`
--

DROP TABLE IF EXISTS `dish`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dish` (
  `d_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `price` decimal(6,2) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dish`
--

LOCK TABLES `dish` WRITE;
/*!40000 ALTER TABLE `dish` DISABLE KEYS */;
INSERT INTO `dish` VALUES (1,'Chicken Dum Biryani',220.00,'Traditional slow-cooked chicken dum biryani'),(2,'Hyderabadi Chicken Biryani',240.00,'Spicy Hyderabadi style chicken biryani'),(3,'Mutton Biryani',320.00,'Aromatic basmati rice with tender mutton'),(4,'Hyderabadi Mutton Biryani',350.00,'Authentic Hyderabadi dum mutton biryani'),(5,'Egg Biryani',180.00,'Boiled eggs cooked with biryani spices'),(6,'Chicken Fry Piece Biryani',260.00,'Fried chicken pieces mixed with biryani rice'),(7,'Chicken 65 Biryani',270.00,'Spicy Chicken 65 layered with biryani'),(8,'Chicken Tikka Biryani',280.00,'Grilled chicken tikka mixed with biryani'),(9,'Chicken Lollipop Biryani',290.00,'Crispy chicken lollipop biryani'),(10,'Boneless Chicken Biryani',300.00,'Boneless chicken biryani for easy eating'),(11,'Kolkata Chicken Biryani',250.00,'Mildly spiced Kolkata-style biryani'),(12,'Ambur Chicken Biryani',240.00,'Tamil Nadu Ambur style biryani'),(13,'Donne Chicken Biryani',260.00,'Karnataka Donne style chicken biryani'),(14,'Fish Biryani',280.00,'Fish pieces cooked with aromatic rice'),(15,'Prawn Biryani',340.00,'Juicy prawns cooked in rich biryani masala'),(16,'Keema Biryani',310.00,'Minced meat biryani with spices'),(17,'Paneer Biryani',200.00,'Paneer cubes cooked with biryani rice'),(18,'Veg Dum Biryani',190.00,'Mixed vegetables slow-cooked dum biryani'),(19,'Mushroom Biryani',210.00,'Fresh mushrooms cooked with basmati rice'),(20,'Kaju Biryani',230.00,'Cashew-based rich vegetarian biryani'),(21,'Mixed Veg Biryani',180.00,'Assorted vegetables with mild spices'),(22,'Soya Chunk Biryani',170.00,'Protein-rich soya chunks biryani'),(23,'Jackfruit Biryani',220.00,'Raw jackfruit used as meat substitute'),(24,'Afghani Chicken Biryani',300.00,'Creamy Afghani-style chicken biryani'),(25,'Special Royal Biryani',380.00,'Premium biryani with rich ingredients');
/*!40000 ALTER TABLE `dish` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-01-20 15:23:55
