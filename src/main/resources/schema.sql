USE 109test;

CREATE TABLE city
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(255),
    state   VARCHAR(255),
    country VARCHAR(255)
);
INSERT INTO city (name, state, country) VALUES ('New York', 'New York', 'United States');
INSERT INTO city (name, state, country) VALUES ('London', 'England', 'United Kingdom');
INSERT INTO city (name, state, country) VALUES ('Paris', 'Île-de-France', 'France');
