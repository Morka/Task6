/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

import java.util.Iterator;

public abstract class Android {
	protected final int snr;
	protected Skin skin;
	protected Software software;
	
	public Android(int snr, Skin skin, Software software) {
		this.snr = snr;
		
		this.benutzeSoftware(software);
		//this.benutzeSkin(Skin);
		
	}
	
	public abstract void benutzeSoftware(Software software);
	
	public Software getSoftware() {
		return software;
	}
	
	//public abstract void benutzeSkin(Skin skin);
	
	/*public Skin getSkin() {
		return skin;
	}*/
	
	public abstract String toString();
}