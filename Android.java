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
	private Security security;
	
	public Android(int snr, Skin skin, Software software) {
		this.snr = snr;
		
		this.benutzeSoftware(software);
		this.benutzeSkin(skin);
		//this.benutzeSecurity(security);
		//this.benutzeLeistung(leistung);
		
	}
	
	public Android deliverAndroid() {
		
		if((getSoftware() != null) && (getSkin() != null))  //  && (getLeistung() != null )  && (getSecurity() != null)
		{
				stack.add(this);
				return this;
		}
		
		return null;
	}
			
	protected void setSoftware(Software software) {
		this.software = software;
	}
	protected Software getSoftware() {
		return software;
	}
	
	
	protected void setSecurity(Security security){
		this.security = security;
	}
	protected Security getSecurity() {
		return this.security;
	}

	protected void setLeistung(Leistung leistung){
		this.leistung = leistung;
	}
	protected Leistung getLeistung() {
		return this.leistung;
	}
	
	protected void setSkin(Skin skin) {
		this.skin = skin;
	}
	

	
	protected int getSNumber() {
		return snr;
	}
	
	protected Skin getSkin() {
		return skin;
	}
	
	public Iterator<Android> iterator() {
		return stack.iterator();
	}
	
	public abstract String toString();
	public abstract void benutzeSoftware(Software software);
	public abstract void benutzeSecurity(Security security);
	public abstract void benutzeSkin(Skin skin);
	//public abstract void benutzeLeistung(Leistung leistung);
}