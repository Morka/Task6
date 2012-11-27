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

	private Security security;
	
	public Android(int snr, Skin skin, Software software, Security security, Leistung leistung) {
		this.snr = snr;
		
		this.benutzeSoftware(software);
		this.benutzeSkin(skin);
		this.benutzeSecurity(security);
		security.benutzeLeistung(leistung);
		
	}
	
	public Android deliverAndroid() {
		
		if((getSoftware() != null) && (getSkin() != null)  && (security.getLeistung() != null )  && (getSecurity() != null))
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
/*
	protected void setLeistung(Leistung leistung){
		this.leistung = leistung;
	}
*/
	
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
	
	
	public abstract void benutzeSoftware(Software software);
	public abstract void benutzeSecurity(Security security);
	public abstract void benutzeSkin(Skin skin);
	
	public abstract String toString();
}