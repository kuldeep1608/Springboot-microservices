create table USERS(
  ID int not null AUTO_INCREMENT,
  USER_NAME varchar(100) not null,
  PASSWORD varchar(100) not null,
  ACTIVE BOOLEAN,
  ROLES varchar(100) not null,
  PRIMARY KEY ( ID )
);