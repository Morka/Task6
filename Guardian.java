/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Guardian extends Android {

	public Guardian(int snr, Skin skin, Software software, Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		String ret = "";
		ret = getSNumber() + " , Skin: " + getSkin() + " , Software: " + getSoftware() + " , Security " + getSecurity() + " , Leistung " + getSecurity().getLeistung();
		return ret;
	}
}