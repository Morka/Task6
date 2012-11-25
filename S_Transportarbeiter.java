/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class S_Transportarbeiter extends Schwerarbeiter {

	public S_Transportarbeiter(int snr, Skin skin, Software software) {
		super(snr, skin, software);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonTransportarbeiterBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Transportarbeiter, Nr: " + this.snr + " , Skin: " + this.skin + " , Software: " + this.software;
		return ret;
	}
}