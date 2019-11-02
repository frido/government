package frido.samosprava.core.entity.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import frido.samosprava.core.entity.Person;

/**
 * StatPersonView
 */
public class StatPersonView {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy"); // 25.09.2018

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

    private boolean dateWithin(String from, String to) {
        try {
            Date now = new Date();
            if (((from == null) || (sdf.parse(from).before(now))) && ((to == null) || (sdf.parse(to).after(now)))) {
                return true;
            }
            return false;
        } catch (ParseException e) {
            return false;
        }
    }

    private boolean dateWithin(Date from, Date to) {
        Date now = new Date();
        if (((from == null) || (from.before(now))) && ((to == null) || (to.after(now)))) {
            return true;
        }
        return false;

    }

}