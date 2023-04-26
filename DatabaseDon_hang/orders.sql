create database orders;
use orders;

CREATE TABLE orders (
   ma_don INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   nguoi_lien_he VARCHAR(50) NOT NULL,
   so_luong_nguoi VARCHAR(50) NOT NULL,
   so_luong_ban varchar(50) not null,
   thanh_tien DECIMAL(10,2) NOT NULL,
   tong_tien DECIMAL(10,2) NOT NULL,
   ngay_dat TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

select*from orders.orders;