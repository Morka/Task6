/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

import java.util.Iterator;
import java.util.Stack;

public abstract class Android {
	private Stack<Android> stack = new Stack<Android>();
	private final int snr;
	private Skin skin;
	private Software software;
	private Leistung leistung;
	
	public Android(int snr, Skin skin, Software software) {
		this.snr = snr;
		
		this.benutzeSoftware(software);
		//this.benutzeLeistung(leistung);
		//this.benutzeSkin(Skin);
		
	}
	
	public Android deliverAndroid() {
		
		if(getSoftware() != null)  //&& getSkin() != null && getLeistung() != null 
		{
				stack.add(this);
				return this;
		}
		
		return null;
	}
		
	public abstract void benutzeSoftware(Software software);
	
	protected void setSoftware(Software software) {
		this.software = software;
	}
	
	//public abstract void benutzeSecurity(Security security);
	
	//public abstract void benutzeLeistung(Leistung leistung);

	protected void setLeistung(Leistung leistung){
		this.leistung = leistung;
	}
	
	protected void setSkin(Skin skin) {
		this.skin = skin;
	}
	
	public Software getSoftware() {
		return software;
	}
	
	//public abstract void benutzeSkin(Skin skin);
	
	/*public Skin getSkin() {
		return skin;
	}*/
	
	public abstract String toString();
	
	protected int getSNumber() {
		return snr;
	}
	
	protected Skin getSkin() {
		return skin;
	}
	
	public Iterator<Android> iterator() {
		return stack.iterator();
	}
}