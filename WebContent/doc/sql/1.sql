CREATE TABLE ACCOUNT
(
ACC_ID	INT	PRIMARY KEY AUTO_INCREMENT  NOT NULL,
ACC_NAME	VARCHAR(200) UNIQUE,
ACC_PASSWORD	VARCHAR(255),
ACC_EMAIL	VARCHAR(200),
ACC_MOBILE	VARCHAR(100) UNIQUE,
ACC_DESC	TEXT,
ACC_CREATED_DATE	DATETIME,
ACC_CREATED_NAME	INT,
ACC_UPDATED_DATE	DATETIME,
ACC_UPDATED_NAME	INT,
ACC_STATUS	INT,
ROLE_ID	INT


);