-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 16, 2018 at 05:17 PM
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
-- Database: `quanlybienban`
--

-- --------------------------------------------------------

--
-- Table structure for table `meetings`
--

CREATE TABLE `meetings` (
  `id` int(11) NOT NULL,
  `userCreateId` int(11) NOT NULL,
  `meetingTitle` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `meetingDate` date NOT NULL,
  `timeStart` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `meetings`
--

INSERT INTO `meetings` (`id`, `userCreateId`, `meetingTitle`, `meetingDate`, `timeStart`) VALUES
(1, 2, 'Hop ve ABC', '2018-11-21', '09:00:00'),
(3, 2, 'Hop CDE', '2018-11-13', '08:00:00'),
(8, 2, 'meeting 8', '2018-11-14', '18:00:00'),
(14, 2, 'meeting 14', '2018-11-14', '19:00:00'),
(16, 2, 'meeting 16', '2018-11-14', '15:00:00'),
(17, 2, 'Meeting 17', '2018-11-14', '13:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `peopleeditreport`
--

CREATE TABLE `peopleeditreport` (
  `id` int(11) NOT NULL,
  `reportId` int(11) NOT NULL,
  `userId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(1, 1, 'PCver1.txt', 0, 'Thanh-123dascascsacascsacklsmcalkcdscaml\nLong-ascamdklsclk124123r233rkml\nCanh-csclakmsdaklmmdksmclaksmdcasdl\nHoang-csakclamckdalmcsd\n\n'),
(2, 1, 'CTver1.txt', 1, '123dascascsacascsacklsmcalkcdscaml[00:01:30~00:02:20]\n\nascamdklsclk124123r233rkml[00:01:25~00:01:50]\n\ncsclakmsdaklmmdksmclaksmdcasdl[00:00:59~00:01:16]\n\ncsakclamckdalmcsd[00:00:05~00:01:00]\n');

-- --------------------------------------------------------

--
-- Table structure for table `reports`
--

CREATE TABLE `reports` (
  `id` int(11) NOT NULL,
  `meetingId` int(11) NOT NULL,
  `reportName` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `reportContent` mediumtext COLLATE utf8_unicode_ci NOT NULL,
  `timeCreate` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `reports`
--

INSERT INTO `reports` (`id`, `meetingId`, `reportName`, `reportContent`, `timeCreate`) VALUES
(1, 1, 'MID1Report', 'Bien Ban Cuoc Hop Hop ABC\n\nThanh vien tham gia: \n+ Thanh\n+ Long\n+ Canh\n+ Hoang\n\nNoi dung cuoc hop:\n[ 00:00:05 ~ 00:01:00 ] Hoang - csakclamckdalmcsd\n[ 00:00:59 ~ 00:01:16 ] Canh - csclakmsdaklmmdksmclaksmdcasdl\n[ 00:01:25 ~ 00:01:50 ] Long - ascamdklsclk124123r233rkml\n[ 00:01:30 ~ 00:02:20 ] Thanh - 123dascascsacascsacklsmcalkcdscaml\n', '09:30:52'),
(2, 1, 'MID1Report', 'Bien Ban Cuoc Hop Hop ABC\n\nThanh vien tham gia: \n+ Thanh\n+ Long\n+ Canh\n+ Hoang\n\nThoi gian bat dau: 08:00:00 AM\n\nNoi dung cuoc hop:\n[ 00:00:05 ~ 00:01:00 ] Hoang - csakclamckdalmcsd\n[ 00:00:59 ~ 00:01:16 ] Canh - csclakmsdaklmmdksmclaksmdcasdl\n[ 00:01:25 ~ 00:01:50 ] Long - ascamdklsclk124123r233rkml\n[ 00:01:30 ~ 00:02:20 ] Thanh - 123dascascsacascsacklsmcalkcdscaml\n', '09:30:52'),
(3, 1, 'MID1Report', 'Bien Ban Cuoc Hop Hop ABC\n\nThanh vien tham gia: \n+ Thanh\n+ Long\n+ Canh\n+ Hoang\n\nThoi gian bat dau: 08:00:00 AM\nThoi gian ket thuc: 10:00:00AM\n\nNoi dung cuoc hop:\n[ 00:00:05 ~ 00:01:00 ] Hoang - csakclamckdalmcsd\n[ 00:00:59 ~ 00:01:16 ] Canh - csclakmsdaklmmdksmclaksmdcasdl\n[ 00:01:25 ~ 00:01:50 ] Long - ascamdklsclk124123r233rkml\n[ 00:01:30 ~ 00:02:20 ] Thanh - 123dascascsacascsacklsmcalkcdscaml\n', '08:55:30'),
(4, 1, 'MID1Report', 'Bien Ban Cuoc Hop Hop ABC\n\nThanh vien tham gia: \n+ Thanh\n+ Long\n+ Canh\n+ Hoang\n\nThoi gian bat dau: 08:00:00 AM\n\nNoi dung cuoc hop:\n[ 00:00:05 ~ 00:01:00 ] Hoang - csakclamckdalmcsd\n[ 00:00:59 ~ 00:01:16 ] Canh - csclakmsdaklmmdksmclaksmdcasdl\n[ 00:01:25 ~ 00:01:50 ] Long - ascamdklsclk124123r233rkml\n[ 00:01:30 ~ 00:02:20 ] Thanh - 123dascascsacascsacklsmcalkcdscaml\n', '20:57:36'),
(5, 1, 'MID1Report', 'Bien Ban Cuoc Hop Hop ABC\n\nThanh vien tham gia: \n+ Thanh\n+ Long\n+ Canh\n+ Hoang\n\nThoi gian bat dau: 08:00:00 AM\nThoi gian ket thuc: 10:00\n\nNoi dung cuoc hop:\n[ 00:00:05 ~ 00:01:00 ] Hoang - csakclamckdalmcsd\n[ 00:00:59 ~ 00:01:16 ] Canh - csclakmsdaklmmdksmclaksmdcasdl\n[ 00:01:25 ~ 00:01:50 ] Long - ascamdklsclk124123r233rkml\n[ 00:01:30 ~ 00:02:20 ] Thanh - 123dascascsacascsacklsmcalkcdscaml\n', '22:05:19');

-- --------------------------------------------------------

--
-- Table structure for table `userpermission`
--

CREATE TABLE `userpermission` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `meetingId` int(11) NOT NULL,
  `permission` varchar(11) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `userpermission`
--

INSERT INTO `userpermission` (`id`, `userId`, `meetingId`, `permission`) VALUES
(45, 6, 14, 'r'),
(46, 6, 16, 'r'),
(47, 1, 17, 'r'),
(49, 8, 14, 'r'),
(59, 1, 14, 'u'),
(61, 6, 17, 'r'),
(62, 6, 8, 'w'),
(63, 1, 3, 'u'),
(64, 4, 3, 'r');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `fullname` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `position` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `fullname`, `position`) VALUES
(1, 'thanhdovan', '81dc9bdb52d04dc20036dbd8313ed055', 'thanh', 'staff'),
(2, 'canhnguyenduc', '81dc9bdb52d04dc20036dbd8313ed055', 'canh', 'manager'),
(4, 'longlengoc', '81dc9bdb52d04dc20036dbd8313ed055', 'long', 'staff'),
(6, 'hoangnguyentrong', '81dc9bdb52d04dc20036dbd8313ed055', 'hoang', 'manager'),
(7, 'tungvuduc', '81dc9bdb52d04dc20036dbd8313ed055', 'tung', 'admin'),
(8, 'manager', '81dc9bdb52d04dc20036dbd8313ed055', 'Manager', 'manager');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `meetings`
--
ALTER TABLE `meetings`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_user_create_id` (`userCreateId`);

--
-- Indexes for table `peopleeditreport`
--
ALTER TABLE `peopleeditreport`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_report_id` (`reportId`),
  ADD KEY `fk_userId` (`userId`);

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
-- Indexes for table `userpermission`
--
ALTER TABLE `userpermission`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fkUserId` (`userId`),
  ADD KEY `fkMeetingId` (`meetingId`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `peopleeditreport`
--
ALTER TABLE `peopleeditreport`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reportparts`
--
ALTER TABLE `reportparts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `reports`
--
ALTER TABLE `reports`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `userpermission`
--
ALTER TABLE `userpermission`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `meetings`
--
ALTER TABLE `meetings`
  ADD CONSTRAINT `fk_user_create_id` FOREIGN KEY (`userCreateId`) REFERENCES `users` (`id`);

--
-- Constraints for table `peopleeditreport`
--
ALTER TABLE `peopleeditreport`
  ADD CONSTRAINT `fk_report_id` FOREIGN KEY (`reportId`) REFERENCES `reports` (`id`),
  ADD CONSTRAINT `fk_userId` FOREIGN KEY (`userId`) REFERENCES `users` (`id`);

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

--
-- Constraints for table `userpermission`
--
ALTER TABLE `userpermission`
  ADD CONSTRAINT `fkMeetingId` FOREIGN KEY (`meetingId`) REFERENCES `meetings` (`id`),
  ADD CONSTRAINT `fkUserId` FOREIGN KEY (`userId`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
