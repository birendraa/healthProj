/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50141
Source Host           : localhost:3306
Source Database       : vidavo

Target Server Type    : MYSQL
Target Server Version : 50141
File Encoding         : 65001

Date: 2010-03-18 19:44:06
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `appointments`
-- ----------------------------
DROP TABLE IF EXISTS `appointments`;
CREATE TABLE `appointments` (
  `AppointmentId` int(20) NOT NULL,
  `Category` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Date` date NOT NULL,
  `Title` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Patient` int(20) NOT NULL,
  `Time` time NOT NULL,
  `Duration` int(11) NOT NULL,
  `Comments` text CHARACTER SET latin1,
  PRIMARY KEY (`AppointmentId`),
  KEY `AppointmentFK` (`Patient`),
  CONSTRAINT `AppointmentFK` FOREIGN KEY (`Patient`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appointments
-- ----------------------------

-- ----------------------------
-- Table structure for `chronic_diseases`
-- ----------------------------
DROP TABLE IF EXISTS `chronic_diseases`;
CREATE TABLE `chronic_diseases` (
  `chID` int(20) NOT NULL,
  `ChroniaVroxitida` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `VactiriakesPneumonies` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `PathiseisPneumonwn` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `AneurismaPneumonikisArtirias` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `DiataraxesArtiriwn` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `AllergikoAsthma` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AnapneustikiAneparkeia` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Anapneustiras` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Kardiopatheia` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AneurismaKardias` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `KardiakiArithmia` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `Vimatodotis` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Emfragma` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Egefaliko` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `ThromvosiAgeiwn` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `StenosiAortikisValvidas` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AneparkeiaAortikisValvidas` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AgeiakesPathiseis` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `Ypotasi` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Ypertasi` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AllesMorfesYpotasis` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `Diavitis` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `NososYpatos` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `IpatikiAneparkeia` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `NefrikiAneparkeia` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `MixanimaAimokatharsis` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Elkos` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiataraxesEderou` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiataraxesNeurikouSistimatos` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `ErpitikoEkzema` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Ipatitida` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `Leuxaimia` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `EleipsiSidirou` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Poliomuelitida` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Thiroeidismos` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `MorfiThiroeidi` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `AllesChroniesAstheneies` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`chID`),
  CONSTRAINT `chronicDiseasesFK` FOREIGN KEY (`chID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chronic_diseases
-- ----------------------------
INSERT INTO `chronic_diseases` VALUES ('1', 'No', '', '', '', '', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', '', '');
INSERT INTO `chronic_diseases` VALUES ('2', 'No', '', '', '', '', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', '', '');
INSERT INTO `chronic_diseases` VALUES ('3', 'No', '', '', '', '', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', '', '');
INSERT INTO `chronic_diseases` VALUES ('4', 'No', '', '', '', '', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', '', '');

-- ----------------------------
-- Table structure for `chronic_medication`
-- ----------------------------
DROP TABLE IF EXISTS `chronic_medication`;
CREATE TABLE `chronic_medication` (
  `cmID` int(20) NOT NULL,
  `AntithromvotikaFarmaka` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `ThromvolitikaFarmaka` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntidiastaltikaTisStefaniaiasKikloforias` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `KardiodiegertikesGlikosides` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `AntiikaFarmaka` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntiarrythmikaFarmaka` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `AntineoplasmatikaFarmaka` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntireumatikaFarmaka` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntiasthmatikaFarmaka` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntithyroidikaFarmaka` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `ThyroidikesOrmones` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Insulin` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntidiabeticTablets` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AnticoagulantMedication` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntipsychoticMedication` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntiepilipticMedication` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Androgona` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Oistrogona` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntisilliptikaFarmaka` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Ormones` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Vitamines` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Sidiros` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AntiallergikaFarmaka` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `OtherChronicMedication` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `NameOfMedication` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`cmID`),
  CONSTRAINT `chronicMedicationFK` FOREIGN KEY (`cmID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chronic_medication
-- ----------------------------
INSERT INTO `chronic_medication` VALUES ('1', 'No', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', '');
INSERT INTO `chronic_medication` VALUES ('2', 'No', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', '');
INSERT INTO `chronic_medication` VALUES ('3', 'No', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', '');
INSERT INTO `chronic_medication` VALUES ('4', 'No', 'No', 'No', '', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', '');

-- ----------------------------
-- Table structure for `contacts`
-- ----------------------------
DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `contactID` int(20) NOT NULL,
  `Relationship` varchar(10) CHARACTER SET latin1 NOT NULL,
  `FirstName` varchar(50) CHARACTER SET latin1 NOT NULL,
  `LastName` varchar(50) CHARACTER SET latin1 NOT NULL,
  `HomePhone` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Email` varchar(50) CHARACTER SET latin1 NOT NULL,
  `patientID` int(20) NOT NULL,
  PRIMARY KEY (`contactID`),
  CONSTRAINT `contactsFK` FOREIGN KEY (`contactID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contacts
-- ----------------------------
INSERT INTO `contacts` VALUES ('1', '', '', '', '', '', '0');
INSERT INTO `contacts` VALUES ('2', '', '', '', '', '', '0');
INSERT INTO `contacts` VALUES ('3', '', '', '', '', '', '0');
INSERT INTO `contacts` VALUES ('4', '', '', '', '', '', '0');

-- ----------------------------
-- Table structure for `family_history`
-- ----------------------------
DROP TABLE IF EXISTS `family_history`;
CREATE TABLE `family_history` (
  `fhID` int(20) NOT NULL,
  `EgefalikoEpeisodio` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiamartiesDiaplasisPneumonon` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiamartiesDiaplasisKikloforikouSistimatos` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiamartiesDiaplasisKardiakwnDiafragmatwn` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `KardiakiKoilotita` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `IstorikoAsthmatos` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiamartiesKardias` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiamartiesTraxeiasVrohou` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `DiaplasiDermatos` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `StenosiLeptouEnderou` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `StenosiPaxeosEnderou` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiamartiesEnderou` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `DiaplasiPeptikouSistimatos` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `NefrikiAgenesia` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `KistikiNososNefrwn` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AnomaliesNefrikisPyelou` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiaplasiNeftwn` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `DiataraxesNefrouOuritira` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiaplasiOuritira` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DiaplasiOuropoiitikouSistimatos` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `KlironomikiAnaimia` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `SigenisThiroeidismos` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `EleipsiLaktasis` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DisanexiaLaktozis` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `PsixikesDiataraxes` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `IstorikoSarkomatwn` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `KakoithiNeoplasmata` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `KataxrisiAlkool` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `KlironomikosDiavitis` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `IstorikoLeuxemias` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `AllesMorfesOikogeneiakouIstorikou` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`fhID`),
  CONSTRAINT `familyHistoryFK` FOREIGN KEY (`fhID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of family_history
-- ----------------------------
INSERT INTO `family_history` VALUES ('1', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', '', 'No', 'No', '', '', '', 'No', 'No', '', 'No', 'No', '', 'No', '', 'No', '', 'No', 'No', '', 'No', 'No', 'No', '');
INSERT INTO `family_history` VALUES ('2', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', '', 'No', 'No', '', '', '', 'No', 'No', '', 'No', 'No', '', 'No', '', 'No', '', 'No', 'No', '', 'No', 'No', 'No', '');
INSERT INTO `family_history` VALUES ('3', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', '', 'No', 'No', '', '', '', 'No', 'No', '', 'No', 'No', '', 'No', '', 'No', '', 'No', 'No', '', 'No', 'No', 'No', '');
INSERT INTO `family_history` VALUES ('4', 'No', 'No', 'No', 'No', 'No', 'No', 'No', '', '', 'No', 'No', '', '', '', 'No', 'No', '', 'No', 'No', '', 'No', '', 'No', '', 'No', 'No', '', 'No', 'No', 'No', '');

-- ----------------------------
-- Table structure for `habits`
-- ----------------------------
DROP TABLE IF EXISTS `habits`;
CREATE TABLE `habits` (
  `habitsID` int(20) NOT NULL,
  `Smoker` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `HowLongSmoke` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Tea` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Coffee` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Softdrinks` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `CaffeinePerDay` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `SaltUsage` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `SugarUsage` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Diet` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `FoodHabits` varchar(250) CHARACTER SET latin1 DEFAULT NULL,
  `AlcoholPerDay` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `AlcoholPerWeek` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `UseOfDrugs` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `UseOfMedication` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Exercise` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `ExerciseType` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `ExerciseHowOften` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `OtherHabits` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`habitsID`),
  CONSTRAINT `habitsFK` FOREIGN KEY (`habitsID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of habits
-- ----------------------------
INSERT INTO `habits` VALUES ('1', 'No', '', 'No', 'No', 'No', '', 'None', 'None', 'No', '', '', '', 'No', 'No', 'No', '', '', '');
INSERT INTO `habits` VALUES ('2', 'No', '', 'No', 'No', 'No', '', 'None', 'None', 'No', '', '', '', 'No', 'No', 'No', '', '', '');
INSERT INTO `habits` VALUES ('3', 'No', '', 'No', 'No', 'No', '', 'None', 'None', 'No', '', '', '', 'No', 'No', 'No', '', '', '');
INSERT INTO `habits` VALUES ('4', 'No', '', 'No', 'No', 'No', '', 'None', 'None', 'No', '', '', '', 'No', 'No', 'No', '', '', '');

-- ----------------------------
-- Table structure for `immunizations`
-- ----------------------------
DROP TABLE IF EXISTS `immunizations`;
CREATE TABLE `immunizations` (
  `immunID` int(20) NOT NULL,
  `BloodType` varchar(5) CHARACTER SET latin1 DEFAULT NULL,
  `BloodDonor` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `BloodBank` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `BloodContageousDiseases` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `BleedingProlems` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DoritisMielouOston` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `KidneyDonor` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `DoritisAllonOrganon` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Allergies` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `AllergiesToDrugs` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `PoorCirculation` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Stigma` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`immunID`),
  CONSTRAINT `immunizationsFK` FOREIGN KEY (`immunID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of immunizations
-- ----------------------------
INSERT INTO `immunizations` VALUES ('1', '', 'No', '', '', 'No', 'No', 'No', '', '', '', 'No', 'No');
INSERT INTO `immunizations` VALUES ('2', '', 'No', '', '', 'No', 'No', 'No', '', '', '', 'No', 'No');
INSERT INTO `immunizations` VALUES ('3', '', 'No', '', '', 'No', 'No', 'No', '', '', '', 'No', 'No');
INSERT INTO `immunizations` VALUES ('4', '', 'No', '', '', 'No', 'No', 'No', '', '', '', 'No', 'No');

-- ----------------------------
-- Table structure for `patients`
-- ----------------------------
DROP TABLE IF EXISTS `patients`;
CREATE TABLE `patients` (
  `patientID` int(20) NOT NULL,
  PRIMARY KEY (`patientID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patients
-- ----------------------------
INSERT INTO `patients` VALUES ('1');
INSERT INTO `patients` VALUES ('2');
INSERT INTO `patients` VALUES ('3');
INSERT INTO `patients` VALUES ('4');

-- ----------------------------
-- Table structure for `personal_info`
-- ----------------------------
DROP TABLE IF EXISTS `personal_info`;
CREATE TABLE `personal_info` (
  `piID` int(20) NOT NULL,
  `FirstName` varchar(30) CHARACTER SET latin1 NOT NULL,
  `MiddleName` varchar(30) CHARACTER SET latin1 DEFAULT '',
  `LastName` varchar(30) CHARACTER SET latin1 NOT NULL,
  `Address` varchar(50) CHARACTER SET latin1 DEFAULT '',
  `AddressNum` int(10) DEFAULT NULL,
  `City` varchar(50) CHARACTER SET latin1 DEFAULT '',
  `State_Region` varchar(50) CHARACTER SET latin1 DEFAULT '',
  `Country` varchar(50) CHARACTER SET latin1 DEFAULT '',
  `Postal_Code` int(10) DEFAULT NULL,
  `Citizenship` varchar(50) CHARACTER SET latin1 DEFAULT '',
  `Height` int(3) unsigned zerofill DEFAULT NULL,
  `Weight` float(3,0) unsigned zerofill DEFAULT NULL,
  `Gender` varchar(20) CHARACTER SET latin1 DEFAULT '',
  `Status` varchar(20) CHARACTER SET latin1 DEFAULT '',
  `BirthDate` date DEFAULT NULL,
  `Profession` varchar(50) CHARACTER SET latin1 DEFAULT '',
  `Insurrance` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Insurance_Type` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Insurance_Id_Number` bigint(30) NOT NULL,
  `First_Visit` date DEFAULT NULL,
  `Children` int(10) DEFAULT NULL,
  `Home_Number` int(20) DEFAULT NULL,
  `CellPhone_Number` int(20) DEFAULT NULL,
  `Work_Number` int(20) DEFAULT NULL,
  `Fax_Number` int(20) DEFAULT NULL,
  `Email` varchar(50) CHARACTER SET latin1 DEFAULT '',
  PRIMARY KEY (`piID`),
  CONSTRAINT `personalInfoFK` FOREIGN KEY (`piID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personal_info
-- ----------------------------
INSERT INTO `personal_info` VALUES ('1', 'ew', '', 'ew', '', '0', '', '', '', '0', '', '000', '000', 'Female', 'Single', '0002-12-31', '', 'ew', 'Item 1', '3', '0002-12-31', '0', '0', '0', '0', '0', '');
INSERT INTO `personal_info` VALUES ('2', 'SSS', '', 'd', '', '0', '', '', '', '0', '', '000', '000', 'Female', 'Single', '0002-01-31', '', 'd', 'Item 1', '7', '0002-01-31', '0', '0', '0', '0', '0', '');
INSERT INTO `personal_info` VALUES ('3', 'h', '', 'k', '', '0', '', '', '', '0', '', '000', '000', 'Female', 'Single', '0002-12-31', '', 'l', 'Item 1', '6', '0002-12-31', '0', '0', '0', '0', '0', '');
INSERT INTO `personal_info` VALUES ('4', 'fff', '??????????', 'redfdsf', '', '0', '', '', '', '0', '', '000', '000', 'Female', 'Single', '0002-11-30', '', 'fsdsdfds', 'O.G.A.', '15', '0002-11-30', '0', '0', '0', '0', '0', '');

-- ----------------------------
-- Table structure for `surgical_history`
-- ----------------------------
DROP TABLE IF EXISTS `surgical_history`;
CREATE TABLE `surgical_history` (
  `shID` int(20) NOT NULL,
  `DescriptionOfSurgery` text CHARACTER SET latin1,
  `HospitalName` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `ReasonOfHospitalization` text CHARACTER SET latin1,
  `FinalDiagnosis` text CHARACTER SET latin1,
  `DoctorsName` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`shID`),
  CONSTRAINT `surgicalHistoryFK` FOREIGN KEY (`shID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of surgical_history
-- ----------------------------
INSERT INTO `surgical_history` VALUES ('1', '', '', '', '', '');
INSERT INTO `surgical_history` VALUES ('2', '', '', '', '', '');
INSERT INTO `surgical_history` VALUES ('3', '', '', '', '', '');
INSERT INTO `surgical_history` VALUES ('4', '', '', '', '', '');
