create database chi_tiet_don_hang;

use chi_tiet_don_hang;

CREATE TABLE HoaDonDatBan (
  MaHoaDon INT PRIMARY KEY AUTO_INCREMENT,
  NgayDat DATE,
  TenKhachHang VARCHAR(50),
  SoDienThoai VARCHAR(20),
  Email VARCHAR(50),
  SoLuongNguoi INT,
  GhiChu VARCHAR(255),
  TongTien INT
);
INSERT INTO HoaDonDatBan (NgayDat, TenKhachHang, SoDienThoai, Email, SoLuongNguoi, GhiChu, TongTien)
VALUES ('2023-04-25', 'Nguyen Van A', '0123456789', 'nguyenvana@gmail.com', 4, 'Yeu cau phuc vu dac biet', 1000000);
select * from chi_tiet_don_hang.HoaDonDatBan;
