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

-- 傾印  資料表 beverage.add_materials 結構
CREATE TABLE IF NOT EXISTS `add_materials` (
  `name` varchar(15) NOT NULL,
  `price` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='加料區';

-- 正在傾印表格  beverage.add_materials 的資料：~12 rows (近似值)
INSERT INTO `add_materials` (`name`, `price`) VALUES
	('草仔粿', 15),
	('琥珀粉圓', 10),
	('雙粉(粉粿+粉圓)', 10),
	('招牌粉粿', 10),
	('蘆薈', 10),
	('嫩仙草', 10),
	('草仔粿', 15),
	('琥珀粉圓', 10),
	('雙粉(粉粿+粉圓)', 10),
	('招牌粉粿', 10),
	('蘆薈', 10),
	('嫩仙草', 10);

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

-- 正在傾印表格  beverage.franchise 的資料：~6 rows (近似值)
INSERT INTO `franchise` (`fid`, `name`, `gender`, `phone`, `lineID`, `address`, `budget`, `opentime`, `contacttime`, `description`) VALUES
	(1, '老王', '女', '0912123456', 'abc123', '台中市北區中清路一段1號', '200萬~300萬', '一個月', '早上09:00~12:00', ''),
	(2, '小白', '男', '0912123456', '', '台中市北區中清路一段1號', '10萬~100萬', '尚未確定', '晚上18:00~22:00', '我要加盟我要加盟'),
	(3, 'Andy', '男', '0422061234', '', '台中市北區中清路一段1號', '400萬~500萬', '六個月', '下午12:00~18:00', '爪蛙.tea GOOD'),
	(4, 'Candy', '女', '0910987654', '', '台東縣池上鄉', '10萬~100萬', '三個月', '早上09:00~12:00', '我要開分店'),
	(5, '陳怡婷', '女', '0911223344', '', '學士路2', '200萬~300萬', '一個月', '早上09:00~12:00', ''),
	(6, 'EMMA', '女', '0967321987', 'java.tea', '中清路一段', '300萬~400萬', '三個月', '早上09:00~12:00', '加盟去');

-- 傾印  資料表 beverage.javateamenu 結構
CREATE TABLE IF NOT EXISTS `javateamenu` (
  `pn` char(3) NOT NULL,
  `typeCode` char(2) NOT NULL DEFAULT '',
  `productCode` int(3) NOT NULL DEFAULT 0,
  `type` varchar(10) NOT NULL DEFAULT '0',
  `product` varchar(10) NOT NULL DEFAULT '',
  `price` int(3) NOT NULL DEFAULT 0,
  PRIMARY KEY (`pn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 正在傾印表格  beverage.javateamenu 的資料：~45 rows (近似值)
INSERT INTO `javateamenu` (`pn`, `typeCode`, `productCode`, `type`, `product`, `price`) VALUES
	('am1', 'am', 1, 'addMateria', '草仔粿', 15),
	('am2', 'am', 2, 'addMateria', '琥珀粉圓', 10),
	('am3', 'am', 3, 'addMateria', '雙粉(粉粿+粉圓)', 10),
	('am4', 'am', 4, 'addMateria', '蘆薈', 10),
	('am5', 'am', 5, 'addMateria', '招牌粉粿', 10),
	('am6', 'am', 6, 'addMateria', '嫩仙草', 10),
	('c1', 'c', 1, 'cheese', '奶蓋招牌紅', 50),
	('c2', 'c', 2, 'cheese', '奶蓋竹香茶', 60),
	('c3', 'c', 3, 'cheese', '奶蓋烏龍茶', 60),
	('c4', 'c', 4, 'cheese', '奶蓋蕎麥茶', 65),
	('f1', 'f', 1, 'flavor', '梅果招牌紅', 55),
	('f2', 'f', 2, 'flavor', '荔枝蘆薈', 60),
	('f3', 'f', 3, 'flavor', '鮮葡萄柚青茶', 65),
	('f4', 'f', 4, 'flavor', '養樂多青菜', 55),
	('f5', 'f', 5, 'flavor', '檸檬高山青', 60),
	('f6', 'f', 6, 'flavor', '粉粿柚香307', 79),
	('f7', 'f', 7, 'flavor', '荔梅蜜語飲', 80),
	('fm1', 'fm', 1, 'freshMilk', '招牌紅拿鐵', 70),
	('fm2', 'fm', 2, 'freshMilk', '烏龍拿鐵', 70),
	('fm3', 'fm', 3, 'freshMilk', '黃金蕎麥拿鐵', 70),
	('fm4', 'fm', 4, 'freshMilk', '竹香翡翠拿鐵', 70),
	('fm5', 'fm', 5, 'freshMilk', '極黑芝麻拿鐵', 80),
	('fm6', 'fm', 6, 'freshMilk', '宇治抹茶優奶', 80),
	('m1', 'm', 1, 'milk', '招牌紅奶茶', 50),
	('m2', 'm', 2, 'milk', '粉粿黑糖奶茶	', 60),
	('m3', 'm', 3, 'milk', '黃金蕎麥奶茶	', 60),
	('m4', 'm', 4, 'milk', '逮丸奶茶	', 65),
	('m5', 'm', 5, 'milk', '極黑芝麻奶茶	', 65),
	('m6', 'm', 6, 'milk', '竹香翡翠奶茶', 50),
	('m7', 'm', 7, 'milk', '粉粿舞伎406奶茶', 79),
	('o1', 'o', 1, 'original', '竹香翡翠', 40),
	('o2', 'o', 2, 'original', '招牌紅茶', 35),
	('o3', 'o', 3, 'original', '炭培烏龍', 35),
	('o4', 'o', 4, 'original', '油切蕎麥茶', 35),
	('o5', 'o', 5, 'original', '手採高山青', 35),
	('t1', 't', 1, 'taste', '粉粿桂花檸檬', 60),
	('t2', 't', 2, 'taste', '粉粿黑糖檸檬', 60),
	('t3', 't', 3, 'taste', '荔枝烏龍', 55),
	('t4', 't', 4, 'taste', '桂花蕎麥茶', 55),
	('t5', 't', 5, 'taste', '柚子烏龍', 65),
	('t6', 't', 6, 'taste', '覆盆子氣泡冰茶', 75),
	('wm1', 'wm', 1, 'winterMelo', '招牌冬瓜紅', 45),
	('wm2', 'wm', 2, 'winterMelo', '冬瓜青茶', 45),
	('wm3', 'wm', 3, 'winterMelo', '冬瓜檸檬', 50),
	('wm4', 'wm', 4, 'winterMelo', '冬瓜仙茶蜜', 50);

-- 傾印  資料表 beverage.javateaorder 結構
CREATE TABLE IF NOT EXISTS `javateaorder` (
  `on` int(3) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL DEFAULT '0',
  `product` varchar(20) NOT NULL DEFAULT '0',
  `material` varchar(20) NOT NULL DEFAULT '0',
  `qty` int(2) NOT NULL DEFAULT 0,
  `states` char(2) NOT NULL DEFAULT '0',
  `date` datetime DEFAULT current_timestamp(),
  KEY `索引 1` (`on`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 正在傾印表格  beverage.javateaorder 的資料：~56 rows (近似值)
INSERT INTO `javateaorder` (`on`, `type`, `product`, `material`, `qty`, `states`, `date`) VALUES
	(1, '原味茶', '竹香翡翠', '草仔粿', 1, '熱', '0000-00-00 00:00:00'),
	(2, '原味茶', '竹香翡翠', '草仔粿', 1, '熱', '0000-00-00 00:00:00'),
	(3, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '0000-00-00 00:00:00'),
	(4, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '2024-01-09 08:27:10'),
	(5, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '2024-01-09 16:30:05'),
	(6, '原味茶', '竹香翡翠', '草仔粿', 2, '熱飲', '2024-01-09 22:12:51'),
	(7, '風味茶', '荔枝蘆薈', '蘆薈', 3, '冷飲', '2024-01-09 22:15:14'),
	(8, '原味茶', '招牌紅茶', '草仔粿', 1, '冷飲', '2024-01-11 11:23:18'),
	(9, '原味茶', '竹香翡翠', '草仔粿', 1, '冷飲', '2024-01-11 15:24:27'),
	(10, '原味茶', '竹香翡翠', '琥珀粉圓', 2, '冷飲', '2024-01-12 14:03:58'),
	(11, '原味茶', '竹香翡翠', '琥珀粉圓', 2, '冷飲', '2024-01-12 22:41:44'),
	(12, '原味茶', '竹香翡翠', '草仔粿', 1, '冷飲', '2024-01-12 22:52:06'),
	(13, '香醇奶茶', '黃金蕎麥奶茶', '不加料', 3, '熱飲', '2024-01-12 23:40:04'),
	(14, '滋味茶', '柚子烏龍', '蘆薈', 4, '熱飲', '2024-01-13 16:06:48'),
	(1, '原味茶', '竹香翡翠', '草仔粿', 1, '熱', '0000-00-00 00:00:00'),
	(2, '原味茶', '竹香翡翠', '草仔粿', 1, '熱', '0000-00-00 00:00:00'),
	(3, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '0000-00-00 00:00:00'),
	(4, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '2024-01-09 08:27:10'),
	(5, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '2024-01-09 16:30:05'),
	(6, '原味茶', '竹香翡翠', '草仔粿', 2, '熱飲', '2024-01-09 22:12:51'),
	(7, '風味茶', '荔枝蘆薈', '蘆薈', 3, '冷飲', '2024-01-09 22:15:14'),
	(8, '原味茶', '招牌紅茶', '草仔粿', 1, '冷飲', '2024-01-11 11:23:18'),
	(9, '原味茶', '竹香翡翠', '草仔粿', 1, '冷飲', '2024-01-11 15:24:27'),
	(10, '原味茶', '竹香翡翠', '琥珀粉圓', 2, '冷飲', '2024-01-12 14:03:58'),
	(11, '原味茶', '竹香翡翠', '琥珀粉圓', 2, '冷飲', '2024-01-12 22:41:44'),
	(12, '原味茶', '竹香翡翠', '草仔粿', 1, '冷飲', '2024-01-12 22:52:06'),
	(13, '香醇奶茶', '黃金蕎麥奶茶', '不加料', 3, '熱飲', '2024-01-12 23:40:04'),
	(14, '滋味茶', '柚子烏龍', '蘆薈', 4, '熱飲', '2024-01-13 16:06:48'),
	(1, '原味茶', '竹香翡翠', '草仔粿', 1, '熱', '0000-00-00 00:00:00'),
	(2, '原味茶', '竹香翡翠', '草仔粿', 1, '熱', '0000-00-00 00:00:00'),
	(3, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '0000-00-00 00:00:00'),
	(4, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '2024-01-09 08:27:10'),
	(5, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '2024-01-09 16:30:05'),
	(6, '原味茶', '竹香翡翠', '草仔粿', 2, '熱飲', '2024-01-09 22:12:51'),
	(7, '風味茶', '荔枝蘆薈', '蘆薈', 3, '冷飲', '2024-01-09 22:15:14'),
	(8, '原味茶', '招牌紅茶', '草仔粿', 1, '冷飲', '2024-01-11 11:23:18'),
	(9, '原味茶', '竹香翡翠', '草仔粿', 1, '冷飲', '2024-01-11 15:24:27'),
	(10, '原味茶', '竹香翡翠', '琥珀粉圓', 2, '冷飲', '2024-01-12 14:03:58'),
	(11, '原味茶', '竹香翡翠', '琥珀粉圓', 2, '冷飲', '2024-01-12 22:41:44'),
	(12, '原味茶', '竹香翡翠', '草仔粿', 1, '冷飲', '2024-01-12 22:52:06'),
	(13, '香醇奶茶', '黃金蕎麥奶茶', '不加料', 3, '熱飲', '2024-01-12 23:40:04'),
	(14, '滋味茶', '柚子烏龍', '蘆薈', 4, '熱飲', '2024-01-13 16:06:48'),
	(1, '原味茶', '竹香翡翠', '草仔粿', 1, '熱', '0000-00-00 00:00:00'),
	(2, '原味茶', '竹香翡翠', '草仔粿', 1, '熱', '0000-00-00 00:00:00'),
	(3, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '0000-00-00 00:00:00'),
	(4, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '2024-01-09 08:27:10'),
	(5, '原味茶', '竹香翡翠', '草仔粿', 1, '熱飲', '2024-01-09 16:30:05'),
	(6, '原味茶', '竹香翡翠', '草仔粿', 2, '熱飲', '2024-01-09 22:12:51'),
	(7, '風味茶', '荔枝蘆薈', '蘆薈', 3, '冷飲', '2024-01-09 22:15:14'),
	(8, '原味茶', '招牌紅茶', '草仔粿', 1, '冷飲', '2024-01-11 11:23:18'),
	(9, '原味茶', '竹香翡翠', '草仔粿', 1, '冷飲', '2024-01-11 15:24:27'),
	(10, '原味茶', '竹香翡翠', '琥珀粉圓', 2, '冷飲', '2024-01-12 14:03:58'),
	(11, '原味茶', '竹香翡翠', '琥珀粉圓', 2, '冷飲', '2024-01-12 22:41:44'),
	(12, '原味茶', '竹香翡翠', '草仔粿', 1, '冷飲', '2024-01-12 22:52:06'),
	(13, '香醇奶茶', '黃金蕎麥奶茶', '不加料', 3, '熱飲', '2024-01-12 23:40:04'),
	(14, '滋味茶', '柚子烏龍', '蘆薈', 4, '熱飲', '2024-01-13 16:06:48');

-- 傾印  資料表 beverage.javateatype 結構
CREATE TABLE IF NOT EXISTS `javateatype` (
  `typeCode` char(2) NOT NULL DEFAULT '',
  `type` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`typeCode`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 正在傾印表格  beverage.javateatype 的資料：~9 rows (近似值)
INSERT INTO `javateatype` (`typeCode`, `type`) VALUES
	('am', '加好料'),
	('cm', '芝士奶蓋'),
	('fm', '鮮奶茶'),
	('ft', '風味茶'),
	('ot', '原味茶'),
	('tm', '香醇奶茶'),
	('tt', '滋味茶'),
	('ty', '種類'),
	('wm', '冬瓜茶系列');

-- 傾印  資料表 beverage.member 結構
CREATE TABLE IF NOT EXISTS `member` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) NOT NULL DEFAULT '',
  `phone` varchar(10) NOT NULL DEFAULT '',
  `gender` varchar(1) NOT NULL DEFAULT '',
  `address` varchar(100) NOT NULL DEFAULT '',
  `passwd` varchar(50) NOT NULL DEFAULT '',
  `email` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='會員資料\r\n';

-- 正在傾印表格  beverage.member 的資料：~0 rows (近似值)

-- 傾印  資料表 beverage.orderlist 結構
CREATE TABLE IF NOT EXISTS `orderlist` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(50) NOT NULL DEFAULT '0',
  `price` int(11) NOT NULL DEFAULT 0,
  `container` varchar(10) NOT NULL DEFAULT '0' COMMENT '容量: 中杯、大杯',
  `btype` varchar(10) NOT NULL DEFAULT '0' COMMENT '種類: 茶、奶茶、奶蓋',
  `isaddMaterial` char(1) NOT NULL DEFAULT '0' COMMENT '是否加料',
  `material` varchar(30) DEFAULT '0' COMMENT '原物料: 1.粉圓 pink_round 2.粉粿 jelly_cake 3.珍珠 pearl 4.椰果 coconut_jelly 5.蘆薈 aloe 6.仙草 grass_jelly',
  `mprice` int(11) DEFAULT 0,
  `ice` varchar(30) NOT NULL DEFAULT '0' COMMENT '冰量: 1.去冰 no 2.微冰 light 3.少冰 less 4.正常冰 regular',
  `sugar` varchar(30) NOT NULL DEFAULT '0' COMMENT '醣量: 1.無糖 no 2.微糖 light 3.少糖 less 4.半糖 half 5.全糖 regular',
  `phone` varchar(10) NOT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 正在傾印表格  beverage.orderlist 的資料：~10 rows (近似值)
INSERT INTO `orderlist` (`bid`, `bname`, `price`, `container`, `btype`, `isaddMaterial`, `material`, `mprice`, `ice`, `sugar`, `phone`) VALUES
	(1, '翡翠檸檬', 40, '中', '茶人系列', '否', '', 0, '去冰', '微糖', '0975348123'),
	(2, '招牌紅茶', 35, '中', '茶人系列', '否', '', 0, '熱', '微糖', '0923417582'),
	(3, '荔枝蘆薈', 60, '大', '講究系列', '是', '珍珠', 5, '少冰', '半糖', '0912047583'),
	(4, '檸檬高山青', 60, '大', '講究系列', '否', '', 0, '熱', '微糖', '0975421884'),
	(5, '招牌紅拿鐵', 70, '中', '自然系列', '否', '', 0, '熱', '正常', '0932575147'),
	(6, '奶蓋蕎麥茶', 65, '中', '濃郁系列', '是', '粉圓', 5, '少冰', '微糖', '0923587141'),
	(7, '冬瓜青茶', 45, '大', '堅持系列', '是', '蘆薈', 10, '少冰', '正常', '0987544270'),
	(8, '烏龍拿鐵', 70, '大', '自然系列', '否', '', 0, '熱', '正常', '0988253401'),
	(9, '奶蓋竹香茶', 65, '中', '濃郁系列', '是', '粉粿', 10, '熱', '微糖', '0975085417'),
	(10, '冬瓜青茶', 45, '大', '堅持系列', '是', '珍珠', 5, '少冰', '微糖', '0986410412');

-- 傾印  資料表 beverage.store 結構
CREATE TABLE IF NOT EXISTS `store` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(15) NOT NULL,
  `s_area` varchar(50) NOT NULL,
  `s_addr` varchar(50) NOT NULL,
  `s_tel` varchar(11) NOT NULL,
  `opentime` varchar(50) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='各地店舖';

-- 正在傾印表格  beverage.store 的資料：~18 rows (近似值)
INSERT INTO `store` (`sid`, `s_name`, `s_area`, `s_addr`, `s_tel`, `opentime`) VALUES
	(1, '爪蛙.tea 新竹光復店', '北部', '新竹市東區光復路一段319號', '03-5790006', '11:00~21:00 週一~週日'),
	(2, '爪蛙.tea 汐止建成店', '北部', '新北市汐止區建成路52號', '02-26475366', '10:00~21:00 週一~週日'),
	(3, '爪蛙.tea 中壢日新店', '北部', '桃園市中壢區日新路42號', '03-4668890', '11:00~20:00 週一~週日'),
	(4, '爪蛙.tea 內湖江南店', '北部', '台北市內湖區江南街75號', '02-26275998', '10:00~20:00 週一~週五 11:00~20:00 週六~週日'),
	(5, '爪蛙.tea 板橋三民店', '北部', '新北市板橋區三民路二段19號', '02-29551219', '10:00~20:00 週一~週日'),
	(6, '爪蛙.tea 頭份建國店', '北部', '苗栗縣頭份市建國路185號', '037-670262', '10:00~21:00 週一~週日'),
	(7, '爪蛙.tea 台中昌平店', '中部', '台中市北屯區昌平路1段238號', '04-22377888', '10:30~23:30 週一~週日'),
	(8, '爪蛙.tea 台中健行店', '中部', '台中市北區健行路514號', '04-22069199', '10:00~21:00 週一~週日'),
	(9, '爪蛙.tea 員林中山店', '中部', '彰化縣員林市中山路一段818號', '048-360818', '09:30~21:00 週一~週日'),
	(10, '爪蛙.tea 鹿港中山店', '中部', '彰化縣鹿港鎮中山路192號1樓', '047-788077', '10:00~21:00 週一~週日'),
	(11, '爪蛙.tea 台中太平店', '中部', '台中市東區精武東路184號', '04-22155119', '10:00~23:00 週一~週日'),
	(12, '爪蛙.tea 高雄壽豐店', '南部', '高雄市楠梓區壽豐路316號', '07-3656363', '09:00~21:00 週一~週日'),
	(13, '爪蛙.tea 嘉義民族店', '南部', '嘉義市西區民族路709號', '05-2227700', '10:00~21:00 週一~週日'),
	(14, '爪蛙.tea 虎尾光復店', '南部', '雲林縣虎尾鎮光復路323號1樓', '05-6335885', '10:00~22:00 週一~週日'),
	(15, '爪蛙.tea 屏東廣東店', '南部', '屏東縣屏東市廣東路608號', '08-7351080', '10:00~21:00 週一~週日'),
	(16, '爪蛙.tea 善化大成店', '南部', '台南市善化區大成路354號', '06-5831300', '10:00~21:00 週一~週日'),
	(17, '爪蛙.tea 台中興大店', '中部', '台中市南區興大路145號', '04-22061123', '10:00~21:00 週一~週日'),
	(18, '爪蛙.tea 屏東枋寮店', '南部', '屏東縣枋寮鄉中山路1號', '08-8706263', '10:00~21:00 週一~週日');

-- 傾印  資料表 beverage.teamenu 結構
CREATE TABLE IF NOT EXISTS `teamenu` (
  `pn` char(3) NOT NULL,
  `typeCode` char(2) NOT NULL DEFAULT '',
  `productCode` int(3) NOT NULL DEFAULT 0,
  `type` varchar(20) NOT NULL DEFAULT '0',
  `product` varchar(20) NOT NULL DEFAULT '',
  `price` int(3) NOT NULL DEFAULT 0,
  PRIMARY KEY (`pn`),
  KEY `索引 2` (`typeCode`),
  CONSTRAINT `FK_javateamenu_javateatype` FOREIGN KEY (`typeCode`) REFERENCES `javateatype` (`typeCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 正在傾印表格  beverage.teamenu 的資料：~50 rows (近似值)
INSERT INTO `teamenu` (`pn`, `typeCode`, `productCode`, `type`, `product`, `price`) VALUES
	('am1', 'am', 1, 'addMaterials', '草仔粿', 15),
	('am2', 'am', 2, 'addMaterials', '琥珀粉圓', 10),
	('am3', 'am', 3, 'addMaterials', '雙粉(粉粿+粉圓)', 10),
	('am4', 'am', 4, 'addMaterials', '蘆薈', 10),
	('am5', 'am', 5, 'addMaterials', '招牌粉粿', 10),
	('am6', 'am', 6, 'addMaterials', '嫩仙草', 10),
	('am7', 'am', 7, 'addMaterials', '不加料', 0),
	('cm1', 'cm', 1, '芝士奶蓋', '奶蓋招牌紅', 50),
	('cm2', 'cm', 2, '芝士奶蓋', '奶蓋竹香茶', 60),
	('cm3', 'cm', 3, '芝士奶蓋', '奶蓋烏龍茶', 60),
	('cm4', 'cm', 4, '芝士奶蓋', '奶蓋蕎麥茶', 65),
	('fm1', 'fm', 1, '鮮奶茶', '招牌紅拿鐵', 70),
	('fm2', 'fm', 2, '鮮奶茶', '烏龍拿鐵', 70),
	('fm3', 'fm', 3, '鮮奶茶', '黃金蕎麥拿鐵', 70),
	('fm4', 'fm', 4, '鮮奶茶', '竹香翡翠拿鐵', 70),
	('fm5', 'fm', 5, '鮮奶茶', '極黑芝麻拿鐵', 80),
	('ft1', 'ft', 1, '風味茶', '梅果招牌紅', 55),
	('ft2', 'ft', 2, '風味茶', '荔枝蘆薈', 60),
	('ft3', 'ft', 3, '風味茶', '鮮葡萄柚青茶', 65),
	('ft4', 'ft', 4, '風味茶', '養樂多青菜', 55),
	('ft5', 'ft', 5, '風味茶', '檸檬高山青', 60),
	('ft6', 'ft', 6, '風味茶', '粉粿柚香307', 79),
	('ot1', 'ot', 1, '原味茶', '竹香翡翠', 40),
	('ot2', 'ot', 2, '原味茶', '招牌紅茶', 35),
	('ot3', 'ot', 3, '原味茶', '炭培烏龍', 35),
	('ot4', 'ot', 4, '原味茶', '油切蕎麥茶', 35),
	('ot5', 'ot', 5, '原味茶', '手採高山青', 35),
	('tm1', 'tm', 1, '香醇奶茶', '招牌紅奶茶', 50),
	('tm2', 'tm', 2, '香醇奶茶', '粉粿黑糖奶茶	', 60),
	('tm3', 'tm', 3, '香醇奶茶', '黃金蕎麥奶茶	', 60),
	('tm4', 'tm', 4, '香醇奶茶', '逮丸奶茶	', 65),
	('tm5', 'tm', 5, '香醇奶茶', '極黑芝麻奶茶	', 65),
	('tm6', 'tm', 6, '香醇奶茶', '竹香翡翠奶茶', 50),
	('tm7', 'tm', 7, '香醇奶茶', '粉粿舞伎406奶茶', 79),
	('tt1', 'tt', 1, '滋味茶', '粉粿桂花檸檬', 60),
	('tt2', 'tt', 2, '滋味茶', '粉粿黑糖檸檬', 60),
	('tt3', 'tt', 3, '滋味茶', '荔枝烏龍', 55),
	('tt4', 'tt', 4, '滋味茶', '桂花蕎麥茶', 55),
	('tt5', 'tt', 5, '滋味茶', '柚子烏龍', 65),
	('ty1', 'ty', 1, 'type', '原味茶', 0),
	('ty2', 'ty', 2, 'type', '風味茶', 0),
	('ty3', 'ty', 3, 'type', '滋味茶', 0),
	('ty4', 'ty', 4, 'type', '香醇奶茶', 0),
	('ty5', 'ty', 5, 'type', '芝士奶蓋', 0),
	('ty6', 'ty', 6, 'type', '鮮奶茶', 0),
	('ty7', 'ty', 7, 'type', '冬瓜茶系列', 0),
	('wm1', 'wm', 1, '冬瓜茶系列', '招牌冬瓜紅', 45),
	('wm2', 'wm', 2, '冬瓜茶系列', '冬瓜青茶', 45),
	('wm3', 'wm', 3, '冬瓜茶系列', '冬瓜檸檬', 50),
	('wm4', 'wm', 4, '冬瓜茶系列', '冬瓜仙茶蜜', 50);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
