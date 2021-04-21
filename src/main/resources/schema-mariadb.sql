use videojuegos;

create table if not exists  videojuego(
	
	id int not null primary key AUTO_INCREMENT,
	nombre varchar(300) not null,
	descripcion varchar(500) not null,
	url_imagen varchar(500) not null 
);


insert into videojuegos (nombre, descripcion, url-imagen) values
("Borderlands","¡Vuelve el padre de los shooter-looter, con tropecientas mil armas y una aventura caótica!","img/Borderlands3.jpg"),
("Control","Tras la invasión de una agencia secreta de Nueva York por parte de una amenaza de otro mundo, te conviertes en la nueva directora que deberá luchar para recuperar Control.","https://media.playstation.com/is/image/SCEA/control-poster-01-ps4-us-11sep19?$native_nt$"),
("Subnautica","Un juego de aventuras submarinas ambientado en un mundo oceánico alienígena. ¡Te espera un mundo abierto enorme lleno de maravillas y peligros!","https://store.playstation.com/store/api/chihiro/00_09_000/container/ES/es/999/EP5426-CUSA13893_00-2222444466669999/1568624921000/image?w=240&h=240&bg_color=000000&opacity=100&_version=00_09_000");

create table if not exists distribuidor(
	id int primary key auto_increment not null,
	nombre varchar(350) not null,
	web varchar(350) not null
);

insert into distribuidor
(id,    nombre,                         web) values
(1,     '2K',                           'https://2k.com'),
(2,     'Focus Home Interactive',       'https://www.focus-home.com'),
(3,     'Thekla',                       null),
(4,     'Number One',                   null),
(5,     '505 Games',                    'https://505games.com'),
(6,     'Unknown Worlds Entertainment', 'https://unknownworlds.com'),
(7,     'Campo Santo',                  'https://www.camposanto.com');

alter table videojuego
add column distribuidor_id int,
add foreign key (distribuidor_id) references distribuidor(id);

update videojuego set distribuidor_id = 1 where id in (1, 5);
update videojuego set distribuidor_id = 2 where id in (2);
update videojuego set distribuidor_id = 3 where id in (3);
update videojuego set distribuidor_id = 4 where id in (4);
update videojuego set distribuidor_id = 5 where id in (6);
update videojuego set distribuidor_id = 6 where id in (7);
update videojuego set distribuidor_id = 7 where id in (8);

alter table videojuego
modify distribuidor_id int not null;