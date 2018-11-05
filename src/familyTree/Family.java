package familyTree;

import java.util.ArrayList;
import java.util.Arrays;

public class Family {
    ArrayList<Person> fam = new ArrayList<>();

    private Person getPerson(String name) {
        for (Person person : this.fam) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public boolean male(String name) {
        if (getPerson(name) == null) {
            Person newPerson = new Person();
            newPerson.setName(name);
            newPerson.setGender("m");
            fam.add(newPerson);
            return true;
        }
        else {
            Person person = getPerson(name);
            if (person.gender.isEmpty()) {
                person.setGender("m");
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean isMale(String name) {
        Person person = getPerson(name);
        if (person.getGender().equals("m")) {
            return true;
        }
        return false;
    }

    public boolean female(String name) {
        if (getPerson(name) == null) {
            Person newPerson = new Person();
            newPerson.setName(name);
            newPerson.setGender("f");
            fam.add(newPerson);
            return true;
        }
        else {
            Person person = getPerson(name);
            if (person.gender.isEmpty()) {
                person.setGender("f");
                return true;
            } else {
                return false;
            }
        }
    }
    public boolean isFemale(String name) {
        Person person = getPerson(name);
        if (person.getGender() == "f") {
            return true;
        }
        return false;
    }

    public boolean setParentOf(String childName, String parentName) {
        Person parent = getPerson(parentName);
        Person child = getPerson(childName);

        if (parent == null) {
            parent = new Person();
            parent.setName(parentName);
            this.fam.add(parent);
        }
        if (child == null) {
            child = new Person();
            child.setName(childName);
            this.fam.add(child);
        }

        child.setParent(parentName);
        parent.addChild(childName);
        return true;

    }
    public String getParentsOf(String name) {
        Person person = getPerson(name);
        return Arrays.toString(person.getParents());
    }

    public String getChildrenOf(String name) {
        Person person = getPerson(name);
        String[] children = person.getChildren().toArray(new String[person.getChildren().size()]);
        return Arrays.toString(children);
    }

}


