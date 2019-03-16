interface ResponseVystavba {
  data: Vystavba[];
}

interface Vystavba {
  id: number;
  title: string;
  urZiadatel: string;
  urZiadost: string;
  urDatum: string;
  urId: string;
  spZiadatel: string;
  spZiadost: string;
  spDatum: string;
  spId: string;
  popis: string;
  source: string;
  zamerZiadatel?: string;
  zamerDatum?: string;
}