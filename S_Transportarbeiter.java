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
		ret = "Transportarbeiter, Nr: " + getSNumber() + " , Skin: " + getSkin() + " , Software: " + getSoftware();
		return ret;
	}

	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonTransportarbeiterBenutzt(this);
		
	}
}