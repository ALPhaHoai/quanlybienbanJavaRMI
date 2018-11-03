-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 03, 2018 at 04:34 PM
-- Server version: 5.7.24-0ubuntu0.18.04.1
-- PHP Version: 7.2.10-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlybienban1`
--

-- --------------------------------------------------------

--
-- Table structure for table `meetings`
--

CREATE TABLE `meetings` (
  `id` int(11) NOT NULL,
  `meetingTitle` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `meetingDate` date NOT NULL,
  `timeStart` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `meetings`
--

INSERT INTO `meetings` (`id`, `meetingTitle`, `meetingDate`, `timeStart`) VALUES
(1, 'Hop ABC', '2018-11-21', '08:00:00'),
(3, 'Hop CDE', '2018-11-13', '08:00:00'),
(4, 'Hop ve DEF', '2018-11-14', '07:00:00'),
(5, 'Hop ve EFG', '2018-11-22', '16:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `reportparts`
--

CREATE TABLE `reportparts` (
  `id` int(11) NOT NULL,
  `meetingId` int(11) NOT NULL,
  `fileName` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `type` int(11) NOT NULL,
  `reportPartContent` mediumtext COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `reportparts`
--

INSERT INTO `reportparts` (`id`, `meetingId`, `fileName`, `type`, `reportPartContent`) VALUES
(1, 3, '', 1, 'from selenium import webdriver\nimport os\n\n\ndef download_done():\n    for i in os.listdir(download_dir):\n        if \".crdownload\" in i:\n            time.sleep(1)\n            download_done()\n\n\nbrowser = webdriver.Chrome()\nbrowser.get((\'http://is.hust.edu.vn/~phuongnh/thdl/\'))\n\nlinksize = browser.find_elements_by_tag_name(\"a\")\nlink = []\nfor x in linksize:\n    link.append(x.get_attribute(\"href\"))\n\nfor x in link:\n    if x.endswith(\"docx\") or x.endswith(\"doc\"):\n        browser.get(x)\n\ndownload_dir=\"/home/wnncr/Downloads\"\noptions = webdriver.ChromeOptions()\nprofile = {\"plugins.plugins_list\": [{\"enabled\": False, \"name\": \"Chrome PDF Viewer\"}],\"download.default_directory\": download_dir , \"download.extensions_to_open\": \"applications/pdf\"}\noptions.add_experimental_option(\"prefs\", profile)\n\n\nfor i in link:\n    if i.endswith(\'pdf\'):\n        driver = webdriver.Chrome(\'/usr/bin/chromedriver\', chrome_options=options)\n        driver.get(i)\n\ndownload_done()\nbrowser.close()\ndriver.close()\n\n\n'),
(2, 3, 'downloadXML.py', 0, 'from selenium import webdriver\nimport os\n\n\ndef download_done():\n    for i in os.listdir(download_dir):\n        if \".crdownload\" in i:\n            time.sleep(1)\n            download_done()\n\n\nbrowser = webdriver.Chrome()\nbrowser.get((\'http://is.hust.edu.vn/~phuongnh/thdl/\'))\n\nlinksize = browser.find_elements_by_tag_name(\"a\")\nlink = []\nfor x in linksize:\n    link.append(x.get_attribute(\"href\"))\n\nfor x in link:\n    if x.endswith(\"docx\") or x.endswith(\"doc\"):\n        browser.get(x)\n\ndownload_dir=\"/home/wnncr/Downloads\"\noptions = webdriver.ChromeOptions()\nprofile = {\"plugins.plugins_list\": [{\"enabled\": False, \"name\": \"Chrome PDF Viewer\"}],\"download.default_directory\": download_dir , \"download.extensions_to_open\": \"applications/pdf\"}\noptions.add_experimental_option(\"prefs\", profile)\n\n\nfor i in link:\n    if i.endswith(\'pdf\'):\n        driver = webdriver.Chrome(\'/usr/bin/chromedriver\', chrome_options=options)\n        driver.get(i)\n\ndownload_done()\nbrowser.close()\ndriver.close()\n\n\n');

-- --------------------------------------------------------

--
-- Table structure for table `reports`
--

CREATE TABLE `reports` (
  `id` int(11) NOT NULL,
  `meetingId` int(11) NOT NULL,
  `reportContent` mediumtext COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `fullname` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `position` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `fullname`, `position`) VALUES
(1, 'thanhdovan', '1234', 'thanh', 'admin'),
(2, 'canhnguyenduc', '1234', 'canh', 'manager'),
(4, 'longlengoc', '1234', 'long', 'staff'),
(6, 'hoangtrongnguyen', '1234', 'hoang', 'staff'),
(7, 'tungvuduc', '1234', 'tung', 'manager');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `meetings`
--
ALTER TABLE `meetings`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reportparts`
--
ALTER TABLE `reportparts`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_meetingId` (`meetingId`);

--
-- Indexes for table `reports`
--
ALTER TABLE `reports`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_meeting_id` (`meetingId`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `meetings`
--
ALTER TABLE `meetings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `reportparts`
--
ALTER TABLE `reportparts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `reports`
--
ALTER TABLE `reports`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reportparts`
--
ALTER TABLE `reportparts`
  ADD CONSTRAINT `fk_meetingId` FOREIGN KEY (`meetingId`) REFERENCES `meetings` (`id`);

--
-- Constraints for table `reports`
--
ALTER TABLE `reports`
  ADD CONSTRAINT `fk_meeting_id` FOREIGN KEY (`meetingId`) REFERENCES `meetings` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
