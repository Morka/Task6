/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Bediener extends Android {

	public Bediener(int snr, Skin skin, Software software, Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return super.toString();
	}
	
	public void aufGesellschafterWechseln(Android android){
		android = new B_Gesellschafter(android.getSNumber(), android.getSkin(), android.getSoftware(), android.getSecurity(), android.getSecurity().getLeistung()); 
	}
	
	public void aufHilfskraftWechseln(Android android){
		android = new B_Hilfskraft(android.getSNumber(), android.getSkin(), android.getSoftware(), android.getSecurity(), android.getSecurity().getLeistung());
	}
	public void aufKaempferWechseln(Android android){
		
	}
	public void aufLeibwaechterWechseln(Android android{
	
	}
	public void aufObjektbewacherWechseln(Android android){
	
	}
	
	public void aufBauarbeiterWechseln(Android android){
	
	}
	
	public void aufServiceTechnikerWechseln(Android android){
	
	}
	
	public void aufTransportarbeiterWechseln(Android android){
	
	}
}