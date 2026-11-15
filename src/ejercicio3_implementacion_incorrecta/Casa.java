package ejercicio3_implementacion_incorrecta;

// PARTE 2: MALA PRÁCTICA (compila, pero no tiene sentido)
// Una casa no se mueve; implementar Movible rompe la lógica del modelo.
// Las interfaces deben usarse solo cuando el comportamiento realmente
// corresponde a la clase ("puede-hacer").
public class Casa implements Movible {

    @Override
    public void moverse() {
        System.out.println("Las casas no se mueven.");
    }
}
