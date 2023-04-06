DROP TABLE IF EXISTS insurance;

CREATE TABLE insurance (
insurance_number int AUTO_INCREMENT PRIMARY KEY,
customer_id int NOT NULL,
insurance_type varchar(100) NOT NULL,
insurance_amount int NOT NULL,
insurance_end_date date DEFAULT NULL
);
INSERT INTO insurance (customer_id, insurance_type, insurance_amount, insurance_end_date) VALUES (1, 'VEHICLE INSURANCE', 99000, CURDATE());

INSERT INTO insurance (customer_id, insurance_type, insurance_amount, insurance_end_date) VALUES (1, 'HOME INSURANCE', 55700, CURDATE());

INSERT INTO insurance (customer_id, insurance_type, insurance_amount, insurance_end_date) VALUES (2, 'TERM INSURANCE', 45800, CURDATE());

INSERT INTO insurance (customer_id, insurance_type, insurance_amount, insurance_end_date) VALUES (2, 'TRAVEL INSURANCE', 35988, CURDATE());