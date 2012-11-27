/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class B_Gesellschafter extends Bediener {
	public B_Gesellschafter(int snr, Skin skin, Software software,  Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonGesellschafterBenutzt(this);
	}
	
	
	public void benutzeSecurity(Security security){
		security.vonGesellschafterBenutzt(this);
	}
	
	public void changeTyp(Android android){
		android.aufGesellschafterWechseln(this);
	}
	
	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonGesellschafterBenutzt(this);
		
	}
	
	public String toString() {
		String ret = "";
		ret = "Gesellschafter, Nr: " + super.toString();
		return ret;
	}
}