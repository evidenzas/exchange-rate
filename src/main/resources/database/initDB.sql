CREATE TABLE IF NOT EXISTS exchange_rates
(
    id SERIAL PRIMARY KEY ,
    currency_from VARCHAR(3) ,
    currency_to VARCHAR(3) ,
    rate NUMERIC ,
    rate_date DATE ,
    updated_time TIMESTAMP
);
CREATE SEQUENCE clients_id_seq INCREMENT BY 1;
-- DROP TABLE IF EXISTS exchange_rates
