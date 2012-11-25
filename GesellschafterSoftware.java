/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class GesellschafterSoftware extends Software {
	public String toString() {
		return "Hilfskraft-Software";
	}
	
	public void vonGesellschafterBenutzt(B_Gesellschafter android) {
		android.software = this;
	}
	
	public void vonHilfskraftBenutzt(B_Hilfskraft android) {
		android.software = null;
	}
	
	public void vonBauarbeiterBenutzt(S_Bauarbeiter android) {
		//android.software = null;		
	}
	
	public void vonServicetechnikerBenutzt(S_ServiceTechniker android) {
		//android.software = null;		
	}
	
	public void vonTransportarbeiterBenutzt(S_Transportarbeiter android) {
		//android.software = null;		
	}
	
	public void vonObjektbewacherBenutzt(G_Objektbewacher android) {
		//android.software = null;		
	}
	
	public void vonLeibwaechterBenutzt(G_Leibwaechter android) {
		//android.software = null;		
	}
	
	public void vonKaempferBenutzt(G_Kaempfer android) {
		//android.software = null;		
	}
}