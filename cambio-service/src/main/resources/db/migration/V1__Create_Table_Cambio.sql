CREATE TABLE `cambio` (
  `id` INT(10) AUTO_INCREMENT PRIMARY KEY,
  `de` CHAR(3) NOT NULL,
  `para` CHAR(3) NOT NULL,
  `fator_conversao` decimal(65,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
