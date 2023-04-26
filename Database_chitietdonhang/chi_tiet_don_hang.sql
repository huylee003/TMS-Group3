create database chi_tiet;

use chi_tiet;

CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    TableID INT NOT NULL,
    CustomerID INT NOT NULL,
    OrderDate DATETIME,
    OrderTotal FLOAT,
    Status VARCHAR(50)
);
CREATE TABLE OrderDetail (
    OrderDetailID INT PRIMARY KEY,
    OrderID INT NOT NULL,
    MenuItemID INT NOT NULL,
    Quantity INT,
    Price FLOAT,
    Total FLOAT,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);
INSERT INTO Orders (OrderID, TableID, CustomerID, OrderDate, OrderTotal, Status)
VALUES (1, 5, 10, '2023-04-26 13:00:00', 50.0, 'Unpaid');

INSERT INTO OrderDetail (OrderDetailID, OrderID, MenuItemID, Quantity, Price, Total)
VALUES (1, 1, 1, 2, 10.0, 20.0);

INSERT INTO OrderDetail (OrderDetailID, OrderID, MenuItemID, Quantity, Price, Total)
VALUES (2, 1, 2, 1, 15.0, 15.0);
select * from chi_tiet.Orders;