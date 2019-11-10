package frido.samosprava.collection;

import java.util.stream.Stream;

import frido.samosprava.entity.Meeting;

public class InMemoryMeetingCollection extends InMemoryBaseCollection<Meeting> {

    public Stream<Meeting> findByYear(Integer councilId, int year) {
        return getAll().filter(x -> filterByYear(x, councilId, year));
    }

    private Boolean filterByYear(Meeting x, Integer councilId, Integer year) {
        int meetingYear = x.getDate().getYear();
        return meetingYear == year && x.getCouncilId() == councilId;
    }

}
