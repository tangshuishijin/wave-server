create table user (
                      user_id bigint not null auto_increment,
                      name varchar(255),
                      password varchar(255),
                      primary key (user_id)
) engine=InnoDB