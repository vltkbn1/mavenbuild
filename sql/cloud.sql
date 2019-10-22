-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 22, 2019 at 03:05 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cloud`
--

-- --------------------------------------------------------

--
-- Table structure for table `qlnv`
--

CREATE TABLE `qlnv` (
  `id` int(11) NOT NULL,
  `manv` varchar(10) NOT NULL,
  `tennv` varchar(255) NOT NULL,
  `dc` varchar(255) NOT NULL,
  `sdt` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `qlnv`
--

INSERT INTO `qlnv` (`id`, `manv`, `tennv`, `dc`, `sdt`) VALUES
(1, 'DTC01', 'Nguyen Vu', 'Ha Noi', 974322834),
(6, 'DTC03', 'Nguy&#7877;n Vi&#7879;t', 'Hoa Binh', 82587589),
(7, 'DTC03', 'Nguy&#7877;n Vi&#7879;t', 'Hoa Binh', 82587589),
(10, 'DTC04', 'Phan Long', 'Pho Yen', 98798798);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('123', '123'),
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `qlnv`
--
ALTER TABLE `qlnv`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `qlnv`
--
ALTER TABLE `qlnv`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
