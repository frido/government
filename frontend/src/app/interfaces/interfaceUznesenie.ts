interface ResponseUznesenie {
  data: Uznesenie[];
}

interface Uznesenie {
  id: number;
  cislo: number;
  typ: string;
  spolok: number;
  zasadnutie: number;
  predkladatel?: number[];
  nadpis: string;
  popis: string;
  vysledok: Vysledok[];
  za: number[];
  proti: number[];
  pritomni: number;
  zdroj: string;
}

interface Vysledok {
  sumar: string;
  popis: string[];
}