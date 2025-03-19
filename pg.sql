Create database PG;
Use pg;

CREATE TABLE Room(
	r_no INT primary key ,
    capacity INT,
    occupied_count INT
);

CREATE TABLE Tenant(
	t_id INT primary key AUTO_INCREMENT,
    nm varchar(100),
    ph_no varchar(50),
    monthly_rent INT,
    room_no INT references Room(r_no),
    is_active boolean,
    join_dt date,
    left_dt date
);

Insert into Tenant (nm, ph_no, monthly_rent, room_no, is_active , join_dt, left_dt ) values ('Orvil', '8402394823' ,20000, 415, true, '2025-03-16',null);

select * from Tenant;

CREATE TABLE Rent(
	r_id INT primary key AUTO_INCREMENT,
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
	s_id INT primary key AUTO_INCREMENT,
    amount INT,
    quantity INT,
    category varchar(20),
    descrptn varchar(100),
    e_id INT references Employee(e_id),
	trnsc_dt date
);

CREATE TABLE Employee(
	e_id INT primary key AUTO_INCREMENT,
    salary INT,
    descrptn varchar(100),
    nm varchar(50),
    mob_no varchar(50),
    join_dt date,
    left_dt date,
    is_active boolean
);

Insert into Employee (salary, descrptn, nm , mob_no, join_dt, left_dt, is_active  ) values (20000, 'Cleaner', 'Orvil', '90123123', '2025-03-16', null, true );
Insert into Room (r_no,capacity,occupied_count) values (415,2,2);
Insert into Rent ( t_id, room_no , amount, mode_of_payment, category,trnsc_dt,frm_dt, to_dt  ) values ( 1, 415, 13000, 'cash', 'rent', '2025-03-16', '2025-03-01', '2025-03-31');



 select * from Employee;
 
 select * from Employee where e_id = 1;