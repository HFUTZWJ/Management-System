create table cargo
(
    cargo_id int(5) PRIMARY key,
    cargo_name VARCHAR(10) not null
)

create table warehouse
(
    ware_id int(5) PRIMARY key,
    ware_name varchar(10) not null,
    ware_location varchar(20) not null
)

insert into warehouse VALUES(1,'红旗','合肥'),(5,'蓝旗','上海'),(2,'绿旗','杭州'),(3,'黄旗','广州'),(4,'黑旗','南京');
insert into cargo VALUES(1001,'螺丝刀'),(1002,'水果刀'),(1003,'菜刀'),(1004,'剪刀'),(1005,'小刀')