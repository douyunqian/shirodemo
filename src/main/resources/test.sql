create database if not exists test;
create table permission(
    pid int(11) not null auto_increment,
    name varchar(255)  not null default "",
    url varchar(255) default "",
    primary key (pid)
);
insert into permission values("1","add","");
insert into permission values("2","delete","");
insert into permission values("3","edit","");
insert into permission values("4","query","");
create table user(
    uid int(11) not null auto_increment,
    username varchar(255) not null DEFAULT "",
    password varchar(255) not null default "",
    primary key (uid)
);
insert into user values("1","admin","123");
insert into user values("1","demo","123");

create table role(
    rid int(11) not null auto_increment,
    rname varchar(255) not null default "",
    primary key(rid)
);
insert into role values("1","admin");
insert into role values("2","customer");

create table permission_role(
    rid int(10) not null,
    pid int(10) not null,
    key idx_rid (rid),
    key idx_pid (pid)
);
insert into permission_role values("1","1");
insert into permission_role values("1","2");
insert into permission_role values("1","3");
insert into permission_role values("1","4");
insert into permission_role values("2","1");
insert into permission_role values("2","4");

create table user_role(
    rid int(10) not null,
    uid int(10) not null,
    key idx_rid(rid),
    key idx_uid(uid)
);

insert into user_role values(1,1);


insert into user_role values(2,2);


