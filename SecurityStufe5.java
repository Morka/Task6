/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
 
public class SecurityStufe5 extends Security{
	public String toString(){
		return "Security Stufe 5";
	}
	public void vonHilfskraftBenutzt(B_Hilfskraft android){

	}
	public void vonGesellschafterBenutzt(B_Gesellschafter android){
	
	}
	public void vonBauarbeiterBenutzt(S_Bauarbeiter android){
	
	}
	public void vonServiceTechnikerBenutzt(S_ServiceTechniker android){
	
	}
	public void vonTransportarbeiterBenutzt(S_Transportarbeiter android){
	
	}
	public void vonObjektbewacherBenutzt(G_Objektbewacher android){
	
	}
	public void vonLeibwaechterBenutzt(G_Leibwaechter android){
	
	}
	public void vonKaempferBenutzt(G_Kaempfer android){
		android.setSecurity(this);
	}
}
