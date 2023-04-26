create database Table1;

use Table1;

CREATE TABLE Ban (
Ban_ID INT PRIMARY KEY AUTO_INCREMENT,
Trang_Thai VARCHAR(50),
Ten_Tiec VARCHAR(100),
Nguoi_Lien_He VARCHAR(100),
So_Luong INT,
Ngay_Dat DATE,
Gio_Dat TIME
);
select * from Table1.ban;