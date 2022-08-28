select* from mst_city
select * from mst_state1



exec pr_mst_city_selectall



alter procedure pr_mst_city_selectall
as
begin
		select city_id,cityname,pincode,s.state_id,cityremarks,s.statename
from mst_city 
inner join mst_state1 s
on mst_city.city_id=s.state_id

end


2. insert
create procedure pr_mstcity_insert
			@city_id        int, 
			@cityname       varchar(200),
			@pincode        varchar(6),
			@state_id       int,
			@cityremarks    varchar(200)
as
begin
	insert into mst_city
	(
	        city_id,       
			cityname,     
			pincode,        
			state_id,       
			cityremarks 
	)
	values
	(
	        @city_id,       
			@cityname,     
			@pincode,        
			@state_id,       
			@cityremarks 
	)
	end
exec	pr_mstcity_insert 5,'surat','360002',4,'execllent'


3 update
	create procedure pr_mstcity_update
			@city_id        int, 
			@cityname       varchar(200),
			@pincode        varchar(6),
			@state_id       int,
			@cityremarks    varchar(200)
as
begin
     update mst_city
       set
		        
		    cityname = @cityname ,      
			pincode = @pincode ,       
			state_id = @state_id ,      
		 cityremarks = @cityremarks
where  city_id   = @city_id 
end

exec pr_mstcity_update 1,'amreli','360050',1,'avg'

create procedure pr_mstcity_delete
		@city_id        int
as
begin

		delete from mst_city
		where city_id=@city_id
end

exec pr_mstcity_delete 1


--select by pk

create procedure select_by_pk_cityid
		@city_id        int
as
begin
  select * from mst_city
  where city_id=@city_id
  end

  exec select_by_pk_cityid 2


create procedure pr_mscity_selectbypincodewith360
		
as 
begin
select * from mst_city
where pincode like '360%'
end

exec pr_mscity_selectbypincodewith360

create procedure pr_mstcity_selectbycitynamepincode
	@cityname  varchar(250),
	@pincode  varchar(6)
	as
	begin
	select * from mst_city
	where cityname = @cityname and pincode = @pincode
	end

	exec pr_mstcity_selectbycitynamepincode 'ajmer','350001'


-----

create procedure selectbyremarks
   @cityremarks varchar(500)
   as
   begin
   select * from mst_city
   where cityremarks =@cityremarks
   end
   exec selectbyremarks 'avg'

 -----

 create procedure selectbystateid
 @state_id int
 as
 begin
 select* from mst_city
 where  state_id=@state_id
 end

 exec selectbystateid 2

 create procedure selectbystateidcityid
  @state_id int,
  @city_id int
  as
  begin
  select * from mst_city
  where state_id=@state_id and 
  city_id= @city_id
  end

  exec selectbystateidcityid 2,2


 