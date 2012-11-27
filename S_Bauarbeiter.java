/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class S_Bauarbeiter extends Schwerarbeiter {

	public S_Bauarbeiter(int snr, Skin skin, Software software,  Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonBauarbeiterBenutzt(this);
	}
	
	public void benutzeSecurity(Security security){
		security.vonBauarbeiterBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Bauarbeiter, Nr: " + super.toString();
		return ret;
	}

	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonBauarbeiterBenutzt(this);
		
	}
}