package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class calculationTest {

		  
	    @Test  
	    public void testFindMax(){  
	        assertEquals(4,calculation.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    
	}  
	    @Test  
	    public void testCube(){  
	        System.out.println("test case cube");  
	        assertEquals(27,calculation.cube(3));  
	    }  
	    @Test  
	    public void testReverseWord(){  
	        System.out.println("test case reverse word");  
	        assertEquals("ym eman si nahk ",calculation.reverseWord("my name is khan"));  
	    }  
	   
}
