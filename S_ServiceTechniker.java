/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class S_ServiceTechniker extends Schwerarbeiter {

	public S_ServiceTechniker(int snr, Skin skin, Software software) {
		super(snr, skin, software);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonServicetechnikerBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Servicetechniker, Nr: " + getSNumber() + " , Skin: " + getSkin() + " , Software: " + getSoftware();
		return ret;
	}

	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonServicetechnikerBenutzt(this);
		
	}
	
}