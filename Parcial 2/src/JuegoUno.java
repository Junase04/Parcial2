import java.util.List;

public class JuegoUno {
    public static void main(String[] args) {
        List<Card> mazo = UnoCardFactory.crearMazo(10);

        for (Card carta : mazo) {
            System.out.println(carta);
            carta.play();
        }
    }
}