-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2018 at 05:47 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `silau`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `idAdmin` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tglLahir` date NOT NULL,
  `username` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`idAdmin`, `nama`, `tglLahir`, `username`, `email`, `password`) VALUES
('1301174385', 'ciara', '3918-07-02', 'ciarand', 'ciarand@gmail.com', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `album`
--

CREATE TABLE `album` (
  `idAlbum` varchar(30) NOT NULL,
  `idPenyanyi` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `rilis` date NOT NULL,
  `genre` varchar(30) NOT NULL,
  `produced` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `album`
--

INSERT INTO `album` (`idAlbum`, `idPenyanyi`, `nama`, `rilis`, `genre`, `produced`) VALUES
('12345', '9999999', 'god is a woman', '0011-11-11', 'pop', 'ariana'),
('123456780', '9999999', 'sweetie', '2018-12-11', 'pop', 'Ariana'),
('123456787', '999909876', 'sweetie', '2018-11-11', 'ballad', 'Ariana'),
('album009', '9999999', 'album009', '0111-11-11', 'pop', 'dd'),
('album010', '9999999', 'albumini', '2018-11-11', 'RnB', 'Acuu'),
('artist00', '9999999', 'Album00', '2018-11-11', 'pop', 'artist00');

-- --------------------------------------------------------

--
-- Table structure for table `detailtracklist`
--

CREATE TABLE `detailtracklist` (
  `id_detailTransaksi` int(11) NOT NULL,
  `idTracklist` varchar(30) NOT NULL,
  `idLagu` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lagu`
--

CREATE TABLE `lagu` (
  `idLagu` varchar(30) NOT NULL,
  `idAlbum` varchar(30) DEFAULT NULL,
  `idAdmin` varchar(30) NOT NULL,
  `judul` varchar(30) NOT NULL,
  `funFact` varchar(200) NOT NULL,
  `seen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lagu`
--

INSERT INTO `lagu` (`idLagu`, `idAlbum`, `idAdmin`, `judul`, `funFact`, `seen`) VALUES
('111111112', NULL, '1301174385', 'Thankyou, next pt.2', 'lagu buat mantan', 0),
('555', '123456780', '1301174385', 'dgdgd', 'hnjm', 0),
('999', '123456780', '1301174385', 'KITA', 'HSJDBDHED', 0),
('lagu00', '123456780', '1301174385', 'iya', 'xxxxxxxxx', 0);

-- --------------------------------------------------------

--
-- Table structure for table `lirik`
--

CREATE TABLE `lirik` (
  `idLirik` varchar(30) NOT NULL,
  `detailLirik` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lirik`
--

INSERT INTO `lirik` (`idLirik`, `detailLirik`) VALUES
('111111112', 'aa'),
('555', 'xcvbnm,'),
('999', 'ASDFGHJKL;'),
('lagu00', '00');

-- --------------------------------------------------------

--
-- Table structure for table `manusia`
--

CREATE TABLE `manusia` (
  `nik` varchar(30) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `noHp` varchar(12) NOT NULL,
  `tglLahir` date NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manusia`
--

INSERT INTO `manusia` (`nik`, `nama`, `noHp`, `tglLahir`, `alamat`) VALUES
('1301174385', 'ciara', '089765432123', '1918-07-02', 'jakarta'),
('1301174541', 'shahnaz', '087787608510', '2015-12-31', 'bandung');

-- --------------------------------------------------------

--
-- Table structure for table `menyanyikan`
--

CREATE TABLE `menyanyikan` (
  `idMenyanyikan` varchar(30) NOT NULL,
  `idPenyanyi` varchar(30) NOT NULL,
  `idLagu` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `penyanyi`
--

CREATE TABLE `penyanyi` (
  `idPenyanyi` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `about` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyanyi`
--

INSERT INTO `penyanyi` (`idPenyanyi`, `nama`, `about`) VALUES
('000', 'dd', 'hehehhehee'),
('002', 'Sheila On 7', 'Sheila on 7 yang digawangi Duta (Vokal), Eross (Lead Guitar), Sakti (Rhythm Guitar), Adam (Bass), dan Anton (Drum) berinisiatif untuk mengajukan demo album pertama mereka ke Major Label di Jakarta setelah single mereka yaitu Kita mendapatkan apresiasi yang positif dari pendengar di Yogyakarta lewat Radio Geronimo FM. Perjalanan yang berliku dilalui oleh band yang berdiri pada tahun 1996 ini kala mengajukan proposal dan demo pembuatan album mereka. Sempat ditolak Warner Music, Sheila on 7 akhirnya resmi dikontrak Sony Music Indonesia pada Oktober 1998 dan langsung melakukan rekaman album di bulan yang sama. '),
('003', 'Dewa 19', 'Dewa 19 adalah sebuah grup musik yang dibentuk pada tahun 1986 di Surabaya, Indonesia. Grup ini telah beberapa kali mengalami pergantian personel dan formasi terakhirnya sebelum dibubarkan pada tahun 2011 adalah Ahmad Dhani (kibor), Andra Junaidi (gitar), Once Mekel (vokal), Yuke Sampurna (bass) dan Agung Yudha (drum). Setelah merajai panggung-panggung festival di akhir era 1980-an, Dewa 19 kemudian hijrah ke Jakarta dan merilis album pertamanya pada tahun 1992 di bawah label Team Records.'),
('004', 'Peterpan/Noah ', 'Noah/Peterpan, adalah sebuah grup musik Pop/Rock alternatif dari Bandung, Indonesia. Grup musik ini dikenal sebagai grup musik terbesar atau paling terkenal di Indonesia, bahkan sedikitnya di dunia. Grup musik ini dibentuk pada tahun 2000 dan terkenal berkat lagunya \"Mimpi Yang Sempurna\" '),
('123', 'namaa', 'about'),
('232', 's', 'ee'),
('765', 'maya', 'ayam den lapeh'),
('999909876', 'Ariana Grande', 'Ariana Grande—born as Grande-Butera on June 26th, 1993—is an actress and a pop vocalist from Boca-Ra'),
('9999999', 'aqiel', 'blabnajshajbdyduydbdeywud'),
('artist00', 'artist00', 'xxxxxxx');

-- --------------------------------------------------------

--
-- Table structure for table `search`
--

CREATE TABLE `search` (
  `idSearch` varchar(30) NOT NULL,
  `idUser` varchar(30) NOT NULL,
  `idLagu` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tracklist`
--

CREATE TABLE `tracklist` (
  `idTracklist` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `idUser` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `idUser` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tglLahir` date NOT NULL,
  `username` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`idUser`, `nama`, `tglLahir`, `username`, `email`, `password`) VALUES
('1301174100', 'fadhlan', '3918-09-25', 'fadhlanp', 'mfadhlan@gmail.com', 'abcdf'),
('234', 'swda', '0111-01-11', 'fghj', 'adaf@.cpm', 'fghj');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idAdmin`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `album`
--
ALTER TABLE `album`
  ADD PRIMARY KEY (`idAlbum`),
  ADD KEY `fk_album_penyanyi` (`idPenyanyi`);

--
-- Indexes for table `detailtracklist`
--
ALTER TABLE `detailtracklist`
  ADD PRIMARY KEY (`id_detailTransaksi`),
  ADD UNIQUE KEY `idLagu` (`idLagu`),
  ADD KEY `fk_detail_tracklist` (`idTracklist`);

--
-- Indexes for table `lagu`
--
ALTER TABLE `lagu`
  ADD PRIMARY KEY (`idLagu`),
  ADD KEY `fk_lagu_album` (`idAlbum`),
  ADD KEY `fk_lagu_admin` (`idAdmin`);

--
-- Indexes for table `lirik`
--
ALTER TABLE `lirik`
  ADD PRIMARY KEY (`idLirik`);

--
-- Indexes for table `manusia`
--
ALTER TABLE `manusia`
  ADD PRIMARY KEY (`nik`);

--
-- Indexes for table `menyanyikan`
--
ALTER TABLE `menyanyikan`
  ADD PRIMARY KEY (`idMenyanyikan`),
  ADD KEY `fk_relasi_penyanyi` (`idPenyanyi`),
  ADD KEY `fk_relasi_lagu` (`idLagu`);

--
-- Indexes for table `penyanyi`
--
ALTER TABLE `penyanyi`
  ADD PRIMARY KEY (`idPenyanyi`);

--
-- Indexes for table `search`
--
ALTER TABLE `search`
  ADD PRIMARY KEY (`idSearch`),
  ADD KEY `fk_search_user` (`idUser`),
  ADD KEY `fk_search_lagu` (`idLagu`);

--
-- Indexes for table `tracklist`
--
ALTER TABLE `tracklist`
  ADD PRIMARY KEY (`idTracklist`),
  ADD UNIQUE KEY `idUser` (`idUser`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `album`
--
ALTER TABLE `album`
  ADD CONSTRAINT `fk_album_penyanyi` FOREIGN KEY (`idPenyanyi`) REFERENCES `penyanyi` (`idPenyanyi`);

--
-- Constraints for table `detailtracklist`
--
ALTER TABLE `detailtracklist`
  ADD CONSTRAINT `fk_detail_lagu` FOREIGN KEY (`idLagu`) REFERENCES `lagu` (`idLagu`),
  ADD CONSTRAINT `fk_detail_tracklist` FOREIGN KEY (`idTracklist`) REFERENCES `tracklist` (`idTracklist`);

--
-- Constraints for table `lagu`
--
ALTER TABLE `lagu`
  ADD CONSTRAINT `fk_lagu_admin` FOREIGN KEY (`idAdmin`) REFERENCES `admin` (`idAdmin`),
  ADD CONSTRAINT `fk_lagu_album` FOREIGN KEY (`idAlbum`) REFERENCES `album` (`idAlbum`);

--
-- Constraints for table `lirik`
--
ALTER TABLE `lirik`
  ADD CONSTRAINT `fk_lirik_lagu` FOREIGN KEY (`idLirik`) REFERENCES `lagu` (`idLagu`);

--
-- Constraints for table `menyanyikan`
--
ALTER TABLE `menyanyikan`
  ADD CONSTRAINT `fk_relasi_lagu` FOREIGN KEY (`idLagu`) REFERENCES `lagu` (`idLagu`),
  ADD CONSTRAINT `fk_relasi_penyanyi` FOREIGN KEY (`idPenyanyi`) REFERENCES `penyanyi` (`idPenyanyi`);

--
-- Constraints for table `search`
--
ALTER TABLE `search`
  ADD CONSTRAINT `fk_search_lagu` FOREIGN KEY (`idLagu`) REFERENCES `lagu` (`idLagu`),
  ADD CONSTRAINT `fk_search_user` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`);

--
-- Constraints for table `tracklist`
--
ALTER TABLE `tracklist`
  ADD CONSTRAINT `fk_tracklist_user` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
