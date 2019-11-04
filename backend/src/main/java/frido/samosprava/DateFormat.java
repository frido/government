package frido.samosprava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * DateFormat
 */
public class DateFormat {

    private static final String PATTERN = "dd.MM.yyyy";

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN);

    public static LocalDate toDate(String stringDate) {
        return LocalDate.parse(stringDate, formatter);
    }

    public static Integer toYear(String stringDate) {
        return toDate(stringDate).getYear();
    }
}