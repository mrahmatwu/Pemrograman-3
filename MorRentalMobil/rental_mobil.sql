-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 30, 2015 at 03:54 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rental_mobil`
--

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE IF NOT EXISTS `mobil` (
  `kode_mobil` int(11) NOT NULL,
  `nama_mobil` varchar(20) NOT NULL,
  `merek_mobil` varchar(15) NOT NULL,
  `tahun_mobil` int(11) NOT NULL,
  `harga_sewa` int(11) NOT NULL,
  PRIMARY KEY (`kode_mobil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`kode_mobil`, `nama_mobil`, `merek_mobil`, `tahun_mobil`, `harga_sewa`) VALUES
(1, 'sgfeg', 'sfef', 31, 234),
(2, 'fsf', 'sdf', 32411, 32411),
(4, 'avan12', 'toyota4', 2013, 2013),
(24, 'qwqw', 'sfd1', 23133, 2311),
(124, 'sfdf', 'dgfg', 3524, 2535);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE IF NOT EXISTS `pelanggan` (
  `kode_pelanggan` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `no_telepon` int(11) NOT NULL,
  PRIMARY KEY (`kode_pelanggan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`kode_pelanggan`, `nama`, `alamat`, `no_telepon`) VALUES
(1, 'as', 'asefw', 32431),
(2, 'qwd', 'qwdwd', 897),
(3, 'qwdsfe', 'qwdwda', 897),
(4, 'tes', 'tes', 1243);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `no_transaksi` int(11) NOT NULL,
  `tanggal` varchar(15) NOT NULL,
  `kode_pelanggan` int(11) NOT NULL,
  `kode_mobil` int(11) NOT NULL,
  `type_mobil` varchar(15) NOT NULL,
  `biaya_sewa` int(11) NOT NULL,
  `lama_sewa` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  PRIMARY KEY (`no_transaksi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`no_transaksi`, `tanggal`, `kode_pelanggan`, `kode_mobil`, `type_mobil`, `biaya_sewa`, `lama_sewa`, `total`) VALUES
(1, '2015-10-05', 1, 2, 'Innova', 2000, 2, 4000),
(2, '2015-03-13', 23, 342, 'Xenia', 9000, 2, 10000),
(3, '2015-04-15', 4, 3, 'Innova', 2000, 4, 8000),
(5, '2015-10-30', 123, 1232, 'Xenia', 200000, 2, 400000),
(13, '2015-03-21', 1, 43, 'Innova', 2000, 3, 6000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
