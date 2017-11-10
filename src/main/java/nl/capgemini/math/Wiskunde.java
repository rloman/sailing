package nl.capgemini.math;

public final class Wiskunde {

    public static int divide(int teller, int noemer) {

        try {
            int result = teller/noemer;

            return result;
        }
        catch(ArithmeticException ae) {
            // ALTIJD iets doen, anders ben je een oen!!!
            System.out.println("Delen door nul is flauwekul!!!");

            throw ae;
        }
        finally {
            System.out.println("De methode Wiskunde::divide wordt nu beeindigd ...");
        }



    }


    private Wiskunde() {

    }
}
