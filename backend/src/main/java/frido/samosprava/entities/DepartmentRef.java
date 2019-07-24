package frido.samosprava.entities;

public class DepartmentRef {
    private Integer council;
    private String period;
    private Integer department;
    private Integer role;

    /**
     * @return the council
     */
    public Integer getCouncil() {
        return council;
    }

    /**
     * @return the role
     */
    public Integer getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * @return the department
     */
    public Integer getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(Integer department) {
        this.department = department;
    }

    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * @param council the council to set
     */
    public void setCouncil(Integer council) {
        this.council = council;
    }
}