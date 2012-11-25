/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Software {
	abstract void vonHilfskraftBenutzt(B_Hilfskraft android);
	abstract void vonGesellschafteBenutzt(B_Gesellschafter android);
	abstract void vonBauarbeiterBenutzt(S_Bauarbeiter android);
	abstract void vonServicetechnikerBenutzt(S_ServiceTechniker android);
	abstract void vonTransportarbeiterBenutzt(S_Transportarbeiter android);
	abstract void vonObjektbewacherBenutzt(G_Objektbewacher android);
	abstract void vonLeibwaechterBenutzt(G_Leibwaechter android);
	abstract void vonKaempferBenutzt(G_Kaempfer android);
}