/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class G_Objektbewacher extends Guardian {

	public G_Objektbewacher(int snr, Skin skin, Software software) {
		super(snr, skin, software);
		// TODO Auto-generated constructor stub
	}

	public void benutzeSoftware(Software software) {
		software.vonObjektbewacherBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Objektbewacher, Nr: " + this.snr + " , Skin: " + this.skin + " , Software: " + this.software;
		return ret;
	}
	
}