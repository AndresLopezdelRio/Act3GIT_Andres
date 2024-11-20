package Git;

import java.util.Random;

public class Git {

    public static void main(String[] args) {
        mostrarNumerosAleatorios(20, 1, 10);
    }

    public static void mostrarNumerosAleatorios(int cantidad, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt(max - min + 1) + min; 
            System.out.println(numeroAleatorio); 
        }
    }
}



