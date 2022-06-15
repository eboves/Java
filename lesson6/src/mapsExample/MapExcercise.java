package mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExcercise {
    public static void main(String[] args){
        Map<String, Person> mapOfPerson = new HashMap<String, Person>();
        ArrayList<Person> people = new ArrayList<Person>();

        Person elvis = new Person("Elvis", "elvis@gmail.com");
        Person maria = new Person("Maria", "maria@gmail.com");
        Person elvira = new Person("Elvira", "elvira@gmail.com");
        Person karen = new Person("Karen", "karen@gmail.com");
        Person eve = new Person("Eve", "eve@gmail.com");

        people.add(elvis);
        people.add(maria);
        people.add(elvira);
        people.add(karen);
        people.add(karen);

        mapOfPerson.put(elvis.getEmail(), elvis);
        mapOfPerson.put(maria.getEmail(), maria);
        mapOfPerson.put(elvira.getEmail(), elvira);
        mapOfPerson.put(karen.getEmail(), karen);
        mapOfPerson.put(eve.getEmail(), eve);

        for (Person person : people) {
            MapExcercise.addToMap(mapOfPerson, person);
        }

        for (String email : mapOfPerson.keySet()) {
            System.out.println(email);
        }

        for (Person person : mapOfPerson.values()) {
            System.out.println(person);
        }

    }

    private static void addToMap(Map<String, Person> map, Person person) {
        map.put(person.getEmail(), person);
    }
}
