/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class B_Gesellschafter extends Bediener {
	public B_Gesellschafter(int snr, Skin skin, Software software) {
		super(snr, skin, software);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonGesellschafterBenutzt(this);
	}
	
	
	public void benutzeSecurity(Security security){
		security.vonGesellschafterBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Gesellschafter, Nr: " + getSNumber() + " , Skin: " + getSkin() + " , Software: " + getSoftware();
		return ret;
	}

	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonGesellschafterBenutzt(this);
		
	}
}