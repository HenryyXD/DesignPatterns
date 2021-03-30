import UI.Player;
import UI.UI;

public class Principal {
    public static void main(String[] args) throws Exception {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
