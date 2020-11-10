package ciclistas;

import java.util.concurrent.CyclicBarrier;

public class Main {
    private static final int NUM_CICLISTAS = 10;

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUM_CICLISTAS, new OpenedBarriesAction());

        for(int i = 0; i < NUM_CICLISTAS; i++){
            new Thread(new Ciclista("Ciclista #"+i, cyclicBarrier), "Ciclista #"+i).start();
        }

    }
}
