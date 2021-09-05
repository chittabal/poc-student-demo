/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 5.6.5-m8 : Database - chitta_task
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`chitta_task` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `chitta_task`;

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `city_id` int(11) NOT NULL AUTO_INCREMENT,
  `active` tinyint(1) DEFAULT '1',
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `city` */

insert  into `city`(`city_id`,`active`,`name`) values 
(1,1,'Bubaneswar'),
(2,1,'Delhi'),
(3,1,'Bangalore'),
(4,1,'Kolkata'),
(5,1,'Mumbai');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `active` tinyint(1) DEFAULT '1',
  `address` varchar(250) DEFAULT NULL,
  `city_id` int(11) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `mobile` varchar(10) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `student` */

insert  into `student`(`student_id`,`active`,`address`,`city_id`,`gender`,`mobile`,`name`) values 
(1,1,'Odisha',1,'Male','8093938533','chitta'),
(2,1,'Delhi',2,'Female','8093938533','jhili'),
(3,1,'safdsdf',4,'Male','8093938533','biswajit'),
(4,1,'1112 DSC platoon attached to INS Kalinga',1,'Male','8093938533','chitta');

/*Table structure for table `student_hobbies` */

DROP TABLE IF EXISTS `student_hobbies`;

CREATE TABLE `student_hobbies` (
  `hobby_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`hobby_id`),
  KEY `FKly4bn8l7qpfp2g3wfe1gu5xs9` (`student_id`),
  CONSTRAINT `FKly4bn8l7qpfp2g3wfe1gu5xs9` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `student_hobbies` */

insert  into `student_hobbies`(`hobby_id`,`name`,`student_id`) values 
(1,'Cricket',1),
(2,'Watching Movie',2),
(3,'Cooking',3),
(4,'Singing',3),
(5,'Watching Movie',3),
(6,'Playing Cricket',3),
(7,'Reading News Paper',3),
(8,'Cooking',4);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
