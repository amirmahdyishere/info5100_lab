show databases;

create database medicaldb;
USE medicaldb;

CREATE TABLE patient(
id int PRIMARY KEY auto_increment,
fname varchar(70),
lname varchar(70),
gender varchar(10),
patient_type varchar(15),
age varchar(3),
Phone varchar(12),
email varchar(35));

INSERT INTO patient(fname, lname)values('AMIR','PV');

SELECT * FROM patient;