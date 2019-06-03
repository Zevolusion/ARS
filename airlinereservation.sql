/*
Navicat MySQL Data Transfer

Source Server         : 173.82.186.106_3306
Source Server Version : 50726
Source Host           : 173.82.186.106:3306
Source Database       : ars

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-06-03 17:23:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `aid` varchar(255) DEFAULT NULL,
  `apw` varchar(255) DEFAULT NULL,
  `aname` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `idnumber` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', '112233', '管理员', '15935746825', '412365987456789123');

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `f_num` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect
-- ----------------------------
INSERT INTO `collect` VALUES ('CC6500');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `title` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (null, '老师实在是太坑了');
INSERT INTO `comment` VALUES (null, '就是老师太不淡定');

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `Com_name` varchar(255) NOT NULL,
  `cpw` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Com_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('中南航空', '123');
INSERT INTO `company` VALUES ('环球航空', '123');

-- ----------------------------
-- Table structure for flight_info
-- ----------------------------
DROP TABLE IF EXISTS `flight_info`;
CREATE TABLE `flight_info` (
  `f_num` varchar(20) NOT NULL,
  `date` varchar(20) DEFAULT NULL,
  `s_time` varchar(20) DEFAULT NULL,
  `a_time` varchar(20) DEFAULT NULL,
  `s_point` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`f_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flight_info
-- ----------------------------
INSERT INTO `flight_info` VALUES ('CC6500', '', '15:45', '17:05', '广州', '四川');
INSERT INTO `flight_info` VALUES ('EX3501', '2018-12-11', '11:00', '17:00', '纽约', '香港');
INSERT INTO `flight_info` VALUES ('GT1080', '2018-12-12', '14:15', '17:00', '惠州', '大连');

-- ----------------------------
-- Table structure for myorders
-- ----------------------------
DROP TABLE IF EXISTS `myorders`;
CREATE TABLE `myorders` (
  `f_num` varchar(20) NOT NULL,
  PRIMARY KEY (`f_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of myorders
-- ----------------------------
INSERT INTO `myorders` VALUES ('CK850J');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `a_notice` varchar(255) DEFAULT NULL,
  `c_notice` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES (null, '明天全员放假');
INSERT INTO `notice` VALUES ('每天将于1:00后台更新', null);

-- ----------------------------
-- Table structure for plane
-- ----------------------------
DROP TABLE IF EXISTS `plane`;
CREATE TABLE `plane` (
  `p_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `s_num` varchar(20) DEFAULT NULL,
  `com_name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plane
-- ----------------------------
INSERT INTO `plane` VALUES ('787', '393', '中南航空');
INSERT INTO `plane` VALUES ('747', '512', '环球航空');
INSERT INTO `plane` VALUES ('C919', '480', '深圳航空');

-- ----------------------------
-- Table structure for ticket
-- ----------------------------
DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket` (
  `price` varchar(255) DEFAULT NULL,
  `s_price` varchar(255) DEFAULT NULL,
  `uname` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `com_name` varchar(255) DEFAULT NULL,
  `p_num` varchar(255) DEFAULT NULL,
  `f_num` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ticket
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(255) DEFAULT NULL,
  `uname` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `idnumber` varchar(255) DEFAULT NULL,
  `upw` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('xm', '小明', '1597532468', '456844987654321', '123456');
INSERT INTO `user` VALUES ('sha', '沙雕', '15935764285', '', '123456');
