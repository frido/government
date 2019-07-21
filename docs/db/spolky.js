exports.spolky = [
  {
    'id': 1,
    'key': 'petrzalka',
    'meno': 'Petržalka',
    'clenovia': [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35],
    'starosta': 36,
    'vicestarosta1': 21,
    'vicestarosta2': 29,
    'plat': {
      'priemernaMzda': 954.00,
      'index': 3.98,
      'starosta': 3797,
      'starostaMin': 3797,
      'starostaMax': 6076,
      'primator': 5316,
      'primatorMin': 3797,
      'primatorMax': 6076,
      'miestny poslanec': {

      },
      'mestsky poslanec': {
        'poslanec': '0.8 * (1/12) * primatorMin',
        'rada/predseda': '0.1 * (1/12) * primatorMin',
        'clen': '0.1 * (1/12) * primatorMin'
      }
    },
    'menu': [
      'uznesenia',
      'interpelacia',
      'poslanci',
      'starosta',
      'vystavba'
    ],
    'employee': [
      {
        'id': 1,
        'fk': 36,
        'votes': 10659,
        'party': 'SaS, NOVA, KDH, OKS, SME RODINA - Boris Kollár',
        'title': 'starosta'
      }, {
        'id': 2,
        'fk': 21,
        'title': '1. vicestarostka'
      }, {
        'id': 3,
        'fk': 29,
        'title': '2. vicestarostka'
      }, {
        'id': 4,
        'fk': 53,
        'title': 'prednosta'
      }, {
        'id': 5,
        'fk': 55,
        'title': 'miestny kontrolór'
      }
    ],
    'commission': [
      {
        'id': 1,
        'name': 'Komisia územného plánu, výstavby a dopravy',
        'desc': ''
      }, {
        'id': 2,
        'name': 'Komisia životného prostredia a verejného poriadku',
        'desc': ''
      }, {
        'id': 3,
        'name': 'Komisia finančná',
        'desc': ''
      }, {
        'id': 4,
        'name': 'Miestna rada',
        'desc': ''
      }, {
        'id': 5,
        'name': 'Komisia športu',
        'desc': ''
      }, {
        'id': 6,
        'name': 'Komisia školská',
        'desc': ''
      }, {
        'id': 7,
        'name': 'Komisia sociálna a bytová',
        'desc': ''
      }, {
        'id': 8,
        'name': 'Komisia kultúry a mládeže',
        'desc': ''
      }, {
        'id': 9,
        'name': 'Komisia investičných činností',
        'desc': ''
      }, {
        'id': 10,
        'name': 'Komisia správy majetku a miestnych podnikov',
        'desc': ''
      }, {
        'id': 11,
        'name': 'Komisia na ochranu verejného záujmu pri výkone funkcií',
        'desc': ''
      }, {
        'id': 12,
        'name': 'Mandátová komisia',
        'desc': ''
      }, {
        'id': 100,
        'name': 'Sobášiaci',
        'desc': ''
      }
    ],
    'fb': {
      'title': 'Petržalka.info',
      'link': 'https://www.facebook.com/petrzalka.info'
    }
  },
  {
    'id': 2,
    'key': 'detva',
    'meno': 'Detva',
    'clenovia': [1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018],
    'starosta': 1001,
    'plat': {
      'priemernaMzda': 954.00,
      'index': 2.81,
      'starosta': 3754,
      'starostaMin': 2681,
      'starostaMax': 4289
    },
    'menu': [
      'uznesenia',
      'interpelacia',
      'poslanci'
    ],
    'fb': {
      'title': 'Detva.info',
      'link': 'https://www.facebook.com/Detvainfo-215319999381212'
    }
  }, {
    'id': 3,
    'key': 'ba',
    'meno': 'Bratislava',
    'clenovia': [],
    'starosta': 0,
    'menu': []
  }, {
    'id': 4,
    'key': 'vuc-ba',
    'meno': 'Bratislavský samosprávny kraj',
    'clenovia': [],
    'starosta': 0,
    'menu': []
  }
]
