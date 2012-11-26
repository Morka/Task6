/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
 
public class SecurityStufe1 extends Security{
	public String toString(){
		return "Security Stufe 1";
	}
	
	public void vonHilfskraftBenutzt(B_Hilfskraft android){
		android.setSecurity(this);
	}
	public void vonGesellschafterBenutzt(B_Gesellschafter android){
		android.setSecurity(this);
	}
	public void vonBauarbeiterBenutzt(S_Bauarbeiter android){
		android.setSecurity(null);
	}
	public void vonServiceTechnikerBenutzt(S_ServiceTechniker android){
		android.setSecurity(null);
	}
	public void vonTransportarbeiterBenutzt(S_Transportarbeiter android){
		android.setSecurity(null);
	}
	public void vonObjektbewacherBenutzt(G_Objektbewacher android){
		android.setSecurity(null);
	}
	public void vonLeibwaechterBenutzt(G_Leibwaechter android){
		android.setSecurity(null);
	}
	public void vonKaempferBenutzt(G_Kaempfer android){
		android.setSecurity(null);
	}
}
