interface ResponseSpolok {
  data: Spolok[];
}

interface Spolok {
  id: number;
  key: string;
  meno: string;
  title: string;
  mayorTitle: string;
  clenovia?: number[];
  plat?: Plat;
  menu?: string[];
  //employee?: Employee[];
  commission?: Commission[];
  department?: Department[];
  fb?: Fb;
}

interface Department {
  id: number;
  name: string;
  role: DepartmentRole[];
}

interface DepartmentRole {
  id: number;
  name: string;
  icon: string;
}

interface Commission {
  id: number;
  name: string;
  desc: string;
}

// interface Employee {
//   id: number;
//   fk: number;
//   title: string
// }

interface Fb {
  title: string;
  link: string;
}

interface Plat {
  priemernaMzda: number;
  index: number;
  starosta: number;
  starostaMin: number;
  starostaMax: number;
  primator?: number;
  primatorMin?: number;
  primatorMax?: number;
  'miestny poslanec'?: MiestnyPoslanec;
  'mestsky poslanec'?: MestskyPoslanec;
}

interface MestskyPoslanec {
  poslanec: string;
  'rada/predseda': string;
  clen: string;
}

interface MiestnyPoslanec {
}
