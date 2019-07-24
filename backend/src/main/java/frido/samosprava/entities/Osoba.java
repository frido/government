package frido.samosprava.entities;

import java.util.ArrayList;
import java.util.List;

import frido.samosprava.entity.Idable;

public class Osoba implements Idable {
    private Integer id;
    private String name;
    private String prefix;
    private String suffix;
    private List<Election> election = new ArrayList<>();
    private List<CommissionRef> commission = new ArrayList<>();
    private List<DepartmentRef> departments = new ArrayList<>();
    private String klub;
    private String fb;
    private Integer role;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
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
     * @return the fb
     */
    public String getFb() {
        return fb;
    }

    /**
     * @param fb the fb to set
     */
    public void setFb(String fb) {
        this.fb = fb;
    }

    /**
     * @return the klub
     */
    public String getKlub() {
        return klub;
    }

    /**
     * @param klub the klub to set
     */
    public void setKlub(String klub) {
        this.klub = klub;
    }

    /**
     * @return the departments
     */
    public List<DepartmentRef> getDepartments() {
        return departments;
    }

    /**
     * @param departments the departments to set
     */
    public void setDepartments(List<DepartmentRef> departments) {
        this.departments = departments;
    }

    /**
     * @return the commission
     */
    public List<CommissionRef> getCommission() {
        return commission;
    }

    /**
     * @param commission the commission to set
     */
    public void setCommission(List<CommissionRef> commission) {
        this.commission = commission;
    }

    /**
     * @return the election
     */
    public List<Election> getElection() {
        return election;
    }

    /**
     * @param election the election to set
     */
    public void setElection(List<Election> election) {
        this.election = election;
    }

    /**
     * @return the suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * @return the prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix the prefix to set
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
}