
INSERT INTO premio(id_premio,dinero) VALUES (1,10000);
INSERT INTO premio(id_premio,dinero) VALUES (2,50000);
INSERT INTO premio(id_premio, dinero) VALUES (3,400000);
INSERT INTO premio(id_premio, dinero) VALUES (4,600000);
INSERT INTO premio(id_premio, dinero) VALUES (5,8000000);

INSERT INTO ronda(id_ronda,nivel, id_premio) VALUES (1,1,1);
INSERT INTO ronda(id_ronda,nivel, id_premio) VALUES (2,2,2);
INSERT INTO ronda(id_ronda,nivel, id_premio) VALUES (3,3,3);
INSERT INTO ronda(id_ronda,nivel, id_premio) VALUES (4,4,4);
INSERT INTO ronda(id_ronda,nivel, id_premio) VALUES (5,5,5);

INSERT INTO categoria(id_categoria,nombre,id_ronda) VALUES (1,'Muy Fácil',1);
INSERT INTO categoria(id_categoria,nombre,id_ronda) VALUES (2,'Fácil',2);
INSERT INTO categoria(id_categoria,nombre,id_ronda) VALUES (3,'Medio',3);
INSERT INTO categoria(id_categoria,nombre,id_ronda) VALUES (4,'Difícil',4);
INSERT INTO categoria(id_categoria,nombre,id_ronda) VALUES (5,'Muy Difícil',5);


insert into jugador(id_jugador, nombre) values (1,'Claudia')
insert into historial_juego(id_historial_juego, acumulado, id_categoria, id_jugador) values (1,3000,1,1)

insert into pregunta(id_pregunta, contenido, id_categoria) values (1,'¿Cuál es el río más largo del mundo?',1)
insert into pregunta(id_pregunta, contenido, id_categoria) values (2,'¿Cuál es el país con más habitantes del mundo?',1)
insert into pregunta(id_pregunta, contenido, id_categoria) values (3,'¿Qué día es la fiesta nacional de los Estados Unidos?',1)
insert into pregunta(id_pregunta, contenido, id_categoria) values (4,'¿Cuál es el enemigo más famoso de Batman?',1)
insert into pregunta(id_pregunta, contenido, id_categoria) values (5,'¿Cuál es el océano más grande del mundo?',1)

insert into pregunta(id_pregunta, contenido, id_categoria) values (6,'¿Cuál es el país con menos habitantes del mundo?',2)
insert into pregunta(id_pregunta, contenido, id_categoria) values (7,'¿Cuántos lados tiene un heptágono?',2)
insert into pregunta(id_pregunta, contenido, id_categoria) values (8,'¿Cuál es el planeta más grande del Sistema Solar?',2)
insert into pregunta(id_pregunta, contenido, id_categoria) values (9,'¿Cuál es el deporte más practicado del mundo?',2)
insert into pregunta(id_pregunta, contenido, id_categoria) values (10,'¿Qué religión tiene la Torá como su libro sagrado?',2)

insert into pregunta(id_pregunta, contenido, id_categoria) values (11,'¿Quién fue el último faraón de Egipto?',3)
insert into pregunta(id_pregunta, contenido, id_categoria) values (12,'¿Cuántos huesos tiene el cuerpo humano?',3)
insert into pregunta(id_pregunta, contenido, id_categoria) values (13,'¿Cuántas estrellas hay en la bandera estadounidense?',3)
insert into pregunta(id_pregunta, contenido, id_categoria) values (14,'¿Quién ganó el mundial de fútbol de 2010?',3)
insert into pregunta(id_pregunta, contenido, id_categoria) values (15,'¿Cuál fue la primera película de Disney? ',3)

insert into pregunta(id_pregunta, contenido, id_categoria) values (16,'¿Cuál es el planeta más alejado del Sol?',4)
insert into pregunta(id_pregunta, contenido, id_categoria) values (17,'¿Qué gas liberan las plantas al hacer la fotosíntesis?',4)
insert into pregunta(id_pregunta, contenido, id_categoria) values (18,'¿Cuál es la montaña más alta del mundo?',4)
insert into pregunta(id_pregunta, contenido, id_categoria) values (19,'¿En qué país nació Adolf Hitler?',4)
insert into pregunta(id_pregunta, contenido, id_categoria) values (20,'¿Cuál es el primer elemento de la tabla periódica?',4)

insert into pregunta(id_pregunta, contenido, id_categoria) values (21,'¿Cuánto duró “La Guerra de los Cien Años”? ',5)
insert into pregunta(id_pregunta, contenido, id_categoria) values (22,'¿Qué medicamento mata a los virus?',5)
insert into pregunta(id_pregunta, contenido, id_categoria) values (23,'De acuerdo a la Biblia, ¿cuántos años vivió Matusalén?',5)
insert into pregunta(id_pregunta, contenido, id_categoria) values (24,'¿Cuál era el nombre de pila de Che Guevara?',5)
insert into pregunta(id_pregunta, contenido, id_categoria) values (25,'¿De qué grupo formaba parte Paul McCartney? ',5)


insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(1,'Amazonas',true,1)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(2,'Río magdalena',false,1)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(3,'Río putumayo',false,1)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(4,'Río guaviare',false,1)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(5,'China',true,2)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(6,'Estados Unidos',false,2)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(7,'Indonesia',false,2)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(8,'Japón',false,2)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(9,'4 de Julio',true,3)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(10,'20 de Julio',false,3)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(11,'10 de Septiembre',false,3)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(12,'16 de Octubre',false,3)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(13,'El joker',true,4)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(14,'El Pingüino',false,4)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(15,'Dos caras',false,4)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(16,'Gatubela',false,4)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(17,'Pacífico',true,5)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(18,'Índico',false,5)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(19,'Atlántico',false,5)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(20,'Ártico',false,5)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(21,'La ciudad del vaticano ',true,6)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(22,'Colombia ',false,6)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(23,'Irán ',false,6)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(24,'Alemania',false,6)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(25,'Siete lados ',true,7)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(26,'Seis lados ',false,7)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(27,'ocho lados ',false,7)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(28,'Ninguna de las respuestas es correcta',false,7)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(29,'Júpiter ',true,8)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(30,'Marte ',false,8)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(31,'Venus ',false,8)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(32,'Tierra',false,8)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(33,'La natación ',true,9)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(34,'El fútbol ',false,9)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(35,'El baloncesto',false,9)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(36,'El rugby',false,9)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(37,'El judaísmo ',true,10)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(38,'El cristianismo ',false,10)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(39,'El catolicismo',false,10)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(40,'El budismo',false,10)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(41,'Ramses lll ',true,11)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(42,'Tutankamon',false,11)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(43,'Ramses ll',false,11)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(44,'Tutmosis',false,11)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(45,'206 huesos ',true,12)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(46,'203',false,12)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(47,'200',false,12)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(48,'207',false,12)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(49,'50',true,13)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(50,'49',false,13)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(51,'30',false,13)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(52,'No tiene estrellas',false,13)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(53,'España ',true,14)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(54,'Brasil ',false,14)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(55,'Portugal ',false,14)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(56,'Alemania',false,14)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(57,'Blanca nieves y los siete enanitos ',true,15)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(58,'Los tres mosqueteros ',false,15)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(59,'La bella y la bestia ',false,15)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(60,'La espada en la piedra',false,15)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(61,'Neptuno ',true,16)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(62,'Plutón ',false,16)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(63,'Saturno ',false,16)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(64,'Urano',false,16)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(65,'Oxigeno ',true,17)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(66,'Helio ',false,17)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(67,'Neón ',false,17)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(68,'Potasio',false,17)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(69,'Everest ',true,18)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(70,'Makalu',false,18)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(71,'Kanchenjunga ',false,18)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(72,'Nuptse',false,18)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(73,'En Austria   ',true,19)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(74,'Polonia   ',false,19)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(75,'Alemania   ',false,19)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(76,'Rusia',false,19)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(77,'Hidrogeno  ',true,20)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(78,'Oxigeno ',false,20)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(79,'Helio ',false,20)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(80,'Hierro',false,20)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(81,'116 años ',true,21)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(82,'100 años ',false,21)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(83,'99 años ',false,21)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(84,'105 años',false,21)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(85,'Ninguno ',true,22)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(86,'Antibióticos ',false,22)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(87,'Analgésicos ',false,22)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(88,'Antipiréticos',false,22)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(89,'969 años ',true,23)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(90,'905 años ',false,23)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(91,'100 años ',false,23)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(92,'99 años ',false,23)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(93,'Ernesto ',true,24)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(94,'Vicente ',false,24)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(95,'José ',false,24)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(96,'Andres',false,24)

insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(97,'The Beatles ',true,25)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(98,'The Rolling stones ',false,25)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(99,'Nirvana ',false,25)
insert into opcion(id_opcion, contenido, correcta, id_pregunta) values(100,'Pink Floyd',false,25)