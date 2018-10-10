package uk.ac.diamond.jaxb;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import org.eclipse.persistence.jaxb.JAXBContextFactory;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
            // Get the default JAXB context as determined by jaxb-api.
            JAXBContext jcDefault = JAXBContext.newInstance(App.class);
            System.out.println(jcDefault);
            // Explicitly get the Moxy JAXB context.
            JAXBContext jcMoxy = JAXBContextFactory.createContext(new Class[]{App.class}, null);
            System.out.println(jcMoxy);
        } catch (JAXBException e) {
            System.out.println("JAXBException " + e);
        }
    }
}
