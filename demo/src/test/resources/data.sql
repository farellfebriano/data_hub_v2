CREATE SCHEMA IF NOT EXISTS studentdatabase;
SET SCHEMA studentdatabase;

CREATE TABLE IF NOT EXISTS students (
    student_ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255),
    ID VARCHAR(255),
    email VARCHAR(255),
    Major VARCHAR(255),
    Age INT
);


