/**
* @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
*/

public class Leistung1KW extends Leistung{
	public void vonHilfskraftBenutzt(HilfskraftSoftware software){
		software.setLeistung(this);
	}
	
	public void vonGesellschafterBenutzt(GesellschafterSoftware software) {
		software.setLeistung(this);
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
		
	}
	
	public String toString(){
		return "1KW Leistung";
	}
}
