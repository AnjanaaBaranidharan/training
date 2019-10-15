package TestCases;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class Message {

   String message = "Sai";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Sai";
      assertEquals(message,messageUtil.salutationMessage());
   }
   @Ignore
   @Test
   public void testPrintMessage1() {
      System.out.println("Inside testPrintMessage()");
      message = "Sai";
      assertEquals(message,messageUtil.printMessage());
   }

}
