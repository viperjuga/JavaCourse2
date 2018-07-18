CREATE DATABASE JAVA2 --Create database of application
GO

USE JAVA2 -- use database of application
CREATE TABLE [products] (
  id BIGINT NOT NULL IDENTITY,
  title VARCHAR(32) NOT NULL,
  description VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
)
GO