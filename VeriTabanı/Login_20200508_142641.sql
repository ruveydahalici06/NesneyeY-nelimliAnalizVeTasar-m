--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: Uye; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Uye" (
    "IdKullanici" integer NOT NULL,
    "kullaniciAdi" character varying NOT NULL,
    sifre character varying(10) NOT NULL,
    yetki boolean DEFAULT false NOT NULL
);


ALTER TABLE public."Uye" OWNER TO postgres;

--
-- Data for Name: Uye; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Uye" VALUES (1, 'rhalici', '123456', true);
INSERT INTO public."Uye" VALUES (2, 'cgncvk', '111111', false);
INSERT INTO public."Uye" VALUES (3, 'ogrSakarya', 'abcdefg', true);
INSERT INTO public."Uye" VALUES (4, 'ogrankara', '060606', false);


--
-- Name: Uye Uye_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Uye"
    ADD CONSTRAINT "Uye_pkey" PRIMARY KEY ("IdKullanici");


--
-- PostgreSQL database dump complete
--

