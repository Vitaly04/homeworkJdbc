create table CUSTOMERS
(
    id int auto_increment not null ,
    name varchar(255) not null ,
    surname varchar(255),
    age int,
    phone_number varchar(255),
    PRIMARY KEY (id)
);

create table ORDERS
(
    id int auto_increment not null ,
    data date,
    customer_id int,
    product_name varchar(255),
    amount int,
    PRIMARY KEY (id),
    foreign key (id) references CUSTOMERS (id)
);

