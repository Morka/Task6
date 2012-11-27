/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class S_Transportarbeiter extends Schwerarbeiter {

	public S_Transportarbeiter(int snr, Skin skin, Software software,  Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonTransportarbeiterBenutzt(this);
	}
	
	public void benutzeSecurity(Security security){
		security.vonTransportarbeiterBenutzt(this);
	}
	
	public void changeTyp(Android android){
		android.aufTransportarbeiterWechseln(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Transportarbeiter, Nr: " + super.toString();
		return ret;
	}

	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonTransportarbeiterBenutzt(this);
		
	}
}