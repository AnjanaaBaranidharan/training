package TestCases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SchoolTest {
	 
    School school = new School();
 
    String[] bag = { "Books", "Notebooks", "Pens" };
    
    String[] bag2 = {"Books", "Notebooks", "Pens","Pencils" };
 
    @Test
    public void testPrepareMyBag() {
 
        System.out.println("Inside testPrepareMyBag()");
        assertArrayEquals(bag, school.prepareMyBag());
 
    }
    @Test
    public void testAddPencils() {
        System.out.println("Inside testAddPencils()");
        assertArrayEquals(bag2, school.addPencils());
    }
 
}
