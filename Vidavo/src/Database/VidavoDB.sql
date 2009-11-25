SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Patients`;

CREATE TABLE `Patients` (
  `patientID` int(4) NOT NULL,
  PRIMARY KEY (`patientID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `personalinfo`;

CREATE TABLE `personalinfo` (
  `patientID` int(4) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `MiddleName` varchar(30) DEFAULT '',
  `LastName` varchar(30) NOT NULL,
  `Address` varchar(50) DEFAULT '',
  `AddressNum` int(10) DEFAULT NULL,
  `City` varchar(50) DEFAULT '',
  `State_Region` varchar(50) DEFAULT '',
  `Country` varchar(50) DEFAULT '',
  `Postal_Code` int(10) DEFAULT NULL,
  `Citizenship` varchar(50) DEFAULT '',
  `Height` int(3) unsigned zerofill DEFAULT NULL,
  `Weight` float(3,0) unsigned zerofill DEFAULT NULL,
  `Gender` varchar(20) DEFAULT '',
  `Status` varchar(20) DEFAULT '',
  `BirthDate` date DEFAULT NULL,
  `Profession` varchar(50) DEFAULT '',
  `Insurrance` varchar(50) NOT NULL,
  `Insurance_Type` varchar(20) NOT NULL,
  `Insurance_Id_Number` int(30) NOT NULL,
  `First_Visit` date DEFAULT NULL,
  `Children` int(10) DEFAULT NULL,
  `Home_Number` int(20) DEFAULT NULL,
  `CellPhone_Number` int(20) DEFAULT NULL,
  `Work_Number` int(20) DEFAULT NULL,
  `Fax_Number` int(20) DEFAULT NULL,
  `Email` varchar(50) DEFAULT '',
  PRIMARY KEY (`patientID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


SET FOREIGN_KEY_CHECKS = 1;
