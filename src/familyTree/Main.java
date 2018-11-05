package familyTree;

public class Main {
    public static void main (String[] args) {
        Family fam = new Family();
        System.out.println(fam.setParentOf("Frank", "Morgan")); // true fam.setParentOf("Frank", "Dylan");
        System.out.println(fam.male("Dylan")); // true
        System.out.println(fam.setParentOf("Joy", "Frank"));
        System.out.println(fam.male("Frank")); // true
        System.out.println(fam.male("Morgan"));
        System.out.println(fam.setParentOf("July", "Morgan")); // true // (The preceding assertion was rejected, so there is no conflict)
        System.out.println(fam.isMale("Joy"));
        System.out.println(fam.isFemale("Joy")); // false // (We know Joy is Frank's child, but we can't derive Joy's gender)//
        System.out.println(fam.getChildrenOf("Morgan")); // ["Frank", "July"]
        System.out.println(fam.setParentOf("Jennifer", "Morgan")); // true
        System.out.println(fam.getChildrenOf("Morgan")); // ["Frank", "Jennifer", "July"]
        System.out.println(fam.getChildrenOf("Dylan")); // ["Frank"] // (That is all we know for sure)
        System.out.println(fam.getParentsOf("Frank")); // ["Dylan", "Morgan"]
        System.out.println(fam.setParentOf("Morgan", "Frank")); // false

    }
}
