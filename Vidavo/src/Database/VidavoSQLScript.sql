SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `appointments`;
CREATE TABLE `appointments` (
  `AppointmentId` int(20) NOT NULL,
  `Category` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Date` date NOT NULL,
  `Title` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Patient` int(20) NOT NULL,
  `Time` time NOT NULL,
  `Am_Pm` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Duration` int(11) NOT NULL,
  `Repetition` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `Every` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Workday` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Comments` text CHARACTER SET latin1,
  PRIMARY KEY (`AppointmentId`),
  KEY `AppointmentFK` (`Patient`),
  CONSTRAINT `AppointmentFK` FOREIGN KEY (`Patient`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `Personal_Info`;

CREATE TABLE `Personal_Info` (
  `piID` int(20) NOT NULL,
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
  PRIMARY KEY (`piID`),
  CONSTRAINT `personalInfoFK` FOREIGN KEY (`piID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `Surgical_History`;

CREATE TABLE `Surgical_History` (
  `shID` int(20) NOT NULL,
  `DescriptionOfSurgery` text,
  `HospitalName` varchar(50) DEFAULT NULL,
  `ReasonOfHospitalization` text,
  `FinalDiagnosis` text,
  `DoctorsName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`shID`),
  CONSTRAINT `surgicalHistoryFK` FOREIGN KEY (`shID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Chronic_Diseases`;

CREATE TABLE `Chronic_Diseases` (
  `chID` int(20) NOT NULL,
  `ChroniaVroxitida` varchar(10) DEFAULT NULL,
  `VactiriakesPneumonies` varchar(100) DEFAULT NULL,
  `PathiseisPneumonwn` varchar(100) DEFAULT NULL,
  `AneurismaPneumonikisArtirias` varchar(100) DEFAULT NULL,
  `DiataraxesArtiriwn` varchar(100) DEFAULT NULL,
  `AllergikoAsthma` varchar(10) DEFAULT NULL,
  `AnapneustikiAneparkeia` varchar(10) DEFAULT NULL,
  `Anapneustiras` varchar(10) DEFAULT NULL,
  `Kardiopatheia` varchar(10) DEFAULT NULL,
  `AneurismaKardias` varchar(10) DEFAULT NULL,
  `KardiakiArithmia` varchar(100) DEFAULT NULL,
  `Vimatodotis` varchar(10) DEFAULT NULL,
  `Emfragma` varchar(10) DEFAULT NULL,
  `Egefaliko` varchar(10) DEFAULT NULL,
  `ThromvosiAgeiwn` varchar(10) DEFAULT NULL,
  `StenosiAortikisValvidas` varchar(10) DEFAULT NULL,
  `AneparkeiaAortikisValvidas` varchar(10) DEFAULT NULL,
  `AgeiakesPathiseis` varchar(100) DEFAULT NULL,
  `Ypotasi` varchar(10) DEFAULT NULL,
  `Ypertasi` varchar(10) DEFAULT NULL,
  `AllesMorfesYpotasis` varchar(100) DEFAULT NULL,
  `Diavitis` varchar(10) DEFAULT NULL,
  `NososYpatos` varchar(100) DEFAULT NULL,
  `IpatikiAneparkeia` varchar(10) DEFAULT NULL,
  `NefrikiAneparkeia` varchar(10) DEFAULT NULL,
  `MixanimaAimokatharsis` varchar(10) DEFAULT NULL,
  `Elkos` varchar(10) DEFAULT NULL,
  `DiataraxesEderou` varchar(10) DEFAULT NULL,
  `DiataraxesNeurikouSistimatos` varchar(100) DEFAULT NULL,
  `ErpitikoEkzema` varchar(10) DEFAULT NULL,
  `Ipatitida` varchar(100) DEFAULT NULL,
  `Leuxaimia` varchar(10) DEFAULT NULL,
  `EleipsiSidirou` varchar(10) DEFAULT NULL,
  `Poliomuelitida` varchar(10) DEFAULT NULL,
  `Thiroeidismos` varchar(10) DEFAULT NULL,
  `MorfiThiroeidi` varchar(100) DEFAULT NULL,
  `AllesChroniesAstheneies` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`chID`),
  CONSTRAINT `chronicDiseasesFK` FOREIGN KEY (`chID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Chronic_Medication`;

CREATE TABLE `Chronic_Medication` (
  `cmID` int(20) NOT NULL,
  `AntithromvotikaFarmaka` varchar(10) DEFAULT NULL,
  `ThromvolitikaFarmaka` varchar(10) DEFAULT NULL,
  `AntidiastaltikaTisStefaniaiasKikloforias` varchar(10) DEFAULT NULL,
  `KardiodiegertikesGlikosides` varchar(50) DEFAULT NULL,
  `AntiikaFarmaka` varchar(10) DEFAULT NULL,
  `AntiarrythmikaFarmaka` varchar(50) DEFAULT NULL,
  `AntineoplasmatikaFarmaka` varchar(10) DEFAULT NULL,
  `AntireumatikaFarmaka` varchar(10) DEFAULT NULL,
  `AntiasthmatikaFarmaka` varchar(10) DEFAULT NULL,
  `AntithyroidikaFarmaka` varchar(10) DEFAULT NULL,
  `ThyroidikesOrmones` varchar(10) DEFAULT NULL,
  `Insulin` varchar(10) DEFAULT NULL,
  `AntidiabeticTablets` varchar(10) DEFAULT NULL,
  `AnticoagulantMedication` varchar(10) DEFAULT NULL,
  `AntipsychoticMedication` varchar(10) DEFAULT NULL,
  `AntiepilipticMedication` varchar(50) DEFAULT NULL,
  `Androgona` varchar(10) DEFAULT NULL,
  `Oistrogona` varchar(10) DEFAULT NULL,
  `AntisilliptikaFarmaka` varchar(10) DEFAULT NULL,
  `Ormones` varchar(10) DEFAULT NULL,
  `Vitamines` varchar(10) DEFAULT NULL,
  `Sidiros` varchar(10) DEFAULT NULL,
  `AntiallergikaFarmaka` varchar(10) DEFAULT NULL,
  `OtherChronicMedication` varchar(50) DEFAULT NULL,
  `NameOfMedication` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cmID`),
  CONSTRAINT `chronicMedicationFK` FOREIGN KEY (`cmID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Contacts`;

CREATE TABLE `Contacts` (
  `contactID` int(20) NOT NULL,
  `Relationship` varchar(10) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `HomePhone` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `patientID` int(20) NOT NULL,
  PRIMARY KEY (`contactID`),
  CONSTRAINT `contactsFK` FOREIGN KEY (`contactID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Family_History`;

CREATE TABLE `Family_History` (
  `fhID` int(20) NOT NULL,
  `EgefalikoEpeisodio` varchar(10) DEFAULT NULL,
  `DiamartiesDiaplasisPneumonon` varchar(10) DEFAULT NULL,
  `DiamartiesDiaplasisKikloforikouSistimatos` varchar(10) DEFAULT NULL,
  `DiamartiesDiaplasisKardiakwnDiafragmatwn` varchar(10) DEFAULT NULL,
  `KardiakiKoilotita` varchar(10) DEFAULT NULL,
  `IstorikoAsthmatos` varchar(10) DEFAULT NULL,
  `DiamartiesKardias` varchar(10) DEFAULT NULL,
  `DiamartiesTraxeiasVrohou` varchar(100) DEFAULT NULL,
  `DiaplasiDermatos` varchar(200) DEFAULT NULL,
  `StenosiLeptouEnderou` varchar(10) DEFAULT NULL,
  `StenosiPaxeosEnderou` varchar(10) DEFAULT NULL,
  `DiamartiesEnderou` varchar(200) DEFAULT NULL,
  `DiaplasiPeptikouSistimatos` varchar(200) DEFAULT NULL,
  `NefrikiAgenesia` varchar(200) DEFAULT NULL,
  `KistikiNososNefrwn` varchar(10) DEFAULT NULL,
  `AnomaliesNefrikisPyelou` varchar(10) DEFAULT NULL,
  `DiaplasiNeftwn` varchar(200) DEFAULT NULL,
  `DiataraxesNefrouOuritira` varchar(10) DEFAULT NULL,
  `DiaplasiOuritira` varchar(10) DEFAULT NULL,
  `DiaplasiOuropoiitikouSistimatos` varchar(200) DEFAULT NULL,
  `KlironomikiAnaimia` varchar(10) DEFAULT NULL,
  `SigenisThiroeidismos` varchar(100) DEFAULT NULL,
  `EleipsiLaktasis` varchar(10) DEFAULT NULL,
  `DisanexiaLaktozis` varchar(200) DEFAULT NULL,
  `PsixikesDiataraxes` varchar(10) DEFAULT NULL,
  `IstorikoSarkomatwn` varchar(10) DEFAULT NULL,
  `KakoithiNeoplasmata` varchar(200) DEFAULT NULL,
  `KataxrisiAlkool` varchar(10) DEFAULT NULL,
  `KlironomikosDiavitis` varchar(10) DEFAULT NULL,
  `IstorikoLeuxemias` varchar(10) DEFAULT NULL,
  `AllesMorfesOikogeneiakouIstorikou` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`fhID`),
  CONSTRAINT `familyHistoryFK` FOREIGN KEY (`fhID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Habits`;

CREATE TABLE `Habits` (
  `habitsID` int(20) NOT NULL,
  `Smoker` varchar(10) DEFAULT NULL,
  `HowLongSmoke` varchar(10) DEFAULT NULL,
  `Tea` varchar(10) DEFAULT NULL,
  `Coffee` varchar(10) DEFAULT NULL,
  `Softdrinks` varchar(10) DEFAULT NULL,
  `CaffeinePerDay` varchar(10) DEFAULT NULL,
  `SaltUsage` varchar(10) DEFAULT NULL,
  `SugarUsage` varchar(10) DEFAULT NULL,
  `Diet` varchar(10) DEFAULT NULL,
  `FoodHabits` varchar(250) DEFAULT NULL,
  `AlcoholPerDay` varchar(100) DEFAULT NULL,
  `AlcoholPerWeek` varchar(100) DEFAULT NULL,
  `UseOfDrugs` varchar(10) DEFAULT NULL,
  `UseOfMedication` varchar(10) DEFAULT NULL,
  `Exercise` varchar(10) DEFAULT NULL,
  `ExerciseType` varchar(100) DEFAULT NULL,
  `ExerciseHowOften` varchar(50) DEFAULT NULL,
  `OtherHabits` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`habitsID`),
  CONSTRAINT `habitsFK` FOREIGN KEY (`habitsID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Immunizations`;

CREATE TABLE `Immunizations` (
  `immunID` int(20) NOT NULL,
  `BloodType` varchar(5) DEFAULT NULL,
  `BloodDonor` varchar(10) DEFAULT NULL,
  `BloodBank` varchar(50) DEFAULT NULL,
  `BloodContageousDiseases` varchar(50) DEFAULT NULL,
  `BleedingProlems` varchar(10) DEFAULT NULL,
  `DoritisMielouOston` varchar(10) DEFAULT NULL,
  `KidneyDonor` varchar(10) DEFAULT NULL,
  `DoritisAllonOrganon` varchar(50) DEFAULT NULL,
  `Allergies` varchar(50) DEFAULT NULL,
  `AllergiesToDrugs` varchar(50) DEFAULT NULL,
  `PoorCirculation` varchar(10) DEFAULT NULL,
  `Stigma` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`immunID`),
  CONSTRAINT `immunizationsFK` FOREIGN KEY (`immunID`) REFERENCES `patients` (`patientID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Patients`;

CREATE TABLE `Patients` (
  `patientID` int(20) NOT NULL,
  PRIMARY KEY (`patientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


SET FOREIGN_KEY_CHECKS = 1;
