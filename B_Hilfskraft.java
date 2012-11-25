/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class B_Hilfskraft extends Bediener {
	public B_Hilfskraft(int snr, Skin skin, Software software) {
		super(snr, skin, software);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonHilfskraftBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Hilfskraft, Nr: " + this.snr + " , Skin: " + this.skin + " , Software: " + this.software;
		return ret;
	}
}