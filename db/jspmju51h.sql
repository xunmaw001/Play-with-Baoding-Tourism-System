-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: jspmju51h
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2021-03-24 12:48:45',1,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2021-03-24 12:48:45',2,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2021-03-24 12:48:45',3,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2021-03-24 12:48:45',4,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2021-03-24 12:48:45',5,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2021-03-24 12:48:45',6,'宇宙银河系月球1号','月某','13823888886','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tablename` varchar(200) DEFAULT 'jingdianmeishi' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float DEFAULT NULL COMMENT '单价',
  `discountprice` float DEFAULT NULL COMMENT '会员价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='在线客服';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (71,'2021-03-24 12:48:45',1,1,'提问1','回复1',1),(72,'2021-03-24 12:48:45',2,2,'提问2','回复2',2),(73,'2021-03-24 12:48:45',3,3,'提问3','回复3',3),(74,'2021-03-24 12:48:45',4,4,'提问4','回复4',4),(75,'2021-03-24 12:48:45',5,5,'提问5','回复5',5),(76,'2021-03-24 12:48:45',6,6,'提问6','回复6',6);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/jspmju51h/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/jspmju51h/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/jspmju51h/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussfeijihuoche`
--

DROP TABLE IF EXISTS `discussfeijihuoche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussfeijihuoche` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='飞机火车评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussfeijihuoche`
--

LOCK TABLES `discussfeijihuoche` WRITE;
/*!40000 ALTER TABLE `discussfeijihuoche` DISABLE KEYS */;
INSERT INTO `discussfeijihuoche` VALUES (151,'2021-03-24 12:48:45',1,1,'用户名1','评论内容1','回复内容1'),(152,'2021-03-24 12:48:45',2,2,'用户名2','评论内容2','回复内容2'),(153,'2021-03-24 12:48:45',3,3,'用户名3','评论内容3','回复内容3'),(154,'2021-03-24 12:48:45',4,4,'用户名4','评论内容4','回复内容4'),(155,'2021-03-24 12:48:45',5,5,'用户名5','评论内容5','回复内容5'),(156,'2021-03-24 12:48:45',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussfeijihuoche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjingdianmeishi`
--

DROP TABLE IF EXISTS `discussjingdianmeishi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjingdianmeishi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='景点美食评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjingdianmeishi`
--

LOCK TABLES `discussjingdianmeishi` WRITE;
/*!40000 ALTER TABLE `discussjingdianmeishi` DISABLE KEYS */;
INSERT INTO `discussjingdianmeishi` VALUES (161,'2021-03-24 12:48:45',1,1,'用户名1','评论内容1','回复内容1'),(162,'2021-03-24 12:48:45',2,2,'用户名2','评论内容2','回复内容2'),(163,'2021-03-24 12:48:45',3,3,'用户名3','评论内容3','回复内容3'),(164,'2021-03-24 12:48:45',4,4,'用户名4','评论内容4','回复内容4'),(165,'2021-03-24 12:48:45',5,5,'用户名5','评论内容5','回复内容5'),(166,'2021-03-24 12:48:45',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjingdianmeishi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjingquxianlu`
--

DROP TABLE IF EXISTS `discussjingquxianlu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjingquxianlu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='景区线路评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjingquxianlu`
--

LOCK TABLES `discussjingquxianlu` WRITE;
/*!40000 ALTER TABLE `discussjingquxianlu` DISABLE KEYS */;
INSERT INTO `discussjingquxianlu` VALUES (141,'2021-03-24 12:48:45',1,1,'用户名1','评论内容1','回复内容1'),(142,'2021-03-24 12:48:45',2,2,'用户名2','评论内容2','回复内容2'),(143,'2021-03-24 12:48:45',3,3,'用户名3','评论内容3','回复内容3'),(144,'2021-03-24 12:48:45',4,4,'用户名4','评论内容4','回复内容4'),(145,'2021-03-24 12:48:45',5,5,'用户名5','评论内容5','回复内容5'),(146,'2021-03-24 12:48:45',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjingquxianlu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feijihuoche`
--

DROP TABLE IF EXISTS `feijihuoche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feijihuoche` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `chufadi` varchar(200) DEFAULT NULL COMMENT '出发地',
  `zhongdiandi` varchar(200) DEFAULT NULL COMMENT '终点地',
  `chufashijian` datetime DEFAULT NULL COMMENT '出发时间',
  `daodashijian` datetime DEFAULT NULL COMMENT '到达时间',
  `jiage` int(11) DEFAULT NULL COMMENT '价格',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='飞机火车';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feijihuoche`
--

LOCK TABLES `feijihuoche` WRITE;
/*!40000 ALTER TABLE `feijihuoche` DISABLE KEYS */;
INSERT INTO `feijihuoche` VALUES (31,'2021-03-24 12:48:45','飞机','出发地1','终点地1','2021-03-24 20:48:45','2021-03-24 20:48:45',1,'http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian1.jpg',1,1,'2021-03-24 20:48:45',1),(32,'2021-03-24 12:48:45','飞机','出发地2','终点地2','2021-03-24 20:48:45','2021-03-24 20:48:45',2,'http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian2.jpg',2,2,'2021-03-24 20:48:45',2),(33,'2021-03-24 12:48:45','飞机','出发地3','终点地3','2021-03-24 20:48:45','2021-03-24 20:48:45',3,'http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian3.jpg',3,3,'2021-03-24 20:49:48',5),(34,'2021-03-24 12:48:45','飞机','出发地4','终点地4','2021-03-24 20:48:45','2021-03-24 20:48:45',4,'http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian4.jpg',4,4,'2021-03-24 20:48:45',4),(35,'2021-03-24 12:48:45','飞机','出发地5','终点地5','2021-03-24 20:48:45','2021-03-24 20:48:45',5,'http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian5.jpg',5,5,'2021-03-24 20:48:45',5),(36,'2021-03-24 12:48:45','飞机','出发地6','终点地6','2021-03-24 20:48:45','2021-03-24 20:48:45',6,'http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian6.jpg',6,6,'2021-03-24 20:48:45',6);
/*!40000 ALTER TABLE `feijihuoche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='旅游论坛 ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (81,'2021-03-24 12:48:45','帖子标题1','帖子内容1',1,1,'用户名1','开放'),(82,'2021-03-24 12:48:45','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(83,'2021-03-24 12:48:45','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(84,'2021-03-24 12:48:45','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(85,'2021-03-24 12:48:45','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(86,'2021-03-24 12:48:45','帖子标题6','帖子内容6',6,6,'用户名6','开放');
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jingdianmeishi`
--

DROP TABLE IF EXISTS `jingdianmeishi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jingdianmeishi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `meishimingcheng` varchar(200) NOT NULL COMMENT '美食名称',
  `meishishuliang` int(11) DEFAULT NULL COMMENT '美食数量',
  `meishixiangqing` longtext COMMENT '美食详情',
  `meishitupian` varchar(200) DEFAULT NULL COMMENT '美食图片',
  `jifenduihuan` int(11) DEFAULT NULL COMMENT '积分兑换',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `price` float NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='景点美食';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jingdianmeishi`
--

LOCK TABLES `jingdianmeishi` WRITE;
/*!40000 ALTER TABLE `jingdianmeishi` DISABLE KEYS */;
INSERT INTO `jingdianmeishi` VALUES (61,'2021-03-24 12:48:45','美食名称1',1,'美食详情1','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian1.jpg',1,1,1,'2021-03-24 20:48:45',99.9),(62,'2021-03-24 12:48:45','美食名称2',2,'美食详情2','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian2.jpg',2,2,2,'2021-03-24 20:48:45',99.9),(63,'2021-03-24 12:48:45','美食名称3',3,'美食详情3','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian3.jpg',3,3,3,'2021-03-24 20:50:14',99.9),(64,'2021-03-24 12:48:45','美食名称4',4,'美食详情4','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian4.jpg',4,4,4,'2021-03-24 20:48:45',99.9),(65,'2021-03-24 12:48:45','美食名称5',5,'美食详情5','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian5.jpg',5,5,5,'2021-03-24 20:48:45',99.9),(66,'2021-03-24 12:48:45','美食名称6',6,'美食详情6','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian6.jpg',6,6,6,'2021-03-24 20:48:45',99.9);
/*!40000 ALTER TABLE `jingdianmeishi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jingquxianlu`
--

DROP TABLE IF EXISTS `jingquxianlu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jingquxianlu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jingqumingcheng` varchar(200) DEFAULT NULL COMMENT '景区名称',
  `jingqudidian` varchar(200) DEFAULT NULL COMMENT '景区地点',
  `jingquxianlu` longtext COMMENT '景区线路',
  `jingquxiangqing` longtext COMMENT '景区详情',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='景区线路';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jingquxianlu`
--

LOCK TABLES `jingquxianlu` WRITE;
/*!40000 ALTER TABLE `jingquxianlu` DISABLE KEYS */;
INSERT INTO `jingquxianlu` VALUES (21,'2021-03-24 12:48:45','景区名称1','景区地点1','景区线路1','景区详情1','http://localhost:8080/jspmju51h/upload/jingquxianlu_zhaopian1.jpg',1,1,'2021-03-24 20:48:45',1),(22,'2021-03-24 12:48:45','景区名称2','景区地点2','景区线路2','景区详情2','http://localhost:8080/jspmju51h/upload/jingquxianlu_zhaopian2.jpg',2,2,'2021-03-24 20:48:45',2),(23,'2021-03-24 12:48:45','景区名称3','景区地点3','景区线路3','景区详情3','http://localhost:8080/jspmju51h/upload/jingquxianlu_zhaopian3.jpg',3,3,'2021-03-24 20:49:57',5),(24,'2021-03-24 12:48:45','景区名称4','景区地点4','景区线路4','景区详情4','http://localhost:8080/jspmju51h/upload/jingquxianlu_zhaopian4.jpg',4,4,'2021-03-24 20:48:45',4),(25,'2021-03-24 12:48:45','景区名称5','景区地点5','景区线路5','景区详情5','http://localhost:8080/jspmju51h/upload/jingquxianlu_zhaopian5.jpg',5,5,'2021-03-24 20:48:45',5),(26,'2021-03-24 12:48:45','景区名称6','景区地点6','景区线路6','景区详情6','http://localhost:8080/jspmju51h/upload/jingquxianlu_zhaopian6.jpg',6,6,'2021-03-24 20:48:45',6);
/*!40000 ALTER TABLE `jingquxianlu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiudianmenpiao`
--

DROP TABLE IF EXISTS `jiudianmenpiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiudianmenpiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiudianmingcheng` varchar(200) DEFAULT NULL COMMENT '酒店名称',
  `jiudiandidian` varchar(200) DEFAULT NULL COMMENT '酒店地点',
  `menpiaoshuliang` int(11) DEFAULT NULL COMMENT '门票数量',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `menpiaoleixing` varchar(200) DEFAULT NULL COMMENT '门票类型',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `price` float NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='酒店门票';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiudianmenpiao`
--

LOCK TABLES `jiudianmenpiao` WRITE;
/*!40000 ALTER TABLE `jiudianmenpiao` DISABLE KEYS */;
INSERT INTO `jiudianmenpiao` VALUES (41,'2021-03-24 12:48:45','酒店名称1','酒店地点1',1,'http://localhost:8080/jspmju51h/upload/jiudianmenpiao_zhaopian1.jpg','门票类型1','2021-03-24 20:48:45',1,99.9),(42,'2021-03-24 12:48:45','酒店名称2','酒店地点2',2,'http://localhost:8080/jspmju51h/upload/jiudianmenpiao_zhaopian2.jpg','门票类型2','2021-03-24 20:48:45',2,99.9),(43,'2021-03-24 12:48:45','酒店名称3','酒店地点3',3,'http://localhost:8080/jspmju51h/upload/jiudianmenpiao_zhaopian3.jpg','门票类型3','2021-03-24 20:50:06',4,99.9),(44,'2021-03-24 12:48:45','酒店名称4','酒店地点4',4,'http://localhost:8080/jspmju51h/upload/jiudianmenpiao_zhaopian4.jpg','门票类型4','2021-03-24 20:48:45',4,99.9),(45,'2021-03-24 12:48:45','酒店名称5','酒店地点5',5,'http://localhost:8080/jspmju51h/upload/jiudianmenpiao_zhaopian5.jpg','门票类型5','2021-03-24 20:48:45',5,99.9),(46,'2021-03-24 12:48:45','酒店名称6','酒店地点6',6,'http://localhost:8080/jspmju51h/upload/jiudianmenpiao_zhaopian6.jpg','门票类型6','2021-03-24 20:48:45',6,99.9);
/*!40000 ALTER TABLE `jiudianmenpiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menpiaoleixing`
--

DROP TABLE IF EXISTS `menpiaoleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menpiaoleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='门票类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menpiaoleixing`
--

LOCK TABLES `menpiaoleixing` WRITE;
/*!40000 ALTER TABLE `menpiaoleixing` DISABLE KEYS */;
INSERT INTO `menpiaoleixing` VALUES (51,'2021-03-24 12:48:45','类型1'),(52,'2021-03-24 12:48:45','类型2'),(53,'2021-03-24 12:48:45','类型3'),(54,'2021-03-24 12:48:45','类型4'),(55,'2021-03-24 12:48:45','类型5'),(56,'2021-03-24 12:48:45','类型6');
/*!40000 ALTER TABLE `menpiaoleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='旅游资讯';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (131,'2021-03-24 12:48:45','标题1','简介1','http://localhost:8080/jspmju51h/upload/news_picture1.jpg','内容1'),(132,'2021-03-24 12:48:45','标题2','简介2','http://localhost:8080/jspmju51h/upload/news_picture2.jpg','内容2'),(133,'2021-03-24 12:48:45','标题3','简介3','http://localhost:8080/jspmju51h/upload/news_picture3.jpg','内容3'),(134,'2021-03-24 12:48:45','标题4','简介4','http://localhost:8080/jspmju51h/upload/news_picture4.jpg','内容4'),(135,'2021-03-24 12:48:45','标题5','简介5','http://localhost:8080/jspmju51h/upload/news_picture5.jpg','内容5'),(136,'2021-03-24 12:48:45','标题6','简介6','http://localhost:8080/jspmju51h/upload/news_picture6.jpg','内容6');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) DEFAULT 'jingdianmeishi' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float NOT NULL DEFAULT '0' COMMENT '价格/积分',
  `discountprice` float DEFAULT '0' COMMENT '折扣价格',
  `total` float NOT NULL DEFAULT '0' COMMENT '总价格/总积分',
  `discounttotal` float DEFAULT '0' COMMENT '折扣总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) DEFAULT NULL COMMENT '状态',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1616590217050 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1616590178069,'2021-03-24 12:49:37',1616590162557,33,'feijihuoche','终点地3','http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian3.jpg'),(1616590180683,'2021-03-24 12:49:40',1616590162557,33,'feijihuoche','终点地3','http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian3.jpg'),(1616590189246,'2021-03-24 12:49:49',1616590162557,33,'feijihuoche','终点地3','http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian3.jpg'),(1616590192268,'2021-03-24 12:49:51',1616590162557,33,'feijihuoche','终点地3','http://localhost:8080/jspmju51h/upload/feijihuoche_zhaopian3.jpg'),(1616590198476,'2021-03-24 12:49:58',1616590162557,23,'jingquxianlu','景区名称3','http://localhost:8080/jspmju51h/upload/jingquxianlu_zhaopian3.jpg'),(1616590201422,'2021-03-24 12:50:00',1616590162557,23,'jingquxianlu','景区名称3','http://localhost:8080/jspmju51h/upload/jingquxianlu_zhaopian3.jpg'),(1616590215315,'2021-03-24 12:50:14',1616590162557,63,'jingdianmeishi','美食名称3','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian3.jpg'),(1616590215685,'2021-03-24 12:50:15',1616590162557,63,'jingdianmeishi','美食名称3','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian3.jpg'),(1616590216321,'2021-03-24 12:50:15',1616590162557,63,'jingdianmeishi','美食名称3','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian3.jpg'),(1616590217049,'2021-03-24 12:50:16',1616590162557,63,'jingdianmeishi','美食名称3','http://localhost:8080/jspmju51h/upload/jingdianmeishi_meishitupian3.jpg');
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1616590162557,'11','yonghu','用户','lue7rcisr8kd0s7y0weqwnmxrbwnaluc','2021-03-24 12:49:27','2021-03-24 13:49:28');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-24 12:48:45');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1616590162558 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-03-24 12:48:45','用户1','123456','姓名1','男','773890001@qq.com','13823888881','http://localhost:8080/jspmju51h/upload/yonghu_zhaopian1.jpg',100),(12,'2021-03-24 12:48:45','用户2','123456','姓名2','男','773890002@qq.com','13823888882','http://localhost:8080/jspmju51h/upload/yonghu_zhaopian2.jpg',100),(13,'2021-03-24 12:48:45','用户3','123456','姓名3','男','773890003@qq.com','13823888883','http://localhost:8080/jspmju51h/upload/yonghu_zhaopian3.jpg',100),(14,'2021-03-24 12:48:45','用户4','123456','姓名4','男','773890004@qq.com','13823888884','http://localhost:8080/jspmju51h/upload/yonghu_zhaopian4.jpg',100),(15,'2021-03-24 12:48:45','用户5','123456','姓名5','男','773890005@qq.com','13823888885','http://localhost:8080/jspmju51h/upload/yonghu_zhaopian5.jpg',100),(16,'2021-03-24 12:48:45','用户6','123456','姓名6','男','773890006@qq.com','13823888886','http://localhost:8080/jspmju51h/upload/yonghu_zhaopian6.jpg',100),(1616590162557,'2021-03-24 12:49:22','11','11','11',NULL,'','',NULL,0);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-25  9:54:38
