package nl.capgemini;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public final class Debug {

    public static void log(String message) {
        System.out.println(LocalDate.now()+" "+message);
    }

    private Debug() {

    }
}
