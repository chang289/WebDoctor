-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: webdoctor
-- ------------------------------------------------------
-- Server version	5.7.15

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
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `author_id` int(11) DEFAULT NULL,
  `title` varchar(1000) DEFAULT NULL,
  `time_stamp` datetime DEFAULT NULL,
  `content` mediumtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned DEFAULT NULL,
  `article_id` int(10) unsigned DEFAULT NULL,
  `time_stamp` datetime DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disease`
--

DROP TABLE IF EXISTS `disease`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disease` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(10000) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disease`
--

LOCK TABLES `disease` WRITE;
/*!40000 ALTER TABLE `disease` DISABLE KEYS */;
INSERT INTO `disease` VALUES (1,'diabetes',' a disease cause by lack of insulin.','Endocrinology '),(2,'rabies','a viral disease that causes acute inflammation of the brain in humans and other mammals.','Infectiology'),(3,'radiation sickness','a collection of health effects that are present within 24 hours of exposure to high amounts of ionizing radiation.','Toxicology'),(4,'HIV/AIDS','Acquired immune deficiency syndrome(AIDS) is a infectious syndrome caused by Human Immunodeficiency Virus(HIV). This fatal disease gradually weakens immune system,\nmaking people vulnerable. With the progress of infection, serious complications like cancer can happen, leading to death, if untreated.','Infectiology'),(5,'Malaria',' a mosquito-borne infectious disease affecting humans and other animals caused by parasitic protozoans (a group of single-celled microorganisms)\nbelonging to the Plasmodium type.','Infectiology'),(6,'Rheumatoid arthritis',' a long-lasting autoimmune disorder that primarily affects joints, typically both parts of the body.','Rheumatology'),(7,'Lupus erythematosus','A name given to a collection of autoimmune diseases in which the human immune system becomes hyperactive and attacks healthy tissues.','Rheumatology'),(8,'Ankylosing spondylitis','A type of arthritis in which there is long term inflammation of the joints of the spine and pelvis.','Rheumatology'),(9,'Tuberculosis','An infectious disease caused by the bacterium Mycobacterium tuberculosis (MTB). MTB generally affects the lungs and often involves the formation of lung cavities.','Infectiology'),(10,'Rhabdomyolysis',' a specialty of medicine and pediatrics that concerns itself with the study of normal kidney function, kidney problems, \nthe treatment of kidney problems and renal replacement therapy (dialysis and kidney transplantation).','Nephrology');
/*!40000 ALTER TABLE `disease` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disease_article`
--

DROP TABLE IF EXISTS `disease_article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disease_article` (
  `disease_id` int(10) unsigned DEFAULT NULL,
  `article_id` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disease_article`
--

LOCK TABLES `disease_article` WRITE;
/*!40000 ALTER TABLE `disease_article` DISABLE KEYS */;
/*!40000 ALTER TABLE `disease_article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disease_symptom`
--

DROP TABLE IF EXISTS `disease_symptom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disease_symptom` (
  `tag_id` int(11) DEFAULT NULL,
  `disease_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disease_symptom`
--

LOCK TABLES `disease_symptom` WRITE;
/*!40000 ALTER TABLE `disease_symptom` DISABLE KEYS */;
INSERT INTO `disease_symptom` VALUES (1,3),(4,3),(4,1),(1,2),(4,2);
/*!40000 ALTER TABLE `disease_symptom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `symptom`
--

DROP TABLE IF EXISTS `symptom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `symptom` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `symptom`
--

LOCK TABLES `symptom` WRITE;
/*!40000 ALTER TABLE `symptom` DISABLE KEYS */;
INSERT INTO `symptom` VALUES (1,'Acitretin','Dermatology'),(2,'Botox','Dermatology'),(3,'Epidermal Nevus','Dermatology'),(4,'Cadasil','Neurology'),(5,'Dermatomyositis','Neurology'),(6,'Erb\'s Palsy','Neurology'),(7,'Rickets','Osteology'),(8,'Fracture','Osteology'),(10,'pannus','ophtalmology'),(11,'chemosis','ophtalmology'),(12,'somopsychosis','psychiatry'),(13,'hysteria','psychiatry'),(14,'aquaphobia','psychiatry'),(15,'Arrhythmia','Cardiology'),(16,'Tachycardia','Cardiology'),(17,'Heart failure','Cardiology'),(18,'chylothorax','Cerebral surgery'),(20,'esophagocele','Cerebral surgery'),(21,'thymoma','Cerebral surgery');
/*!40000 ALTER TABLE `symptom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `authority` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'1','1','1','0'),(2,'1','1','1','0'),(3,'1','1','1','0'),(4,'yiyan zhou','fuck_you','zhou123@purdue.edu','1'),(5,'xu683','webdoctor','11@qq.com','0'),(10,'123','111111','11@qq/com','0');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_favouritearticle`
--

DROP TABLE IF EXISTS `user_favouritearticle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_favouritearticle` (
  `user_id` int(10) unsigned DEFAULT NULL,
  `article_id` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_favouritearticle`
--

LOCK TABLES `user_favouritearticle` WRITE;
/*!40000 ALTER TABLE `user_favouritearticle` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_favouritearticle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-06 15:30:38
