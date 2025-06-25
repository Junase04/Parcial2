import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UnoCardFactory {
    private static final String[] COLORES = {"Rojo", "Verde", "Azul", "Amarillo"};
    private static final String[] NUMEROS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final String[] ACCIONES = {"Salta", "Reversa", "Roba 2"};
    private static final String[] ESPECIALES = {"+4", "Cambio de color"};

    private static final Random rand = new Random();

    //
    public static Card crearCartaAleatoria() {
        int tipo = rand.nextInt(3); 

        switch (tipo) {
            case 0: 
                String colorNum = getRandom(COLORES);
                String numero = getRandom(NUMEROS);
                return new NumberCard(colorNum, numero);

            case 1: 
                String colorAccion = getRandom(COLORES);
                String accion = getRandom(ACCIONES);
                return new ActionCard(colorAccion, accion);

            case 2: 
                String especial = getRandom(ESPECIALES);
                return new WildCard(especial);

            default:
                return null;
        }
    }

    
    public static List<Card> crearMazo(int cantidad) {
        List<Card> mazo = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            mazo.add(crearCartaAleatoria());
        }
        return mazo;
    }

    // Método auxiliar
    private static String getRandom(String[] array) {
        return array[rand.nextInt(array.length)];
    }
}