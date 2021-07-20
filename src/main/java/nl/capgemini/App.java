package nl.capgemini;

import nl.capgemini.exception.InvalidSailingException;
import nl.capgemini.exception.InvalidSailingRuntimeException;
import nl.capgemini.math.Wiskunde;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)  {

        Debug.log("Entering main ... ");

        try {
            int result = Wiskunde.divide(5,1);
        }
        catch (InvalidSailingException ise) {
            System.out.println("Checked exception afgevangen.");
        }
        catch(InvalidSailingRuntimeException isre) {
            System.out.println("Unchecked exception afgevangen.");
        }


        try {
            int result = Wiskunde.divide(5,1);
        }
        catch (InvalidSailingException | InvalidSailingRuntimeException  | NumberFormatException nfe) {
            System.out.println("Checked exception afgevangen.");
        }

        catch(Exception e) {
            System.out.println("Dat ging niet goed ... ");
        }

        Debug.log("Leaving main ... ");




    }
}
