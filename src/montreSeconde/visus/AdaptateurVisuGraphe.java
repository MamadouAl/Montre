package montreSeconde.visus;

import montreSeconde.horloge.EcouteurHorloge;
import montreSeconde.horloge.Heure;

public class AdaptateurVisuGraphe implements EcouteurHorloge {
	private VisuGraphes visuGraphes;
	
	public AdaptateurVisuGraphe(VisuGraphes graphe) {
		visuGraphes = graphe;
	}

	@Override
	public void heureModifiee(Heure nouvelleHeure) {
		int min =nouvelleHeure.getMinute();
		int heure = nouvelleHeure.getHeure();
		int sec = nouvelleHeure.getSeconde();
		
		visuGraphes.setHeure(heure, min, sec);
	}

}
