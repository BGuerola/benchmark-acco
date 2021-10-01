package com.justaproject.manco.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.justaproject.manco.model.EmpresasCNAE;

public class RepositoriCnae {

	private static RepositoriCnae repocnae = new RepositoriCnae();
	
	public HashMap<String, EmpresasCNAE> lltacnae = new HashMap<>();

	public static RepositoriCnae getInstance() {
		return repocnae;
	}

	private RepositoriCnae() {

		saveLead(new EmpresasCNAE("500", "0500 TOTAL SECTOR INDUSTRIAL", 194406, 681317560, 609491761, 160429272,
				73046855, 534600201, 27880492, 87382418, 2311811, 2196248, 2111659, 3665621));
		saveLead(new EmpresasCNAE("710", "0710 Extracci¢n de minerales de hierro", 16, 9962, 9953, 5294, 3083, 4719,
				523, 2211, 50, 50, 49, 85));
		saveLead(new EmpresasCNAE("729", "0729 Extracci¢n de otros minerales met licos no f‚rreos", 42, 869126, 912240,
				410507, 296932, 515158, 137251, 113575, 2280, 2277, 2249, 3885));
		saveLead(new EmpresasCNAE("811",
				"0811 Extracci¢n de piedra ornamental y para la construcci¢n, piedra caliza, yeso, creta y pizarra",
				632, 631893, 579347, 219596, 73640, 429558, 39238, 145957, 4226, 4043, 3901, 6739));
		saveLead(new EmpresasCNAE("812", "0812 Extracci¢n de gravas y arenas,  extracci¢n de arcilla y caol¡n", 847,
				1101646, 1090712, 353084, 134056, 777600, 62785, 219028, 6690, 6431, 6163, 10646));
		saveLead(new EmpresasCNAE("891", "0891 Extracci¢n de minerales para productos qu¡micos y fertilizantes", 16,
				581183, 569768, 208174, 103999, 394370, 99401, 104175, 1845, 1842, 1824, 3153));
		saveLead(new EmpresasCNAE("892", "0892 Extracci¢n de turba", 6, 11419, 7897, 2333, 775, 9139, 284, 1558, 40, 39,
				32, 55));
		saveLead(new EmpresasCNAE("893", "0893 Extracci¢n de sal", 40, 125999, 127380, 43752, 23378, 87096, 4894, 20374,
				549, 538, 522, 908));
		saveLead(new EmpresasCNAE("899", "0899 Otras industrias extractivas ncop", 81, 181256, 185851, 59576, 33414,
				126945, 12021, 26162, 587, 572, 558, 964));
		saveLead(new EmpresasCNAE("910", "0910 Actividades de apoyo a la extracci¢n de petr¢leo y gas natural", 46,
				63916, 77033, 36962, 29081, 40195, 3823, 7881, 124, 113, 111, 193));
		saveLead(new EmpresasCNAE("990", "0990 Actividades de apoyo a otras industrias extractivas", 25, 163111, 170759,
				60868, 15715, 109444, 6656, 45154, 959, 950, 947, 1635));
		saveLead(new EmpresasCNAE("1011", "1011 Procesado y conservaci¢n de carne", 835, 15400595, 14498993, 2474120,
				1097365, 13240887, 419333, 1376755, 45046, 44704, 43415, 76835));
		saveLead(new EmpresasCNAE("1012", "1012 Procesado y conservaci¢n de volater¡a", 162, 4219238, 3657847, 531871,
				110252, 3710844, 114658, 421620, 14289, 14196, 13902, 24614));
		saveLead(new EmpresasCNAE("1013", "1013 Elaboraci¢n de productos c rnicos y de volater¡a", 2505, 12107038,
				12033257, 2460710, 946799, 9927746, 540981, 1513911, 51078, 49786, 48079, 85090));
		saveLead(new EmpresasCNAE("1021", "1021 Procesado de pescados, crust ceos y moluscos", 172, 1903030, 1851689,
				269313, 91154, 1613591, 45233, 178159, 6670, 6611, 6486, 11484));
		saveLead(new EmpresasCNAE("1022", "1022 Fabricaci¢n de conservas de pescado", 399, 5027461, 4604234, 775974,
				276235, 4356348, 85469, 499740, 17111, 16953, 16579, 29349));
		saveLead(new EmpresasCNAE("1031", "1031 Procesado y conservaci¢n de patatas", 116, 498506, 485669, 133351,
				49705, 368332, 40076, 83646, 2805, 2738, 2655, 4699));
		saveLead(new EmpresasCNAE("1032", "1032 Elaboraci¢n de zumos de frutas y hortalizas", 87, 2711011, 2674464,
				437717, 237983, 2328056, 107072, 199734, 5936, 5907, 5849, 10351));
		saveLead(new EmpresasCNAE("1039", "1039 Otro procesado y conservaci¢n de frutas y hortalizas", 1181, 7999723,
				7605351, 1433731, 638277, 6701058, 361269, 795454, 31435, 30838, 30268, 53570));
		saveLead(new EmpresasCNAE("1042", "1042 Fabricaci¢n de margarina y grasas comestibles similares", 18, 173227,
				177764, 42598, 15157, 135493, 5203, 27442, 553, 547, 542, 959));
		saveLead(new EmpresasCNAE("1043", "1043 Fabricaci¢n de aceite de oliva", 1541, 7519711, 7261739, 595973, 266068,
				7190959, 215864, 329905, 11765, 11065, 10692, 18920));
		saveLead(new EmpresasCNAE("1044", "1044 Fabricaci¢n de otros aceites y grasas", 99, 2743289, 2018837, 250093,
				127745, 2509797, 60056, 122348, 2548, 2483, 2440, 4318));
		saveLead(new EmpresasCNAE("1052", "1052 Elaboraci¢n de helados", 400, 829032, 811143, 271325, 93114, 580777,
				30445, 178210, 5737, 5501, 5215, 9231));
		saveLead(new EmpresasCNAE("1053", "1053 Fabricaci¢n de quesos", 1045, 2978817, 2678847, 500603, 229723, 2513898,
				137841, 270881, 9679, 8926, 8613, 15244));
		saveLead(new EmpresasCNAE("1054", "1054 Preparaci¢n de leche y otros productos lácteos", 239, 6115553, 5979813,
				980962, 404407, 5243062, 224379, 576555, 14010, 13866, 13580, 24040));
		saveLead(new EmpresasCNAE("1061", "1061 Fabricaci¢n de productos de moliner¡a", 355, 3277332, 3165496, 416284,
				185194, 2844409, 91017, 231090, 6286, 6093, 5951, 10531));
		saveLead(new EmpresasCNAE("1062", "1062 Fabricaci¢n de almidones y productos amil ceos", 12, 374162, 322070,
				65411, 36236, 316423, 9820, 29175, 511, 503, 484, 856));
		saveLead(new EmpresasCNAE("1071", "1071 Fabricaci¢n de pan y de productos frescos de panader¡a y pasteler¡a",
				11009, 6282123, 6108003, 2207185, 546216, 4147183, 274454, 1660969, 79169, 70877, 63760, 112833));
		saveLead(new EmpresasCNAE("1072",
				"1072 Fabricaci¢n de galletas y productos de panader¡a y pasteler¡a de larga duraci¢n", 580, 2687555,
				2687172, 772203, 305112, 2009783, 123048, 467091, 15559, 15186, 14468, 25608));
		saveLead(new EmpresasCNAE("1073", "1073 Fabricaci¢n de pastas alimenticias, cusc£s y productos similares", 109,
				278889, 264915, 64305, 27903, 216934, 20110, 36402, 1156, 1058, 1022, 1808));
		saveLead(new EmpresasCNAE("1081", "1081 Fabricaci¢n de az£car", 31, 481118, 472648, 50565, -25644, 410148,
				20381, 76209, 1542, 1526, 1500, 2655));
		saveLead(new EmpresasCNAE("1082", "1082 Fabricaci¢n de cacao, chocolate y productos de confiter¡a", 678,
				2850831, 2777866, 716061, 249359, 2188777, 161494, 466702, 14894, 14515, 14018, 24807));
		saveLead(new EmpresasCNAE("1083", "1083 Elaboraci¢n de caf‚, t‚ e infusiones", 273, 3610214, 3166847, 894998,
				364801, 2768681, 143250, 530197, 10458, 10358, 10127, 17929));
		saveLead(new EmpresasCNAE("1084", "1084 Elaboraci¢n de especias, salsas y condimentos", 245, 1288747, 1263443,
				295439, 117961, 1011093, 43928, 177478, 5087, 4999, 4867, 8613));
		saveLead(new EmpresasCNAE("1085", "1085 Elaboraci¢n de platos y comidas preparados", 412, 2392829, 2395420,
				444995, 182050, 2022273, 104988, 262946, 9210, 8972, 8530, 15095));
		saveLead(new EmpresasCNAE("1086",
				"1086 Elaboraci¢n de preparados alimenticios homogeneizados y alimentos diet‚ticos", 112, 907671,
				854973, 266788, 74911, 661633, 42674, 191877, 5147, 5067, 4941, 8744));
		saveLead(new EmpresasCNAE("1089", "1089 Elaboraci¢n de otros productos alimenticios ncop", 1366, 2337682,
				2284021, 568069, 209939, 1812128, 110814, 358130, 13401, 12452, 11629, 20576));
		saveLead(new EmpresasCNAE("1091", "1091 Fabricaci¢n de productos para la alimentaci¢n de animales de granja",
				654, 13198723, 12424400, 1040264, 547768, 12394586, 220384, 492496, 13082, 12821, 12411, 21970));
		saveLead(new EmpresasCNAE("1092", "1092 Fabricaci¢n de productos para la alimentaci¢n de animales de compa¤¡a",
				77, 1021025, 1006560, 209438, 116210, 829804, 31131, 93229, 2123, 2085, 2046, 3621));
		saveLead(new EmpresasCNAE("1101", "1101 Destilaci¢n, rectificaci¢n y mezcla de bebidas alcoh¢licas", 332,
				1545184, 1434006, 417027, 252063, 1216949, 58376, 164965, 4012, 3800, 3635, 6523));
		saveLead(new EmpresasCNAE("1102", "1102 Elaboraci¢n de vinos", 4071, 7806473, 7661463, 1904363, 924929, 6270821,
				565591, 979434, 31564, 29104, 27488, 49317));
		saveLead(new EmpresasCNAE("1103", "1103 Elaboraci¢n de sidra y otras bebidas fermentadas a partir de frutas",
				125, 106622, 108099, 31694, 12434, 79563, 5479, 19261, 782, 654, 561, 1006));
		saveLead(new EmpresasCNAE("1105", "1105 Fabricaci¢n de cerveza", 405, 4471071, 4441055, 1556284, 856681,
				2954935, 289094, 699603, 9931, 9595, 9441, 16955));
		saveLead(new EmpresasCNAE("1107",
				"1107 Fabricaci¢n de bebidas no alcoh¢licas,  producci¢n de aguas minerales y otras aguas embotelladas",
				262, 5344820, 4923496, 994985, 408726, 4452428, 258561, 586259, 13023, 12888, 12518, 22450));
		saveLead(new EmpresasCNAE("1310", "1310 Preparaci¢n e hilado de fibras textiles", 344, 765862, 735444, 181883,
				49733, 574193, 26627, 132150, 4425, 4268, 4156, 7437));
		saveLead(new EmpresasCNAE("1320", "1320 Fabricaci¢n de tejidos textiles", 400, 1132225, 1137154, 270836, 86718,
				894492, 40122, 184117, 5893, 5746, 5545, 9922));
		saveLead(new EmpresasCNAE("1330", "1330 Acabado de textiles", 880, 697552, 698840, 295995, 45529, 407738, 32750,
				250466, 8826, 8266, 8004, 14324));
		saveLead(new EmpresasCNAE("1391", "1391 Fabricaci¢n de tejidos de punto", 205, 230975, 225350, 62744, 14928,
				169530, 4646, 47816, 1637, 1562, 1498, 2681));
		saveLead(new EmpresasCNAE("1392",
				"1392 Fabricaci¢n de art¡culos confeccionados con textiles, excepto prendas de vestir", 3456, 1556216,
				1458941, 439800, 108141, 1126055, 37713, 331659, 15314, 12603, 11953, 21390));
		saveLead(new EmpresasCNAE("1393", "1393 Fabricaci¢n de alfombras y moquetas", 70, 178421, 172092, 51662, 18069,
				130877, 5573, 33593, 1001, 954, 920, 1647));
		saveLead(new EmpresasCNAE("1394", "1394 Fabricaci¢n de cuerdas, cordeles, bramantes y redes", 332, 246112,
				241008, 71416, 21552, 181374, 8925, 49864, 2161, 1945, 1859, 3327));
		saveLead(new EmpresasCNAE("1395",
				"1395 Fabricaci¢n de telas no tejidas y art¡culos confeccionados con ellas, excepto prendas de vestir",
				25, 348894, 342287, 85599, 32672, 271044, 18349, 52928, 1054, 1041, 1026, 1835));
		saveLead(new EmpresasCNAE("1396", "1396 Fabricaci¢n de otros productos textiles de uso t‚cnico e industrial",
				278, 602115, 588191, 186697, 51969, 424086, 21031, 134728, 4032, 3898, 3779, 6762));
		saveLead(new EmpresasCNAE("1399", "1399 Fabricaci¢n de otros productos textiles ncop", 465, 304488, 306231,
				84058, 16300, 232159, 13348, 67757, 2709, 2439, 2295, 4108));
		saveLead(new EmpresasCNAE("1411", "1411 Confecci¢n de prendas de vestir de cuero", 26, 1890, 1879, 941, 196,
				914, 4, 745, 53, 28, 26, 47));
		saveLead(new EmpresasCNAE("1412", "1412 Confecci¢n de ropa de trabajo", 381, 271250, 260544, 88721, 37693,
				189830, 7159, 51028, 2346, 2085, 1906, 3410));
		saveLead(new EmpresasCNAE("1413", "1413 Confecci¢n de otras prendas de vestir exteriores", 5073, 2858300,
				2777866, 652272, 116466, 2250608, 28190, 535806, 23515, 19674, 17023, 30451));
		saveLead(new EmpresasCNAE("1414", "1414 Confecci¢n de ropa interior", 234, 177300, 178555, 45328, 8554, 137179,
				10487, 36774, 1549, 1401, 1257, 2249));
		saveLead(new EmpresasCNAE("1419", "1419 Confecci¢n de otras prendas de vestir y accesorios", 2756, 758298,
				737174, 233206, 36187, 535235, 9959, 197019, 10625, 8457, 7505, 13427));
		saveLead(new EmpresasCNAE("1420", "1420 Fabricaci¢n de art¡culos de peleter¡a", 126, 16475, 15860, 5803, 860,
				11885, 434, 4943, 298, 204, 190, 340));
		saveLead(new EmpresasCNAE("1431", "1431 Confecci¢n de calceter¡a", 47, 157520, 160082, 53650, 7312, 108305,
				7575, 46338, 1697, 1673, 1604, 2869));
		saveLead(new EmpresasCNAE("1439", "1439 Confecci¢n de otras prendas de vestir de punto", 366, 292052, 291067,
				52325, -4971, 246746, 4100, 57296, 2312, 2102, 1930, 3453));
		saveLead(new EmpresasCNAE("1511",
				"1511 Preparaci¢n, curtido y acabado del cuero,  preparaci¢n y te¤ido de pieles", 239, 533753, 525678,
				136684, 37057, 394472, 24026, 99627, 3105, 2960, 2921, 5352));
		saveLead(new EmpresasCNAE("1512",
				"1512 Fabricaci¢n de art¡culos de marroquiner¡a, viaje y de guarnicioner¡a y talabarter¡a", 899, 794345,
				861770, 242184, 45579, 643854, 19687, 196605, 7710, 7009, 6895, 12635));
		saveLead(new EmpresasCNAE("1520", "1520 Fabricaci¢n de calzado", 3172, 2979136, 2964802, 775997, 185248,
				2226760, 31364, 590749, 27503, 25763, 25209, 46186));
		saveLead(new EmpresasCNAE("1610", "1610 Aserrado y cepillado de la madera", 1006, 1032962, 1024919, 274989,
				94451, 782443, 51445, 180538, 7132, 6513, 6336, 11140));
		saveLead(new EmpresasCNAE("1621", "1621 Fabricaci¢n de chapas y tableros de madera", 285, 2248180, 2155049,
				507728, 203290, 1797998, 232794, 304437, 8652, 8520, 8333, 14653));
		saveLead(new EmpresasCNAE("1622", "1622 Fabricaci¢n de suelos de madera ensamblados", 298, 164048, 161466,
				44998, 8253, 121121, 3718, 36745, 1404, 1225, 1174, 2064));
		saveLead(new EmpresasCNAE("1623",
				"1623 Fabricaci¢n de otras estructuras de madera y piezas de carpinter¡a y ebanister¡a para la construcci¢n",
				5225, 1819769, 1783503, 636046, 178980, 1202576, 45894, 457066, 19069, 15802, 15190, 26706));
		saveLead(new EmpresasCNAE("1624", "1624 Fabricaci¢n de envases y embalajes de madera", 899, 1596427, 1583703,
				434490, 148357, 1198748, 61981, 286133, 10378, 9994, 9669, 16999));
		saveLead(new EmpresasCNAE("1629",
				"1629 Fabricaci¢n de art¡culos de corcho, cester¡a y esparter¡a y otros productos de madera (CNAE 1629)",
				1860, 962152, 938965, 236135, 75779, 754753, 39669, 160356, 6831, 5643, 5324, 9360));
		saveLead(new EmpresasCNAE("1711", "1711 Fabricaci¢n de pasta papelera", 8, 732590, 770772, 167559, 78251,
				608826, 159460, 89308, 1258, 1256, 1211, 2130));
		saveLead(new EmpresasCNAE("1712", "1712 Fabricaci¢n de papel y cart¢n", 157, 4143830, 4142086, 1170662, 722063,
				3091431, 233985, 448599, 8362, 8305, 8025, 14119));
		saveLead(new EmpresasCNAE("1721",
				"1721 Fabricaci¢n de papel y cart¢n ondulados,  fabricaci¢n de envases y embalajes de papel y cart¢n",
				721, 5834832, 5766857, 1547906, 657018, 4291255, 331033, 890887, 23620, 23408, 22816, 40136));
		saveLead(new EmpresasCNAE("1722",
				"1722 Fabricaci¢n de art¡culos de papel y cart¢n para uso dom‚stico, sanitario e higi‚nico", 125,
				2072145, 1807156, 478756, 220297, 1618139, 125843, 258459, 5608, 5550, 5422, 9542));
		saveLead(new EmpresasCNAE("1723", "1723 Fabricaci¢n de art¡culos de papeler¡a", 118, 520545, 481423, 136631,
				53440, 390765, 13715, 83191, 2207, 2164, 2110, 3714));
		saveLead(new EmpresasCNAE("1724", "1724 Fabricaci¢n de papeles pintados", 5, 6270, 6322, 1938, 261, 4400, 96,
				1677, 54, 54, 48, 85));
		saveLead(new EmpresasCNAE("1729", "1729 Fabricaci¢n de otros art¡culos de papel y cart¢n", 422, 764347, 752756,
				250733, 83849, 517228, 31074, 166884, 5088, 4975, 4789, 8425));
		saveLead(new EmpresasCNAE("1811", "1811 Impresi¢n de peri¢dicos", 62, 275130, 255863, 110381, 25689, 173357,
				11450, 84692, 1892, 1851, 1813, 3198));
		saveLead(new EmpresasCNAE("1812", "1812 Otras actividades de impresi¢n y artes gr ficas", 9915, 5043266,
				5023332, 1851149, 507781, 3266663, 233634, 1343368, 47812, 41460, 39127, 68862));
		saveLead(new EmpresasCNAE("1813", "1813 Servicios de preimpresi¢n y preparaci¢n de soportes", 2241, 556153,
				542244, 227141, 54041, 331101, 22213, 173100, 7080, 5589, 5209, 9168));
		saveLead(new EmpresasCNAE("1814", "1814 Encuadernaci¢n y servicios relacionados con la misma", 368, 193034,
				193654, 93592, 14439, 101804, 6570, 79153, 2946, 2831, 2668, 4696));
		saveLead(new EmpresasCNAE("1820", "1820 Reproducci¢n de soportes grabados", 1228, 122261, 118392, 45464, 15038,
				79734, 2577, 30426, 2103, 956, 827, 1455));
		saveLead(new EmpresasCNAE("1910", "1910 Coquer¡as", 4, 33378, 32199, 3797, 1798, 32881, 6169, 1998, 51, 48, 44,
				74));
		saveLead(new EmpresasCNAE("2011", "2011 Fabricaci¢n de gases industriales", 29, 1401131, 1397964, 540054,
				337208, 890302, 73473, 202845, 3102, 3090, 3075, 5313));
		saveLead(new EmpresasCNAE("2012", "2012 Fabricaci¢n de colorantes y pigmentos", 47, 1083862, 910487, 237721,
				97535, 867168, 18370, 140186, 2497, 2483, 2435, 4205));
		saveLead(new EmpresasCNAE("2013", "2013 Fabricaci¢n de otros productos b sicos de qu¡mica inorg nica", 95,
				2003220, 1977190, 548432, 302921, 1503526, 131436, 245511, 4346, 4313, 4155, 7180));
		saveLead(new EmpresasCNAE("2014", "2014 Fabricaci¢n de otros productos b sicos de qu¡mica org nica", 215,
				8906155, 8029902, 1246213, 761488, 7830972, 242912, 484726, 8136, 8031, 7832, 13534));
		saveLead(new EmpresasCNAE("2015", "2015 Fabricaci¢n de fertilizantes y compuestos nitrogenados", 347, 2207686,
				2045913, 478385, 229142, 1769407, 43098, 249243, 5653, 5480, 5263, 9098));
		saveLead(new EmpresasCNAE("2016", "2016 Fabricaci¢n de pl sticos en formas primarias", 306, 8518465, 8114568,
				1443205, 784737, 7349628, 268693, 658468, 11292, 11192, 10867, 18774));
		saveLead(new EmpresasCNAE("2017", "2017 Fabricaci¢n de caucho sint‚tico en formas primarias", 32, 304391,
				336293, 125648, 88981, 211345, 7294, 36667, 649, 638, 617, 1067));
		saveLead(new EmpresasCNAE("2020", "2020 Fabricaci¢n de pesticidas y otros productos agroqu¡micos", 77, 1169038,
				1095806, 289810, 132636, 938721, 23285, 157174, 3057, 3031, 2957, 5109));
		saveLead(new EmpresasCNAE("2030",
				"2030 Fabricaci¢n de pinturas, barnices y revestimientos similares,  tintas de imprenta y masillas",
				424, 3720705, 3607654, 973068, 333078, 2795824, 131035, 639990, 13998, 13857, 13584, 23476));
		saveLead(new EmpresasCNAE("2041",
				"2041 Fabricaci¢n de jabones, detergentes y otros art¡culos de limpieza y abrillantamiento", 575,
				3336983, 3233794, 815444, 327486, 2538170, 115244, 487958, 11109, 10869, 10573, 18268));
		saveLead(new EmpresasCNAE("2042", "2042 Fabricaci¢n de perfumes y cosm‚ticos", 577, 4827697, 4781110, 1387435,
				612795, 3613791, 214763, 774640, 18242, 17967, 17345, 30018));
		saveLead(new EmpresasCNAE("2051", "2051 Fabricaci¢n de explosivos", 119, 310739, 298201, 99635, 34381, 218224,
				12466, 65255, 1764, 1695, 1570, 2713));
		saveLead(new EmpresasCNAE("2052", "2052 Fabricaci¢n de colas", 63, 461394, 400604, 96168, 40768, 369645, 7464,
				55400, 1288, 1274, 1239, 2141));
		saveLead(new EmpresasCNAE("2053", "2053 Fabricaci¢n de aceites esenciales", 119, 1019329, 1027952, 300583,
				147773, 739210, 43067, 152810, 2930, 2876, 2805, 4846));
		saveLead(new EmpresasCNAE("2059", "2059 Fabricaci¢n de otros productos qu¡micos ncop", 407, 3127205, 2927567,
				797790, 393357, 2375785, 73094, 404433, 8252, 8098, 7826, 13519));
		saveLead(new EmpresasCNAE("2060", "2060 Fabricaci¢n de fibras artificiales y sint‚ticas", 43, 411457, 452491,
				136975, 43982, 321617, 12484, 92994, 2236, 2222, 2162, 3735));
		saveLead(new EmpresasCNAE("2110", "2110 Fabricaci¢n de productos farmac‚uticos de base", 123, 3796031, 3814676,
				1502767, 879040, 2428646, 225807, 623727, 11919, 11888, 11718, 20309));
		saveLead(new EmpresasCNAE("2120", "2120 Fabricaci¢n de especialidades farmac‚uticas", 213, 11833174, 11219717,
				3821803, 1720231, 8314006, 678921, 2101572, 36949, 36903, 36272, 62928));
		saveLead(new EmpresasCNAE("2211",
				"2211 Fabricaci¢n de neum ticos y c maras de caucho,  reconstrucci¢n y recauchutado de neum ticos", 94,
				3362009, 3023545, 1107827, 490555, 2313519, 255029, 617272, 11327, 11276, 11092, 18870));
		saveLead(new EmpresasCNAE("2219", "2219 Fabricaci¢n de otros productos de caucho", 506, 1979961, 1924688,
				647294, 207052, 1371499, 81205, 440242, 11809, 11612, 11331, 19280));
		saveLead(new EmpresasCNAE("2221", "2221 Fabricaci¢n de placas, hojas, tubos y perfiles de pl stico", 716,
				3765897, 3659092, 956788, 315113, 2869986, 183262, 641675, 15971, 15721, 15410, 26213));
		saveLead(new EmpresasCNAE("2222", "2222 Fabricaci¢n de envases y embalajes de pl stico", 666, 5857207, 5691836,
				1566995, 696066, 4365926, 419675, 870930, 22768, 22619, 22131, 37630));
		saveLead(new EmpresasCNAE("2223", "2223 Fabricaci¢n de productos de pl stico para la construcci¢n", 309, 657829,
				648885, 204803, 69106, 460989, 31880, 135697, 4560, 4428, 4329, 7365));
		saveLead(new EmpresasCNAE("2229", "2229 Fabricaci¢n de otros productos de pl stico", 1760, 6182926, 6136478,
				2004481, 703636, 4317237, 277204, 1300845, 35924, 35341, 34596, 58847));
		saveLead(new EmpresasCNAE("2311", "2311 Fabricaci¢n de vidrio plano", 65, 722144, 736517, 210560, 70375, 542751,
				18068, 140185, 2946, 2917, 2859, 4969));
		saveLead(new EmpresasCNAE("2312", "2312 Manipulado y transformaci¢n de vidrio plano", 695, 1405325, 1309306,
				471279, 165974, 968152, 71770, 305305, 9428, 9158, 8910, 15472));
		saveLead(new EmpresasCNAE("2313", "2313 Fabricaci¢n de vidrio hueco", 41, 1295843, 1206897, 525374, 287774,
				785783, 105806, 237599, 5294, 5287, 5161, 8954));
		saveLead(new EmpresasCNAE("2314", "2314 Fabricaci¢n de fibra de vidrio", 49, 260092, 251743, 83428, 42654,
				180816, 11702, 40774, 951, 933, 911, 1580));
		saveLead(new EmpresasCNAE("2319", "2319 Fabricaci¢n y manipulado de otro vidrio, incluido el vidrio t‚cnico",
				94, 215288, 225671, 60462, 19539, 168386, 7284, 40923, 1233, 1187, 1146, 1988));
		saveLead(new EmpresasCNAE("2320", "2320 Fabricaci¢n de productos cer micos refractarios", 72, 612566, 599343,
				170705, 63977, 453774, 37221, 106728, 2214, 2200, 2141, 3715));
		saveLead(new EmpresasCNAE("2331", "2331 Fabricaci¢n de azulejos y baldosas de cer mica", 214, 3829653, 3743517,
				1249969, 563008, 2694842, 373078, 686960, 16350, 16222, 15981, 27752));
		saveLead(new EmpresasCNAE("2332",
				"2332 Fabricaci¢n de ladrillos, tejas y productos de tierras cocidas para la construcci¢n", 215, 437057,
				438110, 143253, 49856, 317764, 17770, 93397, 2952, 2896, 2803, 4868));
		saveLead(new EmpresasCNAE("2341", "2341 Fabricaci¢n de art¡culos cer micos de uso dom‚stico y ornamental", 578,
				99822, 101619, 53887, 9785, 50418, 8758, 44102, 2238, 1811, 1603, 2781));
		saveLead(new EmpresasCNAE("2342", "2342 Fabricaci¢n de aparatos sanitarios cer micos", 29, 567000, 341161,
				142876, 63980, 457105, 11736, 78896, 1678, 1668, 1619, 2809));
		saveLead(new EmpresasCNAE("2343", "2343 Fabricaci¢n de aisladores y piezas aislantes de material cer mico", 5,
				11621, 11665, 4526, 1086, 7209, 756, 3440, 131, 125, 120, 209));
		saveLead(new EmpresasCNAE("2344", "2344 Fabricaci¢n de otros productos cer micos de uso t‚cnico", 69, 19112,
				20651, 8250, 2430, 13546, 661, 5820, 247, 207, 194, 336));
		saveLead(new EmpresasCNAE("2349", "2349 Fabricaci¢n de otros productos cer micos", 95, 181183, 187495, 76753,
				35512, 127083, 24670, 41241, 1090, 1038, 1005, 1744));
		saveLead(new EmpresasCNAE("2351", "2351 Fabricaci¢n de cemento", 57, 1718411, 1769233, 795018, 476333, 1374642,
				75693, 318685, 5181, 5150, 5079, 8815));
		saveLead(new EmpresasCNAE("2352", "2352 Fabricaci¢n de cal y yeso", 71, 255050, 252583, 87333, 48051, 190022,
				20612, 39282, 973, 940, 899, 1560));
		saveLead(new EmpresasCNAE("2361", "2361 Fabricaci¢n de elementos de hormig¢n para la construcci¢n", 722,
				1775216, 1723750, 534495, 161238, 1259681, 55391, 373257, 11615, 11332, 10950, 19008));
		saveLead(new EmpresasCNAE("2362", "2362 Fabricaci¢n de elementos de yeso para la construcci¢n", 85, 552170,
				483476, 182831, 102405, 375039, 16062, 80426, 1764, 1733, 1708, 2965));
		saveLead(new EmpresasCNAE("2363", "2363 Fabricaci¢n de hormig¢n fresco", 600, 1558372, 1519154, 340159, 103200,
				1232605, 59106, 236959, 7314, 7167, 6929, 12026));
		saveLead(new EmpresasCNAE("2364", "2364 Fabricaci¢n de mortero", 47, 273279, 265564, 68905, 21618, 211521, 3711,
				47287, 1206, 1197, 1152, 2002));
		saveLead(new EmpresasCNAE("2365", "2365 Fabricaci¢n de fibrocemento", 34, 76627, 72650, 24502, 11764, 53177,
				4162, 12738, 316, 306, 296, 514));
		saveLead(new EmpresasCNAE("2369", "2369 Fabricaci¢n de otros productos de hormig¢n, yeso y cemento", 307,
				276143, 267536, 84313, 24562, 194797, 10834, 59751, 2090, 2002, 1919, 3330));
		saveLead(new EmpresasCNAE("2370", "2370 Corte, tallado y acabado de la piedra", 3086, 2320976, 2264287, 818430,
				228640, 1538765, 100035, 589791, 18243, 16941, 16130, 27993));
		saveLead(new EmpresasCNAE("2391", "2391 Fabricaci¢n de productos abrasivos", 71, 137930, 124287, 48081, 15639,
				92818, 3470, 32442, 805, 789, 747, 1296));
		saveLead(new EmpresasCNAE("2399", "2399 Fabricaci¢n de otros productos minerales no met licos ncop", 188,
				3036765, 2899132, 710724, 451346, 2382859, 63543, 259377, 5340, 5294, 5187, 9000));
		saveLead(new EmpresasCNAE("2410", "2410 Fabricaci¢n de productos b sicos de hierro, acero y ferroaleaciones",
				240, 12059602, 12014431, 1739502, 513178, 10329702, 387790, 1226324, 23097, 23018, 21843, 36872));
		saveLead(new EmpresasCNAE("2420",
				"2420 Fabricaci¢n de tubos, tuber¡as, perfiles huecos y sus accesorios, de acero", 135, 1798114,
				1778135, 374920, 72758, 1444145, 55502, 302162, 6429, 6385, 6179, 10423));
		saveLead(new EmpresasCNAE("2431", "2431 Estirado en fr¡o", 12, 151128, 148194, 25817, 7809, 121188, 2044, 18007,
				401, 401, 386, 651));
		saveLead(new EmpresasCNAE("2432", "2432 Laminaci¢n en fr¡o", 7, 446218, 442729, 39276, 13366, 395024, 4170,
				25910, 474, 474, 460, 777));
		saveLead(new EmpresasCNAE("2433", "2433 Producci¢n de perfiles en fr¡o por conformaci¢n con plegado", 154,
				374712, 373396, 81460, 24885, 297480, 5918, 56575, 1601, 1534, 1468, 2475));
		saveLead(new EmpresasCNAE("2434", "2434 Trefilado en fr¡o", 77, 340734, 331032, 51434, 19586, 293683, 6744,
				31848, 811, 778, 756, 1275));
		saveLead(new EmpresasCNAE("2442", "2442 Producci¢n de aluminio", 99, 6382962, 4106607, 654847, 235768, 5766233,
				149997, 419079, 9940, 9906, 9595, 16190));
		saveLead(new EmpresasCNAE("2443", "2443 Producci¢n de plomo, zinc y esta¤o", 16, 1005423, 655991, 190267,
				104205, 823568, 45420, 86062, 1472, 1467, 1424, 2401));
		saveLead(new EmpresasCNAE("2444", "2444 Producci¢n de cobre", 18, 4715793, 4677575, 360362, 255705, 4366127,
				107119, 104656, 1916, 1906, 1849, 3117));
		saveLead(new EmpresasCNAE("2445", "2445 Producci¢n de otros metales no f‚rreos", 34, 76560, 77714, 13254, 33,
				65267, 1787, 13221, 404, 388, 360, 60));
		saveLead(new EmpresasCNAE("2451", "2451 Fundici¢n de hierro", 92, 1144919, 1125223, 336748, 116863, 837399,
				34705, 219885, 5071, 5033, 4907, 8277));
		saveLead(new EmpresasCNAE("2452", "2452 Fundici¢n de acero", 45, 399301, 405615, 129594, 30248, 280196, 11060,
				99346, 2271, 2251, 2174, 3668));
		saveLead(new EmpresasCNAE("2453", "2453 Fundici¢n de metales ligeros", 90, 810232, 795523, 235380, 57590,
				567048, 57784, 177791, 4346, 4320, 4181, 7054));
		saveLead(new EmpresasCNAE("2454", "2454 Fundici¢n de otros metales no f‚rreos", 212, 634227, 626283, 130951,
				37634, 508624, 14360, 93316, 2487, 2403, 2300, 3879));
		saveLead(new EmpresasCNAE("2511", "2511 Fabricaci¢n de estructuras met licas y sus componentes", 2923, 5847196,
				5853857, 1797436, 482205, 4173760, 216213, 1315231, 38310, 37078, 35949, 62628));
		saveLead(new EmpresasCNAE("2512", "2512 Fabricaci¢n de carpinter¡a met lica", 15649, 6118404, 5961393, 2162125,
				610419, 4007510, 190375, 1551706, 60744, 50388, 47771, 83258));
		saveLead(new EmpresasCNAE("2521", "2521 Fabricaci¢n de radiadores y calderas para calefacci¢n central", 121,
				231794, 206824, 70273, 16029, 166155, 4272, 54244, 1356, 1295, 1261, 2197));
		saveLead(new EmpresasCNAE("2529",
				"2529 Fabricaci¢n de otras cisternas, grandes dep¢sitos y contenedores de metal", 573, 1490945, 1481523,
				519899, 90355, 996614, 37619, 429545, 11083, 10880, 10650, 18555));
		saveLead(new EmpresasCNAE("2530",
				"2530 Fabricaci¢n de generadores de vapor, excepto calderas de calefacci¢n central", 47, 216834, 211049,
				82553, 7840, 135208, 4731, 74713, 1583, 1567, 1522, 2651));
		saveLead(new EmpresasCNAE("2540", "2540 Fabricaci¢n de armas y municiones", 39, 788994, 789223, 183752, 82288,
				626815, 17637, 101464, 2268, 2252, 2154, 3753));
		saveLead(new EmpresasCNAE("2550", "2550 Forja, estampaci¢n y embutici¢n de metales,  metalurgia de polvos",
				1353, 8089627, 8093828, 1796387, 613376, 6298120, 329624, 1183011, 28707, 28101, 27278, 47463));
		saveLead(new EmpresasCNAE("2561", "2561 Tratamiento y revestimiento de metales", 1416, 2530823, 2529082, 873991,
				243344, 1681036, 151701, 630647, 17564, 16920, 16446, 28651));
		saveLead(new EmpresasCNAE("2562", "2562 Ingenier¡a mec nica por cuenta de terceros", 5068, 4570948, 4507140,
				2033922, 465338, 2621250, 268945, 1568585, 41931, 38997, 37800, 65821));
		saveLead(new EmpresasCNAE("2571", "2571 Fabricaci¢n de art¡culos de cuchiller¡a y cuberter¡a", 104, 130914,
				121396, 51440, 12119, 78708, 2715, 39321, 1180, 1155, 1107, 1929));
		saveLead(new EmpresasCNAE("2572", "2572 Fabricaci¢n de cerraduras y herrajes", 1416, 970169, 920092, 368809,
				118614, 628522, 23231, 250196, 7147, 6253, 5947, 10361));
		saveLead(new EmpresasCNAE("2573", "2573 Fabricaci¢n de herramientas", 936, 1426799, 1325736, 503022, 88735,
				858242, 67816, 414287, 10751, 10372, 9948, 17334));
		saveLead(new EmpresasCNAE("2591", "2591 Fabricaci¢n de bidones y toneles de hierro o acero", 25, 209018, 197087,
				55374, 20654, 153206, 3567, 34721, 833, 832, 816, 1421));
		saveLead(new EmpresasCNAE("2592", "2592 Fabricaci¢n de envases y embalajes met licos ligeros", 171, 2382191,
				2329906, 615573, 243850, 1779690, 136096, 371723, 8839, 8769, 8543, 14882));
		saveLead(new EmpresasCNAE("2593", "2593 Fabricaci¢n de productos de alambre, cadenas y muelles", 324, 926186,
				1001843, 264885, 74435, 729886, 23585, 190451, 4671, 4537, 4406, 7653));
		saveLead(new EmpresasCNAE("2594", "2594 Fabricaci¢n de pernos y productos de torniller¡a", 349, 634531, 624822,
				219985, 71041, 409642, 34413, 148943, 3725, 3582, 3428, 5979));
		saveLead(new EmpresasCNAE("2599", "2599 Fabricaci¢n de otros productos met licos ncop", 1967, 2268194, 2205643,
				776313, 213900, 1521166, 91892, 562413, 16586, 15513, 14857, 25883));
		saveLead(new EmpresasCNAE("2611", "2611 Fabricaci¢n de componentes electr¢nicos", 377, 1379369, 1393717, 402180,
				119756, 1007293, 26633, 282424, 7119, 6964, 6702, 11752));
		saveLead(new EmpresasCNAE("2612", "2612 Fabricaci¢n de circuitos impresos ensamblados", 229, 542957, 536052,
				172513, 40990, 373955, 31765, 131522, 3345, 3241, 3163, 5549));
		saveLead(new EmpresasCNAE("2620", "2620 Fabricaci¢n de ordenadores y equipos perif‚ricos", 493, 126436, 126277,
				45840, 18500, 81731, 3920, 27340, 1172, 768, 710, 1245));
		saveLead(new EmpresasCNAE("2630", "2630 Fabricaci¢n de equipos de telecomunicaciones", 161, 820349, 839010,
				310369, 76408, 552158, 13218, 233961, 5968, 5892, 5713, 10021));
		saveLead(new EmpresasCNAE("2640", "2640 Fabricaci¢n de productos electr¢nicos de consumo", 100, 353758, 348201,
				76770, 28766, 276286, 6946, 48004, 1290, 1251, 1206, 2114));
		saveLead(new EmpresasCNAE("2651",
				"2651 Fabricaci¢n de instrumentos y aparatos de medida, verificaci¢n y navegaci¢n", 568, 1508744,
				1417976, 545711, 183972, 1022901, 46343, 361739, 8435, 8188, 7961, 13963));
		saveLead(new EmpresasCNAE("2652", "2652 Fabricaci¢n de relojes", 73, 21470, 22505, 11662, 3401, 10777, 211,
				8261, 238, 172, 168, 294));
		saveLead(new EmpresasCNAE("2660",
				"2660 Fabricaci¢n de equipos de radiaci¢n, electrom‚dicos y electroterap‚uticos", 121, 378053, 377441,
				148019, 38083, 259451, 8309, 109935, 2296, 2237, 2146, 3763));
		saveLead(new EmpresasCNAE("2711", "2711 Fabricaci¢n de motores, generadores y transformadores el‚ctricos", 431,
				5844123, 6060378, 1244624, 273140, 4930951, 115749, 971483, 20070, 19832, 19572, 33609));
		saveLead(new EmpresasCNAE("2712", "2712 Fabricaci¢n de aparatos de distribuci¢n y control el‚ctrico", 190,
				2311499, 1851847, 623898, 148668, 1806129, 93988, 475230, 10179, 10139, 9942, 17092));
		saveLead(new EmpresasCNAE("2720", "2720 Fabricaci¢n de pilas y acumuladores el‚ctricos", 25, 1084438, 1007736,
				150735, 37399, 943543, 15984, 113336, 2302, 2287, 2192, 3758));
		saveLead(new EmpresasCNAE("2731", "2731 Fabricaci¢n de cables de fibra ¢ptica", 9, 81438, 86404, 27069, 8460,
				60871, 7095, 18608, 460, 458, 455, 782));
		saveLead(new EmpresasCNAE("2732", "2732 Fabricaci¢n de otros hilos y cables electr¢nicos y el‚ctricos", 130,
				2439869, 2358707, 358828, 93353, 2105434, 47158, 265475, 5156, 5096, 5024, 8626));
		saveLead(new EmpresasCNAE("2733", "2733 Fabricaci¢n de dispositivos de cableado", 31, 314093, 307517, 105281,
				22041, 213403, 15348, 83240, 1445, 1433, 1408, 2418));
		saveLead(new EmpresasCNAE("2740", "2740 Fabricaci¢n de l mparas y aparatos el‚ctricos de iluminaci¢n", 483,
				2353867, 2331564, 664298, 246456, 1743434, 72210, 417843, 10371, 10111, 9854, 16949));
		saveLead(new EmpresasCNAE("2751", "2751 Fabricaci¢n de electrodom‚sticos", 112, 2327441, 1815203, 522422,
				186038, 1814276, 54309, 336384, 8067, 7987, 7701, 13220));
		saveLead(new EmpresasCNAE("2752", "2752 Fabricaci¢n de aparatos dom‚sticos no el‚ctricos", 69, 263057, 257379,
				94960, 35968, 170690, 11633, 58992, 1432, 1403, 1376, 2362));
		saveLead(new EmpresasCNAE("2790", "2790 Fabricaci¢n de otro material y equipo el‚ctrico", 355, 1688853, 1616013,
				653625, 190257, 1149479, 49077, 463368, 13075, 12347, 11971, 20560));
		saveLead(new EmpresasCNAE("2811",
				"2811 Fabricaci¢n de motores y turbinas, excepto los destinados a aeronaves, veh¡culos autom¢viles y ciclomotores",
				68, 1713472, 1737898, 291643, 111572, 1489122, 65778, 180070, 3608, 3592, 3540, 6218));
		saveLead(new EmpresasCNAE("2812", "2812 Fabricaci¢n de equipos de transmisi¢n hidr ulica y neum tica", 100,
				614884, 599090, 198318, 74807, 440566, 23157, 123511, 2822, 2800, 2733, 4803));
		saveLead(new EmpresasCNAE("2813", "2813 Fabricaci¢n de otras bombas y compresores", 117, 736811, 716334, 199239,
				44707, 546291, 20151, 154532, 3572, 3538, 3460, 6079));
		saveLead(new EmpresasCNAE("2814", "2814 Fabricaci¢n de otra grifer¡a y v lvulas", 82, 753484, 698234, 207958,
				70015, 569266, 20621, 137944, 3072, 3049, 2972, 5233));
		saveLead(
				new EmpresasCNAE("2815", "2815 Fabricaci¢n de cojinetes, engranajes y ¢rganos mec nicos de transmisi¢n",
						157, 839242, 759824, 250191, 78655, 601272, 43568, 171537, 3802, 3756, 3641, 6403));
		saveLead(new EmpresasCNAE("2821", "2821 Fabricaci¢n de hornos y quemadores", 71, 151767, 151135, 48892, 10904,
				105231, 2532, 37988, 940, 908, 874, 1536));
		saveLead(new EmpresasCNAE("2822", "2822 Fabricaci¢n de maquinaria de elevaci¢n y manipulaci¢n", 417, 4430189,
				4469355, 1686551, 528501, 2865058, 56286, 1158051, 25035, 24939, 24486, 43057));
		saveLead(new EmpresasCNAE("2823",
				"2823 Fabricaci¢n de m quinas y equipos de oficina, excepto equipos inform ticos", 22, 10283, 10407,
				3612, 496, 7332, 67, 3116, 98, 94, 88, 155));
		saveLead(new EmpresasCNAE("2824", "2824 Fabricaci¢n de herramientas el‚ctricas manuales", 26, 37704, 38116,
				13061, 3756, 25867, 453, 9305, 227, 217, 209, 367));
		saveLead(new EmpresasCNAE("2825", "2825 Fabricaci¢n de maquinaria de ventilaci¢n y refrigeraci¢n no dom‚stica",
				332, 2210704, 2209813, 641462, 180191, 1622621, 60182, 461271, 11805, 11632, 11457, 20144));
		saveLead(new EmpresasCNAE("2829", "2829 Fabricaci¢n de otra maquinaria de uso general ncop", 906, 1959267,
				1923113, 675711, 163087, 1325300, 44017, 512624, 12500, 12310, 11985, 21074));
		saveLead(new EmpresasCNAE("2830", "2830 Fabricaci¢n de maquinaria agraria y forestal", 643, 1745768, 1454488,
				506685, 176936, 1303269, 51289, 329749, 8796, 8530, 8245, 14500));
		saveLead(new EmpresasCNAE("2841", "2841 Fabricaci¢n de m quinas herramienta para trabajar el metal", 268,
				1503768, 1528148, 454620, 119431, 1112704, 35694, 335188, 7037, 6959, 6748, 11856));
		saveLead(new EmpresasCNAE("2849", "2849 Fabricaci¢n de otras m quinas herramienta", 197, 367668, 369050, 146077,
				50956, 228956, 13920, 95121, 2420, 2359, 2291, 4026));
		saveLead(new EmpresasCNAE("2891", "2891 Fabricaci¢n de maquinaria para la industria metal£rgica", 233, 540285,
				531444, 179787, 47684, 366753, 12715, 132104, 3036, 2976, 2881, 5067));
		saveLead(new EmpresasCNAE("2892",
				"2892 Fabricaci¢n de maquinaria para las industrias extractivas y de la construcci¢n", 215, 532344,
				510555, 166330, 36543, 379492, 15019, 129787, 3320, 3266, 3190, 5610));
		saveLead(new EmpresasCNAE("2893",
				"2893 Fabricaci¢n de maquinaria para la industria de la alimentaci¢n, bebidas y tabaco", 634, 1879570,
				1824105, 666488, 211019, 1272530, 48666, 455469, 10550, 10376, 10110, 17778));
		saveLead(new EmpresasCNAE("2894",
				"2894 Fabricaci¢n de maquinaria para las industrias textil, de la confecci¢n y del cuero", 168, 310378,
				299088, 113650, 27533, 209343, 12084, 86117, 2046, 1963, 1907, 3354));
		saveLead(new EmpresasCNAE("2895", "2895 Fabricaci¢n de maquinaria para la industria del papel y del cart¢n", 81,
				345146, 348180, 113965, 27251, 248990, 11762, 86714, 1755, 1717, 1678, 2949));
		saveLead(new EmpresasCNAE("2896", "2896 Fabricaci¢n de maquinaria para la industria del pl stico y el caucho",
				162, 217794, 212654, 98798, 26481, 123264, 10749, 72317, 1823, 1783, 1733, 3050));
		saveLead(new EmpresasCNAE("2899", "2899 Fabricaci¢n de otra maquinaria para usos espec¡ficos ncop", 634,
				1662656, 1636553, 573305, 147675, 1113436, 37053, 425630, 9747, 9572, 9280, 16317));
		saveLead(new EmpresasCNAE("2910", "2910 Fabricaci¢n de veh¡culos de motor", 112, 52335161, 45398025, 6370508,
				2612125, 47495138, 2166935, 3758383, 71858, 71793, 68833, 114695));
		saveLead(new EmpresasCNAE("2920",
				"2920 Fabricaci¢n de carrocer¡as para veh¡culos de motor,  fabricaci¢n de remolques y semirremolques",
				685, 2224864, 2098492, 551243, 180993, 1728978, 34672, 370250, 11042, 10769, 10448, 17414));
		saveLead(new EmpresasCNAE("2931",
				"2931 Fabricaci¢n de equipos el‚ctricos y electr¢nicos para veh¡culos de motor", 44, 3115700, 3184851,
				786612, 337310, 2452498, 105129, 449302, 9310, 9297, 9072, 15115));
		saveLead(new EmpresasCNAE("2932",
				"2932 Fabricaci¢n de otros componentes, piezas y accesorios para veh¡culos de motor", 750, 17897074,
				17797340, 4057180, 1292058, 14158861, 633765, 2765122, 68081, 67793, 66439, 110709));
		saveLead(new EmpresasCNAE("3011", "3011 Construcci¢n de barcos y estructuras flotantes", 383, 2366590, 2385019,
				327948, -124792, 2037511, 58352, 452740, 8609, 8507, 8367, 13759));
		saveLead(new EmpresasCNAE("3012", "3012 Construcci¢n de embarcaciones de recreo y deporte", 75, 61200, 57015,
				18731, 2202, 53680, 1190, 16529, 570, 534, 516, 851));
		saveLead(new EmpresasCNAE("3020", "3020 Fabricaci¢n de locomotoras y material ferroviario", 64, 3195527,
				3340998, 1045818, 311904, 2398583, 57054, 733914, 12004, 11983, 11750, 19315));
		saveLead(new EmpresasCNAE("3030", "3030 Construcci¢n aeron utica y espacial y su maquinaria", 99, 10964487,
				10490445, 2952621, 1401179, 7582548, 196066, 1551442, 25325, 25292, 24642, 40495));
		saveLead(new EmpresasCNAE("3091", "3091 Fabricaci¢n de motocicletas", 92, 137032, 143914, 32593, 3642, 106691,
				5486, 28951, 730, 707, 686, 1128));
		saveLead(
				new EmpresasCNAE("3092", "3092 Fabricaci¢n de bicicletas y de veh¡culos para personas con discapacidad",
						51, 296235, 292066, 58092, 27773, 249183, 7386, 30319, 788, 770, 743, 1221));
		saveLead(new EmpresasCNAE("3101", "3101 Fabricaci¢n de muebles de oficina y de establecimientos comerciales",
				625, 1472625, 1412163, 471929, 134538, 1025406, 34398, 337391, 10038, 9611, 9389, 16591));
		saveLead(new EmpresasCNAE("3102", "3102 Fabricaci¢n de muebles de cocina", 1838, 760937, 727352, 262334, 83074,
				504802, 20734, 179260, 7898, 6551, 6250, 11042));
		saveLead(new EmpresasCNAE("3103", "3103 Fabricaci¢n de colchones", 146, 726629, 721243, 198134, 46644, 543155,
				13639, 151490, 4909, 4848, 4668, 8248));
		saveLead(new EmpresasCNAE("3109", "3109 Fabricaci¢n de otros muebles", 8442, 3375842, 3310137, 1181484, 307506,
				2240469, 78855, 873978, 37692, 31614, 29578, 52264));
		saveLead(new EmpresasCNAE("3212", "3212 Fabricaci¢n de art¡culos de joyer¡a y art¡culos similares", 1672,
				694744, 679439, 152604, 45191, 537229, 6153, 107413, 4895, 3424, 3076, 5426));
		saveLead(new EmpresasCNAE("3220", "3220 Fabricaci¢n de instrumentos musicales", 283, 48566, 48335, 21356, 5134,
				28516, 768, 16221, 817, 563, 523, 922));
		saveLead(new EmpresasCNAE("3230", "3230 Fabricaci¢n de art¡culos de deporte", 266, 275628, 265127, 74821, 22076,
				206778, 5483, 52745, 1843, 1619, 1555, 2747));
		saveLead(new EmpresasCNAE("3240", "3240 Fabricaci¢n de juegos y juguetes", 404, 592376, 550615, 189790, 73692,
				424915, 15461, 116099, 3490, 3159, 3017, 5323));
		saveLead(new EmpresasCNAE("3250", "3250 Fabricaci¢n de instrumentos y suministros m‚dicos y odontol¢gicos",
				5184, 2117098, 1956433, 910601, 294842, 1280584, 315011, 615759, 22588, 18137, 17107, 30177));
		saveLead(new EmpresasCNAE("3291", "3291 Fabricaci¢n de escobas, brochas y cepillos", 42, 144974, 125818, 45642,
				14012, 99165, 5961, 31630, 893, 883, 863, 1522));
		saveLead(new EmpresasCNAE("3299", "3299 Otras industrias manufactureras ncop", 1531, 714046, 704164, 265892,
				82136, 475124, 23195, 183756, 7232, 5885, 5645, 9959));
		saveLead(new EmpresasCNAE("3311", "3311 Reparaci¢n de productos met licos", 239, 233407, 229581, 118306, 12807,
				116712, 5532, 105499, 2878, 2775, 2709, 4844));
		saveLead(new EmpresasCNAE("3312", "3312 Reparaci¢n de maquinaria", 9474, 4534580, 4406219, 1915970, 428376,
				2663388, 83814, 1487594, 46866, 39856, 38364, 68608));
		saveLead(new EmpresasCNAE("3313", "3313 Reparaci¢n de equipos electr¢nicos y ¢pticos", 272, 206516, 205781,
				101303, 15332, 107593, 3291, 85971, 2373, 2250, 2161, 3865));
		saveLead(new EmpresasCNAE("3314", "3314 Reparaci¢n de equipos el‚ctricos", 383, 517682, 511270, 241519, 53401,
				280547, 10050, 188118, 4643, 4489, 4339, 7759));
		saveLead(new EmpresasCNAE("3315", "3315 Reparaci¢n y mantenimiento naval", 2382, 1357581, 1356725, 604011,
				137933, 787877, 70284, 466077, 13936, 12290, 11942, 21354));
		saveLead(new EmpresasCNAE("3316", "3316 Reparaci¢n y mantenimiento aeron utico y espacial", 283, 569936, 581596,
				203053, 46392, 382194, 24467, 156661, 3990, 3789, 3728, 6667));
		saveLead(new EmpresasCNAE("3317", "3317 Reparaci¢n y mantenimiento de otro material de transporte", 216,
				1103263, 1123060, 374238, 51236, 771857, 16985, 323003, 7212, 7069, 6938, 12405));
		saveLead(new EmpresasCNAE("3319", "3319 Reparaci¢n de otros equipos", 324, 128271, 126005, 59858, 14700, 69837,
				7771, 45158, 1590, 1390, 1318, 2357));
		saveLead(new EmpresasCNAE("3320", "3320 Instalaci¢n de m quinas y equipos industriales", 849, 1692570, 1711961,
				760363, 82828, 969180, 17785, 677535, 16041, 15676, 15258, 27288));
		saveLead(new EmpresasCNAE("3512", "3512 Transporte de energ¡a el‚ctrica", 18, 1836715, 1895309, 1687174,
				1540102, 220256, 405054, 147072, 1755, 1749, 1737, 2933));
		saveLead(new EmpresasCNAE("3513", "3513 Distribuci¢n de energ¡a el‚ctrica", 303, 6787546, 6992237, 5855959,
				4992489, 1439720, 1566443, 863471, 10225, 10126, 9968, 16847));
		saveLead(new EmpresasCNAE("3514", "3514 Comercio de energ¡a el‚ctrica", 274, 45161194, 17713385, 3155677,
				2801525, 41809078, 60568, 354153, 5912, 5806, 5567, 9390));
		saveLead(new EmpresasCNAE("3516", "3516 Producci¢n de energ¡a el‚ctrica de origen t‚rmico convencional", 161,
				9310449, 9370421, 1959826, 1524577, 6881181, 514320, 435249, 5053, 4973, 4932, 8320));
		saveLead(new EmpresasCNAE("3518", "3518 Producci¢n de energ¡a el‚ctrica de origen e¢lico", 8913, 4389048,
				4651617, 2997011, 2840900, 1351046, 764278, 156111, 6546, 2166, 2130, 3589));
		saveLead(new EmpresasCNAE("3519", "3519 Producci¢n de energ¡a el‚ctrica de otros tipos", 4753, 7253465, 7426522,
				2685902, 2330660, 4564398, 497400, 355242, 7536, 5082, 4896, 8268));
		saveLead(new EmpresasCNAE("3521", "3521 Producci¢n de gas", 8, 83790, 84380, 68303, 61825, 12844, 1491, 6478,
				131, 125, 110, 185));
		saveLead(new EmpresasCNAE("3522", "3522 Distribuci¢n por tuber¡a de combustibles gaseosos", 30, 1849797,
				2055407, 1645112, 1439654, 423156, 276255, 205458, 2402, 2391, 2371, 4011));
		saveLead(new EmpresasCNAE("3523", "3523 Comercio de gas por tuber¡a", 18, 14316057, 4018082, 748872, 465642,
				13917678, 54260, 283230, 2345, 2331, 2318, 3909));
		saveLead(new EmpresasCNAE("3530", "3530 Suministro de vapor y aire acondicionado", 213, 162482, 157138, 61539,
				25960, 106546, 15073, 35579, 1492, 1359, 1234, 2081));
		saveLead(new EmpresasCNAE("3600", "3600 Captaci¢n, depuraci¢n y distribuci¢n de agua", 2656, 9601149, 9771587,
				4796954, 2694880, 5553717, 396564, 2102074, 48802, 48012, 45635, 76759));
		saveLead(new EmpresasCNAE("3700", "3700 Recogida y tratamiento de aguas residuales", 584, 751862, 769459,
				391381, 163873, 415144, 44640, 227507, 6468, 6218, 5886, 10392));
		saveLead(new EmpresasCNAE("3811", "3811 Recogida de residuos no peligrosos", 1676, 4911915, 5020825, 3364133,
				658918, 1850970, 313042, 2705215, 80990, 80170, 72863, 120651));
		saveLead(new EmpresasCNAE("3812", "3812 Recogida de residuos peligrosos", 75, 138680, 137147, 59623, 18891,
				80107, 4378, 40732, 1379, 1357, 1288, 2133));
		saveLead(new EmpresasCNAE("3821", "3821 Tratamiento y eliminaci¢n de residuos no peligrosos", 426, 3497105,
				3593763, 1845241, 733500, 1781981, 252620, 1111741, 31314, 31157, 29303, 48538));
		saveLead(new EmpresasCNAE("3822", "3822 Tratamiento y eliminaci¢n de residuos peligrosos", 63, 648140, 656629,
				473353, 388792, 181181, 48777, 84561, 1692, 1683, 1656, 2741));
		saveLead(new EmpresasCNAE("3831", "3831 Separaci¢n y clasificaci¢n de materiales", 168, 763261, 764133, 130529,
				59334, 634113, 58497, 71195, 2189, 2124, 2054, 3405));
		saveLead(new EmpresasCNAE("3832", "3832 Valorizaci¢n de materiales ya clasificados", 315, 2484249, 2481321,
				390531, 132735, 2105406, 89589, 257797, 7756, 7643, 7413, 12294));
		saveLead(new EmpresasCNAE("3900",
				"3900 Actividades de descontaminaci¢n y otros servicios de gesti¢n de residuos", 345, 173071, 172670,
				66799, 22984, 107544, 5126, 43815, 1668, 1441, 1331, 2308));
		saveLead(new EmpresasCNAE("4500", "4500G TOTAL SECTOR COMERCIO", 739923, 782063594, 210339158, 116891940,
				40175012, 680757799, 11053380, 76716928, 3221353, 2611706, 2350181, 4222861));
		saveLead(new EmpresasCNAE("4511", "4511 Venta de autom¢viles y veh¡culos de motor ligeros", 14325, 65887165,
				11105626, 5529053, 2105966, 63643136, 802280, 3423087, 101259, 91780, 87556, 157918));
		saveLead(new EmpresasCNAE("4519", "4519 Venta de otros veh¡culos de motor", 567, 3224017, 809071, 429424,
				134572, 2870881, 45771, 294853, 7463, 7216, 6987, 12598));
		saveLead(new EmpresasCNAE("4520", "4520 Mantenimiento y reparaci¢n de veh¡culos de motor", 49873, 10823427,
				10366317, 3715814, 839513, 7331316, 212957, 2876301, 148857, 107047, 95642, 171273));
		saveLead(new EmpresasCNAE("4531", "4531 Comercio al por mayor de repuestos y accesorios de veh¡culos de motor",
				2318, 9285883, 2682522, 1602412, 468158, 7871728, 103595, 1134254, 32372, 31285, 30516, 55081));
		saveLead(new EmpresasCNAE("4532", "4532 Comercio al por menor de repuestos y accesorios de veh¡culos de motor",
				6073, 2590448, 978881, 624714, 133644, 2040095, 34792, 491071, 22675, 18444, 16895, 30275));
		saveLead(new EmpresasCNAE("4540",
				"4540 Venta, mantenimiento y reparaci¢n de motocicletas y de sus repuestos y accesorios", 4205, 2293272,
				698496, 326430, 101544, 2007260, 21524, 224887, 11168, 7787, 7053, 12588));
		saveLead(new EmpresasCNAE("4611",
				"4611 Intermediarios del comercio de materias primas agrarias, animales vivos, materias primas textiles y productos semielaborados",
				2855, 154352, 148463, 94405, 71808, 66696, 4268, 22597, 3112, 620, 560, 935));
		saveLead(new EmpresasCNAE("4612",
				"4612 Intermediarios del comercio de combustibles, minerales, metales y productos qu¡micos industriales",
				4886, 367437, 368623, 255014, 153375, 131517, 6712, 101639, 6481, 2402, 2189, 3854));
		saveLead(new EmpresasCNAE("4613", "4613 Intermediarios del comercio de la madera y materiales de construcci¢n",
				6302, 323349, 313856, 201847, 153752, 131382, 10212, 48095, 6633, 1250, 1138, 1925));
		saveLead(new EmpresasCNAE("4614",
				"4614 Intermediarios del comercio de maquinaria, equipo industrial, embarcaciones y aeronaves", 5928,
				635888, 634340, 404552, 175304, 266614, 12453, 229248, 8234, 3136, 3020, 5368));
		saveLead(new EmpresasCNAE("4615",
				"4615 Intermediarios del comercio de muebles, art¡culos para el hogar y ferreter¡a", 10614, 708003,
				672631, 326428, 230361, 394895, 16569, 96067, 12153, 2791, 2516, 4179));
		saveLead(new EmpresasCNAE("4616",
				"4616 Intermediarios del comercio de textiles, prendas de vestir, peleter¡a, calzado y art¡culos de cuero",
				4702, 531727, 522051, 303885, 166834, 244882, 16156, 137051, 7851, 3452, 3019, 5263));
		saveLead(
				new EmpresasCNAE("4617", "4617 Intermediarios del comercio de productos alimenticios, bebidas y tabaco",
						10256, 1172606, 1162607, 584292, 336702, 630058, 26474, 247590, 15000, 6238, 5773, 10184));
		saveLead(new EmpresasCNAE("4618",
				"4618 Intermediarios del comercio especializados en la venta de otros productos espec¡ficos", 7670,
				1890564, 1747110, 908253, 348420, 1213033, 23798, 559834, 15130, 9380, 8682, 15196));
		saveLead(new EmpresasCNAE("4619", "4619 Intermediarios del comercio de productos diversos", 12650, 1573928,
				1481960, 724014, 338976, 911278, 26065, 385038, 20982, 10599, 9453, 16700));
		saveLead(new EmpresasCNAE("4621",
				"4621 Comercio al por mayor de cereales, tabaco en rama, simientes y alimentos para animales", 5216,
				18686626, 2291883, 1095016, 464531, 17779502, 238580, 630485, 22797, 20048, 18936, 33617));
		saveLead(new EmpresasCNAE("4622", "4622 Comercio al por mayor de flores y plantas", 1229, 965198, 351768,
				192728, 41074, 784976, 10608, 151654, 7671, 6781, 6457, 11583));
		saveLead(new EmpresasCNAE("4623", "4623 Comercio al por mayor de animales vivos", 2427, 4012187, 555701, 226471,
				131240, 3830524, 35732, 95232, 4758, 2886, 2696, 4725));
		saveLead(new EmpresasCNAE("4624", "4624 Comercio al por mayor de cueros y pieles", 578, 968627, 193439, 98265,
				35150, 864325, 11444, 63115, 2141, 1871, 1763, 3109));
		saveLead(new EmpresasCNAE("4631", "4631 Comercio al por mayor de frutas y hortalizas", 9701, 42345356, 10572366,
				5022840, 1425266, 37877792, 606703, 3597574, 172759, 166529, 164132, 295404));
		saveLead(new EmpresasCNAE("4632", "4632 Comercio al por mayor de carne y productos c rnicos", 4509, 9885347,
				1891538, 909735, 264583, 9014778, 135114, 645153, 26313, 23370, 21867, 39084));
		saveLead(new EmpresasCNAE("4633",
				"4633 Comercio al por mayor de productos l cteos, huevos, aceites y grasas comestibles", 2278, 11056521,
				1942317, 640588, 284489, 10569750, 105847, 356098, 12547, 10719, 10195, 18334));
		saveLead(new EmpresasCNAE("4634", "4634 Comercio al por mayor de bebidas", 6911, 15978967, 4345726, 1920670,
				764736, 14494898, 113578, 1155934, 38095, 33486, 31855, 57199));
		saveLead(new EmpresasCNAE("4635", "4635 Comercio al por mayor de productos del tabaco", 60, 3499725, 631392,
				380230, 207917, 3186669, 6804, 172313, 2656, 2625, 2596, 4673));
		saveLead(new EmpresasCNAE("4636", "4636 Comercio al por mayor de az£car, chocolate y confiter¡a", 1684, 3176837,
				833411, 404647, 115641, 2811026, 27110, 289006, 9769, 8583, 8162, 14764));
		saveLead(new EmpresasCNAE("4637", "4637 Comercio al por mayor de caf‚, t‚, cacao y especias", 521, 926655,
				292349, 179681, 75728, 765388, 19334, 103953, 3322, 3015, 2877, 5145));
		saveLead(new EmpresasCNAE("4638",
				"4638 Comercio al por mayor de pescados y mariscos y otros productos alimenticios", 7979, 23135784,
				4555394, 2234979, 770973, 21234852, 191342, 1464006, 47432, 42041, 39858, 71602));
		saveLead(new EmpresasCNAE("4639",
				"4639 Comercio al por mayor, no especializado, de productos alimenticios, bebidas y tabaco", 8782,
				25472481, 4495117, 2429026, 671622, 23405081, 240609, 1757404, 64364, 58447, 55331, 99728));
		saveLead(new EmpresasCNAE("4641", "4641 Comercio al por mayor de textiles", 3034, 2483726, 751211, 398972,
				111660, 2122806, 25161, 287311, 10876, 9354, 8524, 15422));
		saveLead(new EmpresasCNAE("4642", "4642 Comercio al por mayor de prendas de vestir y calzado", 7012, 23258509,
				7697485, 2676605, 1023190, 21031318, 292240, 1653415, 47768, 43606, 38508, 69160));
		saveLead(new EmpresasCNAE("4643", "4643 Comercio al por mayor de aparatos electrodom‚sticos", 4367, 10051738,
				2184486, 971473, 315768, 9295089, 58783, 655705, 18890, 16321, 15496, 27882));
		saveLead(
				new EmpresasCNAE("4644", "4644 Comercio al por mayor de porcelana, cristaler¡a y art¡culos de limpieza",
						2741, 3734746, 1217996, 703643, 299649, 3085399, 43014, 403995, 12897, 11390, 10767, 19021));
		saveLead(new EmpresasCNAE("4645", "4645 Comercio al por mayor de productos perfumer¡a y cosm‚tica", 4067,
				7949240, 3332840, 1587689, 662548, 6561324, 78254, 925141, 27315, 24807, 22695, 40741));
		saveLead(new EmpresasCNAE("4646", "4646 Comercio al por mayor de productos farmac‚uticos", 4017, 44974420,
				11126287, 6398688, 1982251, 39891081, 368664, 4416437, 68101, 65667, 62858, 113491));
		saveLead(new EmpresasCNAE("4647", "4647 Comercio al por mayor de muebles, alfombras y aparatos de iluminaci¢n",
				2851, 2557898, 1006645, 521328, 177895, 2079334, 45639, 343433, 12289, 10897, 10299, 18339));
		saveLead(new EmpresasCNAE("4648", "4648 Comercio al por mayor de art¡culos de relojer¡a y joyer¡a", 1821,
				1713959, 616349, 324505, 130864, 1421614, 16178, 193641, 7336, 6060, 5053, 8997));
		saveLead(new EmpresasCNAE("4649", "4649 Comercio al por mayor de otros art¡culos de uso dom‚stico", 7861,
				10416667, 3161126, 1601213, 460071, 9025283, 149437, 1141142, 38347, 33616, 31281, 56229));
		saveLead(new EmpresasCNAE("4651",
				"4651 Comercio al por mayor de ordenadores, equipos perif‚ricos y programas inform ticos", 2597,
				14815848, 2925512, 1857795, 438981, 13430424, 74603, 1418814, 29503, 28195, 27011, 48176));
		saveLead(new EmpresasCNAE("4652",
				"4652 Comercio al por mayor de equipos electr¢nicos y de telecomunicaciones y sus componentes", 2873,
				12514313, 3255204, 2160773, 558915, 10480384, 218265, 1601859, 34441, 33360, 32336, 58220));
		saveLead(new EmpresasCNAE("4661", "4661 Comercio al por mayor de maquinaria, equipos y suministros agr¡colas",
				2109, 4767996, 1210137, 772498, 264649, 4147369, 87857, 507849, 15852, 14804, 14250, 25620));
		saveLead(new EmpresasCNAE("4662", "4662 Comercio al por mayor de m quinas herramienta", 2260, 4143191, 1353090,
				871810, 269402, 3312936, 55061, 602408, 13904, 12516, 12085, 21736));
		saveLead(new EmpresasCNAE("4663",
				"4663 Comercio al por mayor de maquinaria para la miner¡a, la construcci¢n y la ingenier¡a civil", 1014,
				2611897, 883459, 543524, 188655, 2188365, 82070, 354870, 8220, 7579, 7398, 13287));
		saveLead(new EmpresasCNAE("4664",
				"4664 Comercio al por mayor de maquinaria para la industria textil y de m quinas de coser y tricotar",
				312, 326189, 133789, 88784, 50013, 235892, 2606, 38771, 1223, 1045, 987, 1762));
		saveLead(new EmpresasCNAE("4665", "4665 Comercio al por mayor de muebles de oficina", 360, 444178, 154615,
				94055, 29077, 353392, 6526, 64978, 1996, 1790, 1700, 3047));
		saveLead(new EmpresasCNAE("4666", "4666 Comercio al por mayor de otra maquinaria y equipo de oficina", 1140,
				1651967, 665796, 460864, 104625, 1221551, 13993, 356238, 9634, 8797, 8476, 15310));
		saveLead(new EmpresasCNAE("4669", "4669 Comercio al por mayor de otra maquinaria y equipo", 10552, 20532982,
				6425634, 4084717, 1362231, 16864599, 246812, 2722487, 66127, 61589, 59323, 106913));
		saveLead(new EmpresasCNAE("4671",
				"4671 Comercio al por mayor de combustibles s¢lidos, l¡quidos y gaseosos, y productos similares", 1377,
				36763704, 2738758, 1149567, 792656, 35693722, 178519, 356911, 9614, 8805, 8365, 15056));
		saveLead(new EmpresasCNAE("4672", "4672 Comercio al por mayor de metales y minerales met licos", 1855, 12452652,
				1865304, 911126, 283131, 11537639, 96287, 627995, 17138, 16485, 16026, 28857));
		saveLead(new EmpresasCNAE("4673",
				"4673 Comercio al por mayor de madera, materiales de construcci¢n y aparatos sanitarios", 13564,
				18589171, 5199907, 3040754, 995265, 15889625, 334766, 2045490, 71936, 64094, 61247, 109485));
		saveLead(new EmpresasCNAE("4674", "4674 Comercio al por mayor de ferreter¡a, fontaner¡a y calefacci¢n", 5247,
				9795953, 3008859, 1917636, 591505, 7993638, 103762, 1326131, 39491, 36579, 35289, 63567));
		saveLead(new EmpresasCNAE("4675", "4675 Comercio al por mayor de productos qu¡micos", 4211, 16705325, 3801852,
				2160710, 892737, 14740529, 172984, 1267973, 28915, 26707, 25771, 46172));
		saveLead(new EmpresasCNAE("4676", "4676 Comercio al por mayor de otros productos semielaborados", 853, 3015779,
				696809, 398218, 159433, 2611844, 32273, 238785, 5982, 5610, 5434, 9779));
		saveLead(new EmpresasCNAE("4677", "4677 Comercio al por mayor de chatarra y productos de desecho", 4690,
				7172277, 1787290, 924075, 296570, 6318175, 149178, 627505, 23677, 21084, 20080, 36069));
		saveLead(new EmpresasCNAE("4690", "4690 Comercio al por mayor no especializado", 4672, 1514128, 463318, 246891,
				85480, 1322097, 12717, 161411, 9498, 5529, 5016, 8883));
		saveLead(new EmpresasCNAE("4711",
				"4711 Comercio al por menor en establecimientos no especializados, con predominio en productos alimenticios, bebidas y tabaco",
				39980, 81046810, 21585851, 14127244, 4072890, 68956356, 2599408, 10054354, 454104, 415068, 368854,
				665055));
		saveLead(new EmpresasCNAE("4719", "4719 Otro comercio al por menor en establecimientos no especializados", 9277,
				15115870, 5503210, 3557795, 1036415, 11972178, 266830, 2521380, 104354, 94721, 79271, 143415));
		saveLead(new EmpresasCNAE("4721",
				"4721 Comercio al por menor de frutas y hortalizas en establecimientos especializados", 14687, 2473117,
				714198, 508292, 176393, 1968975, 21737, 331899, 33239, 18399, 15721, 28183));
		saveLead(new EmpresasCNAE("4722",
				"4722 Comercio al por menor de carne y productos c rnicos en establecimientos especializados", 22890,
				4372599, 1483974, 1058554, 376589, 3334315, 28027, 681965, 58108, 34531, 30281, 54546));
		saveLead(new EmpresasCNAE("4723",
				"4723 Comercio al por menor de pescados y mariscos en establecimientos especializados", 9286, 1654099,
				435244, 327613, 157533, 1328495, 11436, 170079, 18932, 9229, 7598, 13733));
		saveLead(new EmpresasCNAE("4724",
				"4724 Comercio al por menor de pan y productos de panader¡a, confiter¡a y pasteler¡a en establecimientos especializados",
				21817, 3042348, 1656366, 1107817, 273982, 1951803, 50873, 833835, 67789, 47084, 38956, 70177));
		saveLead(new EmpresasCNAE("4725", "4725 Comercio al por menor de bebidas en establecimientos especializados",
				2237, 430522, 115022, 66501, 21711, 367085, 5041, 44790, 4339, 2230, 1884, 3362));
		saveLead(new EmpresasCNAE("4726",
				"4726 Comercio al por menor de productos de tabaco en establecimientos especializados", 9037, 7914500,
				875270, 708161, 474760, 7207431, 11580, 233401, 21250, 12233, 10123, 18329));
		saveLead(new EmpresasCNAE("4729",
				"4729 Otro comercio al por menor de productos alimenticios en establecimientos especializados", 14717,
				2366240, 752023, 483045, 159008, 1902692, 17806, 324037, 30880, 17976, 14565, 26208));
		saveLead(new EmpresasCNAE("4730",
				"4730 Comercio al por menor de combustible para la automoci¢n en establecimientos especializados", 5663,
				22350098, 3532637, 2168705, 813224, 20546094, 302819, 1355482, 57088, 54670, 51346, 92814));
		saveLead(new EmpresasCNAE("4741",
				"4741 Comercio al por menor de ordenadores, equipos perif‚ricos y programas inform ticos en establecimientos especializados",
				5816, 4017918, 1142340, 797459, 322218, 3278857, 54381, 475242, 21020, 17415, 14758, 26035));
		saveLead(new EmpresasCNAE("4742",
				"4742 Comercio al por menor de equipos de telecomunicaciones en establecimientos especializados", 3471,
				1693106, 703575, 457895, 77316, 1291534, 19396, 380580, 18999, 16414, 14196, 25668));
		saveLead(new EmpresasCNAE("4743",
				"4743 Comercio al por menor de equipos de audio y v¡deo en establecimientos especializados", 1232,
				894296, 241046, 115298, 725, 792976, 5763, 114572, 5385, 4526, 3708, 6642));
		saveLead(new EmpresasCNAE("4751", "4751 Comercio al por menor de textiles en establecimientos especializados",
				11838, 1605195, 719229, 392212, 125529, 1186965, 13614, 266683, 23444, 12352, 9979, 17812));
		saveLead(new EmpresasCNAE("4752",
				"4752 Comercio al por menor de ferreter¡a, pintura y vidrio en establecimientos especializados", 20599,
				9008075, 3125804, 1968494, 504885, 7151828, 116807, 1463609, 74929, 57287, 51209, 91633));
		saveLead(new EmpresasCNAE("4753",
				"4753 Comercio al por menor de alfombras, moquetas y revestimientos de paredes y suelos en establecimientos especializados",
				141, 32801, 14856, 9474, 2547, 23765, 439, 6928, 349, 270, 239, 426));
		saveLead(new EmpresasCNAE("4754",
				"4754 Comercio al por menor de aparatos electrodom‚sticos en establecimientos especializados", 7929,
				2269737, 624655, 386710, 71974, 1916704, 19774, 314736, 19482, 12955, 11477, 20414));
		saveLead(new EmpresasCNAE("4759",
				"4759 Comercio al por menor de muebles, aparatos de iluminaci¢n y otros art¡culos de uso dom‚stico en establecimientos especializados",
				24658, 8525872, 3378693, 1917184, 549513, 6707248, 123088, 1367671, 77597, 57298, 48535, 86056));
		saveLead(new EmpresasCNAE("4761", "4761 Comercio al por menor de libros en establecimientos especializados",
				6448, 1134914, 387677, 245107, 85890, 911154, 9611, 159217, 13503, 7423, 6090, 10904));
		saveLead(new EmpresasCNAE("4762",
				"4762 Comercio al por menor de peri¢dicos y art¡culos de papeler¡a en establecimientos especializados",
				9900, 1362887, 445566, 288556, 112728, 1086653, 8995, 175828, 17938, 8787, 7237, 12676));
		saveLead(new EmpresasCNAE("4763",
				"4763 Comercio al por menor de grabaciones de m£sica y v¡deo en establecimientos especializados", 62,
				10151, 4692, 2659, 380, 7767, 65, 2278, 164, 109, 92, 166));
		saveLead(new EmpresasCNAE("4764",
				"4764 Comercio al por menor de art¡culos deportivos en establecimientos especializados", 6185, 5192828,
				1860520, 1157607, 395237, 4132761, 63090, 762371, 40024, 36362, 27914, 50264));
		saveLead(new EmpresasCNAE("4765",
				"4765 Comercio al por menor de juegos y juguetes en establecimientos especializados", 3204, 1015831,
				407156, 189287, 12083, 860585, 15788, 177204, 11499, 8699, 7283, 13184));
		saveLead(new EmpresasCNAE("4771",
				"4771 Comercio al por menor de prendas de vestir en establecimientos especializados", 46653, 20970356,
				9486507, 5307383, 2117915, 16003943, 555229, 3189467, 183788, 142719, 110480, 198873));
		saveLead(new EmpresasCNAE("4772",
				"4772 Comercio al por menor de calzado y art¡culos de cuero en establecimientos especializados", 10643,
				3204176, 1430507, 749501, 169420, 2463420, 103618, 580081, 37380, 27926, 23147, 41743));
		saveLead(new EmpresasCNAE("4773",
				"4773 Comercio al por menor de productos farmac‚uticos en establecimientos especializados", 22095,
				17910024, 5295362, 4352737, 2469169, 13544339, 153499, 1883568, 99958, 78514, 67614, 122444));
		saveLead(new EmpresasCNAE("4774",
				"4774 Comercio al por menor de art¡culos m‚dicos y ortop‚dicos en establecimientos especializados",
				4778, 1189652, 658319, 418611, 132679, 808976, 18400, 285932, 12018, 8299, 7414, 13348));
		saveLead(new EmpresasCNAE("4775",
				"4775 Comercio al por menor de productos cosm‚ticos e higi‚nicos en establecimientos especializados",
				6459, 3568432, 1327898, 712032, 155891, 2983134, 72982, 556141, 31535, 26084, 21966, 39640));
		saveLead(new EmpresasCNAE("4776",
				"4776 Comercio al por menor de flores, plantas, semillas, fertilizantes, animales de compa¤¡a y alimentos para los mismos en establecimientos especializados",
				13505, 2107961, 767301, 506224, 172840, 1635658, 35996, 333384, 27871, 16012, 13604, 24493));
		saveLead(new EmpresasCNAE("4777",
				"4777 Comercio al por menor de art¡culos de relojer¡a y joyer¡a en establecimientos especializados",
				9025, 2709055, 1148063, 649600, 250233, 2086888, 51252, 399366, 22719, 15565, 13127, 23398));
		saveLead(new EmpresasCNAE("4778",
				"4778 Otro comercio al por menor de art¡culos nuevos en establecimientos especializados", 24134,
				5105043, 2589654, 1649838, 507518, 3541790, 84045, 1142319, 68484, 47459, 40554, 71890));
		saveLead(new EmpresasCNAE("4779", "4779 Comercio al por menor de art¡culos de segunda mano en establecimientos",
				2523, 420866, 163933, 88780, 16615, 344554, 1249, 72165, 5851, 3414, 2949, 5267));
		saveLead(new EmpresasCNAE("4781",
				"4781 Comercio al por menor de productos alimenticios, bebidas y tabaco en puestos de venta y en mercadillos",
				11875, 955064, 299649, 218302, 132296, 740178, 9916, 86006, 17940, 6029, 4638, 8152));
		saveLead(new EmpresasCNAE("4782",
				"4782 Comercio al por menor de productos textiles, prendas de vestir y calzado en puestos de venta y en mercadillos",
				15476, 371437, 193413, 146356, 110972, 226373, 3272, 35384, 17379, 3240, 2364, 4233));
		saveLead(new EmpresasCNAE("4789",
				"4789 Comercio al por menor de otros productos en puestos de venta y en mercadillos", 14931, 341043,
				181140, 125763, 93321, 217021, 2605, 32442, 17700, 2422, 1853, 3217));
		saveLead(new EmpresasCNAE("4791", "4791 Comercio al por menor por correspondencia o Internet", 7795, 6395229,
				1697432, 683556, 255585, 5858290, 47946, 427971, 20161, 14044, 12715, 22744));
		saveLead(new EmpresasCNAE("4799",
				"4799 Otro comercio al por menor no realizado ni en establecimientos, ni en puestos de venta ni en mercadillos",
				6403, 2754609, 1081668, 608267, 227932, 2189256, 94930, 380334, 19189, 13827, 12446, 22196));
		saveLead(new EmpresasCNAE("4900", "4900 TOTAL SECTOR SERVICIOS", 1615195, 566119029, 457559363, 258243198,
				96265832, 336588186, 34574380, 161977366, 6815714, 5440125, 4601594, 8212633));
		saveLead(new EmpresasCNAE("4910", "4910 Transporte interurbano de pasajeros por ferrocarril", 7, 2529304,
				2637499, 1474443, 595686, 2658863, 423795, 878757, 14528, 14527, 14115, 25354));
		saveLead(new EmpresasCNAE("4920", "4920 Transporte de mercanc¡as por ferrocarril", 10, 294452, 323857, 91089,
				-1762, 239799, 9678, 92851, 1437, 1434, 1426, 2562));
		saveLead(new EmpresasCNAE("4931", "4931 Transporte terrestre urbano y suburbano de pasajeros", 242, 3611231,
				3666163, 3241693, 714888, 1695627, 602966, 2526804, 53045, 52964, 49744, 89344));
		saveLead(new EmpresasCNAE("4939", "4939 Otros tipos de transporte terrestre de pasajeros ncop", 4036, 4449251,
				3865041, 2456848, 686894, 2390979, 464724, 1769955, 56579, 54723, 47606, 85506));
		saveLead(new EmpresasCNAE("4941", "4941 Transporte de mercanc¡as por carretera", 101942, 35962040, 26790486,
				12457847, 4582457, 23910724, 2066362, 7875390, 345001, 261510, 245262, 437074));
		saveLead(new EmpresasCNAE("4942", "4942 Servicios de mudanza", 1091, 250579, 205895, 114579, 21753, 139833,
				7381, 92826, 4284, 3438, 3051, 5428));
		saveLead(new EmpresasCNAE("5010", "5010 Transporte mar¡timo de pasajeros", 492, 889293, 848844, 316186, 149696,
				653781, 257344, 166489, 4973, 4681, 4450, 8543));
		saveLead(new EmpresasCNAE("5020", "5020 Transporte mar¡timo de mercanc¡as", 81, 1480437, 1170333, 273630,
				157381, 1276625, 35731, 116250, 2663, 2636, 2621, 4945));
		saveLead(new EmpresasCNAE("5030", "5030 Transporte de pasajeros por v¡as navegables interiores", 74, 25813,
				24880, 14338, 3751, 11783, 378, 10587, 499, 458, 420, 807));
		saveLead(new EmpresasCNAE("5040", "5040 Transporte de mercanc¡as por v¡as navegables interiores", 6, 3635, 3154,
				1888, 667, 1801, 7, 1221, 59, 52, 45, 86));
		saveLead(new EmpresasCNAE("5110", "5110 Transporte a‚reo de pasajeros", 134, 12740032, 12910074, 3116106,
				1149293, 9858146, 1356919, 1966812, 33329, 33261, 31473, 58698));
		saveLead(new EmpresasCNAE("5121", "5121 Transporte a‚reo de mercanc¡as", 13, 243242, 224221, 73938, 25828,
				173470, 8866, 48110, 911, 908, 876, 1636));
		saveLead(new EmpresasCNAE("5210", "5210 Dep¢sito y almacenamiento", 1520, 4017738, 3735056, 2119075, 966349,
				2071857, 265289, 1152726, 31996, 31320, 30067, 52658));
		saveLead(new EmpresasCNAE("5221", "5221 Actividades anexas al transporte terrestre", 6309, 8945032, 8202253,
				6271386, 4389790, 4915498, 1902489, 1881596, 52173, 47956, 44874, 78405));
		saveLead(new EmpresasCNAE("5222",
				"5222 Actividades anexas al transporte mar¡timo y por v¡as navegables interiores", 696, 4321896,
				3129321, 2173539, 1271462, 2422773, 348136, 902077, 19084, 18507, 17837, 31081));
		saveLead(new EmpresasCNAE("5223", "5223 Actividades anexas al transporte a‚reo", 431, 8634318, 7791290, 5538742,
				3840618, 3084066, 624966, 1698124, 35603, 35416, 31547, 55230));
		saveLead(new EmpresasCNAE("5224", "5224 Manipulaci¢n de mercanc¡as", 474, 2347419, 1599047, 1114808, 276772,
				1270552, 81654, 838036, 15150, 14941, 14375, 25191));
		saveLead(new EmpresasCNAE("5229", "5229 Otras actividades anexas al transporte", 5789, 21977729, 9145652,
				4170163, 1037323, 18057472, 285593, 3132839, 87459, 84256, 80250, 140188));
		saveLead(new EmpresasCNAE("5510", "5510 Hoteles y alojamientos similares", 12139, 24454297, 24199548, 12907402,
				4918431, 12238527, 2143990, 7988972, 279101, 271489, 259668, 482551));
		saveLead(new EmpresasCNAE("5520", "5520 Alojamientos tur¡sticos y otros alojamientos de corta estancia", 14967,
				2938883, 2826194, 1379878, 577732, 1673574, 236212, 802146, 43786, 31724, 29239, 53954));
		saveLead(new EmpresasCNAE("5530", "5530 Campings y aparcamientos para caravanas", 1022, 730196, 719096, 420005,
				195366, 321450, 84903, 224639, 9406, 8781, 8263, 15373));
		saveLead(new EmpresasCNAE("5590", "5590 Otros alojamientos", 842, 435003, 404982, 222104, 97033, 253753, 54204,
				125071, 6461, 5729, 5052, 9359));
		saveLead(new EmpresasCNAE("5610", "5610 Restaurantes y puestos de comidas", 75598, 28064152, 27433473, 11689447,
				2145869, 16858883, 1082125, 9543578, 582062, 516443, 382349, 723402));
		saveLead(new EmpresasCNAE("5621", "5621 Provisi¢n de comidas preparadas para eventos", 8905, 1752313, 1712225,
				705179, 160070, 1118322, 33945, 545109, 35918, 29196, 20720, 39072));
		saveLead(new EmpresasCNAE("5629", "5629 Otros servicios de comidas", 5074, 3813507, 3805042, 2051140, 189824,
				1840497, 78088, 1861316, 121007, 116851, 74806, 141180));
		saveLead(new EmpresasCNAE("5630", "5630 Establecimientos de bebidas", 171866, 20579638, 20203830, 7682096,
				1882550, 13160437, 299174, 5799547, 523984, 360482, 256470, 484872));
		saveLead(new EmpresasCNAE("5811", "5811 Edici¢n de libros", 3295, 2015241, 1640731, 808068, 262934, 1370245,
				15523, 545134, 14554, 11907, 11126, 19309));
		saveLead(new EmpresasCNAE("5812", "5812 Edici¢n de directorios y gu¡as de direcciones postales", 47, 76982,
				70760, 43571, 10461, 34927, 34, 33110, 492, 464, 452, 788));
		saveLead(new EmpresasCNAE("5813", "5813 Edici¢n de peri¢dicos", 758, 1822545, 1658498, 791912, 166604, 1189266,
				6799, 625308, 13924, 13493, 12916, 22657));
		saveLead(new EmpresasCNAE("5814", "5814 Edici¢n de revistas", 1529, 841600, 641563, 320745, 54500, 555236, 5485,
				266245, 7414, 6210, 5669, 9793));
		saveLead(new EmpresasCNAE("5819", "5819 Otras actividades editoriales", 1232, 318437, 221701, 72684, 6139,
				254719, 2957, 66545, 2575, 1767, 1615, 2791));
		saveLead(new EmpresasCNAE("5821", "5821 Edici¢n de videojuegos", 128, 264934, 242203, 159955, 60544, 116830,
				3932, 99411, 2191, 2138, 2096, 3664));
		saveLead(new EmpresasCNAE("5829", "5829 Edici¢n de otros programas inform ticos", 3863, 682196, 629922, 474830,
				195205, 238129, 11771, 279625, 8843, 5829, 5677, 9899));
		saveLead(new EmpresasCNAE("5912",
				"5912 Actividades de postproducci¢n cinematogr fica, de v¡deo y de programas de televisi¢n", 728,
				1486078, 570122, 398355, 233736, 1156041, 8693, 164620, 4373, 3773, 3585, 6465));
		saveLead(new EmpresasCNAE("5914", "5914 Actividades de exhibici¢n cinematogr fica", 407, 860822, 716765, 277420,
				118090, 636372, 57198, 159331, 7462, 7187, 5269, 9601));
		saveLead(new EmpresasCNAE("5915", "5915 Actividades de producci¢n cinematogr fica y de v¡deo", 5328, 1093344,
				955396, 584816, 266369, 762993, 21787, 318447, 12515, 8024, 7539, 13544));
		saveLead(new EmpresasCNAE("5916", "5916 Actividades de producci¢n de programas de televisi¢n", 652, 1432106,
				1245362, 844312, 218927, 711812, 24126, 625385, 13103, 12741, 12349, 22428));
		saveLead(new EmpresasCNAE("5917", "5917 Actividades de distribuci¢n cinematogr fica y de v¡deo", 397, 768275,
				659560, 205541, 113326, 590224, 1980, 92215, 1627, 1308, 1250, 2214));
		saveLead(new EmpresasCNAE("5918", "5918 Actividades de distribuci¢n de programas de televisi¢n", 26, 28136,
				13146, 5630, 1466, 20940, 212, 4165, 107, 104, 96, 171));
		saveLead(new EmpresasCNAE("5920", "5920 Actividades de grabaci¢n de sonido y edici¢n musical", 453, 334303,
				284664, 106367, 46261, 243444, 4404, 60106, 1610, 1189, 1103, 1972));
		saveLead(new EmpresasCNAE("6010", "6010 Actividades de radiodifusi¢n", 774, 618904, 603331, 334381, 75188,
				356472, 11125, 259193, 6507, 6110, 5638, 9171));
		saveLead(new EmpresasCNAE("6020", "6020 Actividades de programaci¢n y emisi¢n de televisi¢n", 538, 5546035,
				4382908, 1911080, 504593, 5849341, 130616, 1406487, 23723, 23443, 22887, 37520));
		saveLead(new EmpresasCNAE("6110", "6110 Telecomunicaciones por cable", 1771, 18292443, 12351372, 7208438,
				3136562, 11525309, 2740472, 4071876, 36206, 35183, 34828, 60381));
		saveLead(new EmpresasCNAE("6120", "6120 Telecomunicaciones inal mbricas", 778, 11837982, 9664647, 4810916,
				3809100, 7405289, 704158, 1001816, 12263, 11691, 11547, 20020));
		saveLead(new EmpresasCNAE("6130", "6130 Telecomunicaciones por sat‚lite", 185, 383533, 340632, 257310, 209303,
				138192, 18241, 48007, 942, 779, 765, 1327));
		saveLead(new EmpresasCNAE("6190", "6190 Otras actividades de telecomunicaciones", 2928, 4582048, 2604855,
				1518811, 848910, 3661792, 199474, 669901, 19846, 18241, 17198, 29649));
		saveLead(new EmpresasCNAE("6201", "6201 Actividades de programaci¢n inform tica", 12465, 13927015, 12552806,
				5997288, 1816174, 8733461, 209118, 4181114, 98403, 89199, 87574, 155121));
		saveLead(new EmpresasCNAE("6202", "6202 Actividades de consultor¡a inform tica", 15981, 14062622, 12378514,
				8045979, 1349186, 6333087, 160766, 6696794, 154535, 142713, 140200, 248152));
		saveLead(new EmpresasCNAE("6203", "6203 Gesti¢n de recursos inform ticos", 3812, 2631469, 1905481, 1133419,
				302990, 1521691, 93197, 830429, 20210, 17279, 16454, 29082));
		saveLead(new EmpresasCNAE("6209",
				"6209 Otros servicios relacionados con las tecnolog¡as de la informaci¢n y la inform tica", 5513,
				3816974, 2879589, 1740465, 251264, 2283496, 36557, 1489201, 36888, 34142, 33244, 58984));
		saveLead(new EmpresasCNAE("6311", "6311 Proceso de datos, hosting y actividades relacionadas", 4481, 1698530,
				1406538, 891747, 298686, 883098, 35638, 593061, 17173, 13851, 12310, 21888));
		saveLead(new EmpresasCNAE("6312", "6312 Portales web", 680, 926683, 833249, 484714, 151730, 463854, 29575,
				332984, 6819, 6274, 5999, 10674));
		saveLead(new EmpresasCNAE("6391", "6391 Actividades de las agencias de noticias", 78, 153606, 154944, 103967,
				562, 58765, 1939, 103405, 2246, 2198, 2155, 3846));
		saveLead(new EmpresasCNAE("6399", "6399 Otros servicios de informaci¢n ncop", 678, 298302, 254248, 163968,
				62395, 146780, 2581, 101573, 3448, 3065, 2745, 4872));
		saveLead(new EmpresasCNAE("6810", "6810 Compraventa de bienes inmobiliarios por cuenta propia", 1093, 1860147,
				113589, -266670, -353262, 1611403, 86071, 86592, 3075, 2298, 2065, 3655));
		saveLead(new EmpresasCNAE("6820", "6820 Alquiler de bienes inmobiliarios por cuenta propia", 127370, 18894500,
				19709717, 12509592, 10360149, 8089134, 6481297, 2149444, 164991, 63677, 57718, 99764));
		saveLead(new EmpresasCNAE("6831", "6831 Agentes de la propiedad inmobiliaria", 47561, 6421757, 6017813, 3179737,
				1565597, 3674008, 184737, 1614140, 86408, 49121, 43715, 76073));
		saveLead(new EmpresasCNAE("6832", "6832 Gesti¢n y administraci¢n de la propiedad inmobiliaria", 9294, 2831253,
				1672092, 647025, -127075, 1851352, 69100, 774099, 29170, 23042, 20193, 36044));
		saveLead(new EmpresasCNAE("6910", "6910 Actividades jur¡dicas", 88082, 11723854, 11072989, 7411422, 4484166,
				4362219, 193283, 2927257, 174413, 82998, 75078, 133534));
		saveLead(new EmpresasCNAE("6920",
				"6920 Actividades de contabilidad, tenedur¡a de libros, auditor¡a y asesor¡a fiscal", 68349, 11032988,
				10583924, 6540189, 2240106, 4788586, 412949, 4300083, 198389, 140233, 125813, 222343));
		saveLead(new EmpresasCNAE("7010", "7010 Actividades de las sedes centrales", 3545, 11683508, 11801080, 5804166,
				593646, 8003721, 652407, 5210519, 61361, 60308, 58679, 103938));
		saveLead(new EmpresasCNAE("7021", "7021 Relaciones p£blicas y comunicaci¢n", 1351, 494723, 430137, 234217,
				65240, 275330, 5927, 168977, 5414, 4336, 4060, 7165));
		saveLead(new EmpresasCNAE("7022", "7022 Otras actividades de consultor¡a de gesti¢n empresarial", 19586,
				8566525, 7607206, 4744713, 1241898, 4192092, 182162, 3502815, 82772, 70050, 65032, 113802));
		saveLead(new EmpresasCNAE("7111", "7111 Servicios t‚cnicos de arquitectura", 50350, 3832553, 3176834, 1820720,
				1196288, 2044142, 97856, 624432, 70779, 20587, 18600, 32605));
		saveLead(new EmpresasCNAE("7112",
				"7112 Servicios t‚cnicos de ingenier¡a y otras actividades relacionadas con el asesoramiento t‚cnico",
				44592, 21535904, 17696387, 8919459, 2325599, 13284724, 288449, 6593861, 180282, 143847, 139136,
				246366));
		saveLead(new EmpresasCNAE("7120", "7120 Ensayos y an lisis t‚cnicos", 10745, 3623194, 3244276, 2206379, 563019,
				1621525, 109100, 1643360, 51211, 44553, 42813, 76184));
		saveLead(new EmpresasCNAE("7211", "7211 Investigaci¢n y desarrollo experimental en biotecnolog¡a", 1572, 684458,
				763028, 660892, 147044, 557308, 69926, 513847, 15164, 13747, 13084, 22206));
		saveLead(new EmpresasCNAE("7219",
				"7219 Otra investigaci¢n y desarrollo experimental en ciencias naturales y t‚cnicas", 3104, 2144692,
				2086121, 1969988, 326434, 1527741, 239449, 1643555, 40668, 38264, 36622, 62144));
		saveLead(new EmpresasCNAE("7220",
				"7220 Investigaci¢n y desarrollo experimental en ciencias sociales y humanidades", 3231, 109808, 111682,
				124016, 44589, 67825, 2836, 79426, 5461, 2516, 2312, 3923));
		saveLead(new EmpresasCNAE("7311", "7311 Agencias de publicidad", 24838, 8030128, 6031176, 2867468, 826967,
				5358891, 124389, 2040501, 77226, 58929, 52607, 92297));
		saveLead(new EmpresasCNAE("7312", "7312 Servicios de representaci¢n de medios de comunicaci¢n", 16452, 9991345,
				2413362, 1494968, 725212, 8720767, 31408, 769757, 29867, 16127, 15439, 27178));
		saveLead(new EmpresasCNAE("7320", "7320 Estudio de mercado y realizaci¢n de encuestas de opini¢n p£blica", 2878,
				1169416, 979862, 548257, 69410, 664453, 26749, 478847, 15825, 13691, 12066, 21109));
		saveLead(new EmpresasCNAE("7410", "7410 Actividades de dise¤o especializado", 6949, 1568607, 1426895, 1017209,
				695851, 666427, 24168, 321357, 13734, 7607, 7053, 12163));
		saveLead(new EmpresasCNAE("7420", "7420 Actividades de fotograf¡a", 15678, 627527, 566041, 309391, 178783,
				325684, 30454, 130609, 21238, 5448, 4508, 7737));
		saveLead(new EmpresasCNAE("7430", "7430 Actividades de traducci¢n e interpretaci¢n", 11018, 644906, 550564,
				405323, 236130, 247149, 14335, 169192, 15963, 5604, 4800, 8304));
		saveLead(new EmpresasCNAE("7490", "7490 Otras actividades profesionales, cient¡ficas y t‚cnicas ncop", 39702,
				4842097, 4326515, 2850176, 1146527, 2350918, 85539, 1703649, 79807, 46971, 42474, 74205));
		saveLead(new EmpresasCNAE("7500", "7500 Actividades veterinarias", 11084, 1437102, 1079490, 684654, 359399,
				775724, 59601, 325255, 26897, 16383, 13535, 24643));
		saveLead(new EmpresasCNAE("7711", "7711 Alquiler de autom¢viles y veh¡culos de motor ligeros", 3725, 6834996,
				6268598, 3292594, 2642108, 3843733, 3310767, 650485, 22481, 20108, 19153, 34713));
		saveLead(new EmpresasCNAE("7712", "7712 Alquiler de camiones", 488, 316009, 318579, 156302, 128675, 165283,
				235410, 27627, 1216, 855, 823, 1483));
		saveLead(new EmpresasCNAE("7721", "7721 Alquiler de art¡culos de ocio y deportivos", 1058, 160556, 141998,
				56881, 12580, 105820, 16797, 44301, 2939, 2170, 1813, 3276));
		saveLead(new EmpresasCNAE("7722", "7722 Alquiler de cintas de v¡deo y discos", 382, 15561, 14565, 3875, 1251,
				12003, 478, 2624, 560, 185, 138, 246));
		saveLead(new EmpresasCNAE("7729", "7729 Alquiler de otros efectos personales y art¡culos de uso dom‚stico",
				1650, 389730, 332563, 188057, 77677, 207297, 48950, 110380, 5362, 4157, 3771, 6804));
		saveLead(new EmpresasCNAE("7731", "7731 Alquiler de maquinaria y equipo de uso agr¡cola", 827, 86245, 81670,
				37696, 23793, 53898, 9481, 13903, 1593, 622, 599, 1076));
		saveLead(
				new EmpresasCNAE("7732", "7732 Alquiler de maquinaria y equipo para la construcci¢n e ingenier¡a civil",
						3133, 2126219, 1917041, 1054409, 552217, 1123884, 394427, 502192, 16784, 14802, 14249, 25746));
		saveLead(new EmpresasCNAE("7733", "7733 Alquiler de maquinaria y equipo de oficina, incluidos ordenadores", 257,
				687912, 401066, 126744, 78743, 570867, 6546, 48001, 1194, 1004, 951, 1702));
		saveLead(new EmpresasCNAE("7734", "7734 Alquiler de medios de navegaci¢n", 2022, 294156, 300197, 112472, 67719,
				202576, 27741, 44753, 2985, 1618, 1459, 2579));
		saveLead(new EmpresasCNAE("7735", "7735 Alquiler de medios de transporte a‚reo", 107, 517478, 511535, 359638,
				306170, 210739, 238703, 53468, 1008, 949, 928, 1687));
		saveLead(new EmpresasCNAE("7739", "7739 Alquiler de otra maquinaria, equipos y bienes tangibles ncop", 5461,
				2898443, 2372032, 1157139, 702804, 1791963, 236576, 454335, 18262, 12916, 12169, 22021));
		saveLead(new EmpresasCNAE("7740",
				"7740 Arrendamiento de la propiedad intelectual y productos similares, excepto trabajos protegidos por los derechos de autor",
				169, 316328, 317563, 177789, 118724, 148974, 7935, 59065, 1403, 1289, 1141, 2068));
		saveLead(new EmpresasCNAE("7810", "7810 Actividades de las agencias de colocaci¢n", 3422, 652002, 598458,
				389683, 90792, 286450, 9227, 298891, 13057, 10740, 9552, 17953));
		saveLead(new EmpresasCNAE("7820", "7820 Actividades de las empresas de trabajo temporal", 361, 6337986, 6286622,
				5924412, 145809, 436347, 24989, 5778603, 236605, 236496, 220040, 377247));
		saveLead(new EmpresasCNAE("7830", "7830 Otra provisi¢n de recursos humanos", 1203, 298477, 294061, 202713,
				23455, 109875, 3162, 179258, 10525, 9693, 8011, 15116));
		saveLead(new EmpresasCNAE("7911", "7911 Actividades de las agencias de viaje", 8997, 21221318, 4165734, 2233045,
				834511, 19291515, 46851, 1398534, 46141, 41024, 38141, 66909));
		saveLead(new EmpresasCNAE("7912", "7912 Actividades de los operadores tur¡sticos", 227, 2735679, 444469, 254798,
				69586, 2519217, 3919, 185212, 5660, 5546, 5329, 9471));
		saveLead(new EmpresasCNAE("7990", "7990 Otros servicios de reservas y actividades relacionadas con los mismos",
				5454, 1082396, 470909, 359034, 149776, 875114, 11856, 209258, 11466, 6622, 5841, 10316));
		saveLead(new EmpresasCNAE("8010", "8010 Actividades de seguridad privada", 1431, 4703254, 4430846, 3764957,
				269139, 983040, 48842, 3495818, 133189, 132396, 120325, 228219));
		saveLead(new EmpresasCNAE("8020", "8020 Servicios de sistemas de seguridad", 406, 1384619, 1098529, 687849,
				222567, 816017, 5621, 465282, 14829, 14664, 13459, 25500));
		saveLead(new EmpresasCNAE("8030", "8030 Actividades de investigaci¢n", 1141, 62010, 54738, 37067, 19613, 27345,
				1593, 17454, 1470, 514, 458, 847));
		saveLead(new EmpresasCNAE("8110", "8110 Servicios integrales a edificios e instalaciones", 1759, 3422845,
				3033931, 1987721, 298128, 1510202, 41157, 1689592, 83522, 82659, 67791, 114584));
		saveLead(new EmpresasCNAE("8121", "8121 Limpieza general de edificios", 28517, 9253655, 8914723, 7650243,
				622684, 2104448, 111653, 7027559, 473022, 452039, 289728, 488498));
		saveLead(new EmpresasCNAE("8122", "8122 Otras actividades de limpieza industrial y de edificios", 1052, 365668,
				347960, 267183, 38596, 102038, 10014, 228587, 10376, 9642, 7619, 12867));
		saveLead(new EmpresasCNAE("8129", "8129 Otras actividades de limpieza", 4080, 1668479, 1564384, 1176850, 191892,
				550890, 77307, 984958, 38150, 35309, 29644, 49975));
		saveLead(new EmpresasCNAE("8130", "8130 Actividades de jardiner¡a", 14652, 1855438, 1692648, 1159890, 261260,
				843042, 72877, 898631, 49832, 37262, 32874, 55368));
		saveLead(new EmpresasCNAE("8211", "8211 Servicios administrativos combinados", 3161, 1337911, 1132312, 714532,
				179623, 696111, 47439, 534909, 19499, 17061, 15596, 30372));
		saveLead(new EmpresasCNAE("8219",
				"8219 Actividades de fotocopiado, preparaci¢n de documentos y otras actividades especializadas de oficina",
				6741, 362193, 343024, 180084, 104988, 184465, 6602, 75095, 9915, 3562, 2923, 5339));
		saveLead(new EmpresasCNAE("8220", "8220 Actividades de los centros de llamadas", 396, 3633763, 2878773, 2431326,
				177787, 1306658, 52649, 2253539, 105521, 105392, 83266, 144952));
		saveLead(new EmpresasCNAE("8230", "8230 Organizaci¢n de convenciones y ferias de muestras", 7264, 2235817,
				1754528, 731192, 236134, 1657081, 47101, 495057, 22836, 16465, 14194, 24530));
		saveLead(new EmpresasCNAE("8291", "8291 Actividades de las agencias de cobros y de informaci¢n comercial", 1272,
				1272387, 1191670, 665570, 162710, 637064, 18332, 502860, 15412, 14451, 12805, 22240));
		saveLead(new EmpresasCNAE("8292", "8292 Actividades de envasado y empaquetado", 347, 498047, 431187, 243080,
				37844, 298094, 17854, 205236, 10412, 10302, 9968, 17339));
		saveLead(new EmpresasCNAE("8299", "8299 Otras actividades de apoyo a las empresas ncop", 64180, 8997843,
				8445332, 4756459, 1932262, 5141433, 250834, 2824196, 170150, 117841, 99607, 173266));
		saveLead(new EmpresasCNAE("9001", "9001 Artes esc‚nicas", 9779, 1570780, 1264102, 837697, 229317, 1129646,
				45192, 608381, 29304, 21147, 17120, 30177));
		saveLead(new EmpresasCNAE("9002", "9002 Actividades auxiliares a las artes esc‚nicas", 4586, 908310, 575116,
				329625, 123710, 708331, 14827, 205914, 11664, 7644, 5973, 10521));
		saveLead(new EmpresasCNAE("9003", "9003 Creaci¢n art¡stica y literaria", 25008, 503723, 479863, 356401, 286783,
				165965, 4096, 69618, 24186, 2315, 1908, 3225));
		saveLead(new EmpresasCNAE("9004", "9004 Gesti¢n de salas de espect culos", 4339, 635412, 462332, 189586, 51500,
				517660, 8268, 138085, 9561, 5876, 4060, 7163));
		saveLead(new EmpresasCNAE("9102", "9102 Actividades de museos", 529, 347787, 352925, 363278, 117163, 349058,
				49136, 246115, 8218, 7892, 6556, 11392));
		saveLead(new EmpresasCNAE("9103", "9103 Gesti¢n de lugares y edificios hist¢ricos", 1516, 226329, 208020,
				133500, 49107, 135090, 17157, 84393, 5768, 3162, 2498, 4341));
		saveLead(new EmpresasCNAE("9104",
				"9104 Actividades de los jardines bot nicos, parques zool¢gicos y reservas naturales", 206, 324385,
				323347, 206131, 103049, 167634, 21437, 103082, 4068, 3860, 3569, 6207));
		saveLead(new EmpresasCNAE("9105", "9105 Actividades de bibliotecas", 189, 53049, 64787, 90906, 4947, 60817,
				14177, 85959, 1839, 1674, 1493, 2591));
		saveLead(new EmpresasCNAE("9106", "9106 Actividades de archivos", 999, 50391, 46358, 33929, 13083, 17295, 1318,
				20846, 1697, 1090, 825, 1432));
		saveLead(new EmpresasCNAE("9200", "9200 Actividades de juegos de azar y apuestas", 11626, 18936601, 9612771,
				5359349, 4131768, 12863320, 382186, 1227581, 52837, 43834, 39995, 65680));
		saveLead(new EmpresasCNAE("9311", "9311 Gesti¢n de instalaciones deportivas", 6640, 2466797, 2292179, 1425948,
				303902, 1444125, 258030, 1122047, 65445, 58362, 38003, 67721));
		saveLead(new EmpresasCNAE("9312", "9312 Actividades de los clubes deportivos", 5503, 6368131, 4630354, 3588287,
				700957, 3202764, 299830, 2887330, 43014, 38978, 25366, 45251));
		saveLead(new EmpresasCNAE("9313", "9313 Actividades de los gimnasios", 8866, 765489, 762612, 403492, 102553,
				394181, 223797, 300939, 33759, 23246, 12709, 22573));
		saveLead(new EmpresasCNAE("9319", "9319 Otras actividades deportivas", 6347, 1570620, 1475599, 1058043, 536642,
				956286, 70300, 521401, 26902, 22199, 15157, 26971));
		saveLead(new EmpresasCNAE("9321", "9321 Actividades de los parques de atracciones y los parques tem ticos",
				2906, 662876, 652228, 402996, 228031, 285702, 111130, 174965, 11464, 8676, 6618, 11803));
		saveLead(new EmpresasCNAE("9329", "9329 Otras actividades recreativas y de entretenimiento", 9939, 2522863,
				2291913, 1226568, 387839, 1317241, 101409, 838729, 61027, 47157, 30135, 53538));
		saveLead(new EmpresasCNAE("9511", "9511 Reparaci¢n de ordenadores y equipos perif‚ricos", 8153, 991859, 835220,
				461053, 158032, 536994, 22842, 303021, 17180, 10669, 9888, 17294));
		saveLead(new EmpresasCNAE("9512", "9512 Reparaci¢n de equipos de comunicaci¢n", 425, 282795, 226348, 129805,
				46865, 185116, 2887, 82939, 3220, 2964, 2771, 4904));
		saveLead(new EmpresasCNAE("9521", "9521 Reparaci¢n de aparatos electr¢nicos de audio y v¡deo de uso dom‚stico",
				3356, 168112, 122832, 74656, 43690, 93527, 2853, 30966, 4649, 1239, 1074, 1870));
		saveLead(new EmpresasCNAE("9522",
				"9522 Reparaci¢n de aparatos electrodom‚sticos y de equipos para el hogar y el jard¡n", 3257, 682207,
				494258, 308464, 82800, 386297, 12297, 225664, 9797, 7127, 6522, 11382));
		saveLead(new EmpresasCNAE("9523", "9523 Reparaci¢n de calzado y art¡culos de cuero", 1143, 68421, 62275, 37635,
				15388, 31151, 1358, 22247, 2315, 1034, 935, 1621));
		saveLead(new EmpresasCNAE("9524", "9524 Reparaci¢n de muebles y art¡culos de menaje", 438, 42244, 33818, 20648,
				5262, 22294, 491, 15386, 1014, 647, 568, 970));
		saveLead(new EmpresasCNAE("9525", "9525 Reparaci¢n de relojes y joyer¡a", 263, 31374, 21050, 14024, 3917, 17743,
				282, 10107, 632, 397, 342, 595));
		saveLead(new EmpresasCNAE("9529", "9529 Reparaci¢n de otros efectos personales y art¡culos de uso dom‚stico",
				11287, 496869, 357156, 209908, 101185, 292644, 9988, 108722, 14962, 4894, 4105, 7043));
		saveLead(new EmpresasCNAE("9601", "9601 Lavado y limpieza de prendas textiles y de piel", 5529, 1113440,
				1011427, 650323, 163250, 538268, 105708, 487073, 27666, 25950, 23623, 42635));
		saveLead(new EmpresasCNAE("9602", "9602 Peluquer¡a y otros tratamientos de belleza", 116558, 4346594, 3884972,
				2422060, 719999, 2025326, 138196, 1702061, 215125, 110409, 89137, 160853));
		saveLead(new EmpresasCNAE("9603", "9603 Pompas f£nebres y actividades relacionadas", 1691, 1481916, 1140724,
				783728, 328220, 765458, 103491, 455507, 14528, 13893, 12880, 23253));
		saveLead(new EmpresasCNAE("9604", "9604 Actividades de mantenimiento f¡sico", 730, 143795, 130166, 77883, 29586,
				69127, 7807, 48298, 3880, 3254, 2419, 4364));
		saveLead(new EmpresasCNAE("9609", "9609 Otras servicios personales ncop", 15271, 629048, 566436, 325261, 145163,
				337780, 6861, 180098, 23567, 10708, 8652, 15384));

	}

	private void saveLead(EmpresasCNAE lead) {
		lltacnae.put(lead.getCnae(), lead);
	}

	public List<EmpresasCNAE> getLeads() {
		return new ArrayList<>(lltacnae.values());
	}
	
	public EmpresasCNAE cnaeseleccionat(String key) {
		EmpresasCNAE cnaeseleccionat=null;
		
		List<EmpresasCNAE> lista= RepositoriCnae.getInstance().getLeads();
		
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCnae()==key) {
				cnaeseleccionat=lista.get(i);
			}
        }	
		return cnaeseleccionat;	
	}
	
	public EmpresasCNAE getOne(String key) { 
		EmpresasCNAE selec = new EmpresasCNAE();
		
		for(Entry<String, EmpresasCNAE> m : lltacnae.entrySet())
	    {
	      if (m.getKey()==key) {
	    	  m.getValue();
	    }
	      selec = m.getValue();
	    }
		return selec;
	}

}
