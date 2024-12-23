drop table if exists item;
drop table if exists account;
create table account (
    account_id int primary key auto_increment,
    username varchar(255) not null unique,
    password varchar(255),
    email varchar(255),
    address1 varchar(20),
    address2 varchar(255),
    city varchar(255),
    state varchar(2),
    zipcode varchar(5)
);
create table item (
    item_id int primary key,
    item_name varchar(255),
    item_size varchar(1),
    item_quantity int,
    item_price decimal,
    item_description varchar(255),
    item_image varchar(255)
);
create table sales (
    transaction_id int primary key auto_increment,
    purchased_by int,
    item_id int,
    foreign key (purchased_by) references  account(account_id),
    foreign key (item_id) references  item(item_id)
);

insert into item values (1, 'Black Crew Socks','S','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (2, 'Black Crew Socks','M','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (3, 'Black Crew Socks','L','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (4, 'White Crew Socks','S','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (5, 'White Crew Socks','M','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (6, 'White Crew Socks','L','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (7, 'Gray Crew Socks','S','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (8, 'Gray Crew Socks','M','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (9, 'Gray Crew Socks','L','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (10, 'Striped Crew Socks','S','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (11, 'Striped Crew Socks','M','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (12, 'Striped Crew Socks','L','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (13, 'Yellow Crew Socks','S','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (14, 'Yellow Crew Socks','M','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (15, 'Yellow Crew Socks','L','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (16, 'Gray Ankle Socks','S','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (17, 'Gray Ankle Socks','M','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (18, 'Gray Ankle Socks','L','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (19, 'Black Ankle Socks','S','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (20, 'Black Ankle Socks','M','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (21, 'Black Ankle Socks','L','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (22, 'White Ankle Socks','S','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (23, 'White Ankle Socks','M','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (24, 'White Ankle Socks','L','9999','10', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (25, 'Black Argyle Dress Socks','S','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (26, 'Black Argyle Dress Socks','M','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (27, 'Black Argyle Dress Socks','L','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (28, 'Burgundy Argyle Dress Socks','S','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (29, 'Burgundy Argyle Dress Socks','M','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (30, 'Burgundy Argyle Dress Socks','L','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (31, 'Lavender Gray Argyle Dress Socks','S','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (32, 'Lavender Gray Argyle Dress Socks','M','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (33, 'Lavender Gray Argyle Dress Socks','L','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (34, 'Striped Dress Socks','S','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (35, 'Striped Dress Socks','M','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');
insert into item values (36, 'Striped Dress Socks','L','9999','15', '100% Cotton Available in All Sizes', 'Images/black.png');

