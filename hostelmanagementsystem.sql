-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2017 at 10:27 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hostelmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `father_name` varchar(255) NOT NULL,
  `cnic` int(17) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `eductionLevel` varchar(255) NOT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  `securityFee` int(22) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `name`, `father_name`, `cnic`, `date_of_birth`, `eductionLevel`, `college_name`, `securityFee`) VALUES
(1, 'sohai', 'ss', 99, 'Sat Sep 16 00:00:00 PKT 1995', 'bsse', 'RIU', 2000),
(2, 'SOH', '99', 99, 'Sat Sep 16 00:00:00 PKT 1995', 'bss', 'dd', 200),
(3, 'soh', 'rr', 22, 'Sat Sep 16 00:00:00 PKT 1995', 'bsse', 'riu', 2000),
(4, 's', 's', 9, 'Sat Sep 16 00:00:00 PKT 1995', 'bsse', 'riu', 200),
(5, 's', 's', 9, 'Sat Sep 16 00:00:00 PKT 1995', 'bsse', 'riu', 200),
(6, 's', 'k', 8, 'Sat Sep 16 00:00:00 PKT 1995', 'BSSE', 'riu', 2000),
(7, 'sohail', 'ii', 99, 'Sat Sep 16 00:00:00 PKT 1995', 'bsse', 'riu', 2000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
