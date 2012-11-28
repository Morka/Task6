/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class HochfesteSkin extends Skin {
		
	public String toString() {
		return "Hochfeste Haut";
	}

	@Override
	public void vonHilfskraftBenutzt(B_Hilfskraft android) {
		android.setSkin(null);
		
	}

	@Override
	public void vonGesellschafterBenutzt(B_Gesellschafter android) {
		android.setSkin(null);
		
	}

	@Override
	public void vonBauarbeiterBenutzt(S_Bauarbeiter android) {
		android.setSkin(this);
		
	}

	@Override
	public void vonServicetechnikerBenutzt(S_ServiceTechniker android) {
		android.setSkin(this);
		
	}

	@Override
	public void vonTransportarbeiterBenutzt(S_Transportarbeiter android) {
		android.setSkin(this);
		
	}

	@Override
	public void vonObjektbewacherBenutzt(G_Objektbewacher android) {
		android.setSkin(this);
		
	}

	@Override
	public void vonLeibwaechterBenutzt(G_Leibwaechter android) {
		android.setSkin(this);
		
	}

	@Override
	public void vonKaempferBenutzt(G_Kaempfer android) {
		android.setSkin(this);
		
	}
}