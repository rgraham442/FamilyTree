package familyTree;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Family {
    private HashMap<String,String> family = new HashMap<>();
    private HashMap<String,String> parent = new HashMap<>();

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

    public boolean setParent(String childName,String parentName) {
        if (!family.containsKey(childName)) {
            family.put(childName,"");
        }
        if (!family.containsKey(parentName)) {
            family.put(parentName,"");
        }
        if (!parent.containsKey(parentName)) {
            parent.put(parentName,childName);
            return true;
        }
        else {
            return false;
        }
    }

//    public Array getParents(String name) {
//        if (parent.containsValue(name)) {
//
//        }
//    }

    public static <K, V> K getKey(Map<K,V> map, V value) {
        for (Map.Entry<K,V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }




}


