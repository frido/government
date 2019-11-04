package frido.samosprava.view;

import java.math.BigDecimal;
import java.util.List;

/**
 * StatView
 */
public class StatView {

    private Integer meetingsNo;
    private Integer resolutionsNo;
    private Integer personNo;
    private List<StatPersonView> creatorsMap;
    private List<StatTypeView> typesMap;
    private BigDecimal budgetsSum;
    private BigDecimal projectsSum;
    private BigDecimal grantsSum;

    public Integer getMeetingsNo() {
        return meetingsNo;
    }

    public BigDecimal getGrantsSum() {
        return grantsSum;
    }

    public void setGrantsSum(BigDecimal grantsSum) {
        this.grantsSum = grantsSum;
    }

    public BigDecimal getProjectsSum() {
        return projectsSum;
    }

    public void setProjectsSum(BigDecimal projectsSum) {
        this.projectsSum = projectsSum;
    }

    public BigDecimal getBudgetsSum() {
        return budgetsSum;
    }

    public void setBudgetsSum(BigDecimal budgetsSum) {
        this.budgetsSum = budgetsSum;
    }

    public List<StatTypeView> getTypesMap() {
        return typesMap;
    }

    public void setTypesMap(List<StatTypeView> typesMap) {
        this.typesMap = typesMap;
    }

    public List<StatPersonView> getCreatorsMap() {
        return creatorsMap;
    }

    public void setCreatorsMap(List<StatPersonView> creatorsMap) {
        this.creatorsMap = creatorsMap;
    }

    public Integer getPersonNo() {
        return personNo;
    }

    public void setPersonNo(Integer personNo) {
        this.personNo = personNo;
    }

    public Integer getResolutionsNo() {
        return resolutionsNo;
    }

    public void setResolutionsNo(Integer resolutionsNo) {
        this.resolutionsNo = resolutionsNo;
    }

    public void setMeetingsNo(Integer meetingsNo) {
        this.meetingsNo = meetingsNo;
    }
}