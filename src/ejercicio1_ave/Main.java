package ejercicio1_ave;

public class Main {
    public static void main(String[] args) {
        Ave ave = new Ave();
        ave.volar();
        ave.cantar();

        // Polimorfismo: la misma ave vista a través de cada interfaz
        Volador volador = ave;
        Cantante cantante = ave;
        volador.volar();
        cantante.cantar();
    }
}
