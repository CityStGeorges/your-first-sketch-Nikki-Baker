DROP DATABASE IF EXISTS pet_database;
CREATE DATABASE pet_database;
USE pet_database;

DROP TABLE IF EXISTS petPet, petEvent;

TABLE petPet (
  petname varchar(20),
  owner varchar(45),
  species varchar(45),
  gender varchar(1) CONSTRAINT (M,F,X),
  birth datetime,
  death datetime
);

TABLE petEvent (
  petname varchar(20),
  eventdate datetime,
  eventtype varchar(15),
  remark varchar(255),
  FOREIGN KEY petname,
  PRIMARY KEY (petname, eventdate),
);