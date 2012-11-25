/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class S_Bauarbeiter extends Schwerarbeiter {

	public S_Bauarbeiter(int snr, Skin skin, Software software) {
		super(snr, skin, software);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonBauarbeiterBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Bauarbeiter, Nr: " + getSNumber() + " , Skin: " + getSkin() + " , Software: " + getSoftware();
		return ret;
	}
}