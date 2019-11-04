package frido.samosprava.core.entity.view;

import frido.samosprava.api.DateFormat;
import frido.samosprava.api.HasValue;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.Project;
import frido.samosprava.core.entity.Resolution;

public class ProjectView extends HasValue {
  private String title;
  // private BigDecimal value;
  private Integer resolutionId;
  private String resolutionTitle;
  private Integer resolutionNumber;
  private Integer year;

  public ProjectView() {

  }

  public ProjectView(InMemoryCollections collections, Resolution r, Project p) {
    collections.meetings().findById(r.getMeetingId())
      .map(m -> m.getDate())
      .map(d -> DateFormat.toYear(d))
      .ifPresent(y -> setYear(y));
    setTitle(p.getTitle());
    setValue(p.getValue());
    setResolutionId(r.getId());
    setResolutionNumber(r.getNumber());
    setResolutionTitle(r.getTitle());

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  // @Override
  // public BigDecimal getValue() {
  //   return value;
  // }

  // public void setValue(BigDecimal value) {
  //   this.value = value;
  // }

  public Integer getResolutionId() {
    return resolutionId;
  }

  public void setResolutionId(Integer resolutionId) {
    this.resolutionId = resolutionId;
  }

  public String getResolutionTitle() {
    return resolutionTitle;
  }

  public void setResolutionTitle(String resolutionTitle) {
    this.resolutionTitle = resolutionTitle;
  }

  public Integer getResolutionNumber() {
    return resolutionNumber;
  }

  public void setResolutionNumber(Integer resolutionNumber) {
    this.resolutionNumber = resolutionNumber;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }
}
