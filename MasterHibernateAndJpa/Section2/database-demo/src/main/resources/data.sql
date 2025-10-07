create table person(
id integer not null,
name varchar(200) not null,
location varchar(200),
birth_date timestamp,
primary key(id)
);

INSERT INTO person (id, name, location, birth_date) VALUES
(1, 'John Doe', 'New York',        TIMESTAMP '1990-05-14 10:30:00'),
(2, 'Jane Smith', 'Los Angeles',   TIMESTAMP '1985-09-23 15:45:00'),
(3, 'Michael Brown', 'Chicago',    TIMESTAMP '1992-12-01 08:20:00'),
(4, 'Emily Johnson', 'Houston',    TIMESTAMP '1998-03-11 21:10:00'),
(5, 'David Wilson', 'San Francisco', TIMESTAMP '1975-07-30 12:00:00'),
(6, 'Sophia Martinez', 'Miami',    TIMESTAMP '2000-11-05 17:55:00'),
(7, 'Daniel Anderson', NULL,       TIMESTAMP '1994-01-19 09:00:00'),
(8, 'Olivia Thomas', 'Seattle',    TIMESTAMP '1988-06-25 14:25:00'),
(9, 'James Taylor', 'Boston',      TIMESTAMP '1996-02-08 19:40:00'),
(10, 'Isabella Moore', 'Denver',   TIMESTAMP '2002-10-17 07:15:00');