/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class G_Leibwaechter extends Guardian {

	public G_Leibwaechter(int snr, Skin skin, Software software) {
		super(snr, skin, software);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonLeibwaechterBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Leibwaechter, Nr: " + this.snr + " , Skin: " + this.skin + " , Software: " + this.software;
		return ret;
	}
}