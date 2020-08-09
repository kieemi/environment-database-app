SET search_path TO habitats_and_species;

CREATE TABLE sdln2k
(
  id_sdln2k serial  NOT NULL,
  kod       char(4) NOT NULL,
  nazwa     varchar,
  PRIMARY KEY (id_sdln2k)
);

COMMENT ON TABLE sdln2k IS 'tabela słownikowa siedlisk';

CREATE TABLE siedn2k_aft
(
  id_siedn2k_aft serial   NOT NULL,
  guid_          char(38) NOT NULL UNIQUE,
  kodobsz        char(9) ,
  datobs         date     NOT NULL,
  dokprz         real     NOT NULL,
  zrddan         varchar  NOT NULL,
  uwg            varchar  NOT NULL,
  stnpoprec      char(2) ,
  stnpopref      char(2) ,
  stnsierec      char(2) ,
  stnsieref      char(2) ,
  perochrec      char(2) ,
  perochref      char(2) ,
  oceogrec       char(2) ,
  oceogref       char(2) ,
  id_sdln2k      integer ,
  PRIMARY KEY (id_siedn2k_aft)
);

COMMENT ON TABLE siedn2k_aft IS 'siedliska przyrodnicze kartowane jako poligon';

COMMENT ON COLUMN siedn2k_aft.guid_ IS 'globalnie unikalny identyfikator danego siedliska';

COMMENT ON COLUMN siedn2k_aft.kodobsz IS 'kod obszaru Natura 2000';

COMMENT ON COLUMN siedn2k_aft.datobs IS 'Data obserwacji';

COMMENT ON COLUMN siedn2k_aft.dokprz IS 'szacowana dokładność  kartowania wyrażona w metrach';

COMMENT ON COLUMN siedn2k_aft.zrddan IS 'opis źródła danych (w przypadku danych opracowywanych na potrzeby pzo, wpisać tylko "pzo")';

COMMENT ON COLUMN siedn2k_aft.uwg IS 'uwagi';

COMMENT ON COLUMN siedn2k_aft.stnpoprec IS 'Rzeczywista ocena parametru powierzchnia siedliska na stanowisku  wg skali FV, U1, U2, XX  (pkt. 3.1. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2k_aft.stnpopref IS 'Referencyjna ocena parametru powierzchnia siedliska na stanowisku wg skali FV, U1, U2, XX  (pkt. 3.2.szabl. dok. pzo)';

COMMENT ON COLUMN siedn2k_aft.stnsierec IS 'Rzeczywista ocena parametru struktury i funkcji na stanowisku wg skali FV, U1, U2, XX  (pkt. 3.1. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2k_aft.stnsieref IS 'Referencyjna ocena parametru struktury i funkcji na stanowisku wg skali FV, U1, U2, XX  (pkt. 3.2. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2k_aft.perochrec IS 'Rzeczywista ocena parametru perspektywy  ochrony na stanowisku wg skali FV, U1, U2, XX (pkt. 3.1. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2k_aft.perochref IS 'Referencyjna ocena parametru perspektywy ochrony na stanowisku wg skali FV, U1, U2, XX  (pkt. 3.2. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2k_aft.oceogrec IS 'Rzewywista ocena  stanu ochrony stanowiska wg skali FV, U1, U2, XX (pkt. 3.1. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2k_aft.oceogref IS 'Referencyjna ocena stanu ochrony siedliska wg skali FV, U1, U2, XX (pkt. 3.2. szabl. dok. pzo)';

CREATE TABLE siedn2kdziaochr
(
  id_siedn2kdziaochr serial   NOT NULL,
  guid_              char(38),
  dziaochr           varchar ,
  podmiot            varchar ,
  termin             varchar ,
  id_siedn2k_aft     integer ,
  PRIMARY KEY (id_siedn2kdziaochr)
);

COMMENT ON TABLE siedn2kdziaochr IS 'działania ochronne';

COMMENT ON COLUMN siedn2kdziaochr.guid_ IS 'globalnie unikalny identyfikator danego siedliska';

COMMENT ON COLUMN siedn2kdziaochr.dziaochr IS 'opis działania ochronnego';

COMMENT ON COLUMN siedn2kdziaochr.podmiot IS 'podmiot odpowiedzialny za realizację działania';

COMMENT ON COLUMN siedn2kdziaochr.termin IS 'termin/częstotliwoścć wykonywania działań';

CREATE TABLE siedn2kwsk
(
  id_siedn2kwsk  serial   NOT NULL,
  guid_          char(38),
  wsknazw        varchar ,
  wskocepop      char(2) ,
  wskoceobe      char(2) ,
  wskoceref      char(2) ,
  id_siedn2k_aft integer ,
  PRIMARY KEY (id_siedn2kwsk)
);

COMMENT ON TABLE siedn2kwsk IS 'wskaźniki';

COMMENT ON COLUMN siedn2kwsk.guid_ IS 'globalnie unikalny identyfikator danego siedliska';

COMMENT ON COLUMN siedn2kwsk.wsknazw IS 'pełna nazwa wskaźnika (pkt. 3.2. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2kwsk.wskocepop IS 'Poprzednia ocena wsk. na podst. dostepnych danych wg skali FV, U1, U2, XX (pkt. 3.1. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2kwsk.wskoceobe IS 'Obecna ocena wskaźnika na stanowisku  wg skali FV, U1, U2, XX (pkt. 3.1. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2kwsk.wskoceref IS 'Referencyjna ocena wskaznika  wg skali FV, U1, U2, XX (pkt. 3.2. szabl. dok. pzo)';

CREATE TABLE siedn2kzagr_ist
(
  id_siedn2kzagr_ist serial   NOT NULL,
  guid_              char(38),
  zagist             char(10),
  zagistops          varchar ,
  id_siedn2k_aft     integer ,
  PRIMARY KEY (id_siedn2kzagr_ist)
);

COMMENT ON TABLE siedn2kzagr_ist IS 'zagrożenia istniejące';

COMMENT ON COLUMN siedn2kzagr_ist.guid_ IS 'globalnie unikalny identyfikator danego siedliska';

COMMENT ON COLUMN siedn2kzagr_ist.zagist IS 'wpisywać kod wynikający z zał. nr 5 do instr. wypełn. SDF  (pkt. 4. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2kzagr_ist.zagistops IS 'pełny opis istniejącego zagrożenia, zgodnie z treścią w dokumentacji  (pkt. 4. szabl. dok. pzo)';

CREATE TABLE siedn2kzagr_pot
(
  id_siedn2kzagr_pot serial   NOT NULL,
  guid_              char(38),
  zagpot             char(10),
  zagpotops          varchar ,
  id_siedn2k_aft     integer ,
  PRIMARY KEY (id_siedn2kzagr_pot)
);

COMMENT ON TABLE siedn2kzagr_pot IS 'zagrożenia potencjalne';

COMMENT ON COLUMN siedn2kzagr_pot.guid_ IS 'globalnie unikalny identyfikator danego siedliska';

COMMENT ON COLUMN siedn2kzagr_pot.zagpot IS 'wpisać kod wynikający z zał. nr 5 do instr. wypełn. SDF (pkt. 4. szabl. dok. pzo)';

COMMENT ON COLUMN siedn2kzagr_pot.zagpotops IS 'opis potencjalnego zagrożenia (pkt. 4. szabl. dok. pzo)';

ALTER TABLE siedn2k_aft
  ADD CONSTRAINT FK_sdln2k_TO_siedn2k_aft
    FOREIGN KEY (id_sdln2k)
    REFERENCES sdln2k (id_sdln2k);

ALTER TABLE siedn2kwsk
  ADD CONSTRAINT FK_siedn2k_aft_TO_siedn2kwsk
    FOREIGN KEY (id_siedn2k_aft)
    REFERENCES siedn2k_aft (id_siedn2k_aft);

ALTER TABLE siedn2kzagr_pot
  ADD CONSTRAINT FK_siedn2k_aft_TO_siedn2kzagr_pot
    FOREIGN KEY (id_siedn2k_aft)
    REFERENCES siedn2k_aft (id_siedn2k_aft);

ALTER TABLE siedn2kzagr_ist
  ADD CONSTRAINT FK_siedn2k_aft_TO_siedn2kzagr_ist
    FOREIGN KEY (id_siedn2k_aft)
    REFERENCES siedn2k_aft (id_siedn2k_aft);

ALTER TABLE siedn2kdziaochr
  ADD CONSTRAINT FK_siedn2k_aft_TO_siedn2kdziaochr
    FOREIGN KEY (id_siedn2k_aft)
    REFERENCES siedn2k_aft (id_siedn2k_aft);


      
