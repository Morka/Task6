/**
* @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
*/

public class Leistung10KW extends Leistung{
	public void vonHilfskraftBenutzt(HilfskraftSoftware software){

	}
	
	public void vonGesellschafterBenutzt(GesellschafterSoftware software) {

	}
	
	public void vonBauarbeiterBenutzt(BauarbeiterSoftware software) {
		
	}
	
	public void vonServicetechnikerBenutzt(ServiceTechnikerSoftware software) {
		
	}
	
	public void vonTransportarbeiterBenutzt(TransportarbeiterSoftware software) {
		
	}
	
	public void vonObjektbewacherBenutzt(ObjektbewacherSoftware software) {
		
	}
	
	public void vonLeibwaechterBenutzt(LeibwaechterSoftware software) {
		
	}
	
	
	public void vonKaempferBenutzt(KaempferSoftware software) {
		software.setLeistung(this)
	}
	
	public String toString(){
		return "10KW Leistung";
	}
}
