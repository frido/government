package frido.samosprava.view;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Meeting;
import frido.samosprava.entity.Resolution;

/**
 * ResolutionView
 */
public class ResolutionView extends Resolution {

    private Meeting meeting;

    public ResolutionView(InMemoryCollections collections, Resolution r) {
        setId(r.getId());
        setCouncilId(r.getCouncilId());
        setNumber(r.getNumber());
        setType(r.getType());
        setMeetingId(r.getMeetingId());
        setCreatorIds(r.getCreatorIds());
        setTitle(r.getTitle());
        setDescription(r.getDescription());
        setResults(r.getResults());
        setVoteYesIds(r.getVoteYesIds());
        setVoteNoIds(r.getVoteNoIds());
        setPresented(r.getPresented());
        setSource(r.getSource());
        setProjects(r.getProjects());
        setMeeting(collections.meetings().findById(r.getMeetingId()).orElse(null));
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }
    
}