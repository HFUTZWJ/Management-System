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

insert into warehouse VALUES(1,'����','�Ϸ�'),(5,'����','�Ϻ�'),(2,'����','����'),(3,'����','����'),(4,'����','�Ͼ�');
insert into cargo VALUES(1001,'��˿��'),(1002,'ˮ����'),(1003,'�˵�'),(1004,'����'),(1005,'С��')