DROP DATABASE IF EXISTS TODOLIST;
CREATE DATABASE TODOLIST;


USE TODOLIST;

CREATE TABLE USER(

    USR_ID INT(50) NOT NULL,
    USR_TOKEN INT,
    USR_NAME VARCHAR(50) NOT NULL,
    USR_EMAIL VARCHAR(35) NOT NULL,
    PRIMARY KEY (USR_ID)
    
);


CREATE TABLE CARD(

    CRD_ID INT NOT NULL AUTO_INCREMENT,
    CRD_TITLE VARCHAR(35),
    CRD_DESCRIPTION VARCHAR(255),
    CRD_DATE_ADD DATE NOT NULL,
    CRD_DATE_DEADLINE DATE NOT NULL,
    CRD_DATE_MODIFY TIMESTAMP,
    CRD_NOFICARTION BOOLEAN NOT NULL,
    USR_ID INT(50) NOT NULL,

    CONSTRAINT USER_ID FOREIGN KEY (USR_ID)
    REFERENCES USER(USR_ID),

    PRIMARY KEY (CRD_ID)
);