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
  `description` mediumtext,
  `department` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disease`
--

LOCK TABLES `disease` WRITE;
/*!40000 ALTER TABLE `disease` DISABLE KEYS */;
INSERT INTO `disease` VALUES (1,'Diabetes',' Diabetes is a disease cause by lack of insulin.','Endocrinology '),(2,'Rabies','a viral disease that causes acute inflammation of the brain in humans and other mammals.','Infectiology'),(3,'Radiation sickness','a collection of health effects that are present within 24 hours of exposure to high amounts of ionizing radiation.','Toxicology'),(4,'Hiv/aids','Acquired immune deficiency syndrome(AIDS) is a infectious syndrome caused by Human Immunodeficiency Virus(HIV). This fatal disease gradually weakens immune system,\nmaking people vulnerable. With the progress of infection, serious complications like cancer can happen, leading to death, if untreated.','Infectiology'),(5,'Malaria',' a mosquito-borne infectious disease affecting humans and other animals caused by parasitic protozoans (a group of single-celled microorganisms)\nbelonging to the Plasmodium type.','Infectiology'),(6,'Rheumatoid arthritis',' a long-lasting autoimmune disorder that primarily affects joints, typically both parts of the body.','Rheumatology'),(7,'Lupus erythematosus','A name given to a collection of autoimmune diseases in which the human immune system becomes hyperactive and attacks healthy tissues.','Rheumatology'),(8,'Ankylosing spondylitis','A type of arthritis in which there is long term inflammation of the joints of the spine and pelvis.','Rheumatology'),(9,'Tuberculosis','An infectious disease caused by the bacterium Mycobacterium tuberculosis (MTB). MTB generally affects the lungs and often involves the formation of lung cavities.','Infectiology'),(10,'Rhabdomyolysis',' a specialty of medicine and pediatrics that concerns itself with the study of normal kidney function, kidney problems, \nthe treatment of kidney problems and renal replacement therapy (dialysis and kidney transplantation).','Nephrology'),(11,'Cataract',' A cataract is a clouding of the lens in the eye leading to a decrease in vision.','Ophthalmology'),(12,'Gastritis','Inflammation of the stomach lining caused by various factors like environment, irregular lifestyle, infections etc','Gastroenterology'),(17,'Obesity','A human body condition in which people\'s BMI(body mass index) is over 30kg/m^2.','Endocrinology'),(18,'Insomnia','A sleep disorder that a affects people\'s sleep quality and disturbs their daily life. It often involves difficulty in falling sleep and maintaning sleep\nsleep and other sleep stages.','Psychiatry');
/*!40000 ALTER TABLE `disease` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disease_article`
--

DROP TABLE IF EXISTS `disease_article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disease_article` (
  `disease_id` int(10) DEFAULT NULL,
  `article_id` int(10) DEFAULT NULL
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
INSERT INTO `disease_symptom` VALUES (22,11),(23,11),(24,11),(26,1),(27,1),(28,1),(29,1),(33,12),(34,17),(25,2),(45,9),(46,9),(25,3),(33,3),(38,3),(48,18),(25,5),(30,5),(33,5),(38,5);
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
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `symptom`
--

LOCK TABLES `symptom` WRITE;
/*!40000 ALTER TABLE `symptom` DISABLE KEYS */;
INSERT INTO `symptom` VALUES (22,'faded colors','Ophthalmology'),(23,'blurry vision','Ophthalmology'),(24,'halos around light','Ophthalmology'),(25,'fever','General'),(26,'weight loss','General'),(27,'polyuria (increased urination)','Endocrinology'),(28,'polydipsia (increased thirst)','Endocrinology'),(29,'polyphagia (increased hunger)','Endocrinology'),(30,'fatigue','General'),(31,'malaise','General'),(32,'night sweats','General'),(33,'nausea','Gastroenterology'),(34,'overweight','Endocrinology'),(36,'cough','General'),(37,'sneezing','General'),(38,'headache','General'),(39,'sore throat','General'),(40,'runny nose','General'),(41,'muscle pain','General'),(42,'toothache','Dentistry'),(43,'tooth cavity','Dentistry'),(44,'	hair loss','Dermatology'),(45,'	chest pain','General'),(46,'hemoptysis','Pulmonology'),(47,'diarrhea','Gastroenterology'),(48,'sleep difficulty','Psychiatry');
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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'1','1','1','0'),(2,'1','1','1','0'),(3,'1','1','1','0'),(4,'zhou482','fuck_you','zhou123@purdue.edu','1'),(5,'xu683','webdoctor','11@qq.com','0'),(10,'123','111111','11@qq/com','0'),(11,'chang289','123456','chang289@purdue.edu','2'),(12,'chang289','123456','chang289@purdue.edu','2');
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

-- Dump completed on 2016-11-17 23:45:51
