package aufgabe19.comparator;

import aufgabe19.PersonComparator;

import java.util.Comparator;

public class NameCompare implements Comparator<PersonComparator> {

    @Override
    public int compare(PersonComparator o1, PersonComparator o2){
        return o1.getNachname().compareTo(o2.getNachname());
    }
}
