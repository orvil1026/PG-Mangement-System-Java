Create database PG;
Use pg;

CREATE TABLE Room(
	r_no INT primary key,
    capacity INT,
    occupied_count INT
);

CREATE TABLE Tenant(
	t_id INT primary key,
    monthly_rent INT,
    room_no INT references Room(r_no),
    is_active boolean,
    join_dt date,
    left_dt date
);

CREATE TABLE Rent(
	r_id INT primary key,
    t_id INT references Tenant(t_id),
    room_no INT references Room(r_no),
    amount INT,
    mode_of_payment varchar(20),
    category varchar(20),
    trnsc_dt date,
    frm_dt date,
    to_dt date
);


CREATE TABLE Spending(
	s_id INT primary key,
    amount INT,
    quantity INT,
    category varchar(20),
    descrptn varchar(100),
    e_id INT references Employee(e_id),
	trnsc_dt date
);

CREATE TABLE Employee(
	e_id INT primary key,
    salary INT,
    descrptn varchar(100),
    nm varchar(50),
    mob_no varchar(50),
    join_dt date,
    left_dt date,
    is_active boolean
);

 