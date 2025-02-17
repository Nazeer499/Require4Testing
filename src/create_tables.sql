-- Tabelle für Anforderungen
CREATE TABLE Anforderung (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titel VARCHAR(255) NOT NULL,
    beschreibung TEXT
);

-- Tabelle für Testfälle
CREATE TABLE Testfall (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titel VARCHAR(255) NOT NULL,
    beschreibung TEXT,
    anforderung_id INT,
    FOREIGN KEY (anforderung_id) REFERENCES Anforderung(id)
);

-- Tabelle für Testläufe
CREATE TABLE Testlauf (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    startdatum DATE,
    enddatum DATE
);
