CREATE TABLE STUDENT (
    student_id INT PRIMARY KEY,
    name VARCHAR(255),
   age INT,
   faculty VARCHAR(255),
    course VARCHAR(255) ARRAY

);

CREATE TABLE COURSE (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(255),
    professor VARCHAR(255)
);