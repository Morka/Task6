/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class S_ServiceTechniker extends Schwerarbeiter {

	public S_ServiceTechniker(int snr, Skin skin, Software software) {
		super(snr, skin, software);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonServicetechnikerBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Servicetechniker, Nr: " + this.snr + " , Skin: " + this.skin + " , Software: " + this.software;
		return ret;
	}
	
}