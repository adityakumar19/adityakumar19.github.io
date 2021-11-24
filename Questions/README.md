# MySQL DATABASE SCRIPTS

CREATE TABLE options (
  Option_Id int NOT NULL AUTO_INCREMENT,
  O_a VARCHAR(100),
  O_b VARCHAR(100),
  O_c VARCHAR(100),
  O_d VARCHAR(100),
  PRIMARY KEY (Option_Id)
);

CREATE TABLE questions (
  Id int NOT NULL AUTO_INCREMENT,
  Question varchar(1000) NOT NULL,
  Answer varchar(200) NOT NULL,
  O_Id int NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (O_Id) REFERENCES options(Option_Id)
);
 
INSERT INTO options 
VALUES (null,"a)Aditya" , "b)Aniruddh" , "c)Prema" , "d)Kumar");

INSERT INTO questions 
VALUES (null,"What is your name?" , "a)Aditya");

INSERT INTO options 
VALUES (null,"a)Mumbai" , "b)Pune" , "c)Aurangabad" , "d)Nashik");

INSERT INTO questions 
VALUES (null,"Where do you live??" , "c)Aurangabad");

INSERT INTO options 
VALUES (null,"a)Coding" , "b)Trekking" , "c)Football" , "d)Travelling");

INSERT INTO questions 
VALUES (null,"What is your hobby?" , "c)Football");


# API's list(tested using postman)
1) To get list of all questions with options -> localhost:8080/api/questions (Get mapping)
2) To get a answer of a particular question using id -> localhost:8080/api/answer?questionId= (Get mapping)
3) To create new question -> localhost:8080/api/questions (Post mapping)
4) To delete a particular question -> localhost:8080/api/questions?questionId= (Delete mapping)
