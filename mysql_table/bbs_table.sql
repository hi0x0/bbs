

create table user (user_id int primary key auto_increment,email varchar(30),username varchar(20),password varchar(20),headerimg varchar(40),quanxian_id int,createtime datetime);

create table tie (tie_id int primary key auto_increment,user_id int,leibie_id int,title varchar(20),tie_content text,guanjianzi varchar(40),liulan int,createtime datetime,dengji int);

create table like_tie (user_id int,tie_id int);

create table liuyan (liuyanId int primary key auto_increment,user_id int,tie_id int,body text,createtime datetime);

create table quanxian (quanxian_id int,body varchar(20));

create table leibie (leibie_id int,body varchar(20));

create table zan (tie_id int,user_id int);




alter table user add INDEX (quanxian_id);

alter table quanxian add UNIQUE (quanxian_id);

alter table tie add INDEX (user_id);

alter table tie add INDEX (leibie_id);

alter table leibie add UNIQUE (leibie_id);

alter table like_tie add INDEX (user_id);

alter table like_tie add UNIQUE (tie_id);

alter table liuyan add INDEX (tie_id);

alter table liuyan add INDEX (user_id);

alter table zan add INDEX (tie_id);

alter table zan add INDEX (user_id);



alter table user add constraint QX_ID foreign key(quanxian_id) references quanxian(quanxian_id);

alter table tie add constraint T_U_ID foreign key(user_id) references user(user_id);

alter table tie add constraint T_L_ID foreign key(leibie_id) references leibie(leibie_id);

alter table like_tie add constraint L_U_ID foreign key(user_id) references user(user_id);

alter table like_tie add constraint L_T_ID foreign key(tie_id) references tie(tie_id);

alter table liuyan add constraint Y_U_ID foreign key(user_id) references user(user_id);

alter table liuyan add constraint  Y_T_ID foreign key(tie_id) references tie(tie_id);

alter table zan add constraint Z_T_ID foreign key(tie_id) references tie(tie_id);

alter table zan add constraint Z_U_ID foreign key(user_id) references tie(user_id);
