--DROP TABLE IF EXISTS cities;
-- 
--CREATE TABLE cities (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  name VARCHAR(250) NOT NULL,
--  country VARCHAR(250) NOT NULL,
--  subcountry VARCHAR(250) NOT NULL,
--  geonameid VARCHAR(250) NOT NULL
--);
--
--INSERT INTO cities (name, country, subcountry, geonameid) VALUES
--  ('les Escaldes', 'Andorra', 'Escaldes-Engordany', '3040051'),
--  ('Andorra la Vella', 'Andorra', 'Andorra la Vella', '3041563');
--  
DROP TABLE IF EXISTS cities;
CREATE TABLE cities AS SELECT * FROM CSVREAD('classpath:world-cities.csv');