INSERT INTO `route`
(id, name) VALUES
(1,'R01'),
(2,'R02'),
(3,'R03'),
(4,'R04'),
(5,'R05'),
(6,'R06'),
(7,'R07'),
(8,'R08'),
(9,'R09'),
(10,'R10');

INSERT INTO `bus`
(id, model,  name, route_id) VALUES
(1, 'Bogdan',  'A092', 1),
(2, 'Bogdan',  'A092', 1),
(3, 'Bogdan',  'A092', 1),
(4, 'Bogdan',  'A092', 2),
(5, 'Bogdan',  'A092', 3),
(6, 'Bogdan',  'A092', 4),
(7, 'Bogdan',  'A092', 5),
(8, 'MAZ',  '215', 5),
(9, 'MAZ',  '215', 6),
(10, 'MAZ',  '215', 6),
(11, 'MAZ',  '215', 7),
(12, 'CityLAZ',  '12', 8),
(13, 'CityLAZ',  '12', 9),
(14, 'CityLAZ',  '12', 10),
(15, 'CityLAZ',  '12', 1);

INSERT INTO `user`
(id, discriminator, first_name, email,
 second_name, login, password, role, bus_id) VALUES
(1,1,'Barak', 'Barak@gmail.com', 'Obama', 'barak', '$2y$04$/.xPMFmsjKNB/4XN6MgJ4Op1QaQIhJvN8yktsAf922mPzvEmi0ZPy', 'ROLE_ADMIN', null),
(2,1,'Donald', 'Donald@gmail.com', 'Trump', 'trump', '$2y$04$0VjURHZwtdQD43twSepiZO45n.t3RYOpCO.r4Gtas3Qpkp6zNj53K', 'ROLE_ADMIN', null),
(3,2,'Timmy', 'Timmy@gmail.com', 'Vermalen', 'timmy', '$2y$04$T2N1205Ub4UK7Ch7rwTxEevD/rXsKUd8gJQ1QDS9WMHxU.n1g4kWG', 'ROLE_DRIVER', 1),
(4,2,'Morganna', 'Morganna@gmail.com', 'Saintinens', 'morganna', '$2y$04$39SLeXgFvGSCJIG.D/g70OCtrgQXAQshzpzgmSiPQhxlTMjDIaPuq', 'ROLE_DRIVER', 2),
(5,2,'Sasha', 'Sasha@gmail.com', 'Blue', 'sasha', '$2y$04$7DC8KNYJXDz3n7VmXivqFuozk1QiYA/NpdN2NykWbkL7Ocbyfj80O', 'ROLE_DRIVER',3),
(6,2,'Semen', 'Semen@gmail.com', 'Slepakov', 'semen', '$2y$04$AFVV2b0zO9lMj.Ho/rlFp.4bubWWNUjcb9fSDo8UwuPxEG.gstV5q', 'ROLE_DRIVER', 4),
(7,2,'Kyrylo', 'Kyrylo@gmail.com', 'Kozhemyaka', 'kyrylo', '$2y$04$B2GolXV4pFJG8sxxI.2PFutmPe6L4D3933Rn2cI8H5VvFpfFf.OuS', 'ROLE_DRIVER', 5),
(8,2,'Stephan', 'Stephan@gmail.com', 'Issmich', 'stephan', '$2y$04$7UNS5C8Z1yVwuSOe0x.eze8vJkJEdQK20vINKp6EvOs.LHNa4D90W', 'ROLE_DRIVER', 6),
(9,2,'Kyryllo', 'Kyryllo@gmail.com', 'Karasiov', 'kyryllo', '$2y$04$8eJ4Zv1JRhaV9DPBNTTHYuhjFbOuXM3QkDmCbH/4QPzQEOwbosB7e', 'ROLE_DRIVER', 7),
(10,2,'Alexandr', 'Alexandr@gmail.com', 'Kostyliev', 's1mple', '$2y$04$hxsuwPa4UQlCJFJS3HGMYOBDSf30R9L6QSoo6B.MDJZtg6SUcpTI2', 'ROLE_DRIVER', 8),
(11,2,'Trinda', 'Trinda@gmail.com', 'Mer', 'trindamer', '$2y$04$KiFucTRXDmc7BOuemC7EBuiDe48CHFcX37bW8KrDLbdjnZJbQpr2m', 'ROLE_DRIVER', 9),
(12,2,'Cho', 'Cho@gmail.com', 'Gath', 'void123', '$2y$04$LSQKjsNngtPGVhM2BipoROkzgmoiY1VZDulzva0jVvfPU2LjoNrfW', 'ROLE_DRIVER', 10);


SELECT * FROM route;
SELECT * FROM bus;
SELECT * FROM user;