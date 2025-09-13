-- schema
create table if not exists T_MESSAGES(
    id varchar(36) default random_uuid() primary key,
    text varchar(255) not null
);