package frido.samosprava.core.entity;

import java.util.List;

public class Resolution extends Record {

  private Integer number;
  private String type;
  private Integer meetingId;
  private List<Integer> creatorIds;
  private String title;
  private String description;
  private List<Result> results;
  private List<Integer> voteYesIds;
  private List<Integer> voteNoIds;
  private String presented;
  private String source;



  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getMeetingId() {
    return meetingId;
  }

  public void setMeetingId(Integer meetingId) {
    this.meetingId = meetingId;
  }

  public List<Integer> getCreatorIds() {
    return creatorIds;
  }

  public void setCreatorIds(List<Integer> creatorIds) {
    this.creatorIds = creatorIds;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<Result> getResults() {
    return results;
  }

  public void setResults(List<Result> results) {
    this.results = results;
  }

  public List<Integer> getVoteYesIds() {
    return voteYesIds;
  }

  public void setVoteYesIds(List<Integer> voteYesIds) {
    this.voteYesIds = voteYesIds;
  }

  public List<Integer> getVoteNoIds() {
    return voteNoIds;
  }

  public void setVoteNoIds(List<Integer> voteNoIds) {
    this.voteNoIds = voteNoIds;
  }

  public String getPresented() {
    return presented;
  }

  public void setPresented(String presented) {
    this.presented = presented;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }
}
