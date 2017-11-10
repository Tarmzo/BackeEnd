CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `isAuthenticated` tinyint(1) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `password` varchar(21) NOT NULL,
  `role` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uc_users_1` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
