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
insert into cargo VALUES(1001,'ʳƷ'),(1002,'����'),(1003,'����'),(1004,'�ҵ�'),(1005,'�Ҿ�')
insert into warehouse values(01,'һ�Ųֿ�','�Ϸ�'),(02,'���Ųֿ�','�Ͼ�'),(03,'���Ųֿ�','����');
insert into sku values(1,'����',01,1001),(2,'����',02,1002),(3,'����',03,1002);