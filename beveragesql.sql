-- --------------------------------------------------------
-- 主機:                           127.0.0.1
-- 伺服器版本:                        11.2.2-MariaDB - mariadb.org binary distribution
-- 伺服器作業系統:                      Win64
-- HeidiSQL 版本:                  12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- 傾印 beverage 的資料庫結構
CREATE DATABASE IF NOT EXISTS `beverage` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `beverage`;

-- 傾印  資料表 beverage.franchise 結構
CREATE TABLE IF NOT EXISTS `franchise` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) NOT NULL DEFAULT '',
  `gender` varchar(1) DEFAULT '' COMMENT '男M/女F',
  `phone` varchar(10) NOT NULL DEFAULT '',
  `lineID` varchar(20) DEFAULT '',
  `address` varchar(30) NOT NULL DEFAULT '',
  `budget` varchar(10) NOT NULL DEFAULT '' COMMENT '開店預算',
  `opentime` varchar(50) NOT NULL DEFAULT '' COMMENT '預計可開店時間',
  `contacttime` varchar(50) NOT NULL DEFAULT '' COMMENT '方便可聯繫時間',
  `description` varchar(300) DEFAULT '' COMMENT '其他說明',
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='加盟專區使用之加盟基本資料';

-- 正在傾印表格  beverage.franchise 的資料：~0 rows (近似值)
REPLACE INTO `franchise` (`fid`, `name`, `gender`, `phone`, `lineID`, `address`, `budget`, `opentime`, `contacttime`, `description`) VALUES
	(1, '老王', '女', '0912123456', 'abc123', '台中市北區中清路一段1號', '200萬~300萬', '一個月', '早上09:00~12:00', ''),
	(2, '小白', '男', '0912123456', '', '台中市北區中清路一段1號', '10萬~100萬', '尚未確定', '晚上18:00~22:00', '我要加盟我要加盟'),
	(3, 'Andy', '男', '0422061234', '', '台中市北區中清路一段1號', '400萬~500萬', '六個月', '下午12:00~18:00', '爪蛙.tea GOOD'),
	(4, 'Candy', '女', '0910987654', '', '台東縣池上鄉', '10萬~100萬', '三個月', '早上09:00~12:00', '我要開分店'),
	(5, '陳怡婷', '女', '0911223344', '', '學士路2', '200萬~300萬', '一個月', '早上09:00~12:00', ''),
	(6, 'EMMA', '女', '0967321987', 'java.tea', '中清路一段', '300萬~400萬', '三個月', '早上09:00~12:00', '加盟去');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
