package montreSeconde.visus;

import montreSeconde.horloge.EcouteurHorloge;
import montreSeconde.horloge.Heure;

public class AdaptateurVisuTexte implements EcouteurHorloge {
	private VisuTexte visuTexte;
	
	public AdaptateurVisuTexte(VisuTexte visu) {
		visuTexte = visu;
	}

	@Override
	public void heureModifiee(Heure nouvelleHeure) {
		int heure = nouvelleHeure.getHeure();
		int min = nouvelleHeure.getMinute();
		int sec = nouvelleHeure.getSeconde();
		visuTexte.setTexte(heure +":"+min +":"+sec);
	}

}
