begin;

-- Database: StrongSoft

-- DROP DATABASE "StrongSoft";

CREATE DATABASE "StrongSoft"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Polish_Poland.1250'
    LC_CTYPE = 'Polish_Poland.1250'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

-- Table: public.pracownik_adres

-- DROP TABLE public.pracownik_adres;

CREATE TABLE public.pracownik_adres
(
    pracownik_adres_id integer NOT NULL,
    ulica text COLLATE pg_catalog."default",
    nr_domu text COLLATE pg_catalog."default",
    nr_mieszkania text COLLATE pg_catalog."default",
    kod_pocztowy text COLLATE pg_catalog."default",
    miasto text COLLATE pg_catalog."default",
    panstwo text COLLATE pg_catalog."default",
    CONSTRAINT pracownik_adres_pkey PRIMARY KEY (pracownik_adres_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.pracownik_adres
    OWNER to postgres;

-- Table: public.pracownik

-- DROP TABLE public.pracownik;

CREATE TABLE public.pracownik
(
    pracownik_id integer NOT NULL,
    imie text COLLATE pg_catalog."default" NOT NULL,
    nazwisko text COLLATE pg_catalog."default" NOT NULL,
    email text COLLATE pg_catalog."default",
    pracownik_adres integer NOT NULL,
    CONSTRAINT pracownik_pkey PRIMARY KEY (pracownik_id),
    CONSTRAINT fk_pracownik_adres_pracownik_adres_id FOREIGN KEY (pracownik_adres)
        REFERENCES public.pracownik_adres (pracownik_adres_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.pracownik
    OWNER to postgres;

end;