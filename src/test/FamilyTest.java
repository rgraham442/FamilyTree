package test;

import familyTree.Family;
import org.junit.Test;

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

}