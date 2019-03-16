interface ResponseInterpelacia {
  data: Interpelacia[];
}

interface Interpelacia {
  id: number;
  spolok: number;
  zasadnutie: number;
  from: number;
  title: string;
  otazka: string;
  otazkaDatum: string;
  odpoved: string;
  odpovedDatum: string;
  zdroj: string;
  tags: string[];
}