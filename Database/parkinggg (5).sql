-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2024 at 11:05 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `parkir`
--

-- --------------------------------------------------------

--
-- Table structure for table `parkinggg`
--

CREATE TABLE `parkinggg` (
  `ID` int(11) NOT NULL,
  `Plat Nomor` varchar(30) DEFAULT NULL,
  `Jenis Kendaraan` varchar(30) DEFAULT NULL,
  `Jam Masuk` varchar(30) DEFAULT NULL,
  `Jam Keluar` varchar(30) DEFAULT NULL,
  `Lama Parkir` varchar(30) DEFAULT NULL,
  `Total Bayar` varchar(30) DEFAULT NULL,
  `Status Pembayaran` varchar(30) NOT NULL DEFAULT 'Menunggu '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `parkinggg`
--

INSERT INTO `parkinggg` (`ID`, `Plat Nomor`, `Jenis Kendaraan`, `Jam Masuk`, `Jam Keluar`, `Lama Parkir`, `Total Bayar`, `Status Pembayaran`) VALUES
(1, 'B1234III', '', NULL, NULL, NULL, NULL, 'Menunggu '),
(4, 'B 1231 WWW', '', '2024-05-07 08:55:36', '2024-05-13 08:30:41', '143:35:05', 'Rp 288000', 'Sudah Bayar'),
(5, 'B 1111 Q', '', '2024-05-07 09:34:20', '2024-05-13 08:27:01', '142:52:41', 'Rp 286000', 'Sudah Bayar'),
(7, 'B 1211 QQQ', '', '2024-05-07 09:52:10', '2024-05-13 08:30:36', '142:38:26', 'Rp 286000', 'Sudah Bayar'),
(8, 'B 5555 QQ', '', '2024-05-07 10:10:22', '2024-05-13 08:30:32', '142:20:10', 'Rp 286000', 'Sudah Bayar'),
(22, 'B 1111 CDW', '', '2024-05-08 10:07:00', '2024-05-13 08:30:27', '118:23:27', 'Rp 238000', 'Sudah Bayar'),
(23, 'B 1211 JKL', 'Mobil', '2024-05-08 10:11:53', '2024-05-13 08:27:30', '118:15:37', 'Rp 358000', 'Sudah Bayar'),
(24, 'K 6010 FFF', 'Motor', '2024-05-08 10:12:06', '2024-05-13 08:30:20', '118:18:14', 'Rp 238000', 'Sudah Bayar'),
(25, 'K 6019 FFF', 'Mobil', '2024-05-08 10:32:59', '2024-05-13 08:29:45', '117:56:46', 'Rp 355000', 'Sudah Bayar'),
(26, 'B 1234 KLM', 'Motor', '2024-05-08 10:33:10', '2024-05-13 08:29:41', '117:56:31', 'Rp 236000', 'Sudah Bayar'),
(27, 'B 1256 JKL', 'Mobil', '2024-05-08 10:38:40', '2024-05-13 08:29:34', '117:50:54', 'Rp 355000', 'Sudah Bayar'),
(28, 'V 3456 FGJ', 'Motor', '2024-05-08 10:38:51', '2024-05-13 08:27:39', '117:48:48', 'Rp 236000', 'Sudah Bayar'),
(33, 'B 1212 ASD', 'Mobil', '2024-05-08 10:45:16', '2024-05-13 08:29:29', '117:44:13', 'Rp 355000', 'Sudah Bayar'),
(34, 'V 1341 SFS', 'Motor', '2024-05-08 10:45:24', '2024-05-13 08:29:25', '117:44:01', 'Rp 236000', 'Sudah Bayar'),
(35, 'B 1231 HHH', 'Mobil', '2024-05-08 10:49:38', '2024-05-13 08:27:35', '117:37:57', 'Rp 355000', 'Sudah Bayar'),
(36, 'B 1299 IUI', 'Motor', '2024-05-08 10:49:57', '2024-05-13 08:28:45', '117:38:48', 'Rp 236000', 'Sudah Bayar'),
(37, 'B 1211 YYY', 'Mobil', '2024-05-08 10:54:24', '2024-05-13 08:28:39', '117:34:15', 'Rp 355000', 'Sudah Bayar'),
(38, 'B 4344 IQU', 'Motor', '2024-05-08 10:54:35', '2024-05-13 08:28:34', '117:33:59', 'Rp 236000', 'Sudah Bayar'),
(39, 'A 5555 YYY', 'Mobil', '2024-05-08 11:19:21', '2024-05-13 08:28:21', '117:09:00', 'Rp 355000', 'Sudah Bayar'),
(41, 'B 111 QWQ', 'Mobil', '2024-05-08 14:49:17', '2024-05-13 06:11:59', '111:22:42', 'Rp 337000', 'Sudah Bayar'),
(43, 'B22QQ', 'Motor', '2024-05-10 08:22:29', '2024-05-13 08:28:11', '72:05:42', 'Rp 146000', 'Sudah Bayar'),
(47, 'B11WW', 'Mobil', '2024-05-10 08:49:33', '2024-05-13 08:28:05', '71:38:32', 'Rp 217000', 'Sudah Bayar'),
(48, 'B123QWE', 'Mobil', '2024-05-10 13:46:13', '2024-05-10 17:14:43', '03:28:30', 'Rp 13000', 'Sudah Bayar'),
(49, 'B22FDA', 'Mobil', '2024-05-10 16:34:57', '2024-05-13 08:28:00', '63:53:03', 'Rp 193000', 'Sudah Bayar'),
(50, 'B3133Q', 'Mobil', '2024-05-10 16:39:05', '2024-05-13 08:27:47', '63:48:42', 'Rp 193000', 'Sudah Bayar'),
(51, 'B434EWD', 'Mobil', '2024-05-10 16:41:34', '2024-05-13 06:12:18', '61:30:44', 'Rp 187000', 'Sudah Bayar'),
(52, 'B656RTR', 'Mobil', '2024-05-10 16:44:59', '2024-05-11 15:35:07', '22:50:08', 'Rp 70000', 'Sudah Bayar'),
(53, 'B5455R', 'Mobil', '2024-05-10 16:56:15', '2024-05-10 17:12:18', '00:16:03', 'Rp 4000', 'Sudah Bayar'),
(54, 'B331OOP', 'Mobil', '2024-05-10 17:16:22', '2024-05-10 17:16:43', '00:00:21', 'Rp 4000', 'Sudah Bayar'),
(55, 'B3332WER', 'Mobil', '2024-05-13 05:28:49', '2024-05-13 05:41:38', '00:12:49', 'Rp 4000', 'Sudah Bayar'),
(56, 'B4432TUY', 'Motor', '2024-05-13 05:39:08', '2024-05-13 05:39:25', '00:00:17', 'Rp 2000', 'Sudah Bayar'),
(57, 'B5352QWE', 'Motor', '2024-05-13 05:41:21', '2024-05-13 09:51:36', '04:10:15', 'Rp 10000', 'Sudah Bayar'),
(58, 'B1211QWR', 'Mobil', '2024-05-13 09:54:08', '2024-05-13 10:37:39', '00:43:31', 'Rp 4000', 'Sudah Bayar'),
(59, 'B3112TYU', 'Mobil', '2024-05-13 10:43:24', '2024-05-13 12:04:40', '01:21:16', 'Rp 7000', 'Sudah Bayar'),
(60, 'B4344FGG', 'Mobil', '2024-05-13 10:43:35', '2024-05-13 12:21:25', '01:37:50', 'Rp 7000', 'Sudah Bayar'),
(61, 'M33EQ', 'Mobil', '2024-05-13 10:43:44', '2024-05-13 12:24:53', '101:09', 'Rp 307000.0', 'Sudah Bayar'),
(62, 'B222QQ', 'Mobil', '2024-05-13 12:25:47', '2024-05-13 12:26:17', '0:30', 'Rp 4000.0', 'Sudah Bayar'),
(63, 'G322WER', 'Mobil', '2024-05-13 12:25:54', '2024-05-13 12:31:13', '5:19', 'Rp 19000.0', 'Sudah Bayar'),
(64, 'D123QWW', 'Mobil', '2024-05-13 12:26:00', '2024-05-13 12:41:10', '15:10', 'Rp 49000.0', 'Sudah Bayar'),
(68, 'B7768JKI', 'Motor', '2024-05-13 12:34:31', '2024-05-14 12:58:34', '1464:03', 'Rp 2930000.0', 'Sudah Bayar'),
(78, 'B8574UAL', 'Mobil', '2024-05-13 16:03:42', '2024-05-13 16:04:42', '1:00', 'Rp 4000.0', 'Sudah Bayar'),
(79, 'B5366WEL', 'Motor', '2024-05-13 16:03:51', NULL, NULL, NULL, 'Menunggu '),
(80, 'N728II', 'Motor', '2024-05-13 16:04:01', '2024-05-13 16:04:57', '0:56', 'Rp 2000.0', 'Sudah Bayar'),
(81, 'R8009RAR', 'Mobil', '2024-05-13 16:04:15', NULL, NULL, NULL, 'Menunggu ');

--
-- Triggers `parkinggg`
--
DELIMITER $$
CREATE TRIGGER `check_plat` BEFORE INSERT ON `parkinggg` FOR EACH ROW BEGIN
    DECLARE isValid INT;

    IF NEW.`Jenis Kendaraan` IN ('Mobil', 'Motor') THEN
        SET isValid = CASE 
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 10 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 9 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 8 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 7 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 8 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][0-9][0-9][A-Z][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 7 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][0-9][0-9][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 6 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][0-9][0-9][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 7 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][0-9][A-Z][A-Z][A-Z]$' THEN 1
	WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 6 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][0-9][A-Z][A-Z]$' THEN 1
	WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 5 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][0-9][A-Z]$' THEN 1           
	WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 6 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][A-Z][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 5 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 4 AND NEW.`Plat Nomor` REGEXP '^[A-Z][A-Z][0-9][A-Z]$' THEN 1
        

        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 8 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][0-9][0-9][0-9][A-Z][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 7 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][0-9][0-9][0-9][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 6 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][0-9][0-9][0-9][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 7 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][0-9][0-9][A-Z][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 6 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][0-9][0-9][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 5 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][0-9][0-9][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 6 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][0-9][A-Z][A-Z][A-Z]$' THEN 1
	WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 5 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][0-9][A-Z][A-Z]$' THEN 1
	WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 4 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][0-9][A-Z]$' THEN 1
	WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 5 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][A-Z][A-Z][A-Z]$' THEN 1
	WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 4 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][A-Z][A-Z]$' THEN 1
        WHEN CHAR_LENGTH(NEW.`Plat Nomor`) = 3 AND NEW.`Plat Nomor` REGEXP '^[A-Z][0-9][A-Z]$' THEN 1
            ELSE 0
        END;

        IF isValid <> 1 THEN
            SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Plat Nomor tidak valid';
        END IF;
    END IF;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `parkinggg`
--
ALTER TABLE `parkinggg`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `parkinggg`
--
ALTER TABLE `parkinggg`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
