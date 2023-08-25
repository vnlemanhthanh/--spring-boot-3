CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Leslie','Andrews','leslie@vnlemanhthanh.edu'),
	(2,'Emma','Baumgarten','emma@vnlemanhthanh.edu'),
	(3,'Avani','Gupta','avani@vnlemanhthanh.edu'),
	(4,'Yuri','Petrov','yuri@vnlemanhthanh.edu'),
	(5,'Juan','Vega','juan@vnlemanhthanh.edu');
