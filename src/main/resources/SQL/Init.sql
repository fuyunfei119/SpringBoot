CREATE DATABASE IF NOT EXISTS `test`
    CHARACTER SET UTF8;

USE `test`;

DROP TABLE IF EXISTS `User`;
CREATE TABLE IF NOT EXISTS `User` (
    `id` VARCHAR(50) NOT NULL,
    `name` VARCHAR(25),
    `age` INT,
    `balance` DOUBLE,
    `isSuperUser` BOOLEAN,
    `birthday` DATE,

    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `User` VALUES (
        'ccc719c8-0afa-45f8-a357-c0b25cc3cfaf',
        'Yunfei Fu',
        23,
        500.00,
        1,
        '1998-01-19');

INSERT INTO `User` VALUES (
        'af7ae1ac-c48b-4273-b302-5dc78f48dcca',
        'Xuan Wang',
        21,
        750.00,
        0,
        '1999-12-24');


INSERT INTO `User` VALUES (
    '0abca287-b41d-47bb-8c4e-95551c523bf5',
    'Long Cheng',
    45,
    8500.00,
    1,
    '1980-05-06');
