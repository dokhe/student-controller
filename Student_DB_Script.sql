-- Create the 'student' database if not exists
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `studentmt`;
USE `studentmt`;

/* Table structure for table `student_data` */
DROP TABLE IF EXISTS `student_data`;

CREATE TABLE `student_data` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `AGE` int(10) NOT NULL,
  `ADMISSION_NUMBER` int(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/* Data for the table `student_data` */
INSERT INTO `student_data`(`ID`,`NAME`,`AGE`,`ADMISSION_NUMBER`) VALUES (1,'John',23,'k49000'),(2,'Paul',34,'k28900');


