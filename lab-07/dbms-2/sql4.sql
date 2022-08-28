-- Stored Procedures
--1. All tables Insert, Update & Delete

create procedure pr_person_insert
@workerid        int,
@firstname      varchar(100),
@lastname       varchar(100),
@salary         decimal(8,2),
@joiningdate    datetime,
@departmentid    int,
@designationid  int

as
begin

insert into p1 
(
		    workerid,
			firstname,
			lastname,
			salary,
			joiningdate,
			departmentid,
			designationid
)
values
(
		@workerid,   
		@firstname,  
		@lastname,   
		@salary,
		@joiningdate,
		@departmentid,
		@designationid
)
end

exec pr_person_insert 108,'keyur','akbari',80000,'2020-12-02',4,16
select * from p1



create procedure pr_dep_insert
    @departmentid        int,
	@departmentname      varchar(100)
	as
	begin
	insert into department
	(
			departmentid,   
			departmentname 
	)
	values
	(
	@departmentid,
	@departmentname 
	)
	end

	exec  pr_dep_insert 5,'civil'
	select * from department

	CREATE PROCEDURE PR_DESIGNATION_INSERT
	@DESIGNATION			INT,
	@DESIGNATIONNAME		VARCHAR(100)
	AS
	BEGIN
	INSERT INTO Designation
	(
		DesignationID,
		DesignationName
	)
	VALUES
	(
		@DESIGNATION,	
		@DESIGNATIONNAME
	)
	END
	EXEC PR_DESIGNATION_INSERT 16,'Etc..'
	SELECT * FROM Designation




	
	--------------PERSON TABLE UPDATE--------------
	CREATE  PROCEDURE PR_PERSON_UPDATE
	@WORKERID		INT,
	@FRISTNAME		VARCHAR(100),
	@LASTNAME		VARCHAR(100),
	@SALARY			DECIMAL(8,2),
	@JOININGDATE	DATETIME,
	@DEPARTMENTID	INT,
	@DESIGNATION	INT
	AS
	BEGIN
	UPDATE p1
	SET					
		FirstName					=@FRISTNAME,	
		LastName					=@LASTNAME,		
		Salary						=@SALARY,			
		JoiningDate					=@JOININGDATE,	
		DepartmentID				=@DEPARTMENTID,	
		DesignationID				=@DESIGNATION
	WHERE WorkerID=@WORKERID
	END
	EXEC PR_PERSON_UPDATE 108,'Prit','Sharma',11000,'01-01-2001',4,16
	SELECT * FROM p1



	
	--------------DEPARTMENT TABLE UPDATE--------------
	CREATE PROCEDURE PR_DEPARTMENT_UPDATE
	@DEPARTMENTID		INT,
	@DEPARTMENTNAME		VARCHAR(100)
	AS
	BEGIN
	UPDATE Department
	SET 
		DepartmentName				=@DEPARTMENTNAME
	WHERE DepartmentID=@DEPARTMENTID
	END
	EXEC PR_DEPARTMENT_UPDATE 5,'XYZ'
	SELECT * FROM Department



		--------------DESIGNATION TABLE UPDATE--------------
	CREATE PROCEDURE PR_DESIGNATION_UPDATE
	@DESIGNATIONID			INT,
	@DESIGNATIONNAME		VARCHAR(100)
	AS
	BEGIN
	UPDATE Designation
	SET 
	DesignationName				=@DESIGNATIONNAME
	WHERE DesignationID=@DESIGNATIONID
	END
	EXEC PR_DESIGNATION_UPDATE 16,'XYZ'
	SELECT * FROM Designation

		--------------PERSON TABLE DELETE--------------
	CREATE  PROCEDURE PR_PERSON_DELETE
	@WORKERID		INT
	AS
	BEGIN
	DELETE FROM p1
	WHERE WorkerID=@WORKERID
	END
	EXEC PR_PERSON_DELETE 108
	SELECT * FROM p1

		--------------DEPATRMENT TABLE DELETE--------------
	CREATE  PROCEDURE PR_DEPARTMENT_DELETE
	@DEPARTMENTID		INT
	AS
	BEGIN
	DELETE FROM Department
	WHERE DepartmentID=@DEPARTMENTID
	END
	EXEC PR_DEPARTMENT_DELETE 5
	SELECT * FROM Department


		--------------DESIGNATION TABLE DELETE--------------
	CREATE  PROCEDURE PR_DESIGNATION_DELETE
	@DESIGNATIONID			INT
	AS
	BEGIN
	DELETE FROM Designation
	WHERE DesignationID=@DESIGNATIONID
	END
	EXEC PR_DESIGNATION_DELETE 16
	SELECT * FROM Designation



--2. All tables SelectAll (If foreign key is available than do write join and take columns on select list)

--------------PERSON TABLE--------------
(-------------DEPARTMENTID FOREGIN KEY-------------)


--3. All tables SelectPK

--4. Create Procedure that takes Department Name & Designation Name as Input and Returns a 
--table with Worker’s First Name, Salary, Joining Date & Department Name.
--5. Create Procedure that takes FirstName as an input parameter and displays’ all the details of 
--the worker with their department & designation name.
--6. Create Procedure which displays department wise maximum, minimum & total salaries