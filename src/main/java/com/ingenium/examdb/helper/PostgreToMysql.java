package com.ingenium.examdb.helper;

public class PostgreToMysql {
    public static void main(String[] args) {

        String sql_schoolclass = StringCutter("INSERT INTO public.classname (class_id, classname) VALUES (1, '1DHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (2, '4AHME');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (3, '1BHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (4, '2AHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (5, '2AHME');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (6, '2BHMBA');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (7, '2CHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (8, '1BHMBA');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (9, '2BHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (10, '2AHMBA');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (11, '1AHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (12, '3AHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (13, '3DHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (14, '1CHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (15, '3AHME');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (16, '3BHMBA');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (17, '1AHMBA');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (18, '3BHIF');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (19, '3AHMBA');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (20, '1AHME');\n" +
                "INSERT INTO public.classname (class_id, classname) VALUES (21, '3CHIF');");

        String sql_subject = StringCutter("INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (1, 'Deutsch', 'D', true);\n" +
                "INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (2, 'Angewandte Mathematik', 'AM', true);\n" +
                "INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (4, 'Programmieren und Software Engineering', 'POS1', false);\n" +
                "INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (3, 'Betriebswirtschaft und Management', 'BWM', false);\n" +
                "INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (6, 'Naturwissenschaften', 'NW2', false);\n" +
                "INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (5, 'Technische Informatik', 'TINF', false);\n" +
                "INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (8, 'Netzwerksysteme und Verteilte Systeme', 'NVS1', false);\n" +
                "INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (7, 'Datenbanken und Informationssysteme', 'DBI1', false);\n" +
                "INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (10, 'Geographie, Geschichte und Politische Bildung', 'GGP', true);\n" +
                "INSERT INTO public.subject (subject_id, longname, shortname, written) VALUES (9, 'Lebende Fremdsprache (Englisch)', 'E', true);");

        String sql_students = StringCutter("INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (111, 'Peria', 'Brimming', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (112, 'Lidia', 'Sima', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (113, 'Winona', 'Di Gregorio', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (114, 'Reagan', 'Tatlock', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (115, 'Paxon', 'Tuny', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (116, 'Giustino', 'Hughs', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (117, 'Kassi', 'Trustram', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (118, 'Halsey', 'Masic', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (119, 'Richmound', 'Brisker', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (120, 'Pip', 'Winfindine', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (121, 'Herschel', 'Schimoni', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (122, 'Martino', 'Skittle', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (123, 'Steffen', 'Rotherham', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (124, 'Jacquelyn', 'Ropcke', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (125, 'Greggory', 'Gawith', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (126, 'Milo', 'Velde', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (127, 'Christa', 'Beswell', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (128, 'Roanne', 'Cawse', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (129, 'Thor', 'Andersson', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (130, 'Abdel', 'Aldington', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (131, 'Tomasine', 'Pichan', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (132, 'Enriqueta', 'MacTrustie', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (133, 'Torrie', 'Bice', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (134, 'Michell', 'Vaun', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (135, 'Frederic', 'Jeanenet', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (136, 'Arlee', 'Guinan', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (137, 'Janis', 'Anders', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (138, 'Consuelo', 'Tran', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (139, 'Terrijo', 'Kitchenham', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (140, 'Jerrie', 'Greenmon', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (141, 'Joli', 'Round', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (142, 'Lorine', 'McBride', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (143, 'Brooks', 'Gourley', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (144, 'Hanny', 'Beagan', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (145, 'Rollin', 'Dowty', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (146, 'Minne', 'Petkov', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (147, 'Paulette', 'Oylett', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (148, 'Cary', 'McPike', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (149, 'Kelley', 'Beazer', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (150, 'Rose', 'Rase', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (151, 'Molli', 'Meekings', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (152, 'Crissy', 'Reast', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (153, 'Marillin', 'Amiable', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (154, 'Nero', 'Clue', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (155, 'Javier', 'Burgett', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (156, 'Catie', 'Renyard', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (157, 'Charmain', 'Vassar', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (158, 'Cathi', 'Cadell', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (159, 'Markos', 'Burchard', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (160, 'Joelie', 'Ostler', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (161, 'Stoddard', 'Audas', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (162, 'Josy', 'Shadrach', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (163, 'Monica', 'Maskall', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (164, 'Janene', 'Boxer', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (165, 'Mela', 'Mucklestone', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (166, 'Erwin', 'Tonbridge', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (167, 'Olympe', 'Florey', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (168, 'Sheilakathryn', 'Hamlen', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (169, 'Terry', 'Hefner', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (170, 'Antonella', 'Highwood', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (171, 'Mignon', 'Bleakman', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (172, 'Therine', 'Linkie', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (173, 'Ajay', 'Nesby', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (174, 'Wilbert', 'Akester', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (175, 'Konrad', 'Emmett', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (176, 'Shari', 'Tregonna', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (177, 'Marmaduke', 'Baxendale', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (178, 'Nettle', 'Dallimare', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (179, 'Jewell', 'Bunker', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (180, 'Ketty', 'Durgan', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (181, 'Sadella', 'Jochens', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (182, 'Karalynn', 'Rowston', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (183, 'Henrieta', 'Blight', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (184, 'Bobby', 'Skill', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (185, 'Waneta', 'Eaklee', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (186, 'Chastity', 'Peggram', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (187, 'Ricky', 'Mowlam', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (188, 'Keven', 'Brand', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (189, 'Karyl', 'Longshaw', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (190, 'Candy', 'Skillanders', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (191, 'Staford', 'Szwarc', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (192, 'Demetri', 'Gaughan', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (193, 'Dan', 'Tallowin', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (194, 'Connie', 'Chewter', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (195, 'Aubrey', 'Pariso', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (196, 'Rosamond', 'Mewrcik', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (197, 'Nada', 'Bytheway', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (198, 'Kit', 'Jackes', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (199, 'Norry', 'Serginson', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (200, 'Alfons', 'Senussi', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (201, 'Wald', 'Stoeck', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (202, 'Kayley', 'Tailour', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (203, 'Donia', 'Attwooll', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (204, 'Monica', 'Dowyer', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (205, 'Valaree', 'Fettis', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (206, 'Thomasina', 'Smye', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (207, 'Mame', 'Frape', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (208, 'Laird', 'Bolle', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (209, 'Napoleon', 'Sauniere', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (210, 'Cosme', 'Ross', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (211, 'Nannette', 'Boullen', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (212, 'Sherill', 'De Michele', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (213, 'Dacia', 'Bussy', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (214, 'Bryan', 'Diwell', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (215, 'Gerhardt', 'Dewes', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (216, 'Matilda', 'Geldard', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (217, 'Margie', 'Catford', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (218, 'Alexina', 'Ridger', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (219, 'Gustaf', 'Jeffrey', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (220, 'Federico', 'Sieur', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (221, 'Dredi', 'Pobjay', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (222, 'Allegra', 'Archdeckne', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (223, 'Beverlee', 'Cutbirth', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (224, 'Roddy', 'Gledstane', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (225, 'Bertina', 'Rolse', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (226, 'Rupert', 'Trow', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (227, 'Nadiya', 'Enterlein', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (228, 'Felizio', 'Gerrard', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (229, 'Diahann', 'Pegg', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (230, 'Vlad', 'Arnet', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (231, 'Cyndie', 'Merrick', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (232, 'Katha', 'Frend', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (233, 'Normie', 'Fagge', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (234, 'Orazio', 'Haking', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (235, 'Robinet', 'Boncoeur', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (236, 'Guthry', 'Klima', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (237, 'Zacharia', 'Stear', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (238, 'Emlynne', 'Olden', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (239, 'Wally', 'Cerro', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (240, 'Samson', 'Shepheard', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (241, 'Queenie', 'Maith', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (242, 'Dorotea', 'Inger', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (243, 'Ameline', 'Ramage', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (244, 'Banky', 'Custance', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (245, 'Teirtza', 'Bass', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (246, 'Matilde', 'Griston', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (247, 'Prudi', 'Coopey', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (248, 'Aeriel', 'Pedrielli', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (249, 'Tripp', 'Gilchriest', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (250, 'Ewell', 'Burren', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (251, 'Tansy', 'Doniso', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (252, 'Lazare', 'Cowope', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (253, 'Guthrie', 'Hilling', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (254, 'Timotheus', 'Whitebread', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (255, 'Raul', 'Linthead', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (256, 'Peggi', 'Arendsen', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (257, 'Huntlee', 'Olenikov', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (258, 'Alon', 'Corkel', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (259, 'Quillan', 'Greatland', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (260, 'Christabella', 'Halt', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (261, 'Evyn', 'Peplow', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (262, 'Lizzie', 'Binnes', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (263, 'Crawford', 'De La Haye', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (264, 'Dasha', 'Remer', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (265, 'Murvyn', 'Varley', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (266, 'Maurice', 'Rickets', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (267, 'Raven', 'Handes', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (268, 'Freemon', 'Rozanski', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (269, 'Cassie', 'Bodicum', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (270, 'Aldus', 'Whyke', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (271, 'Ferdy', 'Spykings', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (272, 'Lothario', 'Tubby', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (273, 'Udell', 'Connors', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (274, 'Nikolaos', 'Leyshon', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (275, 'Sancho', 'Rucklesse', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (276, 'Kathryn', 'Maskell', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (277, 'Leann', 'Brownstein', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (278, 'Marcos', 'Cuffin', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (279, 'Carree', 'Danielut', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (280, 'Marcello', 'Pettiford', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (281, 'Kelci', 'Goldston', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (282, 'North', 'Bulmer', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (283, 'Amalee', 'Sherwyn', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (284, 'Kippar', 'Barkes', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (285, 'Zach', 'Thornebarrow', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (286, 'Rufe', 'Orwell', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (287, 'Craig', 'Klousner', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (288, 'Arnuad', 'Cowburn', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (289, 'Alix', 'Grebbin', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (290, 'Renaud', 'Catterick', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (291, 'Luella', 'Moorfield', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (292, 'Emmerich', 'Zanettini', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (293, 'Rustin', 'Ketton', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (294, 'Casie', 'Swendell', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (295, 'Nils', 'Marini', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (296, 'Jackson', 'Harsant', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (297, 'Dolli', 'Jakovijevic', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (298, 'Janet', 'Dumbellow', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (299, 'Danya', 'Lowrey', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (300, 'Domenic', 'Osband', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (301, 'Agnes', 'Cruttenden', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (302, 'Leonhard', 'Farlham', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (303, 'Nickola', 'Bowker', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (304, 'Appolonia', 'Wassung', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (305, 'Agnola', 'Speare', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (306, 'Karel', 'Pyrke', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (307, 'Itch', 'Hearon', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (308, 'Fons', 'Sansom', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (309, 'Glenn', 'Errigo', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (310, 'Waneta', 'Haig', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (311, 'Marabel', 'Gotmann', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (312, 'Anneliese', 'Benson', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (313, 'Dru', 'Forker', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (314, 'Ally', 'Ferne', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (315, 'Arleta', 'Klemensiewicz', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (316, 'Marabel', 'Yeell', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (317, 'Lelia', 'Crouse', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (318, 'Jemmy', 'Baskerfield', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (319, 'Cordy', 'Stonhouse', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (320, 'Brittan', 'Richards', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (321, 'Ashton', 'Krale', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (322, 'Erek', 'Wearn', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (323, 'Maribel', 'Kelly', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (324, 'Rollins', 'Sellars', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (325, 'Alleen', 'Deverill', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (326, 'Cyrill', 'McCracken', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (327, 'Loleta', 'Redwin', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (328, 'Dulcinea', 'Amiable', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (329, 'Merle', 'Garfield', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (330, 'Corena', 'Brognot', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (331, 'Opaline', 'Sture', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (332, 'Berke', 'Lowdiane', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (333, 'Neala', 'Elderkin', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (334, 'Zuzana', 'Maylour', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (335, 'Carlita', 'Thewlis', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (336, 'Barnett', 'Gainsburgh', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (337, 'Ethe', 'Deschlein', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (338, 'Dahlia', 'Painter', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (339, 'Nita', 'Raithmill', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (340, 'Willey', 'Bennitt', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (341, 'Sigismundo', 'Turrell', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (342, 'Raoul', 'Patman', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (343, 'Judah', 'Thecham', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (344, 'Boigie', 'Huonic', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (345, 'Mariska', 'Bauchop', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (346, 'Gun', 'Edel', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (347, 'Carlynne', 'Whartonby', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (348, 'Greggory', 'Dack', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (349, 'Bink', 'Dwyer', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (350, 'Quinn', 'Dobey', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (351, 'Romeo', 'Mathissen', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (352, 'Vannie', 'Jane', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (353, 'Patricio', 'Pagin', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (354, 'Gui', 'Torpie', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (355, 'Appolonia', 'L'' Anglois', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (356, 'Conney', 'Stonestreet', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (357, 'Zara', 'Izkovicz', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (358, 'Farrand', 'Pullen', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (359, 'Yehudi', 'Muggleton', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (360, 'Shandee', 'Caslake', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (361, 'Timoteo', 'Knappitt', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (362, 'Erwin', 'Cassey', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (363, 'Quincy', 'Queen', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (364, 'Callida', 'Rosenblath', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (365, 'Tiffany', 'Butterly', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (366, 'Maureene', 'Bott', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (367, 'Harland', 'Janssens', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (368, 'Matelda', 'Casaletto', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (369, 'Jelene', 'Saura', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (370, 'Ferris', 'Prudence', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (371, 'Saraann', 'Jantel', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (372, 'Janela', 'Tidbold', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (373, 'Willy', 'Exell', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (374, 'Kissiah', 'Ivanchenkov', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (375, 'Tamarra', 'Quilleash', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (376, 'Ellen', 'Van Leijs', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (377, 'Bay', 'McKimm', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (378, 'Hedwig', 'Knifton', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (379, 'Stillmann', 'Gozard', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (380, 'Carilyn', 'Dawtry', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (381, 'Erek', 'Mccaull', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (382, 'Audrie', 'Sedwick', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (383, 'Claudette', 'Tampling', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (384, 'Hillery', 'Dominik', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (385, 'Josy', 'Chichgar', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (386, 'Yetta', 'Birt', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (387, 'Sollie', 'Sharplin', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (388, 'Moshe', 'Todarello', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (389, 'Bancroft', 'Cafe', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (390, 'Mordy', 'Yeomans', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (391, 'Keir', 'McGuinness', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (392, 'Nikos', 'Fruen', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (393, 'Tessa', 'Mendonca', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (394, 'Valeria', 'Furtado', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (395, 'Oneida', 'Hardesty', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (396, 'Eugene', 'Longea', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (397, 'Issiah', 'Amthor', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (398, 'Gaylor', 'Cowsby', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (399, 'Coriss', 'Lambard', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (400, 'Breanne', 'Chastaing', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (401, 'Sorcha', 'Cowsby', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (402, 'Ketty', 'Nisot', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (403, 'Zacharia', 'Krauss', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (404, 'Philippa', 'Braferton', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (405, 'Isobel', 'Chesswas', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (406, 'Jacquelynn', 'Harber', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (407, 'Ursala', 'Towers', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (408, 'Adrea', 'Achromov', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (409, 'Rennie', 'Sinncock', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (410, 'Elvera', 'Stener', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (411, 'Itch', 'Colbert', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (412, 'Abbe', 'Lingwood', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (413, 'Wyatan', 'Churching', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (414, 'Meredithe', 'Folca', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (415, 'Rory', 'Wardhough', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (416, 'Reece', 'Etches', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (417, 'Kris', 'Hurich', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (418, 'Afton', 'Clemas', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (419, 'Susette', 'Anderbrugge', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (420, 'Janela', 'Seiler', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (421, 'Aundrea', 'McGhee', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (422, 'Astra', 'Jeffs', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (423, 'Malina', 'Kemell', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (424, 'Margarete', 'Schott', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (425, 'Nap', 'Tyne', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (426, 'Consuela', 'Pavlitschek', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (427, 'Dallis', 'Bridgewater', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (428, 'Germaine', 'Stoakley', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (429, 'Ward', 'Campanelli', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (430, 'Euell', 'Shillito', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (431, 'Kristen', 'Tinan', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (432, 'Atlanta', 'Farnaby', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (433, 'Hale', 'Fidler', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (434, 'Sandra', 'Philipsohn', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (435, 'Evanne', 'Simoneschi', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (436, 'Tracy', 'Dumbellow', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (437, 'Mattie', 'Orhtmann', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (438, 'Lissa', 'Kinghorn', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (439, 'Berkly', 'Loudwell', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (440, 'Amber', 'Colvie', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (441, 'Edward', 'Clarke', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (442, 'De witt', 'Kroch', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (443, 'Ronny', 'Harden', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (444, 'Nathalie', 'Benedicto', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (445, 'Emilio', 'Fitzackerley', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (446, 'Deane', 'Erett', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (447, 'Shayla', 'Beaven', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (448, 'Wheeler', 'Jacobsson', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (449, 'Fonz', 'Dwight', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (450, 'Blane', 'Streeting', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (451, 'Celine', 'McMurty', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (452, 'Beale', 'Hugland', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (453, 'Valery', 'Van Cassel', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (454, 'Gillian', 'Boullen', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (455, 'Costanza', 'Mallord', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (456, 'Charita', 'Bestwick', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (457, 'Madelyn', 'Scogings', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (458, 'Kikelia', 'Raff', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (459, 'Monro', 'Belly', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (460, 'Grady', 'Spurling', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (461, 'Bren', 'Isaac', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (462, 'Waly', 'Rosenauer', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (463, 'Clarice', 'Fleet', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (464, 'Christie', 'Salomon', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (465, 'Austine', 'Sponer', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (466, 'Walton', 'Meys', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (467, 'Nevins', 'Seviour', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (468, 'Coletta', 'Dubose', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (469, 'Brannon', 'Jodrellec', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (470, 'Alica', 'Held', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (471, 'Lita', 'Preshous', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (472, 'Sella', 'Ganter', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (473, 'Kayley', 'Ralston', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (474, 'Naoma', 'Tudhope', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (475, 'Martica', 'Brumby', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (476, 'Nance', 'Calbert', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (477, 'Nealon', 'Cousins', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (478, 'Claire', 'Swetmore', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (479, 'Olivero', 'Ware', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (480, 'Adena', 'Hunton', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (481, 'Lishe', 'Sighart', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (482, 'Fawn', 'Lavalle', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (483, 'Layne', 'Dron', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (484, 'Lilllie', 'Wernham', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (485, 'Emory', 'Haith', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (486, 'Riley', 'Tyres', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (487, 'Catha', 'Kear', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (488, 'Wilmer', 'Farrell', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (489, 'Sydney', 'Bradtke', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (490, 'Chickie', 'Leward', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (491, 'Tamera', 'Paffley', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (492, 'Lothario', 'Power', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (493, 'Vinny', 'Jeanes', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (494, 'Drona', 'Tether', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (495, 'Hilario', 'Parman', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (496, 'Constantin', 'Wakeley', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (497, 'Joelynn', 'Clutton', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (498, 'Yorke', 'Deddum', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (499, 'Lovell', 'Pegler', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (500, 'Anette', 'Ciccarello', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (501, 'Yuri', 'Dorton', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (502, 'Mercedes', 'Zellick', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (503, 'Annaliese', 'Shephard', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (504, 'Waverley', 'Tine', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (505, 'Bourke', 'MacGebenay', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (506, 'Ferrell', 'Cordall', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (507, 'Raf', 'Le Blond', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (508, 'Bryna', 'Hickisson', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (509, 'Antoinette', 'Garnsworth', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (510, 'Stavros', 'Dillestone', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (511, 'Giorgio', 'Alven', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (512, 'Latrena', 'Cowely', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (513, 'Constancia', 'McGawn', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (514, 'Alexa', 'Arblaster', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (515, 'Doe', 'Kesten', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (516, 'Mathian', 'Mottram', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (517, 'Caren', 'Kingh', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (518, 'Randolf', 'Plevin', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (519, 'Ambros', 'Caves', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (520, 'Theo', 'Engley', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (521, 'Carie', 'Pinel', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (522, 'Patrice', 'Kelinge', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (523, 'Nollie', 'Minthorpe', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (524, 'Pierson', 'Mountain', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (525, 'Flossie', 'Pedley', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (526, 'Ardra', 'Tankin', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (527, 'Pembroke', 'Giggs', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (528, 'Osbourne', 'Matyushonok', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (529, 'Lanie', 'Rossi', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (530, 'Roselle', 'Doppler', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (531, 'Herman', 'Secret', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (532, 'Nikita', 'Ramsted', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (533, 'Nevsa', 'Janson', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (534, 'Peggie', 'Tash', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (535, 'Jeanine', 'Pietzner', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (536, 'Zuzana', 'Durkin', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (537, 'Gregorius', 'Phelipeaux', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (538, 'Aguistin', 'Kornyshev', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (539, 'Helenelizabeth', 'Durnell', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (540, 'Joelynn', 'Brimilcome', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (541, 'Athena', 'Glisane', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (542, 'Goldie', 'Franzke', 7);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (543, 'Melita', 'Kiljan', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (544, 'Chucho', 'Lightowlers', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (545, 'Gregory', 'Leslie', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (546, 'Sully', 'Wilkinson', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (547, 'Bertram', 'Honeyghan', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (548, 'Eadmund', 'Cassam', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (549, 'West', 'Barnhill', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (550, 'Hamid', 'Skelington', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (551, 'Mohandis', 'Di Boldi', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (552, 'Nikolos', 'Thomlinson', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (553, 'Corby', 'Raffin', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (554, 'Penny', 'Hallows', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (555, 'Cora', 'McClymond', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (556, 'Brina', 'Seer', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (557, 'Lisa', 'Rolph', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (558, 'Jarrad', 'Ciobutaro', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (559, 'Hubey', 'Coronado', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (560, 'Yetta', 'Housley', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (561, 'Ira', 'Livesay', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (562, 'Anett', 'Avon', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (563, 'Ardelle', 'Strippel', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (564, 'Glenda', 'Spellessy', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (565, 'Randolf', 'Skellington', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (566, 'Denise', 'Syncke', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (567, 'Cash', 'Mingame', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (568, 'Benedicta', 'MacLardie', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (569, 'Chico', 'Dripps', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (570, 'Henrik', 'Gorwood', 17);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (571, 'Dru', 'Mill', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (572, 'Sauveur', 'Wyche', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (573, 'Renae', 'Ellaway', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (574, 'Bee', 'Snowman', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (575, 'Jenna', 'Brabban', 10);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (576, 'Marcos', 'Maudsley', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (577, 'Bailie', 'Bodsworth', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (578, 'Therine', 'Aidler', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (579, 'Findley', 'Vinecombe', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (580, 'Carlen', 'Steedman', 13);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (581, 'Inge', 'Larway', 21);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (582, 'Delinda', 'Bromfield', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (583, 'Kelci', 'Jaffra', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (584, 'Jeri', 'Bridgstock', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (585, 'Cecile', 'Adnam', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (586, 'Raynor', 'Ludl', 6);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (587, 'Nanice', 'Wales', 20);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (588, 'Matthiew', 'Pickersgill', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (589, 'Rhett', 'Rozycki', 15);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (590, 'Finley', 'Parfrey', 1);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (591, 'Cynthia', 'Ixor', 4);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (592, 'Darcey', 'Kirkam', 18);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (593, 'Mella', 'Kingett', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (594, 'Dredi', 'Matieu', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (595, 'Enid', 'Forster', 5);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (596, 'Orion', 'Jurek', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (597, 'Kaylee', 'Garmston', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (598, 'Waite', 'Yerlett', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (599, 'Cynthie', 'De Stoop', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (600, 'Bernardo', 'Halfhead', 19);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (601, 'Culver', 'Crasford', 3);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (602, 'Jefferey', 'Lowell', 14);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (603, 'Rufe', 'Bridden', 9);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (604, 'Nevins', 'Charle', 8);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (605, 'Cicely', 'Mineghelli', 16);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (606, 'Avril', 'Quernel', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (607, 'Budd', 'Cullinan', 2);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (608, 'Matthaeus', 'Izard', 12);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (609, 'Ashlee', 'Geddes', 11);\n" +
                "INSERT INTO public.student (student_id, firstname, lastname, classname) VALUES (610, 'Flory', 'Soares', 20);");

        String sql_exams = StringCutter("INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (149, '2018-03-05', 50, 276, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (150, '2017-11-10', 20, 411, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (151, '2017-10-21', 50, 259, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (152, '2017-12-05', 20, 377, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (153, '2017-10-18', 50, 548, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (154, '2017-12-27', 20, 179, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (155, '2017-11-07', 50, 311, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (156, '2018-05-21', 10, 291, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (157, '2018-05-14', 50, 250, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (158, '2018-06-21', 20, 144, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (159, '2018-03-24', 10, 528, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (160, '2018-03-26', 20, 178, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (161, '2017-10-02', 40, 485, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (162, '2018-01-17', 20, 456, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (163, '2017-10-08', 10, 475, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (164, '2018-01-19', 40, 365, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (165, '2017-11-09', 50, 346, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (166, '2017-11-03', 30, 268, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (167, '2018-05-01', 50, 126, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (168, '2018-01-16', 20, 512, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (169, '2017-10-08', 40, 480, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (170, '2017-11-27', 20, 559, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (171, '2017-12-28', 50, 281, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (172, '2018-02-18', 40, 138, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (173, '2017-10-17', 40, 160, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (174, '2018-01-23', 10, 550, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (175, '2017-12-09', 20, 379, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (176, '2018-01-15', 30, 159, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (177, '2018-03-15', 40, 537, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (178, '2017-10-13', 40, 495, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (179, '2017-12-12', 20, 487, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (180, '2018-01-24', 50, 508, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (181, '2018-04-07', 30, 591, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (182, '2018-06-06', 40, 196, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (183, '2018-06-11', 10, 225, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (184, '2018-03-16', 30, 355, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (185, '2017-10-01', 10, 215, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (186, '2018-01-18', 20, 548, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (187, '2018-01-05', 30, 534, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (188, '2018-01-30', 10, 549, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (189, '2018-04-24', 40, 530, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (190, '2018-03-09', 20, 537, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (191, '2017-12-19', 40, 235, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (192, '2018-01-31', 50, 423, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (193, '2017-10-04', 10, 206, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (194, '2018-06-17', 40, 522, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (195, '2018-01-01', 20, 322, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (196, '2017-09-13', 30, 423, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (197, '2017-10-05', 10, 609, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (198, '2018-01-01', 40, 584, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (199, '2017-12-31', 50, 431, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (200, '2018-02-17', 10, 572, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (201, '2018-02-10', 10, 366, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (202, '2017-12-19', 40, 592, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (203, '2018-04-08', 50, 446, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (204, '2018-03-24', 40, 163, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (205, '2017-09-23', 40, 305, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (206, '2017-10-08', 50, 210, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (207, '2018-02-26', 30, 496, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (208, '2017-12-06', 20, 494, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (209, '2017-12-04', 40, 199, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (210, '2018-05-31', 20, 523, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (211, '2018-05-20', 30, 404, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (212, '2018-01-23', 40, 587, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (213, '2017-11-07', 30, 144, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (214, '2017-09-24', 20, 497, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (215, '2018-01-30', 20, 269, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (216, '2018-01-01', 20, 121, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (217, '2018-05-06', 30, 363, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (218, '2018-01-11', 20, 176, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (219, '2018-05-21', 20, 444, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (220, '2017-11-19', 50, 306, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (221, '2017-09-21', 50, 604, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (222, '2018-01-27', 30, 457, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (223, '2018-04-13', 30, 565, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (224, '2018-04-14', 50, 584, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (225, '2018-01-15', 20, 253, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (226, '2018-02-20', 40, 360, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (227, '2017-10-15', 50, 124, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (228, '2018-02-06', 30, 374, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (229, '2017-11-13', 20, 569, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (230, '2018-03-24', 20, 584, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (231, '2018-05-28', 20, 210, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (232, '2018-05-20', 10, 210, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (233, '2018-02-18', 30, 490, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (234, '2018-04-07', 50, 250, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (235, '2018-01-26', 30, 559, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (236, '2017-09-17', 20, 516, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (237, '2017-09-18', 40, 293, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (238, '2017-10-30', 30, 119, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (239, '2018-01-06', 50, 441, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (240, '2017-09-21', 30, 163, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (241, '2017-12-28', 30, 208, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (242, '2017-12-25', 40, 561, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (243, '2018-01-13', 50, 201, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (244, '2018-05-26', 10, 341, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (245, '2017-09-23', 20, 507, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (246, '2017-11-28', 50, 436, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (247, '2017-11-23', 40, 244, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (248, '2017-10-20', 40, 244, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (249, '2017-10-25', 40, 368, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (250, '2018-02-26', 40, 250, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (251, '2018-06-06', 40, 433, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (252, '2018-06-16', 10, 111, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (253, '2018-02-04', 50, 336, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (254, '2017-12-25', 40, 567, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (255, '2018-02-15', 30, 368, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (256, '2017-12-01', 20, 416, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (257, '2018-01-14', 50, 351, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (258, '2018-04-18', 40, 570, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (259, '2018-04-08', 40, 252, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (260, '2018-03-06', 10, 447, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (261, '2018-04-08', 20, 603, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (262, '2018-01-09', 50, 240, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (263, '2018-04-16', 40, 317, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (264, '2018-06-19', 10, 373, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (265, '2017-12-03', 40, 348, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (266, '2018-06-13', 20, 388, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (267, '2018-04-02', 50, 578, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (268, '2018-06-19', 50, 111, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (269, '2018-04-17', 20, 233, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (270, '2017-09-27', 10, 485, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (271, '2017-10-20', 30, 584, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (272, '2017-10-07', 10, 418, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (273, '2018-02-28', 40, 409, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (274, '2018-01-06', 50, 397, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (275, '2018-04-09', 10, 151, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (276, '2017-11-08', 10, 370, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (277, '2018-03-04', 50, 508, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (278, '2018-04-05', 40, 445, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (279, '2017-09-26', 50, 488, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (280, '2018-04-29', 20, 319, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (281, '2018-06-07', 20, 116, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (282, '2018-01-13', 10, 460, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (283, '2018-02-07', 10, 510, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (284, '2018-06-04', 40, 195, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (285, '2017-09-27', 10, 535, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (286, '2018-04-28', 20, 432, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (287, '2017-12-24', 10, 380, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (288, '2018-04-25', 40, 440, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (289, '2017-11-22', 20, 512, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (290, '2018-01-20', 30, 140, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (291, '2018-04-25', 10, 178, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (292, '2018-02-25', 20, 270, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (293, '2017-09-26', 30, 425, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (294, '2017-12-25', 30, 500, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (295, '2018-05-26', 10, 162, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (296, '2018-04-19', 50, 515, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (297, '2017-10-24', 50, 215, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (298, '2017-12-22', 10, 335, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (299, '2018-02-18', 50, 339, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (300, '2017-10-04', 20, 488, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (301, '2018-03-14', 10, 368, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (302, '2017-12-09', 10, 261, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (303, '2018-01-06', 30, 446, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (304, '2017-10-06', 50, 354, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (305, '2017-11-13', 40, 387, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (306, '2018-01-11', 50, 594, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (307, '2018-04-17', 20, 144, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (308, '2017-10-18', 10, 518, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (309, '2018-05-25', 50, 531, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (310, '2018-06-04', 20, 419, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (311, '2018-04-21', 20, 273, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (312, '2018-04-17', 40, 153, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (313, '2018-04-26', 20, 304, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (314, '2017-12-18', 30, 148, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (315, '2018-05-20', 50, 266, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (316, '2018-06-20', 20, 538, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (317, '2017-11-15', 20, 155, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (318, '2018-04-08', 20, 328, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (319, '2017-12-14', 10, 267, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (320, '2018-02-09', 40, 390, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (321, '2017-12-16', 20, 603, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (322, '2017-11-11', 40, 343, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (323, '2017-09-27', 40, 595, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (324, '2017-09-12', 40, 428, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (325, '2018-06-09', 30, 282, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (326, '2018-05-23', 10, 594, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (327, '2018-04-18', 20, 311, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (328, '2017-11-05', 30, 268, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (329, '2017-11-04', 10, 125, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (330, '2018-05-08', 30, 444, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (331, '2018-05-07', 20, 388, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (332, '2018-02-17', 30, 247, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (333, '2018-02-24', 20, 449, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (334, '2017-09-13', 50, 539, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (335, '2017-12-04', 10, 433, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (336, '2018-04-16', 20, 139, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (337, '2018-01-05', 50, 541, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (338, '2018-04-27', 30, 406, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (339, '2018-05-20', 30, 133, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (340, '2017-10-17', 10, 446, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (341, '2018-03-15', 10, 479, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (342, '2017-09-27', 50, 111, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (343, '2018-04-07', 30, 315, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (344, '2018-06-01', 20, 336, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (345, '2018-02-24', 10, 431, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (346, '2018-02-25', 20, 587, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (347, '2017-09-30', 30, 450, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (348, '2017-11-01', 40, 116, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (349, '2018-01-25', 50, 535, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (350, '2017-10-25', 10, 176, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (351, '2018-04-23', 30, 206, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (352, '2017-11-08', 20, 248, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (353, '2018-04-18', 30, 220, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (354, '2017-09-11', 20, 115, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (355, '2017-12-24', 40, 519, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (356, '2018-05-28', 20, 609, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (357, '2017-10-06', 50, 150, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (358, '2017-10-09', 20, 243, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (359, '2017-11-14', 40, 247, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (360, '2017-09-21', 20, 417, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (361, '2018-03-06', 50, 145, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (362, '2017-10-19', 30, 134, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (363, '2018-01-10', 30, 333, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (364, '2017-12-31', 40, 438, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (365, '2018-04-19', 40, 219, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (366, '2018-05-03', 30, 521, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (367, '2017-10-19', 10, 586, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (368, '2018-05-15', 30, 122, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (369, '2017-10-30', 20, 129, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (370, '2017-10-27', 20, 513, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (371, '2018-01-15', 30, 292, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (372, '2018-03-03', 40, 337, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (373, '2018-02-19', 50, 336, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (374, '2017-11-27', 50, 381, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (375, '2018-04-27', 10, 440, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (376, '2017-09-24', 30, 153, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (377, '2018-05-02', 20, 336, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (378, '2017-11-11', 40, 377, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (379, '2017-10-16', 40, 546, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (380, '2017-11-22', 40, 489, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (381, '2017-10-22', 10, 144, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (382, '2018-01-09', 20, 186, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (383, '2018-05-04', 20, 290, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (384, '2017-11-12', 20, 474, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (385, '2018-06-03', 40, 409, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (386, '2017-10-12', 10, 199, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (387, '2018-05-21', 30, 295, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (388, '2018-03-11', 40, 149, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (389, '2018-01-03', 40, 465, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (390, '2017-11-15', 10, 151, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (391, '2017-11-04', 30, 262, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (392, '2018-04-28', 30, 244, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (393, '2017-10-09', 30, 540, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (394, '2017-11-13', 50, 422, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (395, '2018-02-06', 10, 591, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (396, '2017-11-29', 30, 315, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (397, '2018-02-11', 20, 299, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (398, '2017-09-25', 50, 447, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (399, '2018-02-06', 20, 255, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (400, '2018-04-30', 30, 255, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (401, '2017-12-28', 30, 114, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (402, '2018-06-01', 50, 436, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (403, '2017-12-01', 30, 561, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (404, '2017-12-10', 50, 377, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (405, '2018-01-13', 30, 379, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (406, '2018-05-30', 10, 228, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (407, '2018-05-30', 50, 199, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (408, '2018-05-03', 10, 445, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (409, '2017-09-26', 40, 530, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (410, '2017-10-31', 10, 117, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (411, '2018-01-16', 50, 263, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (412, '2018-01-06', 20, 129, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (413, '2018-02-15', 20, 304, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (414, '2018-03-30', 50, 573, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (415, '2018-02-06', 30, 324, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (416, '2017-10-11', 30, 339, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (417, '2017-09-29', 20, 287, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (418, '2017-12-23', 30, 198, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (419, '2018-04-12', 50, 599, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (420, '2017-11-09', 20, 403, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (421, '2018-01-22', 30, 131, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (422, '2018-06-09', 40, 171, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (423, '2018-05-19', 20, 135, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (424, '2017-11-23', 40, 385, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (425, '2017-10-17', 20, 505, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (426, '2018-06-10', 20, 157, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (427, '2018-02-10', 10, 571, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (428, '2018-05-06', 30, 468, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (429, '2017-11-20', 20, 279, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (430, '2017-09-29', 30, 207, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (431, '2018-01-20', 10, 526, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (432, '2018-04-10', 20, 305, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (433, '2017-11-23', 50, 261, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (434, '2018-02-14', 40, 421, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (435, '2017-12-05', 30, 362, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (436, '2018-02-15', 40, 141, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (437, '2018-02-01', 40, 605, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (438, '2017-10-14', 40, 139, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (439, '2018-03-11', 50, 553, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (440, '2018-03-08', 10, 411, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (441, '2018-03-29', 10, 278, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (442, '2018-06-04', 30, 375, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (443, '2018-05-25', 50, 379, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (444, '2018-03-01', 50, 564, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (445, '2018-06-21', 50, 415, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (446, '2018-01-09', 10, 468, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (447, '2018-03-31', 10, 301, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (448, '2018-03-17', 40, 542, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (449, '2018-01-02', 30, 318, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (450, '2018-02-05', 50, 582, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (451, '2017-12-14', 20, 441, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (452, '2018-01-04', 30, 239, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (453, '2018-03-04', 50, 177, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (454, '2017-11-23', 30, 290, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (455, '2018-03-18', 20, 370, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (456, '2018-01-17', 40, 277, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (457, '2017-12-20', 20, 224, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (458, '2018-01-11', 30, 198, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (459, '2018-05-14', 20, 399, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (460, '2018-03-22', 20, 594, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (461, '2018-01-03', 10, 537, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (462, '2018-02-14', 30, 122, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (463, '2018-03-29', 40, 416, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (464, '2018-02-16', 10, 520, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (465, '2017-12-30', 10, 538, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (466, '2017-11-28', 20, 581, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (467, '2018-05-21', 20, 228, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (468, '2017-09-23', 10, 272, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (469, '2018-06-21', 30, 159, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (470, '2018-03-14', 30, 172, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (471, '2018-06-09', 40, 609, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (472, '2017-11-03', 40, 302, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (473, '2018-02-05', 50, 520, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (474, '2017-09-13', 10, 246, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (475, '2017-10-16', 40, 139, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (476, '2017-09-26', 40, 506, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (477, '2017-10-23', 30, 267, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (478, '2018-05-17', 40, 125, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (479, '2018-05-18', 40, 323, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (480, '2017-10-05', 40, 517, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (481, '2017-12-12', 20, 365, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (482, '2017-10-29', 40, 364, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (483, '2018-05-08', 20, 419, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (484, '2018-02-23', 30, 457, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (485, '2018-01-18', 40, 354, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (486, '2018-04-30', 50, 574, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (487, '2018-01-30', 20, 202, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (488, '2018-06-06', 20, 460, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (489, '2017-11-11', 10, 497, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (490, '2017-10-07', 50, 158, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (491, '2018-01-10', 40, 287, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (492, '2017-10-11', 10, 339, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (493, '2018-06-03', 40, 126, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (494, '2018-03-20', 20, 391, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (495, '2018-04-06', 20, 237, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (496, '2017-11-07', 50, 232, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (497, '2018-02-21', 50, 391, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (498, '2018-05-28', 10, 186, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (499, '2018-03-09', 10, 560, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (500, '2017-10-04', 10, 500, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (501, '2017-11-24', 50, 531, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (502, '2017-11-27', 30, 350, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (503, '2018-04-06', 40, 276, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (504, '2018-04-06', 30, 163, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (505, '2018-05-17', 10, 178, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (506, '2017-10-09', 40, 136, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (507, '2018-01-12', 30, 203, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (508, '2017-10-03', 30, 475, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (509, '2018-04-04', 40, 123, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (510, '2017-09-22', 20, 156, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (511, '2017-10-11', 40, 518, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (512, '2018-06-13', 50, 515, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (513, '2017-09-22', 20, 249, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (514, '2018-03-29', 30, 238, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (515, '2017-11-03', 30, 440, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (516, '2017-10-07', 10, 242, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (517, '2018-06-01', 50, 148, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (518, '2018-04-04', 40, 475, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (519, '2018-06-14', 50, 250, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (520, '2018-01-22', 10, 454, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (521, '2017-10-01', 30, 386, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (522, '2017-12-01', 50, 399, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (523, '2017-10-02', 50, 388, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (524, '2017-09-18', 30, 278, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (525, '2017-10-17', 10, 337, 5);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (526, '2018-06-13', 20, 131, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (527, '2018-05-05', 30, 400, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (528, '2018-03-21', 10, 471, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (529, '2017-12-06', 20, 349, 3);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (530, '2018-01-07', 20, 468, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (531, '2017-11-23', 50, 321, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (532, '2017-11-10', 50, 580, 10);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (533, '2018-04-17', 10, 252, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (534, '2018-03-20', 50, 465, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (535, '2018-01-05', 30, 119, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (536, '2017-12-30', 50, 351, 9);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (537, '2017-12-19', 50, 227, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (538, '2017-09-14', 40, 528, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (539, '2017-09-18', 50, 309, 6);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (540, '2017-12-23', 50, 600, 2);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (541, '2018-04-22', 20, 150, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (542, '2018-01-11', 50, 309, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (543, '2017-10-03', 50, 434, 8);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (544, '2018-05-14', 40, 418, 4);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (545, '2017-12-09', 40, 458, 1);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (546, '2017-10-07', 50, 558, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (547, '2017-09-15', 30, 215, 7);\n" +
                "INSERT INTO public.exam (exam_id, dateofexam, duration, student, subject) VALUES (548, '2018-04-15', 20, 491, 9);");

        //System.out.println(sql_schoolclass);
        //System.out.println(sql_students);
        //System.out.println(sql_subject);
        //System.out.println(sql_exams);

        String data = sql_schoolclass + "\n" + sql_students + "\n" + sql_subject + "\n" + sql_exams;
        System.out.println(data);
    }



    public static String StringCutter(String s){
        return s.replaceAll("public.", "");
    }

}
