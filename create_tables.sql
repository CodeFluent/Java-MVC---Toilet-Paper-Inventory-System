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