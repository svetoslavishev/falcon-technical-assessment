CREATE DATABASE  IF NOT EXISTS `bookstore` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bookstore`;
-- MySQL dump 10.16  Distrib 10.3.9-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: bookstore
-- ------------------------------------------------------
-- Server version	10.3.9-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `id_customer` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `id_item` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_item`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (19,'Book: Harry Potter 1'),(20,'Book: Harry Potter 2'),(21,'Book: Harry Potter 3'),(22,'Book: Harry Potter 4'),(23,'Book: Harry Potter 5'),(24,'Book: Harry Potter 6'),(25,'Book: Harry Potter 7'),(26,'Book: Under the Yoke'),(27,'Book: Epic of the Forgotten'),(28,'Book: Les Miserables'),(29,'Book: The Man Who Laughs'),(30,'Book: A Game of Thrones'),(31,'Book: A Clash of Kings'),(32,'Book: A Storm of Swords'),(33,'Book: A Feast for Crows'),(34,'Book: A Dance with Dragons'),(35,'Book: It'),(36,'Book: Pet Sematary'),(37,'Book: The Shining'),(38,'Book: The Outsider'),(39,'Game: Monopoly'),(40,'Game: Scrabble'),(41,'Game: Chess'),(42,'Game: Backgammon'),(43,'Game: Draughts'),(44,'Game: Trivial Pursuit'),(45,'Game: Ludo Board Game'),(46,'Game: Uno'),(47,'Game: Cluedo'),(48,'Game: Twister'),(49,'E-Book: The Adventures of Tom Sawyer'),(50,'E-Book: Adventures of Huckleberry Finn'),(51,'E-Book: Roughing It'),(52,'E-Book: The Mysterious Stranger'),(53,'E-Book: Northanger Abbey'),(54,'E-Book: Sense and Sensibility'),(55,'E-Book: Pride and Prejudice'),(56,'E-Book: Emma'),(57,'E-Book: The Old Man and the Sea'),(58,'E-Book: The Sun Also Rises'),(59,'E-Book: For Whom the Bell Tolls'),(60,'E-Book: In Our Time'),(61,'E-Book: Oryx And Crake'),(62,'E-Book: The Blind Assassin'),(63,'E-Book: Surfacing'),(64,'E-Book: Stone Mattress'),(65,'E-Book: The Secret Adversary'),(66,'E-Book: And Then There Were None'),(67,'E-Book: Death on the Nile'),(68,'E-Book: Crooked House');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_board_game`
--

DROP TABLE IF EXISTS `item_board_game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_board_game` (
  `id_item_board_game` int(11) NOT NULL AUTO_INCREMENT,
  `id_item` int(11) DEFAULT NULL,
  `board_game_name` varchar(100) NOT NULL,
  `min_players` int(11) NOT NULL,
  `max_players` int(11) NOT NULL,
  `board_game_price` double DEFAULT NULL,
  `board_game_stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_item_board_game`),
  KEY `id_item_board_game_fk_idx` (`id_item`),
  CONSTRAINT `id_item_board_game_fk` FOREIGN KEY (`id_item`) REFERENCES `item` (`id_item`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_board_game`
--

LOCK TABLES `item_board_game` WRITE;
/*!40000 ALTER TABLE `item_board_game` DISABLE KEYS */;
INSERT INTO `item_board_game` VALUES (1,39,'Monopoly',2,8,20.99,3),(2,40,'Scrabble',2,4,19.99,5),(3,41,'Chess',2,2,4.99,10),(4,42,'Backgammon',2,2,7.8,9),(5,43,'Draughts',2,2,6.9,9),(6,44,'Trivial Pursuit',2,6,24.99,4),(7,45,'Ludo Board Game',2,4,9,7),(8,46,'Uno',2,10,5.5,9),(9,47,'Cluedo',3,6,15.75,8),(10,48,'Twister',2,4,11,12);
/*!40000 ALTER TABLE `item_board_game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_book`
--

DROP TABLE IF EXISTS `item_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_book` (
  `id_item_book` int(11) NOT NULL AUTO_INCREMENT,
  `id_item` int(11) DEFAULT NULL,
  `book_title` varchar(100) NOT NULL,
  `book_author_name` varchar(100) DEFAULT NULL,
  `book_price` double DEFAULT NULL,
  `book_stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_item_book`),
  UNIQUE KEY `id_item_detail_UNIQUE` (`id_item_book`),
  KEY `id_item_book_fk_idx` (`id_item`),
  CONSTRAINT `id_item_book_fk` FOREIGN KEY (`id_item`) REFERENCES `item` (`id_item`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_book`
--

LOCK TABLES `item_book` WRITE;
/*!40000 ALTER TABLE `item_book` DISABLE KEYS */;
INSERT INTO `item_book` VALUES (1,19,'Harry Potter and The Philosopher\'s Stone','Joanne Rowling',10,2),(2,20,'Harry Potter and The Chamber of Secrets','Joanne Rowling',10,5),(3,21,'Harry Potter and The Prisoner of Azkaban','Joanne Rowling',10,4),(4,22,'Harry Potter and The Goblet of Fire','Joanne Rowling',10,3),(5,23,'Harry Potter and The Order of the Phoenix','Joanne Rowling',10,7),(6,24,'Harry Potter and The Half-Blood Prince','Joanne Rowling',10,15),(7,25,'Harry Potter and The Deathly Hallows','Joanne Rowling',10,4),(8,26,'Under the Yoke','Ivan Vazov',18,8),(9,27,'Epic of the Forgotten','Ivan Vazov',5.99,9),(10,28,'Les Miserables','Victor Hugo ',15.4,12),(11,29,'The Man Who Laughs','Victor Hugo ',14.6,5),(12,30,'A Game of Thrones','George R. R. Martin',12,1),(13,31,'A Clash of Kings','George R. R. Martin',12,3),(14,32,'A Storm of Swords','George R. R. Martin',12,3),(15,33,'A Feast for Crows','George R. R. Martin',12,2),(16,34,'A Dance with Dragons','George R. R. Martin',12,11),(17,35,'It','Stephen King',6.5,4),(18,36,'Pet Sematary','Stephen King',11.99,6),(19,37,'The Shining','Stephen King',8,7),(20,38,'The Outsider','Stephen King',22,9);
/*!40000 ALTER TABLE `item_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_ebook`
--

DROP TABLE IF EXISTS `item_ebook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_ebook` (
  `id_item_ebook` int(11) NOT NULL AUTO_INCREMENT,
  `id_item` int(11) DEFAULT NULL,
  `ebook_title` varchar(100) NOT NULL,
  `ebook_author_name` varchar(100) DEFAULT NULL,
  `ebook_price` double DEFAULT NULL,
  `ebook_stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_item_ebook`),
  KEY `id_item_ebook_fk_idx` (`id_item`),
  CONSTRAINT `id_item_ebook_fk` FOREIGN KEY (`id_item`) REFERENCES `item` (`id_item`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_ebook`
--

LOCK TABLES `item_ebook` WRITE;
/*!40000 ALTER TABLE `item_ebook` DISABLE KEYS */;
INSERT INTO `item_ebook` VALUES (1,49,'The Adventures of Tom Sawyer','Mark Twain',4.6,4),(2,50,'Adventures of Huckleberry Finn','Mark Twain',5.23,6),(3,51,'Roughing It','Mark Twain',3.71,3),(4,52,'The Mysterious Stranger','Mark Twain',3.55,7),(5,53,'Northanger Abbey','Jane Austen',3.49,2),(6,54,'Sense and Sensibility','Jane Austen',3.67,8),(7,55,'Pride and Prejudice','Jane Austen',4.22,1),(8,56,'Emma','Jane Austen',5.34,9),(9,57,'The Old Man and the Sea','Ernest Hemingway',5.55,10),(10,58,' The Sun Also Rises','Ernest Hemingway',6.72,12),(11,59,'For Whom the Bell Tolls','Ernest Hemingway',7.24,4),(12,60,'In Our Time','Ernest Hemingway',6.69,8),(13,61,'Oryx And Crake','Margaret Atwood',6.49,13),(14,62,'The Blind Assassin','Margaret Atwood',7.49,14),(15,63,'Surfacing','Margaret Atwood',4.49,9),(16,64,'Stone Mattress','Margaret Atwood',3.98,10),(17,65,'The Secret Adversary','Agatha Christie',4.64,8),(18,66,'And Then There Were None','Agatha Christie',3.99,9),(19,67,'Death on the Nile','Agatha Christie',5.11,7),(20,68,'Crooked House','Agatha Christie',3.77,8);
/*!40000 ALTER TABLE `item_ebook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `id_order` int(11) NOT NULL AUTO_INCREMENT,
  `id_customer` int(11) NOT NULL,
  PRIMARY KEY (`id_order`,`id_customer`),
  KEY `id_order_fk_idx` (`id_customer`),
  CONSTRAINT `id_order_fk` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_details`
--

DROP TABLE IF EXISTS `order_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_details` (
  `id_order_details` int(11) NOT NULL,
  `id_order` int(11) NOT NULL,
  `id_item` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  PRIMARY KEY (`id_order_details`),
  KEY `id_order_detail_fk_idx` (`id_order`),
  KEY `id_order_detail_fk_2_idx` (`id_item`),
  CONSTRAINT `id_order_detail_fk` FOREIGN KEY (`id_order`) REFERENCES `order` (`id_order`),
  CONSTRAINT `id_order_detail_fk_2` FOREIGN KEY (`id_item`) REFERENCES `item` (`id_item`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_details`
--

LOCK TABLES `order_details` WRITE;
/*!40000 ALTER TABLE `order_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-16 13:48:02
