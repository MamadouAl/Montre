package montreSeconde.horloge;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Horloge extends Thread {
	private Heure heure;
	// Encapsuler une liste d'écouteurs
	List<EcouteurHorloge> ecouteursHorloge = new LinkedList<>();
	// Ajouter des méthodes pour ajouter/supprimer des écouteurs
	public void addEcouteurHorloge(EcouteurHorloge ecouteur) {
		ecouteursHorloge.add(ecouteur);
	}
	public void removeEcouteurHorloge(EcouteurHorloge ecouteur) {
		ecouteursHorloge.remove(ecouteur);
	}

	public void run() {
		while (true) {
			LocalTime heureJava = LocalTime.now();
			adaptationHeure(heureJava);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.err.println("pause interrompue");
			}
		}
	}
	private void adaptationHeure(LocalTime heureJava) {
		Heure heureActuelle = new Heure(heureJava);
		if (!heureActuelle.equals(heure)) {
			heure = heureActuelle;
			//prévenir les écouteurs enregistrés
			for(EcouteurHorloge ecouteur : ecouteursHorloge) {
				ecouteur.heureModifiee(heureActuelle);
			}
		}	
	}
	
	public Heure getHeure() {
		return heure;
	}
}
