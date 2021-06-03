CREATE SCHEMA IF NOT EXISTS example;

CREATE TABLE IF NOT EXISTS example.entity
(
    id   BIGSERIAL PRIMARY KEY NOT NULL,
    name VARCHAR               NOT NULL,
    url  VARCHAR               NOT NULL
);