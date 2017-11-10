package nl.capgemini;

import nl.capgemini.math.Wiskunde;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int quotient = Wiskunde.divide(8,4);

        System.out.println("Het quotient van ... is "+quotient);

        quotient = Wiskunde.divide(15,3);

        System.out.println(quotient);

        quotient = Wiskunde.divide(4,0);

        System.out.println(quotient);



    }
}
