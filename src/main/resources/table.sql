create table SYS_USER
(
  user_id   VARCHAR2(50) default sys_guid() not null,
  user_name VARCHAR2(100) not null,
  password  VARCHAR2(50) not null
)

create table USERINFO
(
  userid   VARCHAR2(50) default sys_guid() not null,
  username VARCHAR2(100) not null,
  password VARCHAR2(50) not null
)

-- ----------------------------
-- Table structure for customer
-- ----------------------------
CREATE TABLE customer (
  cid number(11) NOT NULL primary key,
  cname nvarchar2(20) default NULL,
  cphone nvarchar2(11) default NULL,
  caddress nvarchar2(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for merchant
-- ----------------------------
CREATE TABLE merchant (
  mid number(11) NOT NULL primary key,
  mname nvarchar2(20) default NULL,
  mphone nvarchar2(11) default NULL,
  maddress nvarchar2(200) default NULL
);


-- ----------------------------
-- Table structure for orders
-- ----------------------------

CREATE TABLE orders (
  oid number(11) NOT NULL  primary key,
  odatetime Timestamp default NULL,
  ostate nvarchar2(20) default NULL,
  osummoney number(15,2) default NULL,
  cid number(11) NOT NULL,
  CONSTRAINT order_ibfk_1 FOREIGN KEY (cid) REFERENCES customer (cid)
);


-- ----------------------------
-- Table structure for ordersitem
-- ----------------------------
CREATE TABLE ordersitem (
  oiid number(11) NOT NULL  PRIMARY KEY,
  iobuynum number(11) default NULL,
  iosummoney number(15,2) default NULL,
  pid number(11) NOT NULL,
  oid number(11) NOT NULL,
  CONSTRAINT ordersitem_ibfk_2 FOREIGN KEY (oid) REFERENCES orders (oid),
  CONSTRAINT ordersitem_ibfk_1 FOREIGN KEY (pid) REFERENCES product (pid)
) ;



-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS product;
CREATE TABLE product (
  pid number(11) NOT NULL PRIMARY KEY,
  pname nvarchar2(20) default NULL,
  pprice number(10,2) default NULL,
  premain number(11) default NULL,
  mid number(11) NOT NULL,
  CONSTRAINT product_ibfk_1 FOREIGN KEY (mid) REFERENCES merchant (mid)
);

insert into customer values(1,'张三','15639854081','南阳');
insert into customer values(2,'李四','17439804082','上海');
insert into customer values(3,'王五','13438454088','长春');
insert into customer values(4,'赵六','18239454061','上海');
insert into customer values(5,'刘八','15439854382','北京');
insert into customer values(6,'旺财','17433854087','广东');
insert into merchant values(1,'广州宝洁','800-400-300','广州');
insert into merchant values(2,'北京老板','808-300-446','北京');
insert into merchant values(3,'郑州宇通','888-400-533','郑州');
insert into product values(1,'佳洁士炫白牙齿牙膏',6.8,300,1);
insert into product values(2,'舒肤佳',4.5,400,1);
insert into product values(3,'飘柔',20.8,5,1);
insert into product values(4,'海飞丝',32.5,20,1);
insert into product values(5,'老板油烟机',566.00,40,2);
insert into product values(6,'老板插座',56.00,400,2);
insert into product values(7,'老板风扇',128.00,360,2);
insert into product values(8,'老板压力锅',288.00,460,2);
insert into product values(10,'宇通油电混合客车',200000,10,3);
insert into product values(11,'宇通电动客车',120000,20,3);
insert into product values(12,'宇通重卡',400000,60,3);     
insert into orders values(1,to_date('2016-03-02 12:30:02','yyyy-MM-dd HH24:mi:ss'),'未支付',0,1);
insert into orders values(2,to_date('2016-02-02 09:30:02','yyyy-MM-dd HH24:mi:ss'),'已支付',0,3);
insert into orders values(3,to_date('2016-01-02 12:28:02','yyyy-MM-dd HH24:mi:ss'),'已支付',0,5);
insert into orders values(4,to_date('2016-01-02 12:28:02','yyyy-MM-dd HH24:mi:ss'),'已支付',0,4);
--订单1：有三件商品
insert into ordersitem values(1,3,20.40,1,1);
insert into ordersitem values(2,2,41.6,3,1);
insert into ordersitem values(3,1,400000,11,1);
--订单2：有两件商品
insert into ordersitem values(4,1,566,5,2);
insert into ordersitem values(5,1,128,7,2);
--订单3：有一件商品
insert into ordersitem values(6,1,120000,10,3);
--订单4：有三件商品
insert into ordersitem values(7,3,20.40,1,4);
insert into ordersitem values(8,1,6.8,1,4);
insert into ordersitem values(9,1,400000,11,4);
commit;
