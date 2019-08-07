export const spolky: Spolok[] = [
    {
      'id': 1,
      'key': 'petrzalka',
      'meno': 'Petržalka',
      'title': 'miestny poslanec',
      'mayorTitle': 'starosta',
      'clenovia': [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35],
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
        'poslanci',
        'rozpocet',
        // 'starosta'
        // 'vystavba'
      ],
      // 'employee': [
      //   {
      //     'id': 1,
      //     'fk': 36,
      //     'title': 'starosta'
      //   }, {
      //     'id': 2,
      //     'fk': 21,
      //     'title': '1. vicestarostka'
      //   }, {
      //     'id': 3,
      //     'fk': 29,
      //     'title': '2. vicestarostka'
      //   }, {
      //     'id': 4,
      //     'fk': 53,
      //     'title': 'prednosta'
      //   }, {
      //     'id': 5,
      //     'fk': 55,
      //     'title': 'miestny kontrolór'
      //   }
      // ],
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
      'department': [
        {
          'id': 1,
          'name': 'Petržalka',
          'role': [
            { 'id': 1, 'name': 'Starosta', 'icon': 'fas fa-chess-king' },
            { 'id': 2, 'name': '1. vicestarostka', 'icon': 'fas fa-chess-queen' },
            { 'id': 3, 'name': '2. vicestarostka', 'icon': 'fas fa-chess-queen' },
            { 'id': 4, 'name': 'prednosta', 'icon': 'fas fa-chess-rook' },
            { 'id': 5, 'name': 'miestny kontrolór', 'icon': 'fas fa-chess-knight' }
          ]
        }, {
          'id': 2,
          'name': 'ZŠ Budatínska',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 3,
          'name': 'ZŠ Černyševského',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 4,
          'name': 'ZŠ Dudova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 5,
          'name': 'ZŠ Gessayova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 6,
          'name': 'ZŠ Holíčska',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 7,
          'name': 'ZŠ Lachova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 8,
          'name': 'ZŠ Nobelovo nám.',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 9,
          'name': 'ZŠ Pankúchova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 10,
          'name': 'ZŠ Prokofievova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 11,
          'name': 'ZŠ Tupolevova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 12,
          'name': 'ZŠ Turnianska',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 13,
          'name': 'MŠ Bohrova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 14,
          'name': 'MŠ Bradáčova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 15,
          'name': 'MŠ Bulíkova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 16,
          'name': 'MŠ Bzovícka',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 17,
          'name': 'MŠ Gessayova 2',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 18,
          'name': 'MŠ Gessayova 31',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 19,
          'name': 'MŠ Haanova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 20,
          'name': 'MŠ Holíčska 30',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 21,
          'name': 'MŠ Holíčska 50',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 22,
          'name': 'MŠ Iľjušinova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 23,
          'name': 'MŠ Jankolova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 24,
          'name': 'MŠ Lachova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 25,
          'name': 'MŠ Lietavská',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 26,
          'name': 'MŠ Macharova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 27,
          'name': 'MŠ Nobelovo nám.',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 28,
          'name': 'MŠ Pifflova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 29,
          'name': 'MŠ Rontgenova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 30,
          'name': 'MŠ Rovniankova ',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 31,
          'name': 'MŠ Strečnianska',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 32,
          'name': 'MŠ Ševčenkova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 33,
          'name': 'MŠ Šustekova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 34,
          'name': 'MŠ Tupolevova',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 35,
          'name': 'MŠ Turnianska',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 36,
          'name': 'MŠ Vyšehradská',
          'role': [
            { 'id': 1, 'name': 'člen rady školy', 'icon': 'fas fa-graduation-cap'}
          ]
        }, {
          'id': 37,
          'name': 'Bytový podnik Petržalka, s.r.o.',
          'role': [
            { 'id': 1, 'name': 'člen dozornej rady', 'icon': 'fas fa-stamp'}
          ]
        }, {
          'id': 38,
          'name': 'Športové zariadenia Petržalky, s.r.o.',
          'role': [
            { 'id': 1, 'name': 'člen dozornej rady', 'icon': 'fas fa-stamp'}
          ]
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
      'title': 'mestsky poslanec',
      'mayorTitle': 'primator',
      'clenovia': [1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018],
      'plat': {
        'priemernaMzda': 954.00,
        'index': 2.81,
        'starosta': 3754,
        'starostaMin': 2681,
        'starostaMax': 4289
      },
      'menu': [
        'uznesenia',
        'poslanci',
        'rozpocet'
      ],
      'commission': [
        {
          'id': 1,
          'name': 'Komisia finančná, podnikateľska a správy majetku',
          'desc': ''
        }, {
          'id': 2,
          'name': 'Komisia na ochranu verejného záujmu pri výkone funkcií funkcionárov mesta',
          'desc': ''
        }, {
          'id': 3,
          'name': 'Komisia výstavby, územného plánu a životného prostredia',
          'desc': ''
        }, {
          'id': 4,
          'name': 'Komisia kultúry, ZPOZ-u a cestovného ruchu',
          'desc': ''
        }, {
          'id': 5,
          'name': 'Komisia sociálna, bytová a marginalizovaných komunít',
          'desc': ''
        }, {
          'id': 6,
          'name': 'Komisia športu',
          'desc': ''
        }, {
          'id': 7,
          'name': 'Komisia mládeže a školstva',
          'desc': ''
        }, {
          'id': 8,
          'name': 'Mandátová komisia',
          'desc': ''
        }, {
          'id': 100,
          'name': 'Sobášiaci',
          'desc': ''
        }
      ],
      'department': [
        {
          'id': 1,
          'name': 'Mestsky urad',
          'role': [
            { 'id': 1, 'name': 'primator', 'icon': 'fas fa-chess-king' },
            { 'id': 2, 'name': 'miestny kontrolór', 'icon': 'fas fa-chess-knight' }
          ]
        }, {
          'id': 2,
          'name': 'Kultúrne centrum A. Sládkoviča v Detve',
          'role': [
            {
              'id': 1,
              'name': 'Riaditeľ',
              'icon': 'fas fa-briefcase'
            }
          ]
        }, {
            'id': 3,
            'name': 'Technické služby Detva s.r.o.',
            'role': [
              {
                'id': 1,
                'name': 'člen dozornej rady',
                'icon': 'fas fa-stamp'
              }
            ]
          }, {
            'id': 4,
            'name': 'BYTES, s.r.o.',
            'role': [
              {
                'id': 1,
                'name': 'člen dozornej rady',
                'icon': 'fas fa-stamp'
              }
            ]
          }
      ],
      'fb': {
        'title': 'Detva.info',
        'link': 'https://www.facebook.com/Detvainfo-215319999381212'
      }
    }, {
      'id': 3,
      'key': 'ba',
      'meno': 'Bratislava',
      'title': 'mestský poslanec',
      'mayorTitle': 'primator',
      'clenovia': [],
      'menu': [],
      'commission': [
        {
          'id': 1,
          'name': 'Komisia územného a strategického plánovania, životného prostredia a výstavby',
          'desc': ''
        }, {
          'id': 2,
          'name': 'Komisia dopravy a informačných systémov',
          'desc': ''
        }, {
          'id': 3,
          'name': 'Mestská rada',
          'desc': ''
        }, {
          'id': 4,
          'name': 'Komisia pre školstvo, vzdelávanie a šport',
          'desc': ''
        }, {
          'id': 5,
          'name': 'Komisia pre ochranu verejného poriadku',
          'desc': ''
        }, {
          'id': 6,
          'name': 'Komisia mandátová',
          'desc': ''
        }, {
          'id': 7,
          'name': 'Komisia na ochranu verejného záujmu pri výkone funkcií verejných funkcionárov',
          'desc': ''
        }, {
          'id': 8,
          'name': 'Komisia na ochranu verejného záujmu pri výkone funkcií verejných funkcionárov',
          'desc': ''
        }
      ],
      'department': [
        {
          'id': 1,
          'name': 'Bratislava',
          'role': [
            {
              'id': 1,
              'name': 'Primator',
              'icon': 'fas fa-chess-king'
            }
          ]
        }, {
          'id': 2,
          'name': 'Bratislavská vodárenská spoločnosť, a.s.',
          'role': [
            {
              'id': 1,
              'name': 'člen predstavenstva',
              'icon': 'fas fa-marker'
            }, {
              'id': 2,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }, {
          'id': 3,
          'name': 'Dopravný  podnik  Bratislava,  akciová  spoločnosť',
          'role': [
            {
              'id': 1,
              'name': 'člen predstavenstva',
              'icon': 'fas fa-marker'
            }, {
              'id': 2,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }, {
              'id': 3,
              'name': 'Podpredseda dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }, {
          'id': 4,
          'name': 'Odvoz  a likvidácia  odpadu  a.s.',
          'role': [
            {
              'id': 1,
              'name': 'člen predstavenstva',
              'icon': 'fas fa-marker'
            }, {
              'id': 2,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }, {
              'id': 3,
              'name': 'Predseda dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }, {
          'id': 5,
          'name': 'Incheba,  a.s.',
          'role': [
            {
              'id': 1,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }, {
          'id': 6,
          'name': 'KSP,  s.r.o.',
          'role': [
            {
              'id': 1,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }, {
          'id': 7,
          'name': 'Národné tenisové centrum, a.s.',
          'role': [
            {
              'id': 1,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }, {
          'id': 8,
          'name': 'METRO Bratislava a.s.',
          'role': [
            {
              'id': 1,
              'name': 'Predseda predstavenstva',
              'icon': 'fas fa-marker'
            }
          ]
        }, {
          'id': 9,
          'name': 'Bratislavská integrovaná doprava, a.s.',
          'role': [

          ]
        }, {
          'id': 10,
          'name': 'Bratislavská organizácia cestovného ruchu – Bratislava Tourist Board',
          'role': [

          ]
        }, {
          'id': 11,
          'name': 'Združenie správy námestia',
          'role': [

          ]
        }, {
          'id': 12,
          'name': 'Infra Services, a.s.',
          'role': [
            {
              'id': 1,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }, {
          'id': 13,
          'name': 'BIONERGY, a.s.',
          'role': [
            {
              'id': 1,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }, {
          'id': 14,
          'name': 'RECAR Bratislava a.s.',
          'role': [
            {
              'id': 1,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }
      ],
    }, {
      'id': 4,
      'key': 'vuc-ba',
      'meno': 'Bratislavský samosprávny kraj',
      'title': 'krajský poslanec',
      'mayorTitle': 'zupan',
      'clenovia': [],
      'menu': [],
      'commission': [
        {
          'id': 1,
          'name': 'Komisia životného prostredia, regionálneho rozvoja a územného plánovania',
          'desc': ''
        }, {
          'id': 2,
          'name': 'Komisia školstva, mládeže a športu',
          'desc': ''
        }, {
          'id': 3,
          'name': 'Mandátová komisia',
          'desc': ''
        }, {
          'id': 4,
          'name': 'Komisia na ochranu verejného záujmu',
          'desc': ''
        }, {
          'id': 5,
          'name': 'Komisia kultúry',
          'desc': ''
        }, {
          'id': 6,
          'name': 'Dotačná komisia',
          'desc': ''
        }, {
          'id': 7,
          'name': 'Komisia zdravotníctva a sociálnych vecí',
          'desc': ''
        }, {
          'id': 9,
          'name': 'Komisia európskych záležitostí, regionálnej spolupráce a cestovného ruchu',
          'desc': ''
        }, {
          'id': 10,
          'name': 'Komisia majetku, investícií a verejného obstarávania',
          'desc': ''
        }, {
          'id': 11,
          'name': 'Finančná komisia',
          'desc': ''
        }
      ],
      // 'employee': [
      //   {
      //     'id': 1,
      //     'fk': 18,
      //     'title': 'Podpredseda'
      //   }
      // ],
      'department': [
        {
          'id': 1,
          'name': 'Bratislavský samosprávny kraj',
          'role': [
            {
              'id': 1,
              'name': 'Župan',
              'icon': 'fas fa-chess-king'
            }, {
              'id': 2,
              'name': 'Podpredseda',
              'icon': 'fas fa-chess-queen'
            }
          ]
        }, {
          'id': 2,
          'name': 'Regionálne cesty Bratislava, a.s.',
          'role': [
            {
              'id': 1,
              'name': 'člen dozornej rady',
              'icon': 'fas fa-stamp'
            }
          ]
        }
      ]
    }
  ]
