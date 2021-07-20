package nl.capgemini.math;

import nl.capgemini.Debug;
import nl.capgemini.exception.InvalidSailingException;
import nl.capgemini.exception.InvalidSailingRuntimeException;

public final class Wiskunde {



    public static int divide(int teller, int noemer) throws InvalidSailingException  {

        Debug.log("Entering divide with "+teller+" and "+noemer);

        if(noemer == -1) {
            throw new InvalidSailingRuntimeException();
        }

        try {
            int result = teller/noemer;

            String s = "Jansen";
            System.out.println(s.toUpperCase());

            return result;
        }
        catch(ArithmeticException ae) {
            // ALTIJD iets doen, anders ben je een oen!!!
            System.out.println("Delen door nul is flauwekul!!!");

            InvalidSailingException ise = new InvalidSailingException();

            throw ise;
        }
        finally {
            System.out.println("De methode Wiskunde::divide wordt nu beeindigd ...");
        }



    }


    private Wiskunde() {

    }
}
