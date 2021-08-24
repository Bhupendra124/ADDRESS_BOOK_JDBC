create database addressbook;
use addressbook;
create table address_book(Contact_Id int not null auto_increment ,
firstName varchar(20) not null ,
lastName varchar(20) not null,
address varchar(50),
city varchar(10) not null,
zopCode varchar(10) ,
phoneNumber varchar(12) not null,
emailId varchar(22), primary key(Contact_Id));