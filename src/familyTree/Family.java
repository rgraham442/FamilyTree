package familyTree;

import java.util.ArrayList;
import java.util.HashMap;

public class Family {
    private HashMap<String,String> family = new HashMap<>();
    private HashMap<String,String> parent = new HashMap<>();
    private HashMap<String,String> children = new HashMap<>();

    public boolean male(String name) {
        if (!family.containsKey(name)) {
            family.put(name,"m");
            return true;
        }
        else if (family.get(name).equals("f")) {
                return false;
            }
            else {
                family.put(name,"m");
                return true;
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
        else if (family.get(name).equals("m")) {
            return false;
        }
        else {
            family.put(name,"f");
            return true;
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

    public boolean setParentOf(String childName, String parentName) {
        if (!family.containsKey(childName)) {
            family.put(childName,"");
        }
        if (!family.containsKey(parentName)) {
            family.put(parentName,"");
        }
        if (!parent.containsValue(childName)) {
            parent.put(parentName,childName);
            children.put(childName,parentName);
            return true;
        }
        else {
            return false;
        }
    }
    public ArrayList getParentsOf(String name) {
        ArrayList<String> parents = new ArrayList<>();
        if (parent.containsValue(name)) {
            String regex = "=" + name;
            parents.add(parent.toString().replaceAll(regex, "").replaceAll("[{}]", ""));
            return parents;
        }
        return null;
    }

    public ArrayList getChildrenOf(String name) {
        ArrayList<String> kids = new ArrayList<>();
        if (children.containsValue(name)) {
            String regex = "=" + name;
            kids.add(children.toString().replaceAll(regex, "").replaceAll("[{}]", ""));
            return kids;
        }
        return null;
    }




}


