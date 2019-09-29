CREATE DATABASE jadle;
\c jadle;


CREATE TABLE foodtypes(id SERIAL PRIMARY KEY, name VARCHAR);
CREATE TABLE reviews(id SERIAL PRIMARY KEY, writtenby VARCHAR, rating VARCHAR, content VARCHAR, restaurantid INTEGER, createdat BIGINT);
CREATE TABLE restaurants_foodtypes(id SERIAL PRIMARY KEY, foodtypeid INTEGER, restaurantid INTEGER);
CREATE DATABASE jadle_test WITH TEMPLATE jadle;