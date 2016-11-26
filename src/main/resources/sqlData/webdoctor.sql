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
  `author_name` varchar(20) DEFAULT NULL,
  `title` varchar(1000) DEFAULT NULL,
  `time_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `content` mediumtext,
  `disease` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (9,'test_account1','Eggs and Gastritis','2016-11-26 23:26:11','<p>&nbsp;<img src=\"http://img.aws.livestrongcdn.com/ls-article-image-673/cme/cme_public_images/www_livestrong_com/photos.demandstudios.com/getty/article/181/161/488060262_XS.jpg\" alt=\"\" width=\"673\" height=\"448\" /></p>\n<p data-dmc=\"summary\">You may have to avoid eating eggs if you consistently develop symptoms of gastritis, which is an inflammation in the lining of the stomach. Gastritis may be the result of an egg allergy, an egg intolerance or food poisoning. Report severe abdominal pain, blood in stool or vomit to your doctor immediately to prevent further complications. Avoid eating eggs until you can be seen by your doctor.</p>\n<section class=\"article-section\">\n<h2 class=\"header\"><span data-dmc=\"section-headline\">Egg Allergy</span></h2>\n<p data-dmc=\"section\">If eating eggs causes symptoms of gastritis along with other symptoms, you may have an egg allergy. Eggs are one of them most common foods that trigger an allergic reaction. If you&rsquo;re allergic to eggs, your immune system mistakes the proteins in the egg white, the egg yolk or both as a dangerous substance. The body overreacts to the egg proteins, sending a flood of chemicals into the blood stream to attack the proteins. The presence of these proteins causes inflammation in soft tissues throughout the body. An egg allergy may cause inflammation in your digestive system, skin, cardiovascular system and respiratory system. Egg allergies may cause shock in some people, and they can even lead to death in extreme cases.</p>\n</section>\n<p>&nbsp;</p>\n<section class=\"article-section\">\n<h2 class=\"header\"><span data-dmc=\"section-headline\">Egg Intolerance</span></h2>\n<div>&nbsp;</div>\n<p data-dmc=\"section\">The University of Maryland Medical Center reports that about 25 percent of Americans believe they are allergic to a food, but only about 2 percent of the adult population is diagnosed with a food allergy. Many people confuse egg intolerance with an egg allergy. Egg intolerance can cause gastritis, not because of chemical reactions in the body but because of undigested proteins. Egg intolerance occurs when your digestive system is unable to break down the proteins in eggs, leading to inflammation, bloating, gas and diarrhea. Egg intolerance does not involve the immune system and will primarily cause digestive complications.</p>\n<section class=\"article-section\">\n<h2 class=\"header\"><span data-dmc=\"section-headline\">Food Poisoning</span></h2>\n<p data-dmc=\"section\">Food poisoning from eggs can cause gastritis if the eggs you consume are contaminated with parasites, bacteria or viruses, according to MedlinePlus. Inflammation develops in the lining of the stomach and intestines that causes stomach pain, vomiting, nausea and diarrhea. If you suspect that you have food poisoning from eating eggs, call your doctor. In some cases food poisoning may cause severe symptoms. Dehydration is a common concern with food poisoning, so be sure to increase the amount of fluids you drink to prevent dehydration.</p>\n</section>\n<p data-dmc=\"section\">&nbsp;</p>\n<section class=\"article-section\">\n<h2 class=\"header\"><span data-dmc=\"section-headline\">Considerations</span></h2>\n<p data-dmc=\"section\">If you develop gastritis symptoms from eating eggs, you may have a digestive condition. Common digestive conditions that cause gastritis symptoms include Crohn&rsquo;s disease, irritable bowel syndrome and ulcerative colitis. See your doctor for a proper diagnosis and treatment options.</p>\n</section>\n</section>','Gastritis'),(10,'test_account1','Physicians say symptoms of mosquito-borne ailment are changing, virus has developed drug resistance. ','2016-11-26 23:30:09','<p>Fever and shivering - the only two symptoms to watch out for when it comes to malaria? Not anymore. According to physicians in the city, malaria cases are showing up with varied symptoms, throwing patients as well as doctors off the diagnosis.</p>\n<p>&ldquo;I see malaria patients with fever, decreased urine output, some respiratory problems, disorientation, sleepiness, etc. This was not the case earlier,&rdquo; said Dr Neeraj Uttamani, director, Cumballa Hill Hospital. &ldquo;Vivax strain has turned severe, with patients showing cardiac problems and kidney complications as well,&rdquo; he added.</p>\n<p>&ldquo;Most of the patients are coming in at a later stage and with very unusual symptoms such as state of shock and infections. Many have a combination of malaria and dengue, which is even more worrisome,&rdquo; said Dr Vinay Joshi, pediatric intensivist from Kokilaben Hospital.</p>\n<p>While the blame game continues between the civic body and the builders in the city over the spread of malaria, the virus seems to have developed a resistance to chloroquine, a traditional drug to treat malaria, said intensivists in the city.</p>\n<p>&ldquo;While the falciparum strain has been found to be drug resistant in the past two years, this year, the vivax strain too seems to have developed resistance to chloroquine,&rdquo; said Dr Khusrav Bajan, consultant, emergency, critical care and internal medicine, Hinduja Hospital. Bajan said he had seen drug resistance in 30 % of his vivax malaria patients.</p>\n<p>&ldquo;The organism is getting more virulent &mdash; with multi-organ failure, acute lung injury, etc,&rdquo; said Bajan. &ldquo;If the patient is in ICU, we put them on resistant treatment, or give two drugs as opposed to one,&rdquo; he added.</p>\n<p>&ldquo;Clearly the parasite has undergone mutation. Hence, the unusual symptoms and the drug resistance,&rdquo; said another doctor.</p>\n<p>Civic hospitals are taking all possible measures to cope with the problem. With the increasing number of malaria cases in the city, the civic body has short-listed 74 dispensaries for running out-patient departments (OPD) in the evening.</p>\n<p>Authorities claim that a huge number of patients are turning up to the evening OPDs, which are convenient for working people.</p>\n<p>&ldquo;The response has been good so far. Several people tend to neglect their symptoms as they are busy during the day,&rdquo; said Dr Guirish Ambe, executive health officer, BMC, adding that the evening OPDs are on from 5pm to 8.30pm.</p>\n<p>Health authorities said the OPDs would help in curbing malaria cases in south Mumbai where there are no civic-run hospitals.</p>\n<p>&nbsp;</p>\n<p>&ldquo;Not many like to go for a check-up to a private medical centre and spend huge amount of money. People keep avoiding doctors and resort to self-medication. The civic dispensaries will help in early diagnosis of malaria,&rdquo; said an official from the BMC&rsquo;s health department.</p>','Malaria');
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
INSERT INTO `symptom` VALUES (22,'faded colors','Ophthalmology'),(23,'blurry vision','Ophthalmology'),(24,'halos around light','Ophthalmology'),(25,'fever','General'),(26,'weight loss','General'),(27,'polyuria','Endocrinology'),(28,'polydipsia','Endocrinology'),(29,'polyphagia','Endocrinology'),(30,'fatigue','General'),(31,'malaise','General'),(32,'night sweats','General'),(33,'nausea','Gastroenterology'),(34,'overweight','Endocrinology'),(36,'cough','General'),(37,'sneezing','General'),(38,'headache','General'),(39,'sore throat','General'),(40,'runny nose','General'),(41,'muscle pain','General'),(42,'toothache','Dentistry'),(43,'tooth cavity','Dentistry'),(44,'	hair loss','Dermatology'),(45,'	chest pain','General'),(46,'hemoptysis','Pulmonology'),(47,'diarrhea','Gastroenterology'),(48,'sleep difficulty','Psychiatry');
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
  `password` varchar(128) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `authority` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (13,'test_account1','f6beff36214e620c2281cd5f8686','wu689@purdue.edu','1');
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

-- Dump completed on 2016-11-26 18:31:40
