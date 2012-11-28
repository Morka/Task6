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
	/**
	 * Method checks, wheter the new Android is functional and ready for
	 * delivery or not
	 * 
	 * @return if functional "this" otherwise "null"
	 */
	//Precondition: if the Android is working, it is returned otherwise return = null
	public Android deliverAndroid() {
		
		if((getSoftware() != null) && (getSkin() != null)  && (security.getLeistung() != null )  && (getSecurity() != null))
		{
				return this;
		}
		
		return null;
	}
	
	/**
	 * Method is called if android is already built and needs to be changed
	 * if android = null, nothing is changed, otherwise all changes are made
	 * but not checked if correct. this happens afterwards
	 *
	 * @param android
	 * 
	 */
	//precondition: android != null
	//postconditon: skin, sofware, leistung is set to the new values
	public void changeAndroid(Android android){
		if(android != null){
			this.setSkin(android.getSkin());
			this.setSoftware(android.getSoftware());
			this.getSecurity().setLeistung(android.getSecurity().getLeistung());
		}
	}
	/**
	 * sets new Software
	 *
	 * @param software
	 * 
	 */
	//precondition: software != null
	//postcondition: software is set to the new value
	protected void setSoftware(Software software) {
		this.software = software;
	}
	
	/**
	 * returns software of android
	 *
	 * @return Software
	 */
	protected Software getSoftware() {
		return software;
	}
	
	/**
	 * sets new Security
	 *
	 * @param security
	 */
	 
	//precondition: security != null
	//postcondition: this.security is set to the new value
	protected final void setSecurity(Security security){
		this.security = security;
	}
	
	/**
	 * returns Security of android
	 *
	 * @return Security
	 */
	protected Security getSecurity() {
		return this.security;
	}
	
	/**
	 * sets new Skin
	 * 
	 * @param skin
	 */
	//precondition: skin != null
	//postcondition: this.skin is set to the new value
	protected void setSkin(Skin skin) {
		this.skin = skin;
	}
	/**
	 * returns Skin of android
	 *
	 * @return Skin
	 */
	protected Skin getSkin() {
		return skin;
	}
	/**
	 * returns snr of Android
	 *
	 * @return snr
	 */
	protected int getSNumber() {
		return snr;
	}
	/**
	 * benutzeSoftware is used for dynamicBinding. It calls the right method
	 * from software
	 *
	 * @param software
	 *
	 */
	//precondition: software != null
	//postcondition: the right method of Software is invoked
	public abstract void benutzeSoftware(Software software);
	
	/**
	 * benutzeSecurity is also used for dynamicBinding. It calls the right method
	 * from Security
	 *
	 * @param security
	 *
	 */
	//precondition: security != null
	//postcondition: the right method of Security is invoked
	public abstract void benutzeSecurity(Security security);
	
	/**
	 * benutzeSkin is used for dynamicBinding, too. It calls the right method
	 * from Skin
	 *
	 * @param skin
	 *
	 */
	//precondition: skin != null
	//postcondition: the right method of Skin is invoked
	public abstract void benutzeSkin(Skin skin);
	

	public String toString(){
		String ret = "";
		ret = getSNumber() + " , Skin: " + getSkin() + " , Software: " + getSoftware() + " , Security " + getSecurity() + " , Leistung " + getSecurity().getLeistung();
		return ret;
	}
}