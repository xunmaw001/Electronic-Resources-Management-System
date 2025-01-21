-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm602nm
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
-- Current Database: `ssm602nm`
--

/*!40000 DROP DATABASE IF EXISTS `ssm602nm`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssm602nm` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssm602nm`;

--
-- Table structure for table `bianmujiancha`
--

DROP TABLE IF EXISTS `bianmujiancha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bianmujiancha` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wenjianmingcheng` varchar(200) DEFAULT NULL COMMENT '文件名称',
  `shujukubianma` varchar(200) DEFAULT NULL COMMENT '数据库编码',
  `shujukumingcheng` varchar(200) DEFAULT NULL COMMENT '数据库名称',
  `fenlei` varchar(200) DEFAULT NULL COMMENT '分类',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `tijiaoshenpishijian` date DEFAULT NULL COMMENT '提交审批时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='编目检查';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bianmujiancha`
--

LOCK TABLES `bianmujiancha` WRITE;
/*!40000 ALTER TABLE `bianmujiancha` DISABLE KEYS */;
INSERT INTO `bianmujiancha` VALUES (61,'2022-04-19 06:42:08','文件名称1','数据库编码1','数据库名称1','分类1','用户账号1','用户姓名1','2022-04-19'),(62,'2022-04-19 06:42:08','文件名称2','数据库编码2','数据库名称2','分类2','用户账号2','用户姓名2','2022-04-19'),(63,'2022-04-19 06:42:08','文件名称3','数据库编码3','数据库名称3','分类3','用户账号3','用户姓名3','2022-04-19'),(64,'2022-04-19 06:42:08','文件名称4','数据库编码4','数据库名称4','分类4','用户账号4','用户姓名4','2022-04-19'),(65,'2022-04-19 06:42:08','文件名称5','数据库编码5','数据库名称5','分类5','用户账号5','用户姓名5','2022-04-19'),(66,'2022-04-19 06:42:08','文件名称6','数据库编码6','数据库名称6','分类6','用户账号6','用户姓名6','2022-04-19');
/*!40000 ALTER TABLE `bianmujiancha` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shujuku`
--

DROP TABLE IF EXISTS `shujuku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shujuku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shujukubianma` varchar(200) DEFAULT NULL COMMENT '数据库编码',
  `shujukumingcheng` varchar(200) DEFAULT NULL COMMENT '数据库名称',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `chuangjianshijian` varchar(200) DEFAULT NULL COMMENT '创建时间',
  `fenleifangfa` varchar(200) DEFAULT NULL COMMENT '分类方法',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `miaoshu` varchar(200) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='数据库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shujuku`
--

LOCK TABLES `shujuku` WRITE;
/*!40000 ALTER TABLE `shujuku` DISABLE KEYS */;
INSERT INTO `shujuku` VALUES (71,'2022-04-19 06:42:08','数据库编码1','数据库名称1','用户账号1','用户姓名1','创建时间1','分类方法1',1,'描述1'),(72,'2022-04-19 06:42:08','数据库编码2','数据库名称2','用户账号2','用户姓名2','创建时间2','分类方法2',2,'描述2'),(73,'2022-04-19 06:42:08','数据库编码3','数据库名称3','用户账号3','用户姓名3','创建时间3','分类方法3',3,'描述3'),(74,'2022-04-19 06:42:08','数据库编码4','数据库名称4','用户账号4','用户姓名4','创建时间4','分类方法4',4,'描述4'),(75,'2022-04-19 06:42:08','数据库编码5','数据库名称5','用户账号5','用户姓名5','创建时间5','分类方法5',5,'描述5'),(76,'2022-04-19 06:42:08','数据库编码6','数据库名称6','用户账号6','用户姓名6','创建时间6','分类方法6',6,'描述6');
/*!40000 ALTER TABLE `shujuku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shujukumingcheng`
--

DROP TABLE IF EXISTS `shujukumingcheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shujukumingcheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dianzitushu` varchar(200) DEFAULT NULL COMMENT '电子图书',
  `qikan` varchar(200) DEFAULT NULL COMMENT '期刊',
  `wenxian` varchar(200) DEFAULT NULL COMMENT '文献',
  `lunwen` varchar(200) DEFAULT NULL COMMENT '论文',
  `biaozhun` varchar(200) DEFAULT NULL COMMENT '标准',
  `zhuankan` varchar(200) DEFAULT NULL COMMENT '专刊',
  `moban` varchar(200) DEFAULT NULL COMMENT '模板',
  `gongju` varchar(200) DEFAULT NULL COMMENT '工具',
  `huiyi` varchar(200) DEFAULT NULL COMMENT '会议',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='数据库名称';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shujukumingcheng`
--

LOCK TABLES `shujukumingcheng` WRITE;
/*!40000 ALTER TABLE `shujukumingcheng` DISABLE KEYS */;
INSERT INTO `shujukumingcheng` VALUES (21,'2022-04-19 06:42:08','电子图书1','期刊1','文献1','论文1','标准1','专刊1','模板1','工具1','会议1'),(22,'2022-04-19 06:42:08','电子图书2','期刊2','文献2','论文2','标准2','专刊2','模板2','工具2','会议2'),(23,'2022-04-19 06:42:08','电子图书3','期刊3','文献3','论文3','标准3','专刊3','模板3','工具3','会议3'),(24,'2022-04-19 06:42:08','电子图书4','期刊4','文献4','论文4','标准4','专刊4','模板4','工具4','会议4'),(25,'2022-04-19 06:42:08','电子图书5','期刊5','文献5','论文5','标准5','专刊5','模板5','工具5','会议5'),(26,'2022-04-19 06:42:08','电子图书6','期刊6','文献6','论文6','标准6','专刊6','模板6','工具6','会议6');
/*!40000 ALTER TABLE `shujukumingcheng` ENABLE KEYS */;
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
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','fbhnjdsfpgsuvu2df8jnmsqrs54krfw5','2022-04-19 06:43:10','2022-04-19 07:43:10');
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
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-04-19 06:42:08');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xitongrizhi`
--

DROP TABLE IF EXISTS `xitongrizhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xitongrizhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shujukubianma` varchar(200) DEFAULT NULL COMMENT '数据库编码',
  `shujukumingcheng` varchar(200) DEFAULT NULL COMMENT '数据库名称',
  `fenleifangfa` varchar(200) DEFAULT NULL COMMENT '分类方法',
  `wenjian` varchar(200) DEFAULT NULL COMMENT '文件',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shijian` date DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='系统日志';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xitongrizhi`
--

LOCK TABLES `xitongrizhi` WRITE;
/*!40000 ALTER TABLE `xitongrizhi` DISABLE KEYS */;
INSERT INTO `xitongrizhi` VALUES (91,'2022-04-19 06:42:08','数据库编码1','数据库名称1','分类方法1','文件1','用户账号1','用户姓名1','2022-04-19'),(92,'2022-04-19 06:42:08','数据库编码2','数据库名称2','分类方法2','文件2','用户账号2','用户姓名2','2022-04-19'),(93,'2022-04-19 06:42:08','数据库编码3','数据库名称3','分类方法3','文件3','用户账号3','用户姓名3','2022-04-19'),(94,'2022-04-19 06:42:08','数据库编码4','数据库名称4','分类方法4','文件4','用户账号4','用户姓名4','2022-04-19'),(95,'2022-04-19 06:42:08','数据库编码5','数据库名称5','分类方法5','文件5','用户账号5','用户姓名5','2022-04-19'),(96,'2022-04-19 06:42:08','数据库编码6','数据库名称6','分类方法6','文件6','用户账号6','用户姓名6','2022-04-19');
/*!40000 ALTER TABLE `xitongrizhi` ENABLE KEYS */;
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
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) NOT NULL COMMENT '用户姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2022-04-19 06:42:08','用户账号1','用户姓名1','123456','男','13823888881','upload/yonghu_touxiang1.jpg'),(12,'2022-04-19 06:42:08','用户账号2','用户姓名2','123456','男','13823888882','upload/yonghu_touxiang2.jpg'),(13,'2022-04-19 06:42:08','用户账号3','用户姓名3','123456','男','13823888883','upload/yonghu_touxiang3.jpg'),(14,'2022-04-19 06:42:08','用户账号4','用户姓名4','123456','男','13823888884','upload/yonghu_touxiang4.jpg'),(15,'2022-04-19 06:42:08','用户账号5','用户姓名5','123456','男','13823888885','upload/yonghu_touxiang5.jpg'),(16,'2022-04-19 06:42:08','用户账号6','用户姓名6','123456','男','13823888886','upload/yonghu_touxiang6.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ziyuanbiaoyin`
--

DROP TABLE IF EXISTS `ziyuanbiaoyin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ziyuanbiaoyin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shuhao` varchar(200) DEFAULT NULL COMMENT '书号',
  `shuming` varchar(200) DEFAULT NULL COMMENT '书名',
  `zuozhe` varchar(200) DEFAULT NULL COMMENT '作者',
  `qitazerenzhe` varchar(200) DEFAULT NULL COMMENT '其他责任者',
  `chubanshe` varchar(200) DEFAULT NULL COMMENT '出版社',
  `banci` varchar(200) DEFAULT NULL COMMENT '版次',
  `chubanshijian` datetime DEFAULT NULL COMMENT '出版时间',
  `yeshu` varchar(200) DEFAULT NULL COMMENT '页数',
  `yuyan` varchar(200) DEFAULT NULL COMMENT '语言',
  `fenlei` varchar(200) DEFAULT NULL COMMENT '分类',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `guanjianzi` varchar(200) DEFAULT NULL COMMENT '关键字',
  `zhaiyao` longtext COMMENT '摘要',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='资源标引';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ziyuanbiaoyin`
--

LOCK TABLES `ziyuanbiaoyin` WRITE;
/*!40000 ALTER TABLE `ziyuanbiaoyin` DISABLE KEYS */;
INSERT INTO `ziyuanbiaoyin` VALUES (51,'2022-04-19 06:42:08','书号1','书名1','作者1','其他责任者1','出版社1','版次1','2022-04-19 14:42:08','页数1','语言1','分类1','upload/ziyuanbiaoyin_fengmian1.jpg','关键字1','摘要1','是',''),(52,'2022-04-19 06:42:08','书号2','书名2','作者2','其他责任者2','出版社2','版次2','2022-04-19 14:42:08','页数2','语言2','分类2','upload/ziyuanbiaoyin_fengmian2.jpg','关键字2','摘要2','是',''),(53,'2022-04-19 06:42:08','书号3','书名3','作者3','其他责任者3','出版社3','版次3','2022-04-19 14:42:08','页数3','语言3','分类3','upload/ziyuanbiaoyin_fengmian3.jpg','关键字3','摘要3','是',''),(54,'2022-04-19 06:42:08','书号4','书名4','作者4','其他责任者4','出版社4','版次4','2022-04-19 14:42:08','页数4','语言4','分类4','upload/ziyuanbiaoyin_fengmian4.jpg','关键字4','摘要4','是',''),(55,'2022-04-19 06:42:08','书号5','书名5','作者5','其他责任者5','出版社5','版次5','2022-04-19 14:42:08','页数5','语言5','分类5','upload/ziyuanbiaoyin_fengmian5.jpg','关键字5','摘要5','是',''),(56,'2022-04-19 06:42:08','书号6','书名6','作者6','其他责任者6','出版社6','版次6','2022-04-19 14:42:08','页数6','语言6','分类6','upload/ziyuanbiaoyin_fengmian6.jpg','关键字6','摘要6','是','');
/*!40000 ALTER TABLE `ziyuanbiaoyin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ziyuanjiansuo`
--

DROP TABLE IF EXISTS `ziyuanjiansuo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ziyuanjiansuo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dankujiansuo` varchar(200) DEFAULT NULL COMMENT '单库检索',
  `duokujiansuo` varchar(200) DEFAULT NULL COMMENT '多库检索',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='资源检索';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ziyuanjiansuo`
--

LOCK TABLES `ziyuanjiansuo` WRITE;
/*!40000 ALTER TABLE `ziyuanjiansuo` DISABLE KEYS */;
INSERT INTO `ziyuanjiansuo` VALUES (81,'2022-04-19 06:42:08','单库检索1','多库检索1'),(82,'2022-04-19 06:42:08','单库检索2','多库检索2'),(83,'2022-04-19 06:42:08','单库检索3','多库检索3'),(84,'2022-04-19 06:42:08','单库检索4','多库检索4'),(85,'2022-04-19 06:42:08','单库检索5','多库检索5'),(86,'2022-04-19 06:42:08','单库检索6','多库检索6');
/*!40000 ALTER TABLE `ziyuanjiansuo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ziyuanliebiao`
--

DROP TABLE IF EXISTS `ziyuanliebiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ziyuanliebiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wenjianmingcheng` varchar(200) DEFAULT NULL COMMENT '文件名称',
  `shujukubianhao` varchar(200) DEFAULT NULL COMMENT '数据库编号',
  `shujukumingcheng` varchar(200) DEFAULT NULL COMMENT '数据库名称',
  `fenlei` varchar(200) DEFAULT NULL COMMENT '分类',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `shangchuanshijian` date DEFAULT NULL COMMENT '上传时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='资源列表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ziyuanliebiao`
--

LOCK TABLES `ziyuanliebiao` WRITE;
/*!40000 ALTER TABLE `ziyuanliebiao` DISABLE KEYS */;
INSERT INTO `ziyuanliebiao` VALUES (41,'2022-04-19 06:42:08','文件名称1','数据库编号1','数据库名称1','电气控制','待标引','2022-04-19'),(42,'2022-04-19 06:42:08','文件名称2','数据库编号2','数据库名称2','电气控制','待标引','2022-04-19'),(43,'2022-04-19 06:42:08','文件名称3','数据库编号3','数据库名称3','电气控制','待标引','2022-04-19'),(44,'2022-04-19 06:42:08','文件名称4','数据库编号4','数据库名称4','电气控制','待标引','2022-04-19'),(45,'2022-04-19 06:42:08','文件名称5','数据库编号5','数据库名称5','电气控制','待标引','2022-04-19'),(46,'2022-04-19 06:42:08','文件名称6','数据库编号6','数据库名称6','电气控制','待标引','2022-04-19');
/*!40000 ALTER TABLE `ziyuanliebiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ziyuanshangchuan`
--

DROP TABLE IF EXISTS `ziyuanshangchuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ziyuanshangchuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shujukubianma` varchar(200) DEFAULT NULL COMMENT '数据库编码',
  `shujukumingcheng` varchar(200) DEFAULT NULL COMMENT '数据库名称',
  `fenleifangfa` varchar(200) DEFAULT NULL COMMENT '分类方法',
  `miaoshu` varchar(200) DEFAULT NULL COMMENT '描述',
  `wenjianmingcheng` varchar(200) DEFAULT NULL COMMENT '文件名称',
  `wenjian` varchar(200) DEFAULT NULL COMMENT '文件',
  `chuangjianshijian` date DEFAULT NULL COMMENT '创建时间',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='资源上传';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ziyuanshangchuan`
--

LOCK TABLES `ziyuanshangchuan` WRITE;
/*!40000 ALTER TABLE `ziyuanshangchuan` DISABLE KEYS */;
INSERT INTO `ziyuanshangchuan` VALUES (31,'2022-04-19 06:42:08','数据库编码1','数据库名称1','分类方法1','描述1','文件名称1','','2022-04-19',1,'用户账号1','用户姓名1','是',''),(32,'2022-04-19 06:42:08','数据库编码2','数据库名称2','分类方法2','描述2','文件名称2','','2022-04-19',2,'用户账号2','用户姓名2','是',''),(33,'2022-04-19 06:42:08','数据库编码3','数据库名称3','分类方法3','描述3','文件名称3','','2022-04-19',3,'用户账号3','用户姓名3','是',''),(34,'2022-04-19 06:42:08','数据库编码4','数据库名称4','分类方法4','描述4','文件名称4','','2022-04-19',4,'用户账号4','用户姓名4','是',''),(35,'2022-04-19 06:42:08','数据库编码5','数据库名称5','分类方法5','描述5','文件名称5','','2022-04-19',5,'用户账号5','用户姓名5','是',''),(36,'2022-04-19 06:42:08','数据库编码6','数据库名称6','分类方法6','描述6','文件名称6','','2022-04-19',6,'用户账号6','用户姓名6','是','');
/*!40000 ALTER TABLE `ziyuanshangchuan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-19 15:39:19
