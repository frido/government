interface ResponseUznesenie {
  data: Uznesenie[];
}

interface Uznesenie {
  id: number;
  number: number;
  type: string;
  councilId: number;
  meetingId: number;
  creatorIds?: number[];
  title: string;
  description: string;
  results: Vysledok[];
  voteYesIds: number[];
  voteNoIds: number[];
  presented: number;
  source: string;
  meeting: Meeting;
}

interface Vysledok {
  title: string;
  descriptions: string[];
}
