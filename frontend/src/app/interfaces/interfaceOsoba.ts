

export class OsobaView {
  id: number;
  name: string;
  prefix: string;
  suffix: string;
  role: number;
  elections: ElectionView[];
  departments: DepartmentView[];
  commissions: CommissionView[];
  offices: OfficeView[];
  deputies: DeputyView[];
  klub?: string;
  fb?: string;

  constructor() {}
}

export class DeputyView {
  id: number;
  councilId: number;
  period: string;
  from: string;
  to: string;
  electionId: number;
}

export class OfficeView {
  id: number;
  councilId: number;
  period: string;
  from: string;
  to: string;
  roleId: number;
  electioId: number;
}

export class DepartmentView {
  title: string;
  role: string;
  icon: string;
  roleId: number;
  fk: number; // TODO: change to departmentId
  councilId: number;
}

export class ElectionView {
  title: string;
  councilName: string;
  period: string;
  party: string;
  mayor: boolean;
  commission: CommissionView[];

  constructor() {}
}


export class CommissionView {
  councilName: string;
  name: string;
  period: string;
  chairman: boolean;
  fk: number; // TODO: change to commissionId
  councilId: number;

  constructor() {}
}




