/**
* @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
*/

public class G_Objektbewacher extends Guardian {
	
	public G_Objektbewacher(int snr, Skin skin, Software software,  Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}
	
	public void benutzeSoftware(Software software) {
		software.vonObjektbewacherBenutzt(this);
	}
	
	public void benutzeSecurity(Security security){
		security.vonObjektbewacherBenutzt(this);
	}
	
	public String toString() {
		String ret = "";
		ret = "Objektbewacher, Nr: " + super.toString();
		return ret;
	}
	
	@Override
	public void benutzeSkin(Skin skin) {
		skin.vonObjektbewacherBenutzt(this);
		
	}
	
}