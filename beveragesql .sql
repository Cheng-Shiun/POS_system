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

-- 正在傾印表格  beverage.add_materials 的資料：~6 rows (近似值)
INSERT INTO `add_materials` (`name`, `price`) VALUES
	('草仔粿', 15),
	('琥珀粉圓', 10),
	('雙粉(粉粿+粉圓)', 10),
	('招牌粉粿', 10),
	('蘆薈', 10),
	('嫩仙草', 10);

-- 傾印  資料表 beverage.franchise 結構
CREATE TABLE IF NOT EXISTS `franchise` (
  `principal` varchar(50) NOT NULL,
  `gender` char(1) NOT NULL DEFAULT '' COMMENT '男M/女F'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='加盟專區使用之加盟基本資料';

-- 正在傾印表格  beverage.franchise 的資料：~0 rows (近似值)

-- 傾印  資料表 beverage.member 結構
CREATE TABLE IF NOT EXISTS `member` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `memberName` varchar(50) NOT NULL DEFAULT '0',
  `memberPhone` varchar(10) NOT NULL DEFAULT '0',
  `memberAddress` varchar(100) NOT NULL DEFAULT '0',
  `birthday` date NOT NULL,
  `gender` char(1) NOT NULL DEFAULT '0',
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 正在傾印表格  beverage.member 的資料：~0 rows (近似值)

-- 傾印  資料表 beverage.menu_cheese 結構
CREATE TABLE IF NOT EXISTS `menu_cheese` (
  `name` varchar(10) NOT NULL,
  `price` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='芝士奶蓋系列';

-- 正在傾印表格  beverage.menu_cheese 的資料：~4 rows (近似值)
INSERT INTO `menu_cheese` (`name`, `price`) VALUES
	('奶蓋招牌紅', 50),
	('奶蓋竹香茶', 60),
	('奶蓋烏龍茶', 60),
	('奶蓋蕎麥茶', 65);

-- 傾印  資料表 beverage.menu_flavor 結構
CREATE TABLE IF NOT EXISTS `menu_flavor` (
  `name` varchar(10) NOT NULL,
  `price` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='風味茶系列';

-- 正在傾印表格  beverage.menu_flavor 的資料：~6 rows (近似值)
INSERT INTO `menu_flavor` (`name`, `price`) VALUES
	('梅果招牌紅', 55),
	('荔枝蘆薈', 60),
	('鮮葡萄柚青茶', 65),
	('養樂多青菜', 55),
	('檸檬高山青', 60),
	('粉粿柚香307', 79);

-- 傾印  資料表 beverage.menu_freshmilk 結構
CREATE TABLE IF NOT EXISTS `menu_freshmilk` (
  `name` varchar(10) NOT NULL,
  `price` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='鮮奶茶系列';

-- 正在傾印表格  beverage.menu_freshmilk 的資料：~5 rows (近似值)
INSERT INTO `menu_freshmilk` (`name`, `price`) VALUES
	('招牌紅拿鐵', 70),
	('烏龍拿鐵', 70),
	('黃金蕎麥拿鐵', 70),
	('竹香翡翠拿鐵', 70),
	('極黑芝麻拿鐵', 80);

-- 傾印  資料表 beverage.menu_milk 結構
CREATE TABLE IF NOT EXISTS `menu_milk` (
  `name` varchar(10) NOT NULL,
  `price` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='香醇奶茶系列';

-- 正在傾印表格  beverage.menu_milk 的資料：~7 rows (近似值)
INSERT INTO `menu_milk` (`name`, `price`) VALUES
	('招牌紅奶茶', 50),
	('粉粿黑糖奶茶', 60),
	('黃金蕎麥奶茶', 60),
	('逮丸奶茶', 65),
	('極黑芝麻奶茶', 65),
	('竹香翡翠奶茶', 50),
	('粉粿舞伎406奶茶', 79);

-- 傾印  資料表 beverage.menu_original 結構
CREATE TABLE IF NOT EXISTS `menu_original` (
  `name` varchar(10) NOT NULL,
  `price` int(10) unsigned NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='原味茶系列';

-- 正在傾印表格  beverage.menu_original 的資料：~5 rows (近似值)
INSERT INTO `menu_original` (`name`, `price`) VALUES
	('竹香翡翠', 40),
	('招牌紅茶', 35),
	('炭培烏龍', 35),
	('油切蕎麥茶', 35),
	('手採高山青', 35);

-- 傾印  資料表 beverage.menu_taste 結構
CREATE TABLE IF NOT EXISTS `menu_taste` (
  `name` varchar(10) NOT NULL,
  `price` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='滋味茶系列';

-- 正在傾印表格  beverage.menu_taste 的資料：~5 rows (近似值)
INSERT INTO `menu_taste` (`name`, `price`) VALUES
	('粉粿桂花檸檬', 60),
	('粉粿黑糖檸檬', 60),
	('荔枝烏龍', 55),
	('桂花蕎麥茶', 55),
	('柚子烏龍', 65);

-- 傾印  資料表 beverage.menu_wintermelon 結構
CREATE TABLE IF NOT EXISTS `menu_wintermelon` (
  `name` varchar(10) NOT NULL,
  `price` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='冬瓜茶系列';

-- 正在傾印表格  beverage.menu_wintermelon 的資料：~4 rows (近似值)
INSERT INTO `menu_wintermelon` (`name`, `price`) VALUES
	('招牌冬瓜紅', 45),
	('冬瓜青茶', 45),
	('冬瓜檸檬', 50),
	('冬瓜仙茶蜜', 50);

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

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
