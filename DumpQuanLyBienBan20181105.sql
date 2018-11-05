CREATE DATABASE  IF NOT EXISTS `quanlybienban` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `quanlybienban`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlybienban
-- ------------------------------------------------------
-- Server version	5.7.22-log

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
-- Table structure for table `meetings`
--

DROP TABLE IF EXISTS `meetings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `meetings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meetingTitle` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `meetingDate` date NOT NULL,
  `timeStart` time NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meetings`
--

LOCK TABLES `meetings` WRITE;
/*!40000 ALTER TABLE `meetings` DISABLE KEYS */;
INSERT INTO `meetings` VALUES (1,'Hop ABC','2018-11-21','08:00:00'),(3,'Hop CDE','2018-11-13','08:00:00'),(4,'Hop ve DEF','2018-11-14','07:00:00'),(5,'Hop ve EFG','2018-11-22','16:00:00');
/*!40000 ALTER TABLE `meetings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reportparts`
--

DROP TABLE IF EXISTS `reportparts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reportparts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meetingId` int(11) NOT NULL,
  `fileName` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `type` int(11) NOT NULL,
  `reportPartContent` mediumtext COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_meetingId` (`meetingId`),
  CONSTRAINT `fk_meetingId` FOREIGN KEY (`meetingId`) REFERENCES `meetings` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportparts`
--

LOCK TABLES `reportparts` WRITE;
/*!40000 ALTER TABLE `reportparts` DISABLE KEYS */;
INSERT INTO `reportparts` VALUES (1,3,'',1,'from selenium import webdriver\nimport os\n\n\ndef download_done():\n    for i in os.listdir(download_dir):\n        if \".crdownload\" in i:\n            time.sleep(1)\n            download_done()\n\n\nbrowser = webdriver.Chrome()\nbrowser.get((\'http://is.hust.edu.vn/~phuongnh/thdl/\'))\n\nlinksize = browser.find_elements_by_tag_name(\"a\")\nlink = []\nfor x in linksize:\n    link.append(x.get_attribute(\"href\"))\n\nfor x in link:\n    if x.endswith(\"docx\") or x.endswith(\"doc\"):\n        browser.get(x)\n\ndownload_dir=\"/home/wnncr/Downloads\"\noptions = webdriver.ChromeOptions()\nprofile = {\"plugins.plugins_list\": [{\"enabled\": False, \"name\": \"Chrome PDF Viewer\"}],\"download.default_directory\": download_dir , \"download.extensions_to_open\": \"applications/pdf\"}\noptions.add_experimental_option(\"prefs\", profile)\n\n\nfor i in link:\n    if i.endswith(\'pdf\'):\n        driver = webdriver.Chrome(\'/usr/bin/chromedriver\', chrome_options=options)\n        driver.get(i)\n\ndownload_done()\nbrowser.close()\ndriver.close()\n\n\n'),(2,3,'downloadXML.py',0,'from selenium import webdriver\nimport os\n\n\ndef download_done():\n    for i in os.listdir(download_dir):\n        if \".crdownload\" in i:\n            time.sleep(1)\n            download_done()\n\n\nbrowser = webdriver.Chrome()\nbrowser.get((\'http://is.hust.edu.vn/~phuongnh/thdl/\'))\n\nlinksize = browser.find_elements_by_tag_name(\"a\")\nlink = []\nfor x in linksize:\n    link.append(x.get_attribute(\"href\"))\n\nfor x in link:\n    if x.endswith(\"docx\") or x.endswith(\"doc\"):\n        browser.get(x)\n\ndownload_dir=\"/home/wnncr/Downloads\"\noptions = webdriver.ChromeOptions()\nprofile = {\"plugins.plugins_list\": [{\"enabled\": False, \"name\": \"Chrome PDF Viewer\"}],\"download.default_directory\": download_dir , \"download.extensions_to_open\": \"applications/pdf\"}\noptions.add_experimental_option(\"prefs\", profile)\n\n\nfor i in link:\n    if i.endswith(\'pdf\'):\n        driver = webdriver.Chrome(\'/usr/bin/chromedriver\', chrome_options=options)\n        driver.get(i)\n\ndownload_done()\nbrowser.close()\ndriver.close()\n\n\n'),(3,5,'PCver1.txt',0,'Thanh-123dascascsacascsacklsmcalkcdscaml\nLong-ascamdklsclk124123r233rkml\nCanh-csclakmsdaklmmdksmclaksmdcasdl\nHoang-csakclamckdalmcsd\n\n'),(4,4,'CTver1.txt',1,'123dascascsacascsacklsmcalkcdscaml[00:01:30~00:02:20]\n\nascamdklsclk124123r233rkml[00:01:25~00:01:50]\n\ncsclakmsdaklmmdksmclaksmdcasdl[00:00:59~00:01:16]\n\ncsakclamckdalmcsd[00:00:05~00:01:00]\n'),(5,4,'PCver1.txt',0,'Thanh-123dascascsacascsacklsmcalkcdscaml\nLong-ascamdklsclk124123r233rkml\nCanh-csclakmsdaklmmdksmclaksmdcasdl\nHoang-csakclamckdalmcsd\n\n'),(6,5,'CTver1.txt',1,'123dascascsacascsacklsmcalkcdscaml[00:01:30~00:02:20]\n\nascamdklsclk124123r233rkml[00:01:25~00:01:50]\n\ncsclakmsdaklmmdksmclaksmdcasdl[00:00:59~00:01:16]\n\ncsakclamckdalmcsd[00:00:05~00:01:00]\n');
/*!40000 ALTER TABLE `reportparts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reports`
--

DROP TABLE IF EXISTS `reports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reports` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meetingId` int(11) NOT NULL,
  `reportContent` mediumtext COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_meeting_id` (`meetingId`),
  CONSTRAINT `fk_meeting_id` FOREIGN KEY (`meetingId`) REFERENCES `meetings` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reports`
--

LOCK TABLES `reports` WRITE;
/*!40000 ALTER TABLE `reports` DISABLE KEYS */;
INSERT INTO `reports` VALUES (1,4,'[ 00:01:30 ~ 00:02:20 ] Thanh - 123dascascsacascsacklsmcalkcdscaml\n[ 00:01:25 ~ 00:01:50 ] Long - ascamdklsclk124123r233rkml\n[ 00:00:59 ~ 00:01:16 ] Canh - csclakmsdaklmmdksmclaksmdcasdl\n[ 00:00:05 ~ 00:01:00 ] Hoang - csakclamckdalmcsd\n'),(2,4,'[ 00:01:30 ~ 00:02:20 ] Thanh - 123dascascsacascsacklsmcalkcdscaml\n[ 00:01:25 ~ 00:01:50 ] Long - ascamdklsclk124123r233rkml\n[ 00:00:59 ~ 00:01:16 ] Canh - csclakmsdaklmmdksmclaksmdcasdl\n[ 00:00:05 ~ 00:01:00 ] Hoang - csakclamckdalmcsd\n'),(3,4,'[ 00:01:30 ~ 00:02:20 ] Thanh - 123dascascsacascsacklsmcalkcdscaml\n[ 00:01:25 ~ 00:01:50 ] Long - ascamdklsclk124123r233rkml\n[ 00:00:59 ~ 00:01:16 ] Canh - csclakmsdaklmmdksmclaksmdcasdl\n[ 00:00:05 ~ 00:01:00 ] Hoang - csakclamckdalmcsd\n'),(4,1,''),(5,5,'[ 00:01:30 ~ 00:02:20 ] Thanh - 123dascascsacascsacklsmcalkcdscaml\n[ 00:01:25 ~ 00:01:50 ] Long - ascamdklsclk124123r233rkml\n[ 00:00:59 ~ 00:01:16 ] Canh - csclakmsdaklmmdksmclaksmdcasdl\n[ 00:00:05 ~ 00:01:00 ] Hoang - csakclamckdalmcsd\n');
/*!40000 ALTER TABLE `reports` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `fullname` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `position` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'thanhdovan','1234','thanh','admin'),(2,'canhnguyenduc','1234','canh','manager'),(4,'longlengoc','1234','long','staff'),(6,'hoangtrongnguyen','1234','hoang','staff'),(7,'tungvuduc','1234','tung','manager');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'quanlybienban'
--

--
-- Dumping routines for database 'quanlybienban'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-05 16:22:23
