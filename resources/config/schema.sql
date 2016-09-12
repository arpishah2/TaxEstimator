CREATE TABLE user (
  id int IDENTITY NOT NULL PRIMARY KEY,
  name varchar(32) DEFAULT NULL,
  email varchar(32) NOT NULL,
  password varchar(32) DEFAULT NULL
);

ALTER TABLE user ADD CONSTRAINT unique_email UNIQUE (email);

CREATE TABLE donation (
  donationId int IDENTITY NOT NULL PRIMARY KEY,
  userId int NOT NULL,
  description varchar(512) DEFAULT NULL,
  estimate long NOT NULL,
  tax_deductible long NOT NULL,
  year int
);

alter table donation add constraint user_fk foreign key (userId) references user(id);
