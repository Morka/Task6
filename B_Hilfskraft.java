/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class B_Hilfskraft extends Bediener {
	public B_Hilfskraft(int snr, Skin skin, Software software, Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonHilfskraftBenutzt(this);
	}
	
	public void benutzeSecurity(Security security){
		security.vonHilfskraftBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Hilfskraft, Nr: " + super.toString();
		return ret;
	}

	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonHilfskraftBenutzt(this);
		
	}
}