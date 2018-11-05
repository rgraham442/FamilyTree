package familyTree;

import java.util.ArrayList;

public class Person {
    String name = "";
    String gender = "";
    String[] parents = new String[2];

    ArrayList<String> children = new ArrayList<>();

    public void setName(String newName) {
        this.name = newName;
    }
    public void setParent(String parentName) {
        if (this.parents[0]== null) {
            this.parents[0] = parentName;
        }
        else if (this.parents[1]==null) {
            this.parents[1] = parentName;
        }
        else {

        }
    }

    public void addChild(String child) {
        this.children.add(child);
    }

    public void setGender(String newGender) {
        this.gender = newGender;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }
    public String[] getParents() {
        return this.parents;
    }
    public ArrayList<String> getChildren() {
        return this.children;
    }
}
