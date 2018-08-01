create table warehouse
(
    ware_id int(5) PRIMARY key,
    ware_name varchar(10) not null,
    ware_location varchar(20) not null
);
create table sku (
    sku_id int(5) PRIMARY key auto_increment,
    sku_name varchar(10) not null,
    ware_id int(5) not null,
    cargo_id int(5) not null,
    foreign key(ware_id) references warehouse(ware_id) on delete cascade on update cascade,
    foreign key(cargo_id) references cargo(cargo_id) on delete cascade on update cascade
);
create table cargo
(
    cargo_id int(5) PRIMARY key,
    cargo_name VARCHAR(10) not null
);
insert into cargo VALUES(1001,'食品'),(1002,'衣物'),(1003,'汽车'),(1004,'家电'),(1005,'家具')
insert into warehouse values(01,'一号仓库','合肥'),(02,'二号仓库','南京'),(03,'三号仓库','杭州');
insert into sku values(1,'饼干',01,1001),(2,'衬衣',02,1002),(3,'外套',03,1002);