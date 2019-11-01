package frido.samosprava.core.entity.view;

import frido.samosprava.core.entity.Person;

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
            if (person.getDeputies().stream().anyMatch(d -> d.getCouncilId() == councilId)) { // TODO: calculate with
                                                                                              // year
                setType(2);
            }
        }
        if (person.getOffices() != null) {
            if (person.getOffices().stream().anyMatch(d -> d.getCouncilId() == councilId)) { // TODO: calculate with
                                                                                             // year
                setType(1);
            }
        }
    }
}