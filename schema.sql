Drop table Geek if EXISTS CASCADE;
Drop table Interest if Exists cascade;
drop table joinGeektoInterest if Exists cascade;

Create table Geek(
	id Integer PRIMARY KEY,
	nickname varchar(55),
	interest Integer,
	sexe varchar(55),
	nbview Integer
);

Create table Interest(
	id Integer PRIMARY KEY,
	nickname varchar(55)
);

Create table GeeksInterests(
	idGeek Integer NOT NULL,
	idInterest Integer NOT NULL,
	primary key (idGeek, idInterest),
	foreign key (idGeek) references Geek(id),
	foreign key (idInterest) references Interest(id)
);
