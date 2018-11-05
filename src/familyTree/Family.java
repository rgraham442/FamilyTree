package familyTree;

import java.util.HashMap;

public class Family {
    private HashMap<String,String> family = new HashMap<>();
    private HashMap<String,String> parent = new HashMap<>();

    public boolean male(String name) {
        if (!family.containsKey(name)) {
            family.put(name,"m");
            return true;
        }
        else if (family.get(name).equals("m")) {
                return true;
            }
            else {
                return false;
            }
    }

    public boolean isMale(String name) {
        if (family.get(name).equals("m")) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean female(String name) {
        if (!family.containsKey(name)) {
            family.put(name,"f");
            return true;
        }
        else if (family.get(name).equals("f")) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFemale(String name) {
        if (family.get(name).equals("f")) {
            return true;
        }
        else {
            return false;
        }
    }




}


