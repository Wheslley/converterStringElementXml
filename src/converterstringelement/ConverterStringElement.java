package converterstringelement;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author Wheslley Nycolas da Silva
 * @since 01/2018
 */
public class ConverterStringElement {

    public static void main(String[] args) {
        
        try {
        
            String xml = "<hello>Hello DOM Parser</hello>";
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));   
            
            Element element = doc.getDocumentElement();
            
            System.out.println(element.getTagName());            
            System.out.println("Sucesso");
            
        } catch ( IOException | ParserConfigurationException | SAXException ex ){
            System.out.println("Erro");
        }
        
    }

}
