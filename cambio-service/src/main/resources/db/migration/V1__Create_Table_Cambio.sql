﻿CREATE TABLE cambio(
                         id serial PRIMARY KEY ,
                         from_currency CHAR(3) NOT NULL,
                         to_currency CHAR(3) NOT NULL,
                         conversion_factor decimal(10,2) NOT NULL
 );
