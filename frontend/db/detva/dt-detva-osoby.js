// 1-poslanec, 2-zamestnanec, 3-externy 4-starosta
exports.ludia = [
  {
    'id': 1001,
    'name': 'Ján Šufliarský',
    'prefix': 'Ing.',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 2560,
        'mayor': true
      }
    ],
    'commission': [ ],
    'departments': [ ],
    'office': [
      { 'council': 2, 'fk': 1, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'klub': null,
    'fb': null
  },
  {
    'id': 1002,
    'name': 'Maroš Krnáč',
    'prefix': 'Ing.',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'ŠANCA',
        'votes': 170
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 1, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 2, 'chairman': false }
    ],
    'klub': null,
    'fb': null
  },
  {
    'id': 1003,
    'name': 'Ondrej Vrťo',
    'prefix': 'Ing.',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'KDH',
        'votes': 163
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 3, 'chairman': true },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 2, 'chairman': false }
    ],
    'klub': null,
    'fb': null
  },
  {
    'id': 1004,
    'name': 'Imrich Murín',
    'prefix': '',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 202
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 2, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 4, 'chairman': false }
    ],
    'klub': null,
    'fb': null
  },
  {
    'id': 1005,
    'name': 'Branislav Baran',
    'prefix': '',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 601
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 3, 'chairman': false }
    ],
    'klub': null,
    'fb': null
  },
  {
    'id': 1006,
    'name': 'Jozef Kulišiak (3)',
    'prefix': '',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 457
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 5, 'chairman': false }
    ],
    'klub': null,
    'fb': null
  },
  {
    'id': 1007,
    'name': 'Katarína Krekáňová',
    'prefix': 'Mgr.',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 455
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 6, 'chairman': true },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 7, 'chairman': false }
    ],
    'klub': null,
    'fb': null
  },
  {
    'id': 1008,
    'name': 'Vladimír Kučera',
    'prefix': 'Ing.',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'KDH',
        'votes': 454
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 1, 'chairman': true },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 5, 'chairman': false }
    ],
    'klub': null,
    'fb': null
  },
  {
    'id': 1009,
    'name': 'Slavomír Ciglan',
    'prefix': 'Mgr.',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 686
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 8, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 7, 'chairman': false }
    ],
    'klub': null,
    'fb': null
  },
  {
    'id': 1010,
    'name': 'Darina Labáková',
    'prefix': 'Mgr.',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'SMER-SD',
        'votes': 520
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 8, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 5, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 2, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 100, 'chairman': false }
    ],
    'klub': null,
    'fb': null,
    'role': 1
  },
  {
    'id': 1011,
    'name': 'Ján Šiandor',
    'prefix': '',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 498
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 3, 'chairman': false }
    ],
    'klub': null,
    'fb': null,
    'role': 1
  },
  {
    'id': 1012,
    'name': 'Jana Kuzárová',
    'prefix': 'Mgr.',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'KDH',
        'votes': 496
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 7, 'chairman': true },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 6, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 100, 'chairman': false }
    ],
    'klub': null,
    'fb': null,
    'role': 1
  },
  {
    'id': 1013,
    'name': 'Oľga Vilhanová',
    'prefix': '',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 416
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 1, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 100, 'chairman': false }
    ],
    'klub': null,
    'fb': null,
    'role': 1
  },
  {
    'id': 1014,
    'name': 'Jozef Kulišiak (5)',
    'prefix': '',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 387
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 2, 'chairman': true },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 1, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 4, 'chairman': false }
    ],
    'klub': null,
    'fb': null,
    'role': 1
  },
  {
    'id': 1015,
    'name': 'Jozef Výbošťok',
    'prefix': '',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 380
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 4, 'chairman': false }
    ],
    'klub': null,
    'fb': null,
    'role': 1
  },
  {
    'id': 1016,
    'name': 'Pavel Golian',
    'prefix': '',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'NEKA',
        'votes': 346
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 5, 'chairman': true },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 3, 'chairman': false }
    ],
    'klub': null,
    'fb': null,
    'role': 1
  },
  {
    'id': 1017,
    'name': 'Vladimír Dado',
    'prefix': 'PhDr.',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'KDH',
        'votes': 315
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 4, 'chairman': true },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 1, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 6, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 100, 'chairman': false }
    ],
    'klub': null,
    'fb': null,
    'role': 1
  },
  {
    'id': 1018,
    'name': 'Gabriela Melichová',
    'prefix': '',
    'election': [
      {
        'id': 1,
        'council': 2,
        'from': '01.12.2018', 'to': null,
        'party': 'KDH',
        'votes': 195
      }
    ],
    'deputy': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'election': 1 }
    ],
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 8, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 7, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 6, 'chairman': false },
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 100, 'chairman': false }
    ],
    'klub': null,
    'fb': null,
    'role': 1
  },
  {
    'id': 1019,
    'name': 'Mikuláš Klimo',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 1, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1020,
    'name': 'Martina Ostrihoň',
    'prefix': 'Ing.',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 1, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1021,
    'name': 'Elena Nôtová',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 3, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1022,
    'name': 'Ivan Horváth',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 3, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1023,
    'name': 'Ján Parobek',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 5, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1024,
    'name': 'Dušan Vepřek',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 5, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1025,
    'name': 'Ivan Kollárik',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 5, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1026,
    'name': 'Tomáš Dom',
    'prefix': 'PhDr.',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 4, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1027,
    'name': 'Michaela Fekiačová',
    'prefix': 'Ing.',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 4, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1028,
    'name': 'Helena Gajdošová',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 4, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1029,
    'name': 'Ladislava Ruščáková',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 7, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1030,
    'name': 'Anna Bartóková',
    'prefix': 'Mgr.',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 7, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1031,
    'name': 'Vladimír Oláh',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 7, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1032,
    'name': 'Ľubomír Ostrihoň',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 6, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1033,
    'name': 'František Schmidt',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 6, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1034,
    'name': 'Štefan Závodný',
    'prefix': '',
    'commission': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'fk': 6, 'chairman': false }
    ],
    'role': 3
  },
  {
    'id': 1035,
    'name': 'Erika Mojžišová',
    'prefix': 'Ing.',
    'commission': [ ],
    'departments': [
      { 'council': 2, 'from': '01.12.2018', 'to': null, 'department': 2, 'role': 1 }
    ],
    'role': 3
  }
]
