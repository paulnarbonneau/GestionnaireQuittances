create user if not exists quittance password quittance2019;
create table personne (id serial, titre varchar(50) ,nom varchar(255) , prenom varchar(255) , adresse varchar(255), adresse2 VARCHAR(255), code_postal numeric(5) , ville varchar(255),email varchar(255), constraint pk_locataire primary key (id)) ;
create table appartement (id serial, id_locataire integer references personne(id), id_proprietaire integer references personne(id), adresse VARCHAR(255), adresse2 VARCHAR(255), code_postal numeric(5) , ville VARCHAR(255), loyer numeric(10,2), charges numeric(10,2),constraint pk_appartement primary key (id)) ;
create table quittance (id serial,id_appartement integer, id_locataire integer, mois integer, date_quittance date, constraint pk_quittance primary key (id));


insert into locataire values(1, 'Monsieur' , 'Narbonneau' , 'Paul' , '17 allée de l''ile marante' , 'appartement 225' , '92700', 'Colombes', 'pnarbonn@gmail.com');
insert into locataire values(1, 'Monsieur et Madame' , 'De Jesus' , 'Paul' , '98 rue Saint Martin' , 'appartement 1' , '28100', 'Dreux', 'pnarbonn@gmail.com');
