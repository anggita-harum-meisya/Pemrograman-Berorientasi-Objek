CREATE DATABASE pbo;

USE pbo;

CREATE TABLE mhs (
    nim VARCHAR(20) PRIMARY KEY,
    nama VARCHAR(100),
    nilai_uts DOUBLE,
    nilai_uas DOUBLE,
    nilai_tugas DOUBLE,
    nilai_akhir DOUBLE,
    nilai_huruf VARCHAR(5),
    predikat VARCHAR(30)
);