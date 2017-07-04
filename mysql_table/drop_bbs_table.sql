
alter table user drop foreign key QX_ID;

alter table tie drop foreign key T_U_ID;

alter table tie drop foreign key T_L_ID;

alter table like_tie drop foreign key L_U_ID;

alter table like_tie drop foreign key L_T_ID;

alter table liuyan drop foreign key Y_U_ID;

alter table liuyan drop foreign key Y_T_ID;

alter table zan drop foreign key Z_T_ID;

alter table zan drop foreign key Z_U_ID;



drop table user;
drop table tie;
drop table like_tie;
drop table liuyan;
drop table quanxian;
drop table leibie;
drop table zan;