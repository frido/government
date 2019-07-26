interface Rozpocet {
  current: Sumar;
  sumar: Sumar[];
  prijmy: Prijmy[];
  vydavky: Vydavky[];
}

interface Vydavky {
  program: string;
  title: string;
  comment: string;
  current: MoneyVydavky;
  money: MoneyVydavky[];
  sub: Vydavky[];
  use?: string[];
}

interface MoneyVydavky {
  year: number;
  bv: number;
  kv: number;
  fv: number;
  useKv?: UseKv[];
}

interface UseKv {
  title: string;
  suma: number;
}

interface Prijmy {
  title: string;
  comment: string;
  current: MoneyPrijmy;
  money: MoneyPrijmy[];
  sub: Prijmy[];
}

interface MoneyPrijmy {
  year: number;
  suma: number;
}

interface Sumar {
  year: number;
  vydavky: number;
  prijmy: number;
}