package frido.samosprava.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;

import frido.samosprava.entity.Meeting;

public class InMemoryMeetingCollection extends InMemoryBaseCollection<Meeting> {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy"); // 25.09.2018

    public Stream<Meeting> findByYear(Integer councilId, int year) {
        return getAll().filter(x -> filterByYear(x, councilId, year));
    }

    // TODO: deprecated year - use new Date
    private Boolean filterByYear(Meeting x, Integer councilId, Integer year) {
        // try {
            // int meetingYear = sdf.parse(x.getDate()).getYear() + 1900;
            int meetingYear = x.getDate().getYear();
            return meetingYear == year && x.getCouncilId() == councilId;
        // } catch (ParseException e) {
        //     return false;
        // }
    }

     
}
