

export class OsobaView {
  id: number;
  name: string;
  prefix: string;
  suffix: string;
  role: number;
  elections: ElectionView[];
  departments: DepartmentView[];
  commissions: CommissionView[]
  klub?: string;
  fb?: string;

  constructor() {}
}

export class DepartmentView {
  title: string;
  role: string;
  icon: string;
  roleId: number;
  departmentId: number;
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
  commissionId: number;
  councilId: number;

  constructor() {}
}




