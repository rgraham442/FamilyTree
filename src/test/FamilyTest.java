package test;

import familyTree.Family;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FamilyTest {

    @Test
    public void femaleShouldReturnTrue() {
        Family fam = new Family();
        assertTrue(fam.female("Sarah"));
    }

    @Test
    public void maleShouldReturnTrue() {
        Family fam = new Family();
        assertTrue(fam.male("Robin"));
    }

    @Test
    public void isMaleShouldReturnFalse() {
        Family fam = new Family();
        fam.female("Sarah");
        assertFalse(fam.isMale("Sarah"));
    }

    @Test
    public void isFemaleShouldReturnFalse() {
        Family fam = new Family();
        fam.male("John");
        assertFalse(fam.isFemale("John"));
    }

    @Test
    public void setParentShouldReturnTrue() {
        Family fam = new Family();
        assertTrue(fam.setParentOf("John","Lisa"));
    }

    @Test
    public void johnAndKimShouldBeReturned() {
        Family fam = new Family();
        fam.setParentOf("Sam","John");
        fam.setParentOf("Sam","Kim");
        ArrayList<String> parentTest = new ArrayList<>();
        parentTest.add("John");
        parentTest.add("Kim");
        assertEquals("John and Kim should be returned", fam.getParentsOf("Sam"), parentTest);
    }

    @Test
    public void samAndLukeShouldBeReturned() {
        Family fam = new Family();
        fam.setParentOf("Sam","John");
        fam.setParentOf("Luke","John");
        ArrayList<String> kidTest = new ArrayList<>();
        kidTest.add("Luke");
        kidTest.add("Sam");
        assertEquals("John and Kim should be returned", fam.getChildrenOf("John"), kidTest);
    }

}