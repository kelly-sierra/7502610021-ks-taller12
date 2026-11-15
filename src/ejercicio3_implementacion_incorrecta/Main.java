package ejercicio3_implementacion_incorrecta;

public class Main {
    public static void main(String[] args) {

        // ===== PARTE 1: no implementar los métodos de la interfaz (ERROR) =====
        // Ver Avion.java: descomenta la clase para observar el error de compilación.

        // ===== PARTE 2: interfaz sin lógica relevante (COMPILA, mala práctica) =====
        Movible casa = new Casa();
        casa.moverse(); // Compila y corre, pero modelar una Casa como Movible no tiene sentido
    }
}
