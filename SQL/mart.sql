-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 24 Apr 2018 pada 15.28
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mart`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `jenis_barang` varchar(20) NOT NULL,
  `harga_beli` int(10) NOT NULL,
  `harga_jual` int(10) NOT NULL,
  `stok` int(10) NOT NULL,
  `tanggal_masuk` date DEFAULT NULL,
  `id_perusahaan` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `jenis_barang`, `harga_beli`, `harga_jual`, `stok`, `tanggal_masuk`, `id_perusahaan`) VALUES
('1234', 'asdasf', 'makanan', 123, 1234, 2, '2018-04-24', 2),
('D001', 'Pulpy Orange 90 ml', 'minuman', 5000, 10000, 25, '2018-04-24', 2),
('D002', 'Air Mineral', 'minuman', 2000, 7000, 20, '2018-01-15', 3),
('F001', 'Sosis', 'makanan', 5000, 7000, 12, '2018-01-13', 1),
('F002', 'Nugget', 'makanan', 6000, 10000, 15, '2018-01-13', 1),
('F003', 'dfghj', 'makanan', 1234, 12345, 123, '2018-04-24', 1),
('F004', 'fghjk', 'makanan', 123, 1234, 123, '2018-04-24', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(5) NOT NULL,
  `nama_pegawai` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `noHP` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `alamat`, `gender`, `noHP`, `password`) VALUES
(1001, 'Aang', 'Hasan 4', 'Wanita', '089912345678', 'aangcantik'),
(1002, 'Tyasih', 'Airan', 'Wanita', '088845671234', 'tyayes'),
(1003, 'Ruci', 'Kedaton', 'Wanita', '088984571234', 'cintayakult'),
(1004, 'Dinda', 'Senopati', 'Wanita', '088091271234', 'dindania22');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `id_penjualan` int(10) NOT NULL,
  `id_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `id_pegawai` int(5) NOT NULL,
  `nama_pegawai` varchar(100) NOT NULL,
  `jumlah_barang` int(5) NOT NULL,
  `total_harga` int(10) NOT NULL,
  `tanggal_keluar` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `id_perusahaan` int(10) NOT NULL,
  `nama_perusahaan` varchar(100) NOT NULL,
  `noHP` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `supplier`
--

INSERT INTO `supplier` (`id_perusahaan`, `nama_perusahaan`, `noHP`, `alamat`) VALUES
(1, 'PT.Sumber Jaya', '0987654321', 'Bandung'),
(2, 'PT.Sumber Abadi', '0987654324', 'Jambi'),
(3, 'PT.Sumber Rejeki', '0967654324', 'Lampung');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `id_perusahaan` (`id_perusahaan`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_perusahaan`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`id_perusahaan`) REFERENCES `supplier` (`id_perusahaan`) ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`) ON UPDATE CASCADE,
  ADD CONSTRAINT `penjualan_ibfk_2` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
