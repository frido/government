interface ResponseZasadnutie {
  data: Zasadnutie[];
}

interface Zasadnutie {
  id: number;
  spolok: number;
  datum: string;
  cas: string;
  miesto: string;
}