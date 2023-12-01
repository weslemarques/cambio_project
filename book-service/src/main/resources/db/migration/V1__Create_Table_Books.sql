CREATE TABLE books(
    id serial  PRIMARY KEY,
    author char(70),
    launch_date date,
    price decimal(10,2),
    title char(70)
);