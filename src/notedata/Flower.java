package notedata;

import beat.chlwhdtn.Beat;

public class Flower implements BeatListener {
	@Override
	public Beat[] getNotes(int startTime, int gap) {
		return new Beat[] {
				new Beat(4080 - startTime - gap, "L"),
				new Beat(4330 - startTime - gap, "S"),
				new Beat(4980 - startTime - gap, "K"),
				new Beat(5110 - startTime - gap, "D"),
				new Beat(5260 - startTime - gap, "K"),
				new Beat(5380 - startTime - gap, "D"),
				new Beat(5480 - startTime - gap, "K"),
				new Beat(5750 - startTime - gap, "D"),
				new Beat(5980 - startTime - gap, "K"),
				new Beat(6260 - startTime - gap, "D"),
				new Beat(6370 - startTime - gap, "K"),
				new Beat(6590 - startTime - gap, "D"),
				new Beat(6830 - startTime - gap, "K"),
				new Beat(6920 - startTime - gap, "D"),
				new Beat(7180 - startTime - gap, "K"),
				new Beat(7430 - startTime - gap, "D"),
				new Beat(7680 - startTime - gap, "K"),
				new Beat(7780 - startTime - gap, "D"),
				new Beat(7900 - startTime - gap, "K"),
				new Beat(8170 - startTime - gap, "D"),
				new Beat(8280 - startTime - gap, "K"),
				new Beat(8530 - startTime - gap, "D"),
				new Beat(8770 - startTime - gap, "K"),
				new Beat(8900 - startTime - gap, "D"),
				new Beat(9000 - startTime - gap, "K"),
				new Beat(9130 - startTime - gap, "D"),
				new Beat(9260 - startTime - gap, "K"),
				new Beat(9370 - startTime - gap, "D"),
				new Beat(10370 - startTime - gap, "D"),
				new Beat(11340 - startTime - gap, "K"),
				new Beat(11830 - startTime - gap, "D"),
				new Beat(12280 - startTime - gap, "D"),
				new Beat(12800 - startTime - gap, "D"),
				new Beat(13290 - startTime - gap, "K"),
				new Beat(13760 - startTime - gap, "D"),
				new Beat(14230 - startTime - gap, "D"),
				new Beat(14740 - startTime - gap, "D"),
				new Beat(15230 - startTime - gap, "K"),
				new Beat(15230 - startTime - gap, "D"),
				new Beat(15700 - startTime - gap, "D"),
				new Beat(16180 - startTime - gap, "D"),
				new Beat(16640 - startTime - gap, "D"),
				new Beat(17100 - startTime - gap, "K"),
				new Beat(17610 - startTime - gap, "D"),
				new Beat(18130 - startTime - gap, "D"),
				new Beat(18620 - startTime - gap, "D"),
				new Beat(19150 - startTime - gap, "K"),
				new Beat(19560 - startTime - gap, "D"),
				new Beat(20070 - startTime - gap, "D"),
				new Beat(20590 - startTime - gap, "D"),
				new Beat(21080 - startTime - gap, "S"),
				new Beat(21190 - startTime - gap, "J"),
				new Beat(21320 - startTime - gap, "F"),
				new Beat(21560 - startTime - gap, "L"),
				new Beat(21830 - startTime - gap, "S"),
				new Beat(21910 - startTime - gap, "J"),
				new Beat(22050 - startTime - gap, "F"),
				new Beat(22170 - startTime - gap, "L"),
				new Beat(22320 - startTime - gap, "S"),
				new Beat(22550 - startTime - gap, "J"),
				new Beat(23020 - startTime - gap, "F"),
				new Beat(23140 - startTime - gap, "L"),
				new Beat(23270 - startTime - gap, "S"),
				new Beat(23500 - startTime - gap, "J"),
				new Beat(23770 - startTime - gap, "F"),
				new Beat(23890 - startTime - gap, "L"),
				new Beat(24030 - startTime - gap, "S"),
				new Beat(24160 - startTime - gap, "J"),
				new Beat(24290 - startTime - gap, "F"),
				new Beat(24500 - startTime - gap, "L"),
				new Beat(24890 - startTime - gap, "S"),
				new Beat(25000 - startTime - gap, "J"),
				new Beat(25150 - startTime - gap, "F"),
				new Beat(25460 - startTime - gap, "L"),
				new Beat(25660 - startTime - gap, "S"),
				new Beat(25940 - startTime - gap, "J"),
				new Beat(26050 - startTime - gap, "F"),
				new Beat(26170 - startTime - gap, "L"),
				new Beat(26420 - startTime - gap, "S"),
				new Beat(26860 - startTime - gap, "K"),
				new Beat(27410 - startTime - gap, "K"),
				new Beat(27890 - startTime - gap, "K"),
				new Beat(28390 - startTime - gap, "K"),
				new Beat(28890 - startTime - gap, "K"),
				new Beat(29370 - startTime - gap, "K"),
				new Beat(29860 - startTime - gap, "K"),
				new Beat(30360 - startTime - gap, "K"),
				new Beat(30840 - startTime - gap, "K"),
				new Beat(31280 - startTime - gap, "K"),
				new Beat(31780 - startTime - gap, "D"),
				new Beat(32270 - startTime - gap, "D"),
				new Beat(32290 - startTime - gap, "S"),
				new Beat(32750 - startTime - gap, "D"),
				new Beat(33260 - startTime - gap, "D"),
				new Beat(33740 - startTime - gap, "D"),
				new Beat(34250 - startTime - gap, "D"),
				new Beat(34720 - startTime - gap, "F"),
				new Beat(35210 - startTime - gap, "D"),
				new Beat(35690 - startTime - gap, "F"),
				new Beat(36200 - startTime - gap, "D"),
				new Beat(36650 - startTime - gap, "F"),
				new Beat(37160 - startTime - gap, "D"),
				new Beat(37660 - startTime - gap, "F"),
				new Beat(38150 - startTime - gap, "D"),
				new Beat(38610 - startTime - gap, "F"),
				new Beat(38900 - startTime - gap, "D"),
				new Beat(39120 - startTime - gap, "S"),
				new Beat(39340 - startTime - gap, "F"),
				new Beat(39590 - startTime - gap, "D"),
				new Beat(39840 - startTime - gap, "S"),
				new Beat(40080 - startTime - gap, "F"),
				new Beat(40310 - startTime - gap, "D"),
				new Beat(40550 - startTime - gap, "F"),
				new Beat(40660 - startTime - gap, "J"),
				new Beat(40800 - startTime - gap, "F"),
				new Beat(40940 - startTime - gap, "J"),
				new Beat(41080 - startTime - gap, "F"),
				new Beat(41180 - startTime - gap, "J"),
				new Beat(41330 - startTime - gap, "F"),
				new Beat(41470 - startTime - gap, "J"),
				new Beat(41600 - startTime - gap, "F"),
				new Beat(41690 - startTime - gap, "J"),
				new Beat(41830 - startTime - gap, "F"),
				new Beat(41930 - startTime - gap, "J"),
				new Beat(42070 - startTime - gap, "F"),
				new Beat(42190 - startTime - gap, "J"),
				new Beat(42330 - startTime - gap, "F"),
				new Beat(44440 - startTime - gap, "D"),
				new Beat(44850 - startTime - gap, "D"),
				new Beat(45390 - startTime - gap, "D"),
				new Beat(45910 - startTime - gap, "D"),
				new Beat(46470 - startTime - gap, "K"),
				new Beat(46920 - startTime - gap, "K"),
				new Beat(47410 - startTime - gap, "K"),
				new Beat(47910 - startTime - gap, "K"),
				new Beat(48400 - startTime - gap, "F"),
				new Beat(48880 - startTime - gap, "F"),
				new Beat(49380 - startTime - gap, "K"),
				new Beat(49880 - startTime - gap, "F"),
				new Beat(50360 - startTime - gap, "J"),
				new Beat(50810 - startTime - gap, "F"),
				new Beat(51300 - startTime - gap, "J"),
				new Beat(51850 - startTime - gap, "F"),
				new Beat(52290 - startTime - gap, "J"),
				new Beat(52760 - startTime - gap, "D"),
				new Beat(53210 - startTime - gap, "K"),
				new Beat(53690 - startTime - gap, "S"),
				new Beat(54230 - startTime - gap, "L"),
				new Beat(54710 - startTime - gap, "D"),
				new Beat(55220 - startTime - gap, "K"),
				new Beat(55780 - startTime - gap, "D"),
				new Beat(56180 - startTime - gap, "K"),
				new Beat(56640 - startTime - gap, "D"),
				new Beat(57160 - startTime - gap, "J"),
				new Beat(57640 - startTime - gap, "F"),
				new Beat(58140 - startTime - gap, "K"),
				new Beat(58600 - startTime - gap, "D"),
				new Beat(59120 - startTime - gap, "J"),
				new Beat(59490 - startTime - gap, "F"),
				new Beat(59810 - startTime - gap, "K"),
				new Beat(60070 - startTime - gap, "F"),
				new Beat(60340 - startTime - gap, "J"),
				new Beat(60570 - startTime - gap, "F"),
				new Beat(60830 - startTime - gap, "J"),
				new Beat(60940 - startTime - gap, "F"),
				new Beat(61270 - startTime - gap, "J"),
				new Beat(61800 - startTime - gap, "S"),
				new Beat(61940 - startTime - gap, "L"),
				new Beat(62050 - startTime - gap, "S"),
				new Beat(62290 - startTime - gap, "L"),
				new Beat(62410 - startTime - gap, "S"),
				new Beat(62680 - startTime - gap, "L"),
				new Beat(62810 - startTime - gap, "S"),
				new Beat(64010 - startTime - gap, "J"),
				new Beat(64230 - startTime - gap, "F"),
				new Beat(64500 - startTime - gap, "J"),
				new Beat(64740 - startTime - gap, "F"),
				new Beat(64850 - startTime - gap, "J"),
				new Beat(65160 - startTime - gap, "F"),
				new Beat(65650 - startTime - gap, "L"),
				new Beat(65790 - startTime - gap, "S"),
				new Beat(65950 - startTime - gap, "L"),
				new Beat(66190 - startTime - gap, "S"),
				new Beat(66310 - startTime - gap, "L"),
				new Beat(66550 - startTime - gap, "S"),
				new Beat(66670 - startTime - gap, "L"),
				new Beat(66920 - startTime - gap, "S"),
				new Beat(67060 - startTime - gap, "L"),
				new Beat(67300 - startTime - gap, "D"),
				new Beat(67580 - startTime - gap, "K"),
				new Beat(67860 - startTime - gap, "F"),
				new Beat(68330 - startTime - gap, "J"),
				new Beat(68670 - startTime - gap, "D"),
				new Beat(69050 - startTime - gap, "K"),
				new Beat(69560 - startTime - gap, "F"),
				new Beat(69800 - startTime - gap, "L"),
				new Beat(69930 - startTime - gap, "D"),
				new Beat(70190 - startTime - gap, "K"),
				new Beat(70440 - startTime - gap, "F"),
				new Beat(70730 - startTime - gap, "J"),
				new Beat(70970 - startTime - gap, "S"),
				new Beat(71560 - startTime - gap, "D"),
				new Beat(71810 - startTime - gap, "K"),
				new Beat(72240 - startTime - gap, "D"),
				new Beat(72510 - startTime - gap, "K"),
				new Beat(73510 - startTime - gap, "S"),
				new Beat(73730 - startTime - gap, "L"),
				new Beat(74010 - startTime - gap, "D"),
				new Beat(74250 - startTime - gap, "K"),
				new Beat(74510 - startTime - gap, "F"),
				new Beat(74970 - startTime - gap, "J"),
				new Beat(75460 - startTime - gap, "J"),
				new Beat(75770 - startTime - gap, "F"),
				new Beat(76010 - startTime - gap, "J"),
				new Beat(76200 - startTime - gap, "D"),
				new Beat(76440 - startTime - gap, "K"),
				new Beat(77460 - startTime - gap, "F"),
				new Beat(77550 - startTime - gap, "J"),
				new Beat(77690 - startTime - gap, "D"),
				new Beat(77980 - startTime - gap, "K"),
				new Beat(78180 - startTime - gap, "S"),
				new Beat(78390 - startTime - gap, "L"),
				new Beat(78890 - startTime - gap, "D"),
				new Beat(79320 - startTime - gap, "K"),
				new Beat(79590 - startTime - gap, "F"),
				new Beat(80150 - startTime - gap, "J"),
				new Beat(80370 - startTime - gap, "D"),
				new Beat(80580 - startTime - gap, "K"),
				new Beat(80960 - startTime - gap, "S"),
				new Beat(81340 - startTime - gap, "L"),
				new Beat(81560 - startTime - gap, "D"),
				new Beat(82260 - startTime - gap, "K"),
				new Beat(82530 - startTime - gap, "F"),
				new Beat(83490 - startTime - gap, "J"),
				new Beat(84260 - startTime - gap, "K"),
				new Beat(84510 - startTime - gap, "D"),
				new Beat(84700 - startTime - gap, "L"),
				new Beat(84850 - startTime - gap, "S"),
				new Beat(85160 - startTime - gap, "K"),
				new Beat(86190 - startTime - gap, "D"),
				new Beat(86440 - startTime - gap, "J"),
				new Beat(86650 - startTime - gap, "F"),
				new Beat(86770 - startTime - gap, "K"),
				new Beat(87100 - startTime - gap, "F"),
				new Beat(88180 - startTime - gap, "D"),
				new Beat(88410 - startTime - gap, "K"),
				new Beat(88650 - startTime - gap, "F"),
				new Beat(88910 - startTime - gap, "J"),
				new Beat(89110 - startTime - gap, "D"),
				new Beat(89560 - startTime - gap, "K"),
				new Beat(89790 - startTime - gap, "D"),
				new Beat(90110 - startTime - gap, "K"),
				new Beat(90540 - startTime - gap, "D"),
				new Beat(90880 - startTime - gap, "L"),
				new Beat(91120 - startTime - gap, "S"),
				new Beat(91330 - startTime - gap, "K"),
				new Beat(91590 - startTime - gap, "D"),
				new Beat(91820 - startTime - gap, "J"),
				new Beat(92050 - startTime - gap, "D"),
				new Beat(92180 - startTime - gap, "K"),
				new Beat(92340 - startTime - gap, "D"),
				new Beat(92440 - startTime - gap, "J"),
				new Beat(92580 - startTime - gap, "D"),
				new Beat(92850 - startTime - gap, "K"),
				new Beat(93300 - startTime - gap, "D"),
				new Beat(93450 - startTime - gap, "J"),
				new Beat(93750 - startTime - gap, "D"),
				new Beat(94020 - startTime - gap, "K"),
				new Beat(94140 - startTime - gap, "D"),
				new Beat(94250 - startTime - gap, "J"),
				new Beat(94420 - startTime - gap, "D"),
				new Beat(94520 - startTime - gap, "K"),
				new Beat(94730 - startTime - gap, "D"),
				new Beat(95220 - startTime - gap, "J"),
				new Beat(95400 - startTime - gap, "D"),
				new Beat(95510 - startTime - gap, "K"),
				new Beat(95720 - startTime - gap, "D"),
				new Beat(95810 - startTime - gap, "J"),
				new Beat(96030 - startTime - gap, "D"),
				new Beat(96180 - startTime - gap, "K"),
				new Beat(96300 - startTime - gap, "D"),
				new Beat(96420 - startTime - gap, "J"),
				new Beat(96670 - startTime - gap, "D"),
				new Beat(97140 - startTime - gap, "J"),
				new Beat(97290 - startTime - gap, "K"),
				new Beat(97490 - startTime - gap, "D"),
				new Beat(97730 - startTime - gap, "J"),
				new Beat(98000 - startTime - gap, "K"),
				new Beat(98370 - startTime - gap, "D"),
				new Beat(99070 - startTime - gap, "K"),
				new Beat(99600 - startTime - gap, "K"),
				new Beat(100090 - startTime - gap, "L"),
				new Beat(100620 - startTime - gap, "L"),
				new Beat(101120 - startTime - gap, "L"),
				new Beat(101560 - startTime - gap, "L"),
				new Beat(102060 - startTime - gap, "L"),
				new Beat(102560 - startTime - gap, "L"),
				new Beat(103050 - startTime - gap, "L"),
				new Beat(103520 - startTime - gap, "S"),
				new Beat(103540 - startTime - gap, "L"),
				new Beat(104000 - startTime - gap, "S"),
				new Beat(104030 - startTime - gap, "L"),
				new Beat(104520 - startTime - gap, "S"),
				new Beat(104540 - startTime - gap, "L"),
				new Beat(105000 - startTime - gap, "S"),
				new Beat(105010 - startTime - gap, "L"),
				new Beat(105460 - startTime - gap, "S"),
				new Beat(105490 - startTime - gap, "L"),
				new Beat(105920 - startTime - gap, "S"),
				new Beat(105930 - startTime - gap, "L"),
				new Beat(106410 - startTime - gap, "S"),
				new Beat(106430 - startTime - gap, "L"),
				new Beat(106900 - startTime - gap, "S"),
				new Beat(106910 - startTime - gap, "L"),
				new Beat(106910 - startTime - gap, "K"),
				new Beat(106910 - startTime - gap, "D"),
				new Beat(107380 - startTime - gap, "S"),
				new Beat(107400 - startTime - gap, "L"),
				new Beat(107410 - startTime - gap, "K"),
				new Beat(107410 - startTime - gap, "D"),
				new Beat(107860 - startTime - gap, "L"),
				new Beat(107860 - startTime - gap, "S"),
				new Beat(107890 - startTime - gap, "K"),
				new Beat(107890 - startTime - gap, "D"),
				new Beat(108370 - startTime - gap, "D"),
				new Beat(108370 - startTime - gap, "S"),
				new Beat(108390 - startTime - gap, "L"),
				new Beat(108390 - startTime - gap, "K"),
				new Beat(108880 - startTime - gap, "S"),
				new Beat(108900 - startTime - gap, "L"),
				new Beat(108900 - startTime - gap, "K"),
				new Beat(108900 - startTime - gap, "F"),
				new Beat(108900 - startTime - gap, "D"),
				new Beat(108900 - startTime - gap, "J"),
				new Beat(109310 - startTime - gap, "S"),
				new Beat(109330 - startTime - gap, "D"),
				new Beat(109350 - startTime - gap, "L"),
				new Beat(109350 - startTime - gap, "K"),
				new Beat(109350 - startTime - gap, "F"),
				new Beat(109350 - startTime - gap, "J"),
				new Beat(109790 - startTime - gap, "S"),
				new Beat(109800 - startTime - gap, "D"),
				new Beat(109830 - startTime - gap, "L"),
				new Beat(109830 - startTime - gap, "K"),
				new Beat(109830 - startTime - gap, "F"),
				new Beat(109830 - startTime - gap, "J"),
				new Beat(110310 - startTime - gap, "S"),
				new Beat(110330 - startTime - gap, "D"),
				new Beat(110350 - startTime - gap, "L"),
				new Beat(110350 - startTime - gap, "J"),
				new Beat(110380 - startTime - gap, "K"),
				new Beat(110400 - startTime - gap, "F"),
				new Beat(110790 - startTime - gap, "F"),
				new Beat(111320 - startTime - gap, "J"),
				new Beat(111790 - startTime - gap, "F"),
				new Beat(112310 - startTime - gap, "K"),
				new Beat(112760 - startTime - gap, "D"),
				new Beat(112890 - startTime - gap, "K"),
				new Beat(113030 - startTime - gap, "D"),
				new Beat(113160 - startTime - gap, "K"),
				new Beat(113310 - startTime - gap, "D"),
				new Beat(113420 - startTime - gap, "K"),
				new Beat(113540 - startTime - gap, "D"),
				new Beat(113660 - startTime - gap, "K"),
				new Beat(113770 - startTime - gap, "D"),
				new Beat(113880 - startTime - gap, "K"),
				new Beat(114010 - startTime - gap, "D"),
				new Beat(114140 - startTime - gap, "K"),
				new Beat(114260 - startTime - gap, "D"),
				new Beat(114390 - startTime - gap, "K"),
				new Beat(114520 - startTime - gap, "D"),
				new Beat(114640 - startTime - gap, "K"),
				new Beat(116690 - startTime - gap, "F"),
				new Beat(117240 - startTime - gap, "J"),
				new Beat(117690 - startTime - gap, "F"),
				new Beat(118110 - startTime - gap, "J"),
				new Beat(118620 - startTime - gap, "F"),
				new Beat(119150 - startTime - gap, "J"),
				new Beat(119580 - startTime - gap, "D"),
				new Beat(119930 - startTime - gap, "K"),
				new Beat(120320 - startTime - gap, "F"),
				new Beat(120770 - startTime - gap, "J"),
				new Beat(121080 - startTime - gap, "D"),
				new Beat(121540 - startTime - gap, "F"),
				new Beat(121570 - startTime - gap, "J"),
				new Beat(122040 - startTime - gap, "D"),
				new Beat(122070 - startTime - gap, "K"),
				new Beat(122540 - startTime - gap, "F"),
				new Beat(122540 - startTime - gap, "J"),
				new Beat(123010 - startTime - gap, "D"),
				new Beat(123020 - startTime - gap, "K"),
				new Beat(123490 - startTime - gap, "F"),
				new Beat(123490 - startTime - gap, "J"),
				new Beat(123970 - startTime - gap, "D"),
				new Beat(123990 - startTime - gap, "K"),
				new Beat(124450 - startTime - gap, "F"),
				new Beat(124480 - startTime - gap, "J"),
				new Beat(124940 - startTime - gap, "D"),
				new Beat(124970 - startTime - gap, "K"),
				new Beat(125410 - startTime - gap, "F"),
				new Beat(125430 - startTime - gap, "J"),
				new Beat(125860 - startTime - gap, "D"),
				new Beat(125890 - startTime - gap, "K"),
				new Beat(126440 - startTime - gap, "S"),
				new Beat(126460 - startTime - gap, "L"),
				new Beat(126910 - startTime - gap, "D"),
				new Beat(126940 - startTime - gap, "K"),
				new Beat(127380 - startTime - gap, "F"),
				new Beat(127400 - startTime - gap, "J"),
				new Beat(127910 - startTime - gap, "F"),
				new Beat(127920 - startTime - gap, "J"),
				new Beat(128350 - startTime - gap, "F"),
				new Beat(128380 - startTime - gap, "J"),
				new Beat(128840 - startTime - gap, "F"),
				new Beat(128840 - startTime - gap, "J"),
				new Beat(129350 - startTime - gap, "D"),
				new Beat(129370 - startTime - gap, "K"),
				new Beat(129810 - startTime - gap, "D"),
				new Beat(129850 - startTime - gap, "K"),
				new Beat(130280 - startTime - gap, "D"),
				new Beat(130290 - startTime - gap, "K"),
				new Beat(130760 - startTime - gap, "D"),
				new Beat(130790 - startTime - gap, "K"),
				new Beat(131240 - startTime - gap, "D"),
				new Beat(131260 - startTime - gap, "K"),
				new Beat(131630 - startTime - gap, "D"),
				new Beat(131650 - startTime - gap, "K"),
				new Beat(131660 - startTime - gap, "F"),
				new Beat(131670 - startTime - gap, "J"),
				new Beat(132020 - startTime - gap, "L"),
				new Beat(132020 - startTime - gap, "K"),
				new Beat(132020 - startTime - gap, "D"),
				new Beat(132020 - startTime - gap, "S"),
				new Beat(132020 - startTime - gap, "J"),
				new Beat(132040 - startTime - gap, "F"),
				new Beat(133970 - startTime - gap, "D"),
				new Beat(134050 - startTime - gap, "K"),
				new Beat(134170 - startTime - gap, "D"),
				new Beat(134480 - startTime - gap, "K"),
				new Beat(134640 - startTime - gap, "D"),
				new Beat(134900 - startTime - gap, "K"),
				new Beat(135010 - startTime - gap, "D"),
				new Beat(135590 - startTime - gap, "K"),
				new Beat(136220 - startTime - gap, "F"),
				new Beat(136330 - startTime - gap, "J"),
				new Beat(136660 - startTime - gap, "F"),
				new Beat(136930 - startTime - gap, "J"),
				new Beat(137040 - startTime - gap, "F"),
				new Beat(137290 - startTime - gap, "J"),
				new Beat(137400 - startTime - gap, "F"),
				new Beat(137730 - startTime - gap, "K"),
				new Beat(138150 - startTime - gap, "D"),
				new Beat(138420 - startTime - gap, "J"),
				new Beat(138630 - startTime - gap, "F"),
				new Beat(138920 - startTime - gap, "K"),
				new Beat(139130 - startTime - gap, "D"),
				new Beat(139360 - startTime - gap, "J"),
				new Beat(140090 - startTime - gap, "F"),
				new Beat(140570 - startTime - gap, "K"),
				new Beat(141050 - startTime - gap, "F"),
				new Beat(141590 - startTime - gap, "J"),
				new Beat(142070 - startTime - gap, "D"),
				new Beat(142530 - startTime - gap, "K"),
				new Beat(143030 - startTime - gap, "S"),
				new Beat(143460 - startTime - gap, "L"),
				new Beat(143780 - startTime - gap, "D"),
				new Beat(144050 - startTime - gap, "K"),
				new Beat(144520 - startTime - gap, "F"),
				new Beat(144770 - startTime - gap, "J"),
				new Beat(145680 - startTime - gap, "D"),
				new Beat(145950 - startTime - gap, "K"),
				new Beat(146170 - startTime - gap, "D"),
				new Beat(146450 - startTime - gap, "K"),
				new Beat(146680 - startTime - gap, "D"),
				new Beat(147090 - startTime - gap, "K"),
				new Beat(147580 - startTime - gap, "D"),
				new Beat(148220 - startTime - gap, "D"),
				new Beat(148810 - startTime - gap, "D"),
				new Beat(149400 - startTime - gap, "D"),
				new Beat(149830 - startTime - gap, "J"),
				new Beat(150350 - startTime - gap, "F"),
				new Beat(150830 - startTime - gap, "J"),
				new Beat(151350 - startTime - gap, "F"),
				new Beat(151790 - startTime - gap, "K"),
				new Beat(152290 - startTime - gap, "D"),
				new Beat(152770 - startTime - gap, "K"),
				new Beat(153230 - startTime - gap, "D"),
				new Beat(153750 - startTime - gap, "K"),
				new Beat(154320 - startTime - gap, "D"),
				new Beat(154710 - startTime - gap, "K"),
				new Beat(155170 - startTime - gap, "D"),
				new Beat(155650 - startTime - gap, "K"),
				new Beat(156170 - startTime - gap, "D"),
				new Beat(156650 - startTime - gap, "K"),
				new Beat(157100 - startTime - gap, "D"),
				new Beat(157570 - startTime - gap, "K"),
				new Beat(158020 - startTime - gap, "D"),
				new Beat(158510 - startTime - gap, "K"),
				new Beat(158960 - startTime - gap, "D"),
				new Beat(159490 - startTime - gap, "K"),
				new Beat(159960 - startTime - gap, "D"),
				new Beat(160410 - startTime - gap, "K"),
				new Beat(160930 - startTime - gap, "D"),
				new Beat(161380 - startTime - gap, "K"),
				new Beat(162080 - startTime - gap, "D"),
				new Beat(162520 - startTime - gap, "K"),
				new Beat(162960 - startTime - gap, "D"),
				new Beat(163490 - startTime - gap, "K"),
				new Beat(163930 - startTime - gap, "D"),
				new Beat(164410 - startTime - gap, "K"),
				new Beat(164830 - startTime - gap, "D"),
				new Beat(165450 - startTime - gap, "K"),
				new Beat(165860 - startTime - gap, "F"),
				new Beat(166340 - startTime - gap, "J"),
				new Beat(166820 - startTime - gap, "F"),
				new Beat(167380 - startTime - gap, "J"),
				new Beat(167870 - startTime - gap, "F"),
				new Beat(168370 - startTime - gap, "J"),
				new Beat(168810 - startTime - gap, "F"),
				new Beat(169270 - startTime - gap, "J"),
				new Beat(169720 - startTime - gap, "F"),
				new Beat(170170 - startTime - gap, "J"),
				new Beat(170730 - startTime - gap, "F"),
				new Beat(171220 - startTime - gap, "J"),
				new Beat(171720 - startTime - gap, "F"),
				new Beat(172190 - startTime - gap, "J"),
				new Beat(172730 - startTime - gap, "F"),
				new Beat(173190 - startTime - gap, "J"),
				new Beat(173720 - startTime - gap, "F"),
				new Beat(174150 - startTime - gap, "J"),
				new Beat(174590 - startTime - gap, "F"),
				new Beat(175120 - startTime - gap, "J"),
				new Beat(175590 - startTime - gap, "F"),
				new Beat(176050 - startTime - gap, "J"),
				new Beat(176540 - startTime - gap, "F"),
				new Beat(177070 - startTime - gap, "J"),
				new Beat(177540 - startTime - gap, "F"),
				new Beat(178000 - startTime - gap, "J"),
				new Beat(178570 - startTime - gap, "F"),
				new Beat(179050 - startTime - gap, "J"),
				new Beat(179500 - startTime - gap, "F"),
				new Beat(180040 - startTime - gap, "J"),
				new Beat(180540 - startTime - gap, "F"),
				new Beat(181020 - startTime - gap, "J"),
				new Beat(181470 - startTime - gap, "F"),
				new Beat(181980 - startTime - gap, "J"),
				new Beat(182430 - startTime - gap, "F"),
				new Beat(183990 - startTime - gap, "S"),
				new Beat(184510 - startTime - gap, "S"),
				new Beat(184530 - startTime - gap, "S"),
				new Beat(184570 - startTime - gap, "S"),
				new Beat(184590 - startTime - gap, "S"),
				new Beat(184620 - startTime - gap, "S"),
				new Beat(184650 - startTime - gap, "S"),
				new Beat(184690 - startTime - gap, "S"),
				new Beat(184730 - startTime - gap, "S"),
				new Beat(184750 - startTime - gap, "S"),
				new Beat(184790 - startTime - gap, "S"),
				new Beat(184830 - startTime - gap, "S"),
				new Beat(184850 - startTime - gap, "S"),
				new Beat(184890 - startTime - gap, "S"),
				new Beat(184930 - startTime - gap, "S"),
				new Beat(184950 - startTime - gap, "S"),
				new Beat(184990 - startTime - gap, "S"),
				new Beat(185030 - startTime - gap, "S"),
				new Beat(185030 - startTime - gap, "K"),
				new Beat(185530 - startTime - gap, "J"),
				new Beat(185970 - startTime - gap, "K"),
				new Beat(186460 - startTime - gap, "J"),
				new Beat(186950 - startTime - gap, "K"),
				new Beat(187420 - startTime - gap, "J"),
				new Beat(187890 - startTime - gap, "K"),
				new Beat(188410 - startTime - gap, "J"),
				new Beat(188890 - startTime - gap, "K"),
				new Beat(189360 - startTime - gap, "J"),
				new Beat(189820 - startTime - gap, "K"),
				new Beat(190280 - startTime - gap, "J"),
				new Beat(190780 - startTime - gap, "K"),
				new Beat(191260 - startTime - gap, "K"),
				new Beat(191760 - startTime - gap, "K"),
				new Beat(192260 - startTime - gap, "K"),
				new Beat(192780 - startTime - gap, "K"),
				new Beat(193240 - startTime - gap, "K"),
				new Beat(193710 - startTime - gap, "K"),
				new Beat(194230 - startTime - gap, "K"),
				new Beat(194700 - startTime - gap, "K"),
				new Beat(195220 - startTime - gap, "K"),
				new Beat(195690 - startTime - gap, "K"),
				new Beat(196160 - startTime - gap, "K"),
				new Beat(196690 - startTime - gap, "K"),
				new Beat(197130 - startTime - gap, "K"),
				new Beat(197600 - startTime - gap, "K"),
				new Beat(198130 - startTime - gap, "K"),
				new Beat(198600 - startTime - gap, "F"),
				new Beat(199090 - startTime - gap, "J"),
				new Beat(199620 - startTime - gap, "F"),
				new Beat(200100 - startTime - gap, "J"),
				new Beat(200550 - startTime - gap, "D"),
				new Beat(201060 - startTime - gap, "K"),
				new Beat(201530 - startTime - gap, "F"),
				new Beat(202040 - startTime - gap, "L"),
				new Beat(202470 - startTime - gap, "D"),
				new Beat(202980 - startTime - gap, "K"),
				new Beat(203460 - startTime - gap, "F"),
				new Beat(203940 - startTime - gap, "J"),
				new Beat(204460 - startTime - gap, "D"),
				new Beat(204980 - startTime - gap, "K"),
				new Beat(205440 - startTime - gap, "F"),
				new Beat(205950 - startTime - gap, "L"),
				new Beat(206410 - startTime - gap, "D"),
				new Beat(206930 - startTime - gap, "K"),
				new Beat(207260 - startTime - gap, "F"),
				new Beat(207670 - startTime - gap, "J"),
				new Beat(208120 - startTime - gap, "D"),
				new Beat(208380 - startTime - gap, "K"),
				new Beat(208520 - startTime - gap, "F"),
				new Beat(208780 - startTime - gap, "L"),
				new Beat(209020 - startTime - gap, "D"),
				new Beat(209260 - startTime - gap, "K"),
				new Beat(209490 - startTime - gap, "F"),
				new Beat(209610 - startTime - gap, "J"),
				new Beat(210070 - startTime - gap, "D"),
				new Beat(210220 - startTime - gap, "K"),
				new Beat(210330 - startTime - gap, "F"),
				new Beat(210780 - startTime - gap, "L"),
				new Beat(210900 - startTime - gap, "D"),
				new Beat(211010 - startTime - gap, "K"),
				new Beat(212050 - startTime - gap, "D"),
				new Beat(212290 - startTime - gap, "J"),
				new Beat(212470 - startTime - gap, "F"),
				new Beat(212750 - startTime - gap, "K"),
				new Beat(213010 - startTime - gap, "D"),
				new Beat(213460 - startTime - gap, "L"),
				new Beat(214000 - startTime - gap, "L")

		};
	}
}
