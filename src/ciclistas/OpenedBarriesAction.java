package ciclistas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class OpenedBarriesAction implements Runnable {
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.getDefault());
    private static int contador = 0;

    @Override
    public void run() {
        switch(contador){
            case 0:
                System.out.printf("%s -> Comienza la etapa. (ejecutado en %s)\n", LocalTime.now().format(dateTimeFormatter), Thread.currentThread().getName());
                contador++;
                break;
            case 1:
                System.out.printf("%s -> De vuelta a casa. (ejecutado en %s)\n", LocalTime.now().format(dateTimeFormatter), Thread.currentThread().getName());
                contador++;
                break;
        }

    }
}
