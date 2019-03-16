interface ResponseOsoba {
  data: Osoba[];
}

interface Osoba {
  id: number;
  name: string;
  prefix: string;
  suffix: string;
  election?: Election[];
  commission?: CommissionRef[];
  departments?: DepartmentRef[];
  klub?: string;
  fb?: string;
  role: number;
}

interface DepartmentRef {
  council: number;
  period: string;
  department: number;
  role: number;
}

interface Election {
  council: number;
  period: string;
  votes: number;
  party: string;
  mayor: boolean;
}


interface CommissionRef {
  council: number;
  period: string;
  fk: number,
  chairman: boolean
}
