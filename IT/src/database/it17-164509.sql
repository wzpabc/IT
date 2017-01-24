-- MySQL dump 10.13  Distrib 5.7.14, for Win64 (x86_64)
--
-- Host: localhost    Database: it
-- ------------------------------------------------------
-- Server version	5.7.14-log

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
-- Table structure for table `job_config`
--

DROP TABLE IF EXISTS `job_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job_config` (
  `id` int(11) DEFAULT NULL,
  `config_code` varchar(255) DEFAULT NULL,
  `config_name` varchar(255) DEFAULT NULL,
  `freq` int(11) DEFAULT '1',
  `retry_time` int(11) DEFAULT NULL,
  `email` varchar(1024) DEFAULT NULL,
  `config_status` char(1) DEFAULT NULL,
  `ktr_name` varchar(1024) DEFAULT NULL,
  `remark` varchar(1024) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `run_status` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_config`
--

LOCK TABLES `job_config` WRITE;
/*!40000 ALTER TABLE `job_config` DISABLE KEYS */;
INSERT INTO `job_config` VALUES (1,'1','SalesOrder_Inbound.kjb',2,5,'dickxiao@tupperware.com,vikali@tupperware.com','1','SalesOrder_Inbound.kjb','','2015-12-09 16:07:01','2016-05-24 16:45:30',NULL),(2,'2','SalesOrder_Outbound.kjb',1,4,'dickxiao@tupperware.com,vikali@tupperware.com','1','SalesOrder_Outbound.kjb','','2015-12-09 16:07:47','2016-01-28 14:59:23',NULL),(3,'3','Address_Book.kjb',5,3,'dickxiao@tupperware.com,vikali@tupperware.com','1','Address_Book.kjb','','2015-12-09 16:08:22','2016-03-04 17:19:24',NULL),(4,'4','stock_balance.kjb',1,10,'dickxiao@tupperware.com,vikali@tupperware.com','1','stock_balance.kjb','','2015-12-09 16:09:06','2016-03-15 11:12:56',NULL),(5,'5','ItemBranch_job.kjb',2,4,'dickxiao@tupperware.com,vikali@tupperware.com','1','ItemBranch_job.kjb','','2015-12-09 16:10:08','2016-03-04 09:57:39',NULL),(6,'6','item_base_price.kjb',3,3,'dickxiao@tupperware.com,vikali@tupperware.com','1','item_base_price.kjb','','2015-12-09 16:10:36','2016-03-04 09:57:19',NULL),(7,'7','BOMSalesOfficeKIT_job.kjb',1,4,'dickxiao@tupperware.com,vikali@tupperware.com','1','BOMSalesOfficeKIT_job.kjb','','2015-12-09 16:11:10','2016-03-03 17:09:40',NULL),(8,'8','AddressBydatejob.kjb',32,5,'dickxiao@tupperware.com,vikali@tupperware.com','1','AddressBydatejob.kjb','','2015-12-09 16:11:48','2016-03-31 11:01:24',NULL),(10,'9','deteleOrderDetail_in_repeat.kjb',1,3,'dickxiao@tupperware.com,vikali@tupperware.com','1','deteleOrderDetail_in_repeat.kjb','1','2016-03-31 11:01:00','2016-03-31 11:01:43',NULL),(11,'10','StockAdjust',2,5,'vikali@Tupperware.com','1','StockAdjustOut.kjb','','2016-07-18 10:43:27','2016-07-18 10:43:27',NULL);
/*!40000 ALTER TABLE `job_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job_email`
--

DROP TABLE IF EXISTS `job_email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job_email` (
  `mail` varchar(100) DEFAULT NULL,
  `execDate` datetime DEFAULT NULL,
  `nextExecDate` datetime DEFAULT NULL,
  `YearWeek` varchar(8000) DEFAULT NULL,
  `OrganNo` varchar(255) DEFAULT NULL,
  `organName` varchar(255) DEFAULT NULL,
  `EmailTo` varchar(255) DEFAULT NULL,
  `EmailCC` varchar(255) DEFAULT NULL,
  `EmailBC` varchar(255) DEFAULT NULL,
  `subject` varchar(273) DEFAULT NULL,
  `content` varchar(10) DEFAULT NULL,
  `attPath` varchar(100) DEFAULT NULL,
  `isActive` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_email`
--

LOCK TABLES `job_email` WRITE;
/*!40000 ALTER TABLE `job_email` DISABLE KEYS */;
INSERT INTO `job_email` VALUES ('                                                                                                    ','2017-01-11 00:00:00','2017-01-18 13:22:30','201702','010','华南','patrickwang@tupperware.com','patrickwang@tupperware.com','patrickwang@tupperware.com','华南区2017年第2周周报','0000000000','                                                                                                    ',0),('                                                                                                    ','2017-01-11 00:00:00','2017-01-18 13:22:30','201702','020','华东','patrickwang@tupperware.com','patrickwang@tupperware.com','patrickwang@tupperware.com','华东区2017年第2周周报','0000000000','                                                                                                    ',0),('                                                                                                    ','2017-01-11 00:00:00','2017-01-18 13:22:30','201702','040','西南','patrickwang@tupperware.com','patrickwang@tupperware.com','patrickwang@tupperware.com','西南区2017年第2周周报','0000000000','                                                                                                    ',0),('                                                                                                    ','2017-01-11 00:00:00','2017-01-18 13:22:30','201702','050','华北','patrickwang@tupperware.com','patrickwang@tupperware.com','patrickwang@tupperware.com','华北区2017年第2周周报','0000000000','                                                                                                    ',0),('                                                                                                    ','2017-01-11 00:00:00','2017-01-18 13:22:30','201702','060','东北','patrickwang@tupperware.com','patrickwang@tupperware.com','patrickwang@tupperware.com','东北区2017年第2周周报','0000000000','                                                                                                    ',0),('                                                                                                    ','2017-01-11 00:00:00','2017-01-18 13:22:30','201702','070','西北','patrickwang@tupperware.com','patrickwang@tupperware.com','patrickwang@tupperware.com','西北区2017年第2周周报','0000000000','                                                                                                    ',0),('                                                                                                    ','2017-01-11 00:00:00','2017-01-18 13:22:30','201702','00','公司','patrickwang@tupperware.com','patrickwang@tupperware.com','patrickwang@tupperware.com','公司2017年第2周周报','0000000000','                                                                                                    ',0);
/*!40000 ALTER TABLE `job_email` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organization`
--

DROP TABLE IF EXISTS `organization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organization` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(64) NOT NULL COMMENT '组织名',
  `address` varchar(100) DEFAULT NULL COMMENT '地址',
  `code` varchar(64) NOT NULL COMMENT '编号',
  `icon` varchar(32) DEFAULT NULL COMMENT '图标',
  `pid` bigint(19) DEFAULT NULL COMMENT '父级主键',
  `seq` tinyint(2) NOT NULL DEFAULT '0' COMMENT '排序',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='组织机构';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organization`
--

LOCK TABLES `organization` WRITE;
/*!40000 ALTER TABLE `organization` DISABLE KEYS */;
INSERT INTO `organization` VALUES (1,'总经办','王家桥','01','fi-social-windows',NULL,0,'2014-02-19 01:00:00'),(3,'技术部','','02','fi-social-github',NULL,1,'2015-10-01 13:10:42'),(5,'产品部','','03','fi-social-apple',NULL,2,'2015-12-06 12:15:30'),(6,'测试组','','04','fi-social-snapchat',3,0,'2015-12-06 13:12:18');
/*!40000 ALTER TABLE `organization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resource`
--

DROP TABLE IF EXISTS `resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resource` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(64) NOT NULL COMMENT '资源名称',
  `url` varchar(100) DEFAULT NULL COMMENT '资源路径',
  `open_mode` varchar(32) DEFAULT NULL COMMENT '打开方式 ajax,iframe',
  `description` varchar(255) DEFAULT NULL COMMENT '资源介绍',
  `icon` varchar(32) DEFAULT NULL COMMENT '资源图标',
  `pid` bigint(19) DEFAULT NULL COMMENT '父级资源id',
  `seq` tinyint(2) NOT NULL DEFAULT '0' COMMENT '排序',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '状态',
  `resource_type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '资源类别',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=237 DEFAULT CHARSET=utf8 COMMENT='资源';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resource`
--

LOCK TABLES `resource` WRITE;
/*!40000 ALTER TABLE `resource` DISABLE KEYS */;
INSERT INTO `resource` VALUES (1,'权限管理','',NULL,'系统管理','fi-folder',NULL,0,0,0,'2014-02-19 01:00:00'),(11,'资源管理','/resource/manager','ajax','资源管理','fi-database',1,1,0,0,'2014-02-19 01:00:00'),(12,'角色管理','/role/manager','ajax','角色管理','fi-torso-business',1,2,0,0,'2014-02-19 01:00:00'),(13,'用户管理','/user/manager','ajax','用户管理','fi-torsos-all',1,3,0,0,'2014-02-19 01:00:00'),(14,'部门管理','/organization/manager','ajax','部门管理','fi-results-demographics',1,4,0,0,'2014-02-19 01:00:00'),(111,'列表','/resource/treeGrid','ajax','资源列表','fi-list',11,0,0,1,'2014-02-19 01:00:00'),(112,'添加','/resource/add','ajax','资源添加','fi-page-add',11,0,0,1,'2014-02-19 01:00:00'),(113,'编辑','/resource/edit','ajax','资源编辑','fi-page-edit',11,0,0,1,'2014-02-19 01:00:00'),(114,'删除','/resource/delete','ajax','资源删除','fi-page-delete',11,0,0,1,'2014-02-19 01:00:00'),(121,'列表','/role/dataGrid','ajax','角色列表','fi-list',12,0,0,1,'2014-02-19 01:00:00'),(122,'添加','/role/add','ajax','角色添加','fi-page-add',12,0,0,1,'2014-02-19 01:00:00'),(123,'编辑','/role/edit','ajax','角色编辑','fi-page-edit',12,0,0,1,'2014-02-19 01:00:00'),(124,'删除','/role/delete','ajax','角色删除','fi-page-delete',12,0,0,1,'2014-02-19 01:00:00'),(125,'授权','/role/grant','ajax','角色授权','fi-check',12,0,0,1,'2014-02-19 01:00:00'),(131,'列表','/user/dataGrid','ajax','用户列表','fi-list',13,0,0,1,'2014-02-19 01:00:00'),(132,'添加','/user/add','ajax','用户添加','fi-page-add',13,0,0,1,'2014-02-19 01:00:00'),(133,'编辑','/user/edit','ajax','用户编辑','fi-page-edit',13,0,0,1,'2014-02-19 01:00:00'),(134,'删除','/user/delete','ajax','用户删除','fi-page-delete',13,0,0,1,'2014-02-19 01:00:00'),(141,'列表','/organization/treeGrid','ajax','用户列表','fi-list',14,0,0,1,'2014-02-19 01:00:00'),(142,'添加','/organization/add','ajax','部门添加','fi-page-add',14,0,0,1,'2014-02-19 01:00:00'),(143,'编辑','/organization/edit','ajax','部门编辑','fi-page-edit',14,0,0,1,'2014-02-19 01:00:00'),(144,'删除','/organization/delete','ajax','部门删除','fi-page-delete',14,0,0,1,'2014-02-19 01:00:00'),(221,'日志监控','',NULL,NULL,'fi-folder',NULL,2,0,0,'2015-12-01 11:44:20'),(222,'日常运维','',NULL,NULL,'fi-folder',NULL,1,0,0,'2015-12-06 12:40:42'),(223,'特百惠','/m_tup','iframe',NULL,'fi-home',222,0,0,0,'2015-12-06 12:42:42'),(224,'财务报表','/m_report','iframe',NULL,'fi-video',222,1,0,0,'2015-12-06 12:45:28'),(226,'修改密码','/user/editPwdPage','ajax',NULL,'fi-unlock',NULL,3,0,1,'2015-12-07 20:23:06'),(227,'登录日志','/sysLog/manager','ajax',NULL,'fi-info',221,0,0,0,'2016-09-30 22:10:53'),(228,'Druid监控','/druid','iframe',NULL,'fi-monitor',221,0,0,0,'2016-09-30 22:12:50'),(229,'系统图标','/icons.html','ajax',NULL,'fi-photo',221,0,0,0,'2016-12-24 15:53:47'),(230,'系统接口','',NULL,NULL,'fi-folder',NULL,3,0,0,'2017-01-18 11:55:13'),(231,'订单同步','/job/order','ajax',NULL,'fi-yen',230,0,0,0,'2017-01-18 11:57:07'),(233,'作业管理','/job/manage',NULL,NULL,'fi-refresh',230,0,0,0,'2017-01-18 12:07:32'),(234,'状态监控','/job/monitor',NULL,NULL,'fi-refresh',230,0,0,0,'2017-01-18 15:22:32'),(235,'test','','ajax',NULL,'fi-refresh',233,0,0,1,'2017-01-18 15:45:58'),(236,'邮件服务','/mailhome',NULL,NULL,'fi-mail',222,0,0,0,'2017-01-18 15:58:41');
/*!40000 ALTER TABLE `resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(64) NOT NULL COMMENT '角色名',
  `seq` tinyint(2) NOT NULL DEFAULT '0' COMMENT '排序号',
  `description` varchar(255) DEFAULT NULL COMMENT '简介',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='角色';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin',0,'超级管理员',0),(2,'de',0,'技术部经理',0),(7,'pm',0,'产品部经理',0),(8,'test',0,'测试账户',0);
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_resource`
--

DROP TABLE IF EXISTS `role_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_resource` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_id` bigint(19) NOT NULL COMMENT '角色id',
  `resource_id` bigint(19) NOT NULL COMMENT '资源id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=479 DEFAULT CHARSET=utf8 COMMENT='角色资源';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_resource`
--

LOCK TABLES `role_resource` WRITE;
/*!40000 ALTER TABLE `role_resource` DISABLE KEYS */;
INSERT INTO `role_resource` VALUES (158,3,1),(159,3,11),(160,3,111),(161,3,112),(162,3,113),(163,3,114),(164,3,12),(165,3,121),(166,3,122),(167,3,123),(168,3,124),(169,3,125),(170,3,13),(171,3,131),(172,3,132),(173,3,133),(174,3,134),(175,3,14),(176,3,141),(177,3,142),(178,3,143),(179,3,144),(359,7,1),(360,7,14),(361,7,141),(362,7,142),(363,7,143),(364,7,222),(365,7,223),(366,7,224),(367,7,221),(368,7,226),(409,1,1),(410,1,11),(411,1,111),(412,1,112),(413,1,113),(414,1,114),(415,1,12),(416,1,121),(417,1,122),(418,1,123),(419,1,124),(420,1,125),(421,1,13),(422,1,131),(423,1,132),(424,1,133),(425,1,134),(426,1,14),(427,1,141),(428,1,142),(429,1,143),(430,1,144),(431,1,222),(432,1,223),(433,1,224),(434,1,221),(435,1,227),(436,1,228),(437,2,1),(438,2,13),(439,2,131),(440,2,132),(441,2,133),(442,2,222),(443,2,223),(444,2,224),(445,2,221),(446,2,227),(447,2,228),(448,8,1),(449,8,11),(450,8,111),(451,8,12),(452,8,121),(453,8,13),(454,8,131),(455,8,14),(456,8,141),(457,8,222),(458,8,223),(459,8,224),(460,8,221),(461,8,227),(462,8,228),(478,8,229);
/*!40000 ALTER TABLE `role_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_log`
--

DROP TABLE IF EXISTS `sys_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `login_name` varchar(255) DEFAULT NULL COMMENT '登陆名',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `opt_content` varchar(1024) DEFAULT NULL COMMENT '内容',
  `client_ip` varchar(255) DEFAULT NULL COMMENT '客户端ip',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=499 DEFAULT CHARSET=utf8 COMMENT='系统日志';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_log`
--

LOCK TABLES `sys_log` WRITE;
/*!40000 ALTER TABLE `sys_log` DISABLE KEYS */;
INSERT INTO `sys_log` VALUES (391,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=222&_=1484643638508&','0:0:0:0:0:0:0:1','2017-01-17 17:01:38'),(392,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=223&_=1484643638509&','0:0:0:0:0:0:0:1','2017-01-17 17:01:42'),(393,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=224&_=1484643638510&','0:0:0:0:0:0:0:1','2017-01-17 17:01:57'),(394,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=223&_=1484643638511&','0:0:0:0:0:0:0:1','2017-01-17 17:03:56'),(395,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=223&name=特百惠&resourceType=0&url=http://www.tupperware.com.cn/&openMode=iframe&icon=fi-home&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-17 17:04:19'),(396,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=224&_=1484643638512&','0:0:0:0:0:0:0:1','2017-01-17 17:05:24'),(397,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=224&name=财务报表&resourceType=0&url=http://www.tupperware.com.cn/&openMode=iframe&icon=fi-video&seq=1&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-17 17:05:47'),(398,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:login,[参数]:',NULL,'2017-01-17 17:09:29'),(399,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:loginPost,[参数]:_csrf=2deb7fbd-5087-4cf6-b42f-67afdb3c9a60&username=admin&password=test&captcha=a738&rememberMe=1&','0:0:0:0:0:0:0:1','2017-01-17 17:09:50'),(400,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:login,[参数]:',NULL,'2017-01-17 17:23:26'),(401,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:loginPost,[参数]:_csrf=8345a2f0-f2bd-454a-ad30-a0acf9da9fed&username=admin&password=test&captcha=edvx&rememberMe=1&','0:0:0:0:0:0:0:1','2017-01-17 17:23:34'),(402,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:login,[参数]:',NULL,'2017-01-17 17:27:13'),(403,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:loginPost,[参数]:_csrf=30421135-2b95-4ad6-8a67-bd9873ddd763&username=admin&password=test&captcha=9q7h&rememberMe=1&','0:0:0:0:0:0:0:1','2017-01-17 17:27:30'),(404,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:login,[参数]:',NULL,'2017-01-17 17:36:18'),(405,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:loginPost,[参数]:_csrf=745017fc-47cf-470e-9ebb-5d1af0fbb01b&username=admin&password=test&captcha=y7qp&rememberMe=1&','0:0:0:0:0:0:0:1','2017-01-17 17:36:33'),(406,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:login,[参数]:',NULL,'2017-01-17 17:42:22'),(407,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:login,[参数]:',NULL,'2017-01-17 17:59:34'),(408,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:loginPost,[参数]:_csrf=8598d44c-dbea-4681-babf-d725357412f4&username=admin&password=test&captcha=qa4m&rememberMe=1&','0:0:0:0:0:0:0:1','2017-01-17 17:59:42'),(409,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:loginPost,[参数]:_csrf=8598d44c-dbea-4681-babf-d725357412f4&username=admin&password=test&captcha=sbg9&rememberMe=1&','0:0:0:0:0:0:0:1','2017-01-17 17:59:48'),(410,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:login,[参数]:',NULL,'2017-01-17 18:12:25'),(411,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:loginPost,[参数]:_csrf=f55a28b3-a3bb-415f-9b83-7e1fea9f9d12&username=admin&password=test&captcha=yewt&rememberMe=1&','0:0:0:0:0:0:0:1','2017-01-17 18:12:35'),(412,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=223&_=1484704758727&','0:0:0:0:0:0:0:1','2017-01-18 10:00:54'),(413,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=223&name=特百惠&resourceType=1&url=http://www.tupperware.com.cn/&openMode=iframe&icon=fi-home&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 10:01:00'),(414,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=223&_=1484704873608&','0:0:0:0:0:0:0:1','2017-01-18 10:01:33'),(415,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=223&name=特百惠&resourceType=0&url=http://www.tupperware.com.cn/&openMode=iframe&icon=fi-home&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 10:01:38'),(416,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=133&_=1484704873609&','0:0:0:0:0:0:0:1','2017-01-18 10:01:46'),(417,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=11&_=1484704873610&','0:0:0:0:0:0:0:1','2017-01-18 10:02:01'),(418,'admin','admin','[类名]:com.tup.controller.OrganizationController,[方法]:addPage,[参数]:',NULL,'2017-01-18 10:03:23'),(419,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=226&_=1484704873614&','0:0:0:0:0:0:0:1','2017-01-18 10:03:44'),(420,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=228&_=1484704873617&','0:0:0:0:0:0:0:1','2017-01-18 10:25:28'),(421,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=228&_=1484704873618&','0:0:0:0:0:0:0:1','2017-01-18 10:25:51'),(422,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:login,[参数]:',NULL,'2017-01-18 11:09:43'),(423,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:loginPost,[参数]:_csrf=2c6c6ce6-4b44-461d-a28c-132f0e8ed47c&username=admin&password=test&captcha=muc3&rememberMe=1&','0:0:0:0:0:0:0:1','2017-01-18 11:09:54'),(424,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=222&_=1484711546205&','0:0:0:0:0:0:0:1','2017-01-18 11:53:47'),(425,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=222&name=日常运维&resourceType=0&url=&openMode=&icon=fi-folder&seq=1&status=0&pid=&','0:0:0:0:0:0:0:1','2017-01-18 11:54:03'),(426,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:addPage,[参数]:',NULL,'2017-01-18 11:54:17'),(427,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=222&_=1484711546207&','0:0:0:0:0:0:0:1','2017-01-18 11:54:37'),(428,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:addPage,[参数]:',NULL,'2017-01-18 11:54:48'),(429,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:add,[参数]:name=系统接口&resourceType=0&url=&openMode=ajax&icon=fi-folder&seq=3&status=0&pid=&','0:0:0:0:0:0:0:1','2017-01-18 11:55:13'),(430,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:addPage,[参数]:',NULL,'2017-01-18 11:55:44'),(431,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:add,[参数]:name=订单同步&resourceType=1&url=&openMode=ajax&icon=fi-folder&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 11:57:07'),(432,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=231&_=1484711829113&','0:0:0:0:0:0:0:1','2017-01-18 11:57:20'),(433,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=231&name=订单同步&resourceType=0&url=&openMode=ajax&icon=fi-folder&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 11:57:23'),(434,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=13&_=1484711829119&','0:0:0:0:0:0:0:1','2017-01-18 11:57:59'),(435,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=231&_=1484711829120&','0:0:0:0:0:0:0:1','2017-01-18 11:58:16'),(436,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=231&name=订单同步&resourceType=0&url=/user/manager&openMode=ajax&icon=fi-folder&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 11:58:24'),(437,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=13&_=1484711829122&','0:0:0:0:0:0:0:1','2017-01-18 11:58:39'),(438,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=13&name=用户管理&resourceType=0&url=/user/manager&openMode=ajax&icon=fi-torsos-all&seq=3&status=0&pid=1&','0:0:0:0:0:0:0:1','2017-01-18 11:58:51'),(439,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=231&_=1484711829124&','0:0:0:0:0:0:0:1','2017-01-18 12:00:09'),(440,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=231&name=订单同步&resourceType=0&url=/user/manager&openMode=ajax&icon=fi-torsos-all&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 12:00:13'),(441,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=231&_=1484711829125&','0:0:0:0:0:0:0:1','2017-01-18 12:00:44'),(442,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=231&name=订单同步&resourceType=0&url=/user/manager&openMode=ajax&icon=fi-yen&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 12:00:48'),(443,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=223&_=1484711829126&','0:0:0:0:0:0:0:1','2017-01-18 12:02:14'),(444,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:addPage,[参数]:',NULL,'2017-01-18 12:02:33'),(445,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:add,[参数]:name=Kettle_QA&resourceType=0&url=&openMode=ajax&icon=fi-folder&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:03:12'),(446,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=232&_=1484711829128&','0:0:0:0:0:0:0:1','2017-01-18 12:03:40'),(447,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=232&name=Kettle_QA&resourceType=0&url=http://159.234.170.116:8080/tupperware/IndexAction_goMain.action?address=manage.jsp&openMode=iframe&icon=fi-folder&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:03:48'),(448,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=223&_=1484711829131&','0:0:0:0:0:0:0:1','2017-01-18 12:04:07'),(449,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=223&name=特百惠&resourceType=0&url=http://www.tupperware.com.cn/&openMode=iframe&icon=fi-home&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:04:10'),(450,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=232&_=1484711829132&','0:0:0:0:0:0:0:1','2017-01-18 12:04:13'),(451,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=232&name=Kettle_QA&resourceType=0&url=http://159.234.170.116:8080/tupperware/IndexAction_goMain.action?address=manage.jsp&openMode=iframe&icon=fi-folder&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:04:17'),(452,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=232&_=1484711829133&','0:0:0:0:0:0:0:1','2017-01-18 12:04:20'),(453,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=232&name=Kettle_QA&resourceType=0&url=http://159.234.170.116:8080/tupperware/IndexAction_goMain.action?address=manage.jsp&openMode=&icon=fi-folder&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:04:22'),(454,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=223&_=1484711829134&','0:0:0:0:0:0:0:1','2017-01-18 12:04:23'),(455,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=223&name=特百惠&resourceType=0&url=http://www.tupperware.com.cn/&openMode=iframe&icon=fi-home&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:04:24'),(456,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=224&_=1484711829135&','0:0:0:0:0:0:0:1','2017-01-18 12:04:26'),(457,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=224&name=财务报表&resourceType=0&url=http://www.tupperware.com.cn/&openMode=iframe&icon=fi-video&seq=1&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:04:28'),(458,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=232&_=1484711829136&','0:0:0:0:0:0:0:1','2017-01-18 12:04:31'),(459,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=232&name=Kettle_QA&resourceType=0&url=http://159.234.170.116:8080/tupperware/IndexAction_goMain.action?address=manage.jsp&openMode=iframe&icon=fi-folder&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:04:42'),(460,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:delete,[参数]:id=232&','0:0:0:0:0:0:0:1','2017-01-18 12:06:01'),(461,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:addPage,[参数]:',NULL,'2017-01-18 12:06:39'),(462,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:add,[参数]:name=作业管理&resourceType=0&url=&openMode=iframe&icon=fi-arrows-in&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 12:07:32'),(463,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=14&_=1484712480297&','0:0:0:0:0:0:0:1','2017-01-18 12:08:32'),(464,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=233&_=1484712480300&','0:0:0:0:0:0:0:1','2017-01-18 12:09:09'),(465,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=233&name=作业管理&resourceType=0&url=&openMode=&icon=fi-refresh&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 12:09:13'),(466,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=227&_=1484712480302&','0:0:0:0:0:0:0:1','2017-01-18 12:10:24'),(467,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=231&_=1484712480303&','0:0:0:0:0:0:0:1','2017-01-18 12:10:36'),(468,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=231&name=订单同步&resourceType=0&url=/sysLog/manager&openMode=ajax&icon=fi-yen&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 12:10:39'),(469,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=233&_=1484712480304&','0:0:0:0:0:0:0:1','2017-01-18 12:10:41'),(470,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=233&name=作业管理&resourceType=0&url=/sysLog/manager&openMode=&icon=fi-refresh&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 12:10:44'),(471,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=223&_=1484712480305&','0:0:0:0:0:0:0:1','2017-01-18 12:10:46'),(472,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=223&name=特百惠&resourceType=0&url=/sysLog/manager&openMode=iframe&icon=fi-home&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:10:51'),(473,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=224&_=1484712480306&','0:0:0:0:0:0:0:1','2017-01-18 12:10:53'),(474,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=224&name=财务报表&resourceType=0&url=/sysLog/manager&openMode=iframe&icon=fi-video&seq=1&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 12:10:57'),(475,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:logout,[参数]:',NULL,'2017-01-18 14:23:40'),(476,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:logout,[参数]:',NULL,'2017-01-18 15:18:55'),(477,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=233&_=1484723945552&','0:0:0:0:0:0:0:1','2017-01-18 15:19:15'),(478,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=233&name=作业管理&resourceType=0&url=/job/monitor&openMode=&icon=fi-refresh&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 15:19:23'),(479,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:addPage,[参数]:',NULL,'2017-01-18 15:21:34'),(480,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:add,[参数]:name=状态监控&resourceType=0&url=/job/monitor&openMode=ajax&icon=fi-refresh&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 15:22:32'),(481,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=233&_=1484724154865&','0:0:0:0:0:0:0:1','2017-01-18 15:22:46'),(482,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=233&name=作业管理&resourceType=0&url=/job/manage&openMode=&icon=fi-refresh&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 15:22:55'),(483,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=223&_=1484724182980&','0:0:0:0:0:0:0:1','2017-01-18 15:34:49'),(484,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=223&name=特百惠&resourceType=0&url=/m_tup&openMode=iframe&icon=fi-home&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 15:35:00'),(485,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=224&_=1484724182981&','0:0:0:0:0:0:0:1','2017-01-18 15:35:03'),(486,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=224&name=财务报表&resourceType=0&url=/m_report&openMode=iframe&icon=fi-video&seq=1&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 15:35:12'),(487,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=231&_=1484724182982&','0:0:0:0:0:0:0:1','2017-01-18 15:36:20'),(488,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:edit,[参数]:id=231&name=订单同步&resourceType=0&url=/job/order&openMode=ajax&icon=fi-yen&seq=0&status=0&pid=230&','0:0:0:0:0:0:0:1','2017-01-18 15:36:31'),(489,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=121&_=1484725482386&','0:0:0:0:0:0:0:1','2017-01-18 15:45:19'),(490,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:addPage,[参数]:',NULL,'2017-01-18 15:45:41'),(491,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:add,[参数]:name=test&resourceType=1&url=&openMode=ajax&icon=fi-refresh&seq=0&status=0&pid=233&','0:0:0:0:0:0:0:1','2017-01-18 15:45:58'),(492,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:editPage,[参数]:id=226&_=1484725913320&','0:0:0:0:0:0:0:1','2017-01-18 15:56:09'),(493,'admin','admin','[类名]:com.tup.controller.UserController,[方法]:editPwdPage,[参数]:',NULL,'2017-01-18 15:56:17'),(494,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:addPage,[参数]:',NULL,'2017-01-18 15:57:49'),(495,'admin','admin','[类名]:com.tup.controller.ResourceController,[方法]:add,[参数]:name=邮件服务&resourceType=0&url=/mailhome&openMode=ajax&icon=fi-mail&seq=0&status=0&pid=222&','0:0:0:0:0:0:0:1','2017-01-18 15:58:41'),(496,'admin','admin','[类名]:com.tup.controller.LoginController,[方法]:logout,[参数]:',NULL,'2017-01-18 16:00:23'),(497,'snoopy','snoopy','[类名]:com.tup.controller.LoginController,[方法]:logout,[参数]:',NULL,'2017-01-18 16:00:59'),(498,'test','test','[类名]:com.tup.controller.LoginController,[方法]:logout,[参数]:',NULL,'2017-01-18 16:01:15');
/*!40000 ALTER TABLE `sys_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `login_name` varchar(64) NOT NULL COMMENT '登陆名',
  `name` varchar(64) NOT NULL COMMENT '用户名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `sex` tinyint(2) NOT NULL DEFAULT '0' COMMENT '性别',
  `age` tinyint(2) DEFAULT '0' COMMENT '年龄',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `user_type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '用户类别',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '用户状态',
  `organization_id` int(11) NOT NULL DEFAULT '0' COMMENT '所属机构',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin','098f6bcd4621d373cade4e832627b4f6',0,25,'18707173376',0,0,1,'2015-12-06 13:14:05'),(13,'snoopy','snoopy','098f6bcd4621d373cade4e832627b4f6',0,25,'18707173376',1,0,3,'2015-10-01 13:12:07'),(14,'dreamlu','dreamlu','098f6bcd4621d373cade4e832627b4f6',0,25,'18707173376',1,0,5,'2015-10-11 23:12:58'),(15,'test','test','098f6bcd4621d373cade4e832627b4f6',0,25,'18707173376',1,0,6,'2015-12-06 13:13:03');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(19) NOT NULL COMMENT '用户id',
  `role_id` bigint(19) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8 COMMENT='用户角色';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (53,15,8),(60,1,1),(61,1,2),(62,1,7),(63,13,2),(64,14,7),(65,1,8);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-18 16:45:09
