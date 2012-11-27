/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class G_Leibwaechter extends Guardian {

	public G_Leibwaechter(int snr, Skin skin, Software software, Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonLeibwaechterBenutzt(this);
	}
	
	public void benutzeSecurity(Security security){
		security.vonLeibwaechterBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Leibwaechter, Nr: " + super.toString();
		return ret;
	}

	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonLeibwaechterBenutzt(this);
		
	}
}