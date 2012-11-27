/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */


public abstract class Android {
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
				return this;
		}
		
		return null;
	}
	
	public Android changeAndroid(Android android){
		if(android != null){
			this.setSkin(android.getSkin());
			this.getSecurity().setLeistung(android.getSecurity().getLeistung());
		}
		
		return this;
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
		security.setLeistung(leistung);
	}

	
	protected void setSkin(Skin skin) {
		this.skin = skin;
	}
	protected Skin getSkin() {
		return skin;
	}
	
	protected int getSNumber() {
		return snr;
	}
	
	/*
	public Iterator<Android> iterator() {
		return stack.iterator();
	}*/
	
	
	public abstract void benutzeSoftware(Software software);
	public abstract void benutzeSecurity(Security security);
	public abstract void benutzeSkin(Skin skin);
	
	public String toString(){
		String ret = "";
		ret = getSNumber() + " , Skin: " + getSkin() + " , Software: " + getSoftware() + " , Security " + getSecurity() + " , Leistung " + getSecurity().getLeistung();
		return ret;
	}
}