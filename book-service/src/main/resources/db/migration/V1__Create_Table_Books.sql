CREATE TABLE books(
    id serial  PRIMARY KEY,
    author char(170),
    launch_date date,
    price decimal(10,2),
    title char(170)
);