-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 20, 2023 at 01:22 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `geumnailssaw`
--

-- --------------------------------------------------------

--
-- Table structure for table `cabang`
--

CREATE TABLE `cabang` (
  `id_cbg` varchar(10) NOT NULL,
  `nm_cbg` varchar(30) NOT NULL,
  `kota` varchar(15) NOT NULL,
  `almt_cbg` varchar(200) NOT NULL,
  `telp_cbg` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cabang`
--

INSERT INTO `cabang` (`id_cbg`, `nm_cbg`, `kota`, `almt_cbg`, `telp_cbg`) VALUES
('C01', 'Plaza Atrium', 'Jakarta', 'Lt 3-F, Jl. Senen Raya 2 No.135, RW.2, Senen, Jakarta', '021847634'),
('C02', 'Grand Galaxy Park', 'Bekasi', 'Mall Grand Galaxy Park Lt 2-D8 , Jl. Boulevard Raya 1, Bekasi, Jawa Barat', '021847632'),
('C03', 'Lippo Plaza Jember', 'Jember', 'Lt 1-F8, Jalan Gajah Mada No. 106, Jawa Timur', '021483467'),
('C04', 'Cibinong Mall', 'Cibinong', 'Lt 1F, Jl. Raya Mayor Oking Jaya Atmaja No. 7', '021743754'),
('C05', 'Mal Cijantung', 'Jakarta', 'Lt 3-2F,  Jl. Pendidikan RT1/RW4, Cijantung, Jakarta Timur', '0812736275'),
('C06', 'Grand Indonesia', 'Jakarta', 'Lt 5-D7, Jl. MH Thamrin No. 1, Jakarta Pusat', '0812345763');

-- --------------------------------------------------------

--
-- Table structure for table `calonkywn`
--

CREATE TABLE `calonkywn` (
  `nik` varchar(20) NOT NULL,
  `nm_ck` varchar(40) NOT NULL,
  `tgl_lhr` date NOT NULL,
  `pddkn` varchar(10) NOT NULL,
  `tmpt_tgl` varchar(100) NOT NULL,
  `tlp_ck` varchar(15) NOT NULL,
  `exp` int(11) NOT NULL,
  `p_org` varchar(10) NOT NULL,
  `id_low` varchar(10) NOT NULL,
  `tgl_lmr` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `calonkywn`
--

INSERT INTO `calonkywn` (`nik`, `nm_ck`, `tgl_lhr`, `pddkn`, `tmpt_tgl`, `tlp_ck`, `exp`, `p_org`, `id_low`, `tgl_lmr`) VALUES
('3000720964430700', 'Janis Joan', '2000-04-01', 'SD', 'Jl. Dwikora Raya II no. 77, Senen, Jakarta Pusat', '084446253572', 0, 'Tidak Ada', 'L01', '2023-06-22'),
('30139347647534', 'Lucia Zera', '1999-08-27', 'SD', 'Jl. Agung 12 RT 002 RW 003 Gedong, Pasar Rebo, Jakarta Timur', '08120823674', 1, 'Tidak Ada', 'L02', '2023-06-05'),
('301846134562478', 'Khoirunissa', '2001-03-30', 'S1', 'Jl. Gang Ampar, Condet', '08213834647', 0, 'Ada', 'L01', '2023-06-22'),
('302394672353647', 'Novelia Putri', '2001-02-26', 'SMA', 'Jl. Meruya Raya No. 5, Jakarta', '0812367354', 0, 'Ada', 'L01', '2023-06-23'),
('3040714051340300', 'Rachel Salom', '2000-02-09', 'SMA', 'Jl. Benyamin, Mangga Besar', '088375780527', 3, 'Tidak Ada', 'L01', '2023-06-25'),
('3055126519673000', 'Elsa Kartika', '1992-11-15', 'S2', 'Jl. Taman Indah Sari No.8, Cililitan', '085017894266', 1, 'Tidak Ada', 'L01', '2023-06-29'),
('3090282335611640', 'Rosa Absari', '1993-12-14', 'SD', 'Jl. Buana Biru, Jatinegara', '087459629455', 0, 'Tidak Ada', 'L01', '2023-06-28'),
('3277411774641000', 'Samantha Kate', '2001-10-28', 'S1', 'Jl. Trikora no. 66, Pasar Rebo', '089131951977', 4, 'Ada', 'L01', '2023-06-22'),
('3298415017222810', 'Megan Kartika', '2000-03-12', 'SMK', 'Jl. Persatuan, Senen', '087238186376', 2, 'Ada', 'L01', '2023-06-25'),
('3332539609882650', 'Ayu Sari', '2000-11-13', 'SD', 'Jl. H. Elik, Senen', '089150529254', 1, 'Tidak Ada', 'L01', '2023-06-26'),
('3350853438521190', 'Dinda Rahmawati', '2001-06-25', 'SMA', 'Jl. Gardenia, Bekasi', '084496478249', 1, 'Tidak Ada', 'L02', '2023-06-07'),
('3383139672256950', 'Desya Hami', '2001-01-26', 'SD', 'Jl. Metropolitan, Bekasi', '086774145545', 1, 'Tidak Ada', 'L02', '2023-06-07'),
('3413828853108820', 'Amanda Maya', '2000-07-07', 'Tidak Ada', 'Jl. Kemang Pondoh, Kemang', '085698956497', 1, 'Tidak Ada', 'L01', '2023-06-25'),
('3423340492161460', 'Martha Betha', '1998-06-18', 'D3', 'Jl. Galaksi Raya II, Bekasi', '083293296170', 1, 'Ada', 'L02', '2023-06-01'),
('3426015929068110', 'Fitri Agung', '1999-02-02', 'SMK', 'Jl. Otto Iskandardinata I, KP Melayu', '081345242254', 0, 'Tidak Ada', 'L01', '2023-06-22'),
('3453128402537750', 'Patricia', '2000-06-06', 'SD', 'Jl. Taruma, Daan Mogot', '081459593768', 4, 'Tidak Ada', 'L01', '2023-06-25'),
('3491603843658810', 'Ariel Yasmin', '1990-01-29', 'S1', 'Jl. Condet Barat, Condet', '082793182975', 6, 'Tidak Ada', 'L02', '2023-06-07'),
('3509455582130450', 'Luna Erna', '2000-06-20', 'SMP', 'Jl. Galaksi Raya II, Bekasi', '083567556171', 0, 'Ada', 'L02', '2023-06-01'),
('3608589109800810', 'Michelle Yan', '1998-06-05', 'SMA', 'Jl. Srengseng, Cengkareng', '087094121352', 0, 'Ada', 'L01', '2023-06-23'),
('3701457207641140', 'Riska Haria', '2000-10-23', 'SMK', 'Jl. Pekayon Raya, Bekasi', '087018490150', 0, 'Tidak Ada', 'L02', '2023-06-06'),
('3715905358125290', 'Maya Amano', '2000-01-08', 'S2', 'Jl. Pantai, Ancol', '088720645127', 2, 'Tidak Ada', 'L01', '2023-06-25'),
('3749826710238440', 'Risma Agung', '2000-12-28', 'SMA', 'Jl. Pengairan, Bekasi', '088917376633', 0, 'Tidak Ada', 'L02', '2023-06-07'),
('3770655749372460', 'Angela Christie', '1974-10-24', 'Tidak Ada', 'Jl. Manggis 1, Bekasi', '086495309580', 3, 'Tidak Ada', 'L02', '2023-06-06'),
('3815281508994520', 'Azula Rahma', '2000-02-10', 'SMA', 'Jl. Sueb, Mangga Dua', '089447456662', 0, 'Ada', 'L01', '2023-06-25'),
('3847307681570500', 'Franseska Junior', '2000-03-11', 'Tidak Ada', 'Jl. Ciracas Raya, Cijantung', '088343176111', 2, 'Tidak Ada', 'L01', '2023-06-25'),
('3852545456175790', 'Maria Narmi', '2000-06-16', 'SD', 'Jl. Mangga Raya, Cibubur', '087960319881', 3, 'Tidak Ada', 'L01', '2023-06-29'),
('3862737005382660', 'Dela Indah Saputri', '1998-03-03', 'S1', 'Jl. Adisuria XXI, Grogol', '082848059694', 2, 'Ada', 'L01', '2023-06-22'),
('3908439838194010', 'Christie Cantika', '1999-06-17', 'D3', 'Jl. Akasia Raya, Ciracas', '088204077479', 5, 'Ada', 'L01', '2023-06-30'),
('3956957463381050', 'Elie Rasya', '2000-06-19', 'SMK', 'Jl. Galaksi Raya III, Bekasi', '086194954173', 1, 'Ada', 'L02', '2023-06-01'),
('3960541058914360', 'Kate Middleton', '1998-05-04', 'SD', 'Jl. Raja Imamat I, Grogol', '082373834740', 0, 'Tidak Ada', 'L01', '2023-06-23'),
('3987390713161040', 'Dewi Sartinah', '1995-06-21', 'S1', 'Jl. Galaksi Raya IV, Bekasi', '082458084980', 0, 'Ada', 'L02', '2023-06-05');

-- --------------------------------------------------------

--
-- Table structure for table `kriteria`
--

CREATE TABLE `kriteria` (
  `nm_krit` varchar(8) NOT NULL,
  `bobot` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kriteria`
--

INSERT INTO `kriteria` (`nm_krit`, `bobot`) VALUES
('exp', 25),
('gmbr', 20),
('kom', 20),
('mtvs', 15),
('org', 10),
('pddkn', 10);

-- --------------------------------------------------------

--
-- Table structure for table `krywnbaru`
--

CREATE TABLE `krywnbaru` (
  `id_k` varchar(10) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `nm_k` varchar(40) NOT NULL,
  `tgl_trn` date NOT NULL,
  `tgl_m` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `krywnbaru`
--

INSERT INTO `krywnbaru` (`id_k`, `nik`, `nm_k`, `tgl_trn`, `tgl_m`) VALUES
('K001', '3862737005382660', 'Dela Indah Saputri', '2023-07-01', '2023-07-09'),
('K002', '3277411774641000', 'Samantha Kate', '2023-07-02', '2023-07-15'),
('K003', '3908439838194010', 'Christie Cantika', '2023-07-03', '2023-07-15'),
('K004', '3040714051340300', 'Rachel Salom', '2023-07-01', '2023-07-14'),
('K005', '3491603843658810', 'Ariel Yasmin', '2023-07-10', '2023-07-19'),
('K006', '3423340492161460', 'Martha Betha', '2023-07-11', '2023-06-20');

-- --------------------------------------------------------

--
-- Table structure for table `lowongan`
--

CREATE TABLE `lowongan` (
  `id_low` varchar(10) NOT NULL,
  `id_cbg` varchar(10) NOT NULL,
  `tgl_aw` date NOT NULL,
  `tgl_ak` date NOT NULL,
  `st_low` varchar(10) NOT NULL,
  `jml_kb` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lowongan`
--

INSERT INTO `lowongan` (`id_low`, `id_cbg`, `tgl_aw`, `tgl_ak`, `st_low`, `jml_kb`) VALUES
('L01', 'C01', '2023-06-21', '2023-06-30', 'Aktif', 4),
('L02', 'C02', '2023-06-01', '2023-06-07', 'Aktif', 3),
('L03', 'C05', '2023-06-29', '2023-07-01', 'Tutup', 4),
('L04', 'C02', '2023-06-15', '2023-06-24', 'Aktif', 1),
('L05', 'C04', '2023-07-01', '2023-07-09', 'Aktif', 2),
('L06', 'C06', '2023-08-20', '2023-08-26', 'Aktif', 6);

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `username` varchar(25) NOT NULL,
  `password` varchar(30) NOT NULL,
  `nm_pg` varchar(30) NOT NULL,
  `level` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`username`, `password`, `nm_pg`, `level`) VALUES
('dellatan', 'tan12344567', 'Della Indah', 'Admin'),
('johnny667', 'jonjonjon', 'John Terry', 'Admin'),
('jt2828', '28282828', 'Jason Terry', 'Admin'),
('lia5674', 'lily6789', 'Ananda Lily', 'Admin'),
('mlj123', 'mljmlj876', 'Mee Ling Njo', 'Owner'),
('nora7567', '75677567', 'Nora Amanda', 'Owner'),
('paulaug', 'aug123456', 'Paul Agusta', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `penilaian`
--

CREATE TABLE `penilaian` (
  `id_nilai` varchar(10) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `n_pddkn` varchar(10) NOT NULL,
  `n_porg` varchar(10) NOT NULL,
  `n_exp` varchar(10) NOT NULL,
  `n_kkom` varchar(20) NOT NULL,
  `n_mtvs` varchar(20) NOT NULL,
  `n_gmbr` varchar(20) NOT NULL,
  `c_pddkn` double NOT NULL,
  `c_porg` double NOT NULL,
  `c_exp` double NOT NULL,
  `c_kkom` double NOT NULL,
  `c_mtvs` double NOT NULL,
  `c_gmbr` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penilaian`
--

INSERT INTO `penilaian` (`id_nilai`, `nik`, `n_pddkn`, `n_porg`, `n_exp`, `n_kkom`, `n_mtvs`, `n_gmbr`, `c_pddkn`, `c_porg`, `c_exp`, `c_kkom`, `c_mtvs`, `c_gmbr`) VALUES
('P01', '3000720964430700', 'SMP', 'Tidak Ada', '0 Tahun', 'Sangat Baik', 'Buruk', '58', 3, 1, 1, 5, 2, 3),
('P02', '3040714051340300', 'SMP', 'Tidak Ada', '>=3 Tahun', 'Baik', 'Cukup', '75', 3, 1, 4, 4, 3, 4),
('P03', '3055126519673000', 'S2', 'Tidak Ada', '0 Tahun', 'Baik', 'Sangat Buruk', '21', 5, 1, 1, 4, 1, 2),
('P04', '3090282335611640', 'SD', 'Tidak Ada', '0 Tahun', 'Cukup', 'Cukup', '40', 2, 1, 1, 3, 3, 2),
('P05', '3277411774641000', 'S1', 'Ada', '>=3 Tahun', 'Baik', 'Baik', '66', 5, 2, 4, 4, 4, 4),
('P06', '3298415017222810', 'SMK', 'Ada', '2 Tahun', 'Baik', 'Sangat Buruk', '25', 4, 2, 3, 4, 1, 2),
('P07', '3332539609882650', 'SD', 'Tidak Ada', '1 Tahun', 'Cukup', 'Sangat Buruk', '39', 2, 1, 2, 3, 1, 2),
('P08', '3413828853108820', 'Tidak Ada', 'Tidak Ada', '1 Tahun', 'Cukup', 'Baik', '60', 1, 1, 2, 3, 4, 3),
('P09', '3426015929068110', 'SMK', 'Tidak Ada', '0 Tahun', 'Sangat Baik', 'Sangat Baik', '55', 4, 1, 1, 5, 5, 3),
('P10', '3453128402537750', 'SD', 'Tidak Ada', '>=3 Tahun', 'Cukup', 'Sangat Baik', '79', 2, 1, 4, 3, 5, 4),
('P11', '3608589109800810', 'SMA', 'Ada', '0 Tahun', 'Baik', 'Buruk', '89', 4, 2, 1, 4, 2, 5),
('P12', '3715905358125290', 'S2', 'Tidak Ada', '2 Tahun', 'Cukup', 'Buruk', '75', 5, 1, 3, 3, 2, 4),
('P13', '3815281508994520', 'SMA', 'Ada', '0 Tahun', 'Sangat Baik', 'Baik', '35', 4, 2, 1, 5, 4, 2),
('P14', '3847307681570500', 'Tidak Ada', 'Tidak Ada', '2 Tahun', 'Cukup', 'Sangat Baik', '79', 1, 1, 3, 3, 5, 4),
('P15', '3852545456175790', 'SD', 'Tidak Ada', '>=3 Tahun', 'Cukup', 'Cukup', '78', 2, 1, 4, 3, 3, 4),
('P16', '3862737005382660', 'S1', 'Ada', '2 Tahun', 'Sangat Baik', 'Sangat Baik', '98', 5, 2, 3, 5, 5, 5),
('P17', '3908439838194010', 'D3', 'Ada', '>=3 Tahun', 'Baik', 'Cukup', '60', 4, 2, 4, 4, 3, 3),
('P18', '3960541058914360', 'SD', 'Tidak Ada', '0 Tahun', 'Buruk', 'Sangat Buruk', '14', 2, 1, 1, 2, 1, 1),
('P19', '3116923289761980', 'SMA', 'Tidak Ada', '0 Tahun', 'Cukup', 'Sangat Buruk', '72', 4, 1, 1, 3, 1, 4),
('P20', '3350853438521190', 'SMA', 'Tidak Ada', '1 Tahun', 'Baik', 'Buruk', '61', 4, 1, 2, 4, 2, 4),
('P21', '3383139672256950', 'SD', 'Tidak Ada', '1 Tahun', 'Buruk', 'Buruk', '7', 2, 1, 2, 2, 2, 1),
('P22', '3423340492161460', 'D3', 'Ada', '1 Tahun', 'Sangat Baik', 'Baik', '92', 5, 2, 2, 5, 4, 5),
('P23', '3491603843658810', 'S1', 'Tidak Ada', '>=3 Tahun', 'Sangat Baik', 'Sangat Baik', '86', 5, 1, 4, 5, 5, 5),
('P24', '3509455582130450', 'SMP', 'Ada', '0 Tahun', 'Cukup', 'Baik', '45', 3, 2, 1, 3, 4, 3),
('P25', '3701457207641140', 'SMK', 'Tidak Ada', '0 Tahun', 'Buruk', 'Cukup', '30', 4, 1, 1, 2, 3, 2),
('P26', '3749826710238440', 'SMA', 'Tidak Ada', '0 Tahun', 'Cukup', 'Baik', '71', 4, 1, 1, 3, 4, 4),
('P27', '3770655749372460', 'Tidak Ada', 'Tidak Ada', '>=3 Tahun', 'Cukup', 'Sangat Baik', '87', 1, 1, 4, 3, 5, 5),
('P28', '3828531926178770', 'S2', 'Tidak Ada', '0 Tahun', 'Sangat Baik', 'Sangat Baik', '45', 5, 1, 1, 5, 5, 3),
('P29', '3956957463381050', 'SMK', 'Ada', '1 Tahun', 'Baik', 'Baik', '75', 4, 2, 2, 4, 4, 4),
('P30', '3987390713161040', 'S1', 'Ada', '0 Tahun', 'Cukup', 'Cukup', '57', 5, 2, 1, 3, 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `ranking`
--

CREATE TABLE `ranking` (
  `id_rnk` varchar(10) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `nilai` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cabang`
--
ALTER TABLE `cabang`
  ADD PRIMARY KEY (`id_cbg`);

--
-- Indexes for table `calonkywn`
--
ALTER TABLE `calonkywn`
  ADD PRIMARY KEY (`nik`);

--
-- Indexes for table `kriteria`
--
ALTER TABLE `kriteria`
  ADD PRIMARY KEY (`nm_krit`);

--
-- Indexes for table `krywnbaru`
--
ALTER TABLE `krywnbaru`
  ADD PRIMARY KEY (`id_k`);

--
-- Indexes for table `lowongan`
--
ALTER TABLE `lowongan`
  ADD PRIMARY KEY (`id_low`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `penilaian`
--
ALTER TABLE `penilaian`
  ADD PRIMARY KEY (`id_nilai`);

--
-- Indexes for table `ranking`
--
ALTER TABLE `ranking`
  ADD PRIMARY KEY (`id_rnk`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
