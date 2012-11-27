/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class TransportarbeiterSoftware extends Software {
	public String toString() {
		return "Transportarbeiter-Software";
	}
	
	public void vonHilfskraftBenutzt(B_Hilfskraft android) {
		android.setSoftware(null);
	}
	
	public void vonGesellschafterBenutzt(B_Gesellschafter android) {
		android.setSoftware(null);
	}
	
	public void vonBauarbeiterBenutzt(S_Bauarbeiter android) {
		android.setSoftware(null);
	}
	
	public void vonServicetechnikerBenutzt(S_ServiceTechniker android) {
		android.setSoftware(null);
	}
	
	public void vonTransportarbeiterBenutzt(S_Transportarbeiter android) {
		android.setSoftware(this);
	}
	
	public void vonObjektbewacherBenutzt(G_Objektbewacher android) {
		android.setSoftware(null);
	}
	
	public void vonLeibwaechterBenutzt(G_Leibwaechter android) {
		android.setSoftware(null);
	}
	
	
	public void vonKaempferBenutzt(G_Kaempfer android) {
		android.setSoftware(null);
	}
}