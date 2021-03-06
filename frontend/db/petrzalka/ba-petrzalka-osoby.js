// 1-poslanec, 2-zamestnanec, 3-externy
exports.ludia = [
  {
    'id': 0,
    'name': '',
    'prefix': '',
    'suffix': '',
    'party': '',
    'votes': 0
  },
  {
    'id': 1,
    'name': 'Natália Podhorná',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 2116
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 2, 'chairman': true }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 7, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'natalia.podhorna',
    'role': 1
  },
  {
    'id': 2,
    'name': 'Branislav Kleinert',
    'prefix': 'Ing.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 1866
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 3, 'chairman': true }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 8, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'branislav.kleinert',
    'role': 1
  },
  {
    'id': 3,
    'name': 'Branislav Sepši',
    'prefix': 'Ing. arch.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1861
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 3, 'role': 1 }
    ],
    'klub': null,
    'fb': 'branislav.sepsi.52',
    'role': 1
  },
  {
    'id': 4,
    'name': 'Tatiana Kratochvílová',
    'prefix': 'Ing.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1860
      }, {
        'council': 3,
        'period': '2018/2022',
        'votes': 9409,
        'party': 'Progresívne Slovensko, SPOLU'
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 2, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 2, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 10, 'role': 1 }
    ],
    'klub': 'Team Vallo',
    'fb': null,
    'role': 1
  },
  {
    'id': 5,
    'name': 'Drahan Petrovič',
    'prefix': 'Ing. arch',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1859
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 4, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 33, 'role': 1 },
      { 'council': 3, 'period': '2018/2022', 'department': 8, 'role': 1 }
    ],
    'klub': 'Team Vallo',
    'fb': null,
    'role': 1
  },
  {
    'id': 6,
    'name': 'Iveta Plšeková',
    'prefix': 'MUDr.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'MLADÁ PETRŽALKA - lokálna strana',
        'votes': 1728
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 3, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 2, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 5, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 17, 'role': 1 }
    ],
    'klub': 'Mladá Petržalka',
    'fb': 'iveta.plsekova',
    'role': 1
  },
  {
    'id': 7,
    'name': 'Jozef Fischer',
    'prefix': 'Bc. Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1710
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 5, 'chairman': true }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 16, 'role': 1 }
    ],
    'klub': null,
    'fb': 'fischo',
    'role': 1
  },
  {
    'id': 8,
    'name': 'Gabriela Fulová',
    'prefix': 'Ing.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 1708
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 2, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 6, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 4, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 28, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': null,
    'role': 1
  },
  {
    'id': 9,
    'name': 'Iveta Jančoková',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 1702
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 7, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 8, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 6, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 5, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 34, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'iveta.fecova',
    'role': 1
  },
  {
    'id': 10,
    'name': 'Matúš Repka',
    'prefix': 'Ing. arch.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1678
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 9, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 12, 'role': 1 }
    ],
    'klub': 'Team Vallo',
    'fb': 'profile.php?id=100014573430873',
    'role': 1
  },
  {
    'id': 11,
    'name': 'Lena Bočkayová',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Nezávislý kandidát',
        'votes': 1664
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 10, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 6, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 11, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 2, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 25, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': null,
    'role': 1
  },
  {
    'id': 12,
    'name': 'Tomáš Palkovič',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1564
      }, {
        'council': 3,
        'period': '2018/2022',
        'votes': 6622,
        'party': 'Progresívne Slovensko, SPOLU'
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 4, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 3, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 2, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 10, 'role': 1 }
    ],
    'klub': 'Team Vallo',
    'fb': 'tomolas',
    'role': 1
  },
  {
    'id': 13,
    'name': 'Pavol Škápik',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1558
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 10, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 2, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 11, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 4, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 5, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 18, 'role': 1 }
    ],
    'klub': null,
    'fb': 'pavol.skapik',
    'role': 1
  },
  {
    'id': 14,
    'name': 'Michala Kozáková',
    'prefix': 'Ing. arch.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1369
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 9, 'chairman': true },
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 2, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 27, 'role': 1 }
    ],
    'klub': 'Team Vallo',
    'fb': 'michala.basova.5',
    'role': 1
  },
  {
    'id': 15,
    'name': 'Miroslav Dragun',
    'prefix': '',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Nezávislý kandidát',
        'votes': 1328
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 9, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 2, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 9, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 23, 'role': 1 }
    ],
    'klub': null,
    'fb': 'MiroslavDragun',
    'role': 1
  },
  {
    'id': 16,
    'name': 'Miroslav Behúl',
    'prefix': 'Ing.',
    'suffix': 'PhD.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 1317
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 9, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 11, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 10, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 6, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 20, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'miroslav.behul',
    'role': 1
  },
  {
    'id': 17,
    'name': 'Ivan Halmo',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1317
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 5, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 13, 'role': 1 }
    ],
    'klub': 'Team Vallo',
    'fb': null,
    'role': 1
  },
  {
    'id': 36,
    'name': 'Ján Hrčka',
    'prefix': 'Ing.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 2613,
        'party': 'KDS, NOVA, OKS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti, Zmena zdola, DÚ'
      }, {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 10659,
        'mayor': true
      }, {
        'council': 3,
        'period': '2018/2022',
        'votes': 10883,
        'party': 'NEKA'
      }
    ],
    'commission': [
      { 'council': 3, 'period': '2018/2022', 'fk': 4, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 5, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 1, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'jan.hrcka.98',
    'role': 4
  },
  {
    'id': 18,
    'name': 'Elena Pätoprstá',
    'prefix': 'Ing. arch., Mgr. art.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'party': 'KDS, NOVA, OKS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti, Zmena zdola, DÚ',
        'votes': 1839
      }, {
        'council': 1,
        'period': '2018/2022',
        'party': 'Zmena zdola, DÚ, OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO)',
        'votes': 1857
      }, {
        'council': 3,
        'period': '2018/2022',
        'votes': 9469,
        'party': 'OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), SaS, SME RODINA - Boris Kollár, KDH, OKS, NOVA, Zmena zdola, DÚ'
      }, {
        'council': 4,
        'period': '2017/2022',
        'party': 'SaS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), KDH, SMK-MKP, NOVA, OKS, Zmena zdola, DÚ',
        'votes': 10665
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 2, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 11, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 1, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 11, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 32, 'role': 1 },
      { 'council': 3, 'period': '2018/2022', 'department': 12, 'role': 1 },
      { 'council': 4, 'period': '2017/2022', 'department': 1, 'role': 2 }
    ],
    'klub': null,
    'fb': 'elena.patoprsta',
    'role': 1
  },
  {
    'id': 19,
    'name': 'Vladimír Dolinay',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1732,
        'party': 'KDS, NOVA, OKS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti, Zmena zdola, DÚ'
      }, {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 2346
      }, {
        'council': 3,
        'period': '2018/2022',
        'votes': 6862,
        'party': 'OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), SaS, SME RODINA - Boris Kollár, KDH, OKS, NOVA, Zmena zdola, DÚ'
      }, {
        'council': 4,
        'period': '2017/2022',
        'party': 'SaS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), KDH, SMK-MKP, NOVA, OKS, Zmena zdola, DÚ',
        'votes': 7770
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 6, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 11, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 4, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 4, 'chairman': true },
      { 'council': 4, 'period': '2017/2022', 'fk': 2, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 3, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 4, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 5, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 6, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 8, 'role': 1 },
      { 'council': 3, 'period': '2018/2022', 'department': 3, 'role': 3 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'dolinay',
    'role': 1
  }, {
    'id': 20,
    'name': 'Jozef Vydra',
    'prefix': 'Ing.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1611,
        'party': 'KDS, NOVA, OKS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti, Zmena zdola, DÚ'
      }, {
        'council': 1,
        'period': '2018/2022',
        'votes': 2116,
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár'
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': true },
      { 'council': 1, 'period': '2018/2022', 'fk': 3, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 8, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 29, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'jozef.vydra.3',
    'role': 1
  }, {
    'id': 21,
    'name': 'Lýdia Ovečková',
    'prefix': 'Ing.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1466,
        'party': 'KDS, NOVA, OKS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti, Zmena zdola, DÚ'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 2341
      }, {
        'council': 4,
        'period': '2017/2022',
        'party': 'SaS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), KDH, SMK-MKP, NOVA, OKS, Zmena zdola, DÚ',
        'votes': 8474
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 8, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 2, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 3, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 7, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 6, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 1, 'role': 2 },
      { 'council': 1, 'period': '2018/2022', 'department': 12, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 36, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'lydia.oveckova',
    'role': 1
  }, {
    'id': 22,
    'name': 'Peter Cmorej',
    'prefix': 'Mgr., Ing.',
    'adresa': 'Gercenova 1',
    'mobil': '+421 907 209 700',
    'email': 'peter.cmorej@gmail.com',
    'obvod': '1',
    'dalsie': 'Člen klubu Slobodný klub',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1464,
        'party': 'KDH, MLADÁ PETRŽALKA, MOST - HÍD, SIEŤ, SaS, SDKÚ-DS, SZ'
      }, {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 2376
      }, {
        'council': 3,
        'period': '2018/2022',
        'votes': 7890,
        'party': 'OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), SaS, SME RODINA - Boris Kollár, KDH, OKS, NOVA, Zmena zdola, DÚ'
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 12, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 4, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 6, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 26, 'role': 1 },
      { 'council': 3, 'period': '2018/2022', 'department': 2, 'role': 2 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'peter.cmorej',
    'role': 1
  }, {
    'id': 23,
    'name': 'Ján Bučan',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1383,
        'party': 'KDH, MLADÁ PETRŽALKA, MOST - HÍD, SIEŤ, SaS, SDKÚ-DS, SZ'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Nezávislý kandidát',
        'votes': 1957
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 12, 'chairman': true },
      { 'council': 1, 'period': '2018/2022', 'fk': 5, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 7, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 24, 'role': 1 }
    ],
    'klub': 'My sme Petržalka',
    'fb': 'jan.bucan.33',
    'role': 1
  }, {
    'id': 24,
    'name': 'Peter Hochschorner',
    'prefix': '',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1357,
        'party': 'KDS, NOVA, OKS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti, Zmena zdola, DÚ'
      }, {
        'council': 1,
        'period': '2018/2022',
        'party': 'Zmena zdola, DÚ, OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO)',
        'votes': 1508
      }, {
        'council': 3,
        'period': '2018/2022',
        'votes': 8048,
        'party': 'OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), SaS, SME RODINA - Boris Kollár, KDH, OKS, NOVA, Zmena zdola, DÚ'
      }, {
        'council': 4,
        'period': '2017/2022',
        'party': 'SaS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), KDH, SMK-MKP, NOVA, OKS, Zmena zdola, DÚ',
        'votes': 9671
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 5, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 4, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 7, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 2, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 9, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 9, 'role': 1 },
      { 'council': 3, 'period': '2018/2022', 'department': 6, 'role': 1 }
    ],
    'fb': null,
    'role': 1
  }, {
    'id': 25,
    'name': 'Oliver Kríž',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1301,
        'party': 'KDH, MLADÁ PETRŽALKA, MOST - HÍD, SIEŤ, SaS, SDKÚ-DS, SZ'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'MLADÁ PETRŽALKA - lokálna strana',
        'votes': 1715
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 12, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 1, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 30, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 35, 'role': 1 }
    ],
    'klub': 'Mladá Petržalka',
    'fb': 'oliver.petrzalsky?ref=br_rs',
    'role': 1
  },
  {
    'id': 26,
    'name': 'Ľuboš Kačírek',
    'prefix': 'Mgr.',
    'suffix': 'PhD.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1291,
        'party': 'KDH, MLADÁ PETRŽALKA, MOST - HÍD, SIEŤ, SaS, SDKÚ-DS, SZ'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Progresívne Slovensko, SPOLU',
        'votes': 1861
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 8, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 6, 'chairman': true }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 4, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 14, 'role': 1 }
    ],
    'klub': 'Team Vallo',
    'fb': 'lubos.kacirek.7',
    'role': 1
  }, {
    'id': 27,
    'name': 'Juraj Kríž',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1199,
        'party': 'KDH, MLADÁ PETRŽALKA, MOST - HÍD, SIEŤ, SaS, SDKÚ-DS, SZ'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'MLADÁ PETRŽALKA - lokálna strana',
        'votes': 1527
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 6, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 11, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 4, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 4, 'role': 1 }
    ],
    'klub': 'Mladá Petržalka',
    'fb': 'juraj.kriz.3',
    'role': 1
  }, {
    'id': 28,
    'name': 'Pavel Šesták',
    'prefix': 'Ing.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1094,
        'party': 'KDS, NOVA, OKS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti, Zmena zdola, DÚ'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Nezávislý kandidát',
        'votes': 1288
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 3, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 10, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 4, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 11, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'pavel.sestak.98',
    'role': 1
  },
  {
    'id': 29,
    'name': 'Jana Hrehorová',
    'prefix': '',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1054,
        'party': 'NEKA'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Nezávislý kandidát',
        'votes': 2077
      },
      {
        'council': 4,
        'period': '2017/2022',
        'party': 'Nezávislý kandidát',
        'votes': 5541
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 7, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 6, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 7, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 1, 'role': 3 },
      { 'council': 1, 'period': '2018/2022', 'department': 6, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 11, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 31, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'jana.hrehorova',
    'role': 1
  },
  {
    'id': 30,
    'name': 'Ján Karman',
    'prefix': 'Ing.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1046,
        'party': 'KDH, MLADÁ PETRŽALKA, MOST - HÍD, SIEŤ, SaS, SDKÚ-DS, SZ'
      }, {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 1508
      }, {
        'council': 3,
        'period': '2018/2022',
        'votes': 6646,
        'party': 'OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), SaS, SME RODINA - Boris Kollár, KDH, OKS, NOVA, Zmena zdola, DÚ'
      }, {
        'council': 4,
        'period': '2017/2022',
        'party': 'SaS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), KDH, SMK-MKP, NOVA, OKS, Zmena zdola, DÚ',
        'votes': 5622
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 11, 'chairman': true },
      { 'council': 3, 'period': '2018/2022', 'fk': 3, 'chairman': true },
      { 'council': 3, 'period': '2018/2022', 'fk': 7, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 3, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 4, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 10, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 6, 'chairman': false },
      { 'council': 4, 'period': '2017/2022', 'fk': 11, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 22, 'role': 1 },
      { 'council': 3, 'period': '2018/2022', 'department': 5, 'role': 1 },
      { 'council': 4, 'period': '2017/2022', 'department': 2, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'jan.karman.7',
    'role': 1
  },
  {
    'id': 31,
    'name': 'Miroslava Makovníková Mosná',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 1027,
        'party': 'KDS, NOVA, OKS, OBYČAJNÍ ĽUDIA a nezávislé osobnosti, Zmena zdola, DÚ'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 1900
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 8, 'chairman': true },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 12, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'mirka.m.mosna',
    'role': 1
  }, {
    'id': 32,
    'name': 'Ľudmila Farkašovská',
    'prefix': 'PhDr.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 996,
        'party': 'LEPŠIA ŠTVRŤ, SNS, SMER-SD, SDS, Strana moderného Slovenska, SZS'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'Nezávislý kandidát',
        'votes': 1352
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 4, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 2, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 6, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 2, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 21, 'role': 1 }
    ],
    'klub': null,
    'fb': 'farkasovskaludmila',
    'role': 1
  }, {
    'id': 33,
    'name': 'Milan Vetrák',
    'prefix': 'JUDr.',
    'suffix': 'PhD.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 953,
        'party': 'Nezávislý kandidát'
      }, {
        'council': 1,
        'period': '2018/2022',
        'party': 'Nezávislý kandidát',
        'votes': 2223
      }, {
        'council': 3,
        'period': '2018/2022',
        'votes': 8141,
        'party': 'OBYČAJNÍ ĽUDIA a nezávislé osobnosti (OĽANO), SaS, SME RODINA - Boris Kollár, KDH, OKS, NOVA, Zmena zdola, DÚ'
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 9, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 8, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 4, 'chairman': false },
      { 'council': 3, 'period': '2018/2022', 'fk': 7, 'chairman': true },
      { 'council': 3, 'period': '2018/2022', 'fk': 8, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 19, 'role': 1 },
      { 'council': 3, 'period': '2018/2022', 'department': 4, 'role': 3 },
      { 'council': 3, 'period': '2018/2022', 'department': 6, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'milan.vetrak',
    'role': 1
  },
  {
    'id': 34,
    'name': 'Ivan Uhlár',
    'prefix': 'Mgr.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 931,
        'party': 'KDH, MLADÁ PETRŽALKA, MOST - HÍD, SIEŤ, SaS, SDKÚ-DS, SZ'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'votes': 1895
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 10, 'chairman': true },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 3, 'role': 1 }
    ],
    'klub': 'PRE Petržalku',
    'fb': 'ivan.uhlar.9',
    'role': 1
  },
  {
    'id': 35,
    'name': 'Daniela Palúchová',
    'prefix': 'Mgr.',
    'suffix': 'PhD., MPH.',
    'election': [
      {
        'council': 1,
        'period': '2014/2018',
        'votes': 885,
        'party': 'LEPŠIA ŠTVRŤ, SNS, SMER-SD, SDS, Strana moderného Slovenska, SZS'
      },
      {
        'council': 1,
        'period': '2018/2022',
        'party': 'MLADÁ PETRŽALKA - lokálna strana',
        'votes': 1289
      }
    ],
    'commission': [
      { 'council': 1, 'period': '2018/2022', 'fk': 7, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 8, 'chairman': false },
      { 'council': 1, 'period': '2018/2022', 'fk': 100, 'chairman': false }
    ],
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 9, 'role': 1 },
      { 'council': 1, 'period': '2018/2022', 'department': 15, 'role': 1 }
    ],
    'klub': 'Mladá Petržalka',
    'fb': null,
    'role': 1
  }, {
    'id': 53,
    'name': 'Miroslav Štefánik',
    'prefix': '',
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 1, 'role': 4 }
    ],
    'role': 2
  }, {
    'id': 55,
    'name': 'Stanislav Fiala',
    'prefix': '',
    'departments': [
      { 'council': 1, 'period': '2018/2022', 'department': 1, 'role': 5 }
    ],
    'role': 2
  }
]
