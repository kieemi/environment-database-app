INSERT INTO habitats_and_species.sdln2k (kod,nazwa) VALUES 
('6150','Wysokogórskie łąki acidofilne (Juncion trifidi)')
,('6440','Łąki selemicowe (Cnidion dubii)')
,('9160','Grąd subatlantycki (Stellario-Carpinetum');

INSERT INTO habitats_and_species.siedn2k_aft (guid_,kodobsz,datobs,dokprz,zrddan,uwg,stnpoprec,stnpopref,stnsierec,stnsieref,perochrec,perochref,oceogrec,oceogref,id_sdln2k) VALUES 
('{864B17D5-5BCA-4407-A407-A44B4046DDBF}','PLH020002','2020-05-25',2.5,'plan zadan ochronnych','brak','FV','FV','FV','FV','FV','FV','FV','FV',1)
,('{31FC3DEC-6525-40C5-A730-645FFEDD207F}','PLH020050','2020-06-06',3.0,'uzupelnienie stanu wiedzy','brak','FV','XX','XX','FV','FV','FV','XX','FV',1)
,('{5084F503-6201-4140-B050-B9266B873CCB}','PLH020072','2020-03-12',1.0,'obserwacja pracownia tut. Dyrekcji','ponowic nwentaryzacje w grudniu','FV','XX','XX','XX','FV','U1','U2','U1',2);

INSERT INTO habitats_and_species.siedn2kdziaochr (guid_,dziaochr,podmiot,termin,id_siedn2k_aft) VALUES 
('{864B17D5-5BCA-4407-A407-A44B4046DDBF}','Monitoring realizacji działań ochronnych w 6 roku obowiązywania PZO','Zarząd Melioracji','raz do roku',1)
,('{864B17D5-5BCA-4407-A407-A44B4046DDBF}','W trakcie cięć (także rębni stopniowych i złożonych), pozostawić 5-10% powierzchni drzewostanów','Nadlesnictwo Bystrzyca Klodzka','raz do roku w pierwszym kwartale',1);

INSERT INTO habitats_and_species.siedn2kwsk (guid_,wsknazw,wskocepop,wskoceobe,wskoceref,id_siedn2k_aft) VALUES 
('{864B17D5-5BCA-4407-A407-A44B4046DDBF}','Fragmentacja siedliska','XX','U1','FV',1)
,('{864B17D5-5BCA-4407-A407-A44B4046DDBF}','Obce gatunki inwazyjne','FV','U2','FV',1);

INSERT INTO habitats_and_species.siedn2kzagr_ist (guid_,zagist,zagistops,id_siedn2k_aft) VALUES 
('{864B17D5-5BCA-4407-A407-A44B4046DDBF}','I01       ','Gatunki obce siedliskowo, tj. świerk, sosna, modrzew',1)
,('{864B17D5-5BCA-4407-A407-A44B4046DDBF}','A04.05    ','Zbyt mała ilość stojących lub leżących martwych lub obumierających drzew',1);

INSERT INTO habitats_and_species.siedn2kzagr_pot (guid_,zagpot,zagpotops,id_siedn2k_aft) VALUES 
('{864B17D5-5BCA-4407-A407-A44B4046DDBF}','K02       ','Przegęszczenie drzew',1)
,('{864B17D5-5BCA-4407-A407-A44B4046DDBF}','K03       ','Igliwie pochodzące z drzewa uniemożliwia poprawę stanu siedliska',1);