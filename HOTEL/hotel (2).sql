-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Des 2023 pada 18.46
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `customer`
--

CREATE TABLE `customer` (
  `nama` varchar(100) NOT NULL,
  `nik` bigint(16) NOT NULL,
  `no_kamar` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `harga` decimal(10,3) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `customer`
--

INSERT INTO `customer` (`nama`, `nik`, `no_kamar`, `tanggal`, `harga`, `status`) VALUES
('Alfi', 123456, 1, '2023-11-22', '500.000', 'Sudah'),
('Alfi', 12345, 1, '2023-11-22', '500.000', 'Sudah'),
('alfi', 123456, 1, '2023-11-22', '500.000', 'Sudah'),
('alfi', 1242, 1, '2023-11-22', '500.000', 'Sudah'),
('alfi', 12345678, 1, '2023-11-22', '500.000', 'Sudah'),
('alfi', 12345678, 1, '2023-11-22', '500.000', 'Sudah'),
('qwe', 1234, 1, '2023-11-22', '500.000', 'Sudah'),
('asert', 12345, 1, '2023-11-23', '500.000', 'Sudah'),
('qwertyuio', 12345678, 1, '2023-11-23', '500.000', 'Sudah'),
('asdfghjkl', 12345678, 2, '2023-11-28', '500.000', 'Sudah'),
('asdfghjkl', 12345678, 2, '2023-11-28', '500.000', 'Sudah'),
('123456', 1234567, 3, '2023-11-28', '500.000', 'Sudah'),
('Athar Rayyan', 123456789, 3, '2023-11-28', '500.000', 'Sudah'),
('Rean', 1234567890, 3, '2023-11-28', '500.000', 'Sudah'),
('asdfg', 1234567, 2, '2023-11-28', '500.000', 'Sudah'),
('Sula', 1234567890, 2, '2023-12-02', '500.000', 'Sudah'),
('Cut Rifa', 1234567890, 11, '2023-12-11', '1000.000', 'Sudah'),
('Alfi Zamriza', 12345678, 14, '2023-12-14', '1000.000', 'Sudah');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kamar`
--

CREATE TABLE `kamar` (
  `no_kamar` int(11) NOT NULL,
  `tipe_kamar` enum('Standard','Superior') NOT NULL,
  `kasur` enum('Single','Double') NOT NULL,
  `harga` double(10,3) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `kamar`
--

INSERT INTO `kamar` (`no_kamar`, `tipe_kamar`, `kasur`, `harga`, `status`) VALUES
(1, 'Standard', 'Single', 500.000, 'Not Booking'),
(2, 'Standard', 'Single', 500.000, 'Not Booking'),
(3, 'Standard', 'Single', 500.000, 'Not Booking'),
(4, 'Standard', 'Single', 500.000, 'Not Booking'),
(5, 'Standard', 'Single', 500.000, 'Not Booking'),
(6, 'Standard', 'Double', 750.000, 'Not Booking'),
(7, 'Standard', 'Double', 750.000, 'Not Booking'),
(8, 'Standard', 'Double', 750.000, 'Not Booking'),
(9, 'Standard', 'Double', 750.000, 'Not Booking'),
(10, 'Standard', 'Double', 750.000, 'Not Booking'),
(11, 'Superior', 'Single', 1000.000, 'Not Booking'),
(12, 'Superior', 'Single', 1000.000, 'Not Booking'),
(13, 'Superior', 'Single', 1000.000, 'Not Booking'),
(14, 'Superior', 'Single', 1000.000, 'Not Booking'),
(15, 'Superior', 'Single', 1000.000, 'Not Booking'),
(16, 'Superior', 'Double', 1250.000, 'Not Booking'),
(17, 'Superior', 'Double', 1250.000, 'Not Booking'),
(18, 'Superior', 'Double', 1250.000, 'Not Booking'),
(19, 'Superior', 'Double', 1250.000, 'Not Booking'),
(20, 'Superior', 'Double', 1250.000, 'Not Booking');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`no_kamar`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `kamar`
--
ALTER TABLE `kamar`
  MODIFY `no_kamar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
