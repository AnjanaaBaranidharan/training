package javaXml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class XMLWriter {

    public static void main(String[] args) {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            //add elements to Document
            Element rootElement =
                doc.createElementNS("https://www.perficient.com/employee", "Employees");
            //append root element to document
            doc.appendChild(rootElement);

            //append first child element to root element
            rootElement.appendChild(getEmployee(doc, "1", "Anjanaa", "24", "Java Developer", "Female"));

            rootElement.appendChild(getEmployee(doc, "2", "Vignesh", "28", "Manager", "Male"));
            
            rootElement.appendChild(getEmployee(doc, "3", "Bala", "26", "Senior Developer", "Male"));

            //for output to file, console
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            //for pretty print
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //write to console or file
            StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(new File("C:\\Users\\anjanaa.baranidharan\\Desktop\\emps.xml"));

            //write data
            transformer.transform(source, console);
            transformer.transform(source, file);
            System.out.println("DONE");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static Node getEmployee(Document doc, String id, String name, String age, String role,
            String gender) {
        Element employee = doc.createElement("Employee");

        //set id attribute
        employee.setAttribute("id", id);

        //create name element
        employee.appendChild(getEmployeeElements(doc, employee, "name", name));

        //create age element
        employee.appendChild(getEmployeeElements(doc, employee, "age", age));

        //create role element
        employee.appendChild(getEmployeeElements(doc, employee, "role", role));

        //create gender element
        employee.appendChild(getEmployeeElements(doc, employee, "gender", gender));

        return employee;
    }


    //utility method to create text node
    private static Node getEmployeeElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

}