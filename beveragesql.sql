-- --------------------------------------------------------
-- 主機:                           127.0.0.1
-- 伺服器版本:                        11.2.2-MariaDB - mariadb.org binary distribution
-- 伺服器作業系統:                      Win64
-- HeidiSQL 版本:                  12.6.0.6765
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
  `fid` int(11) NOT NULL DEFAULT 0,
  `name` varchar(15) NOT NULL DEFAULT '',
  `gender` varchar(1) NOT NULL DEFAULT '' COMMENT '男M/女F',
  `phone` varchar(10) NOT NULL DEFAULT '',
  `lineID` varchar(20) NOT NULL DEFAULT '',
  `address` varchar(30) NOT NULL DEFAULT '',
  `budget` varchar(10) NOT NULL DEFAULT '' COMMENT '開店預算',
  `opentime` varchar(50) NOT NULL DEFAULT '' COMMENT '預計可開店時間',
  `contacttime` varchar(50) NOT NULL DEFAULT '' COMMENT '方便可聯繫時間',
  `desciption` varchar(300) NOT NULL DEFAULT '' COMMENT '其他說明',
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='加盟專區使用之加盟基本資料';

-- 正在傾印表格  beverage.franchise 的資料：~0 rows (近似值)

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

-- 正在傾印表格  beverage.javateamenu 的資料：~43 rows (近似值)
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
	('fm1', 'fm', 1, 'freshMilk', '招牌紅拿鐵', 70),
	('fm2', 'fm', 2, 'freshMilk', '烏龍拿鐵', 70),
	('fm3', 'fm', 3, 'freshMilk', '黃金蕎麥拿鐵', 70),
	('fm4', 'fm', 4, 'freshMilk', '竹香翡翠拿鐵', 70),
	('fm5', 'fm', 5, 'freshMilk', '極黑芝麻拿鐵', 80),
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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='各地店舖';

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

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
