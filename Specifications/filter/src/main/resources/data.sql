INSERT INTO address (id, city) VALUES (1, 'Tbilisi');
INSERT INTO address (id, city) VALUES (2, 'Batumi');

INSERT INTO student (id, name, address_id) VALUES (1, 'Luka', 1);
INSERT INTO student (id, name, address_id) VALUES (2, 'Nika', 2);

INSERT INTO subject (id, name, student_id) VALUES (1, 'Math', 1);
INSERT INTO subject (id, name, student_id) VALUES (2, 'Physics', 1);
INSERT INTO subject (id, name, student_id) VALUES (3, 'Biology', 2);
INSERT INTO subject (id, name, student_id) VALUES (4, 'Chemistry', 2);