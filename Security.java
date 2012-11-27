/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Security {	
	private Leistung leistung;
	
	public abstract void vonHilfskraftBenutzt(B_Hilfskraft android);
	public abstract void vonGesellschafterBenutzt(B_Gesellschafter android);
	public abstract void vonBauarbeiterBenutzt(S_Bauarbeiter android);
	public abstract void vonServiceTechnikerBenutzt(S_ServiceTechniker android);
	public abstract void vonTransportarbeiterBenutzt(S_Transportarbeiter android);
	public abstract void vonObjektbewacherBenutzt(G_Objektbewacher android);
	public abstract void vonLeibwaechterBenutzt(G_Leibwaechter android);
	public abstract void vonKaempferBenutzt(G_Kaempfer android);
	
	public abstract void benutzeLeistung(Leistung leistung);
	
	public void setLeistung(Leistung leistung){
		this.leistung = leistung;
	}
	
	public Leistung getLeistung(){
		return leistung;
	}
	
	public abstract String toString();
}