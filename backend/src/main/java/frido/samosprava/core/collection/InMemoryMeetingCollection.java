package frido.samosprava.core.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import frido.samosprava.core.entity.Meeting;

public class InMemoryMeetingCollection extends InMemoryBaseCollection<Meeting> {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy"); // 25.09.2018

    public Stream<Meeting> findByYear(Integer councilId, int year) {
        return data.values().stream().filter(x -> filterByYear(x, councilId, year));
    }

    // TODO: deprecated year - use new Date
    private Boolean filterByYear(Meeting x, Integer councilId, Integer year) {
        try {
            int meetingYear = sdf.parse(x.getDate()).getYear() + 1900;
            return meetingYear == year && x.getCouncilId() == councilId;
        } catch (ParseException e) {
            return false;
        }
    }

     
}
