/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class HilfskraftSoftware extends Software {
	public String toString() {
		return "Hilfskraft-Software";
	}
	
	public void vonHilfskraftBenutzt(B_Hilfskraft android) {
		android.software = this;		
	}
	
	public void vonGesellschafterBenutzt(B_Gesellschafter android) {
		android.software = null;
	}
	
	public void vonBauarbeiterBenutzt(S_Bauarbeiter android) {
		
	}
	
	public void vonServicetechnikerBenutzt(S_ServiceTechniker android) {
		
	}
	
	public void vonTransportarbeiterBenutzt(S_Transportarbeiter android) {
		
	}
	
	public void vonObjektbewacherBenutzt(G_Objektbewacher android) {
		
	}
	
	public void vonLeibwaechterBenutzt(G_Leibwaechter android) {
		
	}
	
	
	public void vonKaempferBenutzt(G_Kaempfer android) {
		
	}
}