package montreSeconde;

import javax.swing.SwingUtilities;

import montreSeconde.horloge.EcouteurHorloge;
import montreSeconde.horloge.EcouteurTest;
import montreSeconde.horloge.Horloge;

public class Main {
	public static void main(String... args) {
		Horloge horloge = new Horloge();
		horloge.start();
		SwingUtilities.invokeLater(() -> {new Fenetre(horloge);});
		EcouteurTest ecouteurTest = new EcouteurTest();
		horloge.addEcouteurHorloge(ecouteurTest);
	}
}
