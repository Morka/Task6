/**
* @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
*/

public class Leistung10KW extends Leistung{
	
	public void vonSecurityStufe1Benutzt(SecurityStufe1 security){
		security.setLeistung(null);
	}
	
	public void vonSecurityStufe2Benutzt(SecurityStufe2 security) {
		security.setLeistung(null);
	}
	
	public void vonSecurityStufe3Benutzt(SecurityStufe3 security) {
		security.setLeistung(null);
	}
	
	public void vonSecurityStufe4Benutzt(SecurityStufe4 security) {
		security.setLeistung(this);
	}
	
	public void vonSecurityStufe5Benutzt(SecurityStufe5 security) {
		security.setLeistung(null);

	}
	
	public String toString(){
		return "10KW Leistung";
	}
}
