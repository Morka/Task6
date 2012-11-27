/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class S_ServiceTechniker extends Schwerarbeiter {

	public S_ServiceTechniker(int snr, Skin skin, Software software,  Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonServicetechnikerBenutzt(this);
	}
	
	public void benutzeSecurity(Security security){
		security.vonServiceTechnikerBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Servicetechniker, Nr: " + super.toString();
		return ret;
	}

	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonServicetechnikerBenutzt(this);
		
	}
	
}