package javaXml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class XmlAsString {
        
    public static void main(String args[]) throws FileNotFoundException  {
        
        //Scanner Example - read file line by line in Java using Scanner
         FileInputStream fis = new FileInputStream("C:\\Users\\anjanaa.baranidharan\\Desktop\\info.xml");
         Scanner scanner = new Scanner(fis);
      
         //reading file line by line using Scanner in Java
         System.out.println("Reading file line by line in Java using Scanner");
      
         while(scanner.hasNextLine()){
             System.out.println(scanner.nextLine());
         }
      
         scanner.close();
  }
    
}
