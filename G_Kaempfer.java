/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class G_Kaempfer extends Guardian {

	public G_Kaempfer(int snr, Skin skin, Software software) {
		super(snr, skin, software);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonKaempferBenutzt(this);
	}
	
	
	public void benutzeSecurity(Security security){
		security.vonKaempferBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Kaempfer, Nr: " + getSNumber() + " , Skin: " + getSkin() + " , Software: " + getSoftware();
		return ret;
	}

	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonKaempferBenutzt(this);
		
	}
	
}