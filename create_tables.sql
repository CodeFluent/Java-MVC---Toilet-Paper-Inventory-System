create table Users  (
      userId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
      username VARCHAR(255),
      password VARCHAR(255),
      email VARCHAR(255),
      role VARCHAR(255)
);

INSERT INTO Users (username, password, email, role)
VALUES ("root", "password", null, "admin");

INSERT INTO Users (username, password, email, role)
VALUES ("johnny", "pissedaf", "johnny@portapotty.com", "user");


create table Products (
    productId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    cost DECIMAL,
    stock INTEGER,
    description VARCHAR(50),
    name VARCHAR(50)
);

INSERT INTO Products (cost, stock, description, name)
VALUES (5.00, 1000, "A wonderful silky smooth paper.", "Blue Toilet Paper");

INSERT INTO Products (cost, stock, description, name)
VALUES (10.00, 10000, "Jagged, and cruel.", "Jagged Toilet Paper");

create table Orders (
    orderId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    userId INT NOT NULL,
    productId INT NOT NULL,
    quantity INTEGER,
    dateSubmitted DATE
);

INSERT INTO Orders (userID, productId, quantity, dateSubmitted)
VALUES (2, 1, 300, NOW());