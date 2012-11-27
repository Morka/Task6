/**
* @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
*/

public class LeistungUnendlichKW extends Leistung{
	
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
		security.setLeistung(null);

	}
	
	public void vonSecurityStufe5Benutzt(SecurityStufe5 security) {
		security.setLeistung(this);
	}
	
	public String toString(){
		return "Unendlich KW Leistung";
	}
}
