package montreSeconde.visus;

import montreSeconde.horloge.EcouteurHorloge;
import montreSeconde.horloge.Heure;

public class AdaptateurVisuHorloge implements EcouteurHorloge {
	private VisuHorloge visuHorloge;
	
	public AdaptateurVisuHorloge(VisuHorloge visuH) {
		visuHorloge = visuH;
	}

	@Override
	public void heureModifiee(Heure nouvelleHeure) {
		visuHorloge.setHeure(nouvelleHeure);

	}

}
