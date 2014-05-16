delete from user where user_id > 0;
delete from role where role_id > 0;

delete from subcategory where subcategory_id > 0;
delete from category where category_id > 0;
delete from area where area_id > 0;

delete from wisdom where wisdom_id > 0;

insert into role(role_id,role) values(1,'admin');
insert into role(role) values('user');

insert into user(user_id,name,nick,role_id, password) values(2,"Клименко Руслан","the_kaba",1, "Ajba123654~");

insert into area(area_id,area,is_admin_side) values(1,"Programming",0);
insert into area(area_id,area,is_admin_side) values(2,"Humanity",0);
insert into area(area_id,area,is_admin_side) values(3,"Sport",0);
insert into area(area_id,area,is_admin_side) values(4,"Interesting",0);


insert into category(category_id,category,is_admin_side,area_id) values(1,"Java",0,1);
insert into category(category,is_admin_side,area_id) values("Scala",0,1);
insert into category(category,is_admin_side,area_id) values("Groovy",0,1);
insert into category(category,is_admin_side,area_id) values("Clojure",0,1);
insert into category(category,is_admin_side,area_id) values("SQL",0,1);
insert into category(category,is_admin_side,area_id) values("Patterns",0,1);
insert into category(category,is_admin_side,area_id) values("IDE's",0,1);

insert into category(category,is_admin_side,area_id) values("Philosophy",0,2);
insert into category(category,is_admin_side,area_id) values("Music",0,2);
insert into category(category,is_admin_side,area_id) values("Literature",0,2);

insert into category(category,is_admin_side,area_id) values("Bodybuilding",0,3);
insert into category(category,is_admin_side,area_id) values("Snowboarding",0,3);
insert into category(category,is_admin_side,area_id) values("Biking",0,3);

insert into category(category,is_admin_side,area_id) values("Psychology",0,4);
insert into category(category,is_admin_side,area_id) values("Biology",0,4);


insert into subcategory(subcategory_id,is_admin_side, subcategory,category_id) values(1,0,"Java CORE",1);
insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Hibernate",1);
insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Spring",1);
insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Play!",1);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Scala CORE",2);
insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Scala functional",2);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Groovy CORE",3);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Clojure CORE",4);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"SQL CORE",5);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Main",6);
insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Behavioral",6);
insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Structure",6);
insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Borning",6);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Eclipse",7);
insert into subcategory(is_admin_side, subcategory,category_id) values(0,"IDEA",7);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Lacan",8);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Rock",9);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"New",10);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Excercises",11);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Excercises",12);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Excercises",13);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Success",14);

insert into subcategory(is_admin_side, subcategory,category_id) values(0,"Our body",15);


insert into wisdom(wisdom_id,author,wisdom) values(1,'Народная мудрость.','Сделал дело - гуляй смело.');
insert into wisdom(author,wisdom) values('Народная мудрость.','Утро вечера мудреннее.');
