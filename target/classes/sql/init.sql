
CREATE TABLE USER(
user_id NVARCHAR(10) PRIMARY KEY NOT NULL,
user_password NVARCHAR(20) NOT NULL ,  
user_name NVARCHAR(20) NOT NULL
);

insert into user values ('admin','P@ssw0rd','管理者');
insert into user values ('rayho','123456','Ray Ho');
