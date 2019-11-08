package frido.samosprava.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import frido.samosprava.entity.Person;

/**
 * StatPersonView
 */
public class StatPersonView {

    private Person person;
    private Integer value;
    private Integer type;

    public StatPersonView(Person person, Integer value) {
        this.setPerson(person);
        this.setValue(value);
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void calcType(int councilId, int year) {
        if (person.getDeputies() != null) {
            if (person.getDeputies().stream()
                    .anyMatch(d -> d.getCouncilId() == councilId && dateWithin(d.getFrom(), d.getTo()))) {
                setType(2);
            }
        }
        if (person.getOffices() != null) {
            if (person.getOffices().stream()
                    .anyMatch(d -> d.getCouncilId() == councilId && dateWithin(d.getFrom(), d.getTo()))) {
                setType(1);
            }
        }
    }

    private boolean dateWithin(LocalDate from, LocalDate to) {
        LocalDate now = LocalDate.now();
            if (((from == null) || (from.isBefore(now))) && ((to == null) || (to.isAfter(now)))) {
                return true;
            }
            return false;

    }
}