-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2024 at 12:32 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestion_conge`
--

-- --------------------------------------------------------

--
-- Table structure for table `approbation`
--

CREATE TABLE `approbation` (
  `approbationID` int(11) NOT NULL,
  `approbationConge` int(11) NOT NULL,
  `approbationDate` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `approbation`
--

INSERT INTO `approbation` (`approbationID`, `approbationConge`, `approbationDate`) VALUES
(3, 5, '2024-05-01'),
(4, 6, '2024-05-06'),
(5, 7, '2024-05-06'),
(6, 8, '2024-05-06'),
(7, 9, '2024-05-06'),
(8, 10, '2024-05-06');

-- --------------------------------------------------------

--
-- Table structure for table `categorieemploye`
--

CREATE TABLE `categorieemploye` (
  `typeEmployeID` int(11) NOT NULL,
  `typeEmploye` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categorieemploye`
--

INSERT INTO `categorieemploye` (`typeEmployeID`, `typeEmploye`) VALUES
(1, 'Directeur Generale'),
(2, 'Chef De Service'),
(3, 'Employe Simple'),
(5, 'Directeur Ressources Humaines');

-- --------------------------------------------------------

--
-- Table structure for table `demandeconge`
--

CREATE TABLE `demandeconge` (
  `demandeID` int(11) NOT NULL,
  `demandeEmploye` int(11) NOT NULL,
  `demandeDateDebut` date NOT NULL,
  `demandeDateFin` date NOT NULL,
  `demandeJours` int(11) NOT NULL,
  `demandeMotif` text NOT NULL,
  `demandeEtat` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `demandeconge`
--

INSERT INTO `demandeconge` (`demandeID`, `demandeEmploye`, `demandeDateDebut`, `demandeDateFin`, `demandeJours`, `demandeMotif`, `demandeEtat`) VALUES
(1, 3, '2024-04-30', '2024-05-14', 15, 'la maladie.....', 0),
(2, 1, '2024-04-29', '2024-05-19', 25, 'hospitalisation', 0),
(4, 4, '2024-05-01', '2024-05-20', 20, 'repos medical', 0),
(5, 5, '2024-05-01', '2024-05-20', 20, 'malade', 1),
(6, 10, '2024-05-07', '2024-05-26', 20, 'voyage professionel', 1),
(7, 11, '2024-05-07', '2024-05-18', 12, 'repos', 0),
(8, 12, '2024-05-07', '2024-05-16', 10, 'akaruhuko', 0),
(9, 13, '2024-05-07', '2024-05-11', 5, 'repos', 0),
(10, 14, '2024-05-08', '2024-05-11', 5, 'malade', 0);

-- --------------------------------------------------------

--
-- Table structure for table `employe`
--

CREATE TABLE `employe` (
  `employeID` int(11) NOT NULL,
  `employeMatricule` varchar(20) NOT NULL,
  `employeNom` varchar(50) NOT NULL,
  `employePrenom` varchar(50) NOT NULL,
  `employeAdresse` varchar(50) NOT NULL,
  `employeService` int(11) NOT NULL,
  `employeCategorie` int(11) NOT NULL,
  `employeTelephone` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employe`
--

INSERT INTO `employe` (`employeID`, `employeMatricule`, `employeNom`, `employePrenom`, `employeAdresse`, `employeService`, `employeCategorie`, `employeTelephone`) VALUES
(1, '123/485', 'IZOMPANSAVYE', 'chalom', 'kanyosha', 2, 1, '68894773'),
(3, '345/765', 'MUGISHA', 'Chalome', 'Ruyigi', 1, 1, '78899009'),
(4, '786/098', 'NIYUKURI', 'Prince', 'musaga', 2, 3, '78064321'),
(5, '2345/765', 'NIYUBUNTU', 'Bella', 'kanyosha', 3, 3, '67584033'),
(6, '009/2024', 'NDUWIMANA', 'Elyse', 'Rumonge', 2, 3, '68947362'),
(7, '010/2024', 'IRANKUNDA', 'Christian', 'Kayanza', 1, 3, '69584736'),
(8, '011/2024', 'HABARYGIRA', 'Patrick', 'Kinyinya', 1, 2, '78574625'),
(9, '012/2024', 'KAGABO', 'Pierre', 'Kirundo', 2, 2, '78574625'),
(10, '111/2024', 'DUSENGE', 'Didier', 'kanyosha', 1, 5, '67895466'),
(11, '1010/2024', 'IRAKOZE', 'Nestor', 'kayanza', 2, 2, '68574533'),
(12, '1011', 'MUKAMA', 'Aime', 'ruziba', 3, 5, '67594028'),
(13, '002/2024', 'Kim', 'alain', 'ruyigi', 1, 1, '64324567'),
(14, '003/2024', 'KAGABO', 'Etienne', 'cankuzo', 2, 5, '675859403');

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE `service` (
  `serviceID` int(11) NOT NULL,
  `serviceNom` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `service`
--

INSERT INTO `service` (`serviceID`, `serviceNom`) VALUES
(1, 'Comptabilite'),
(2, 'reseaux informatique'),
(3, 'programmation');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `approbation`
--
ALTER TABLE `approbation`
  ADD PRIMARY KEY (`approbationID`),
  ADD KEY `approbationConge` (`approbationConge`);

--
-- Indexes for table `categorieemploye`
--
ALTER TABLE `categorieemploye`
  ADD PRIMARY KEY (`typeEmployeID`);

--
-- Indexes for table `demandeconge`
--
ALTER TABLE `demandeconge`
  ADD PRIMARY KEY (`demandeID`),
  ADD KEY `demandeEmploye` (`demandeEmploye`);

--
-- Indexes for table `employe`
--
ALTER TABLE `employe`
  ADD PRIMARY KEY (`employeID`),
  ADD KEY `employeService` (`employeService`),
  ADD KEY `employeType` (`employeCategorie`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`serviceID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `approbation`
--
ALTER TABLE `approbation`
  MODIFY `approbationID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `categorieemploye`
--
ALTER TABLE `categorieemploye`
  MODIFY `typeEmployeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `demandeconge`
--
ALTER TABLE `demandeconge`
  MODIFY `demandeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `employe`
--
ALTER TABLE `employe`
  MODIFY `employeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `service`
--
ALTER TABLE `service`
  MODIFY `serviceID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `approbation`
--
ALTER TABLE `approbation`
  ADD CONSTRAINT `approbation_ibfk_1` FOREIGN KEY (`approbationConge`) REFERENCES `demandeconge` (`demandeID`);

--
-- Constraints for table `demandeconge`
--
ALTER TABLE `demandeconge`
  ADD CONSTRAINT `demandeconge_ibfk_1` FOREIGN KEY (`demandeEmploye`) REFERENCES `employe` (`employeID`);

--
-- Constraints for table `employe`
--
ALTER TABLE `employe`
  ADD CONSTRAINT `employe_ibfk_1` FOREIGN KEY (`employeService`) REFERENCES `service` (`serviceID`),
  ADD CONSTRAINT `employe_ibfk_2` FOREIGN KEY (`employeCategorie`) REFERENCES `categorieemploye` (`typeEmployeID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
