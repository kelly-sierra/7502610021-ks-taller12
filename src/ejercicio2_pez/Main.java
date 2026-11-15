package ejercicio2_pez;

public class Main {
    public static void main(String[] args) {
        Pez pez = new Pez();
        pez.nadar();
        pez.respirar();

        // Polimorfismo: la misma instancia vista a través de cada interfaz
        Nadador nadador = pez;
        Respirador respirador = pez;
        nadador.nadar();
        respirador.respirar();
    }
}
