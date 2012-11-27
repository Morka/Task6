/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Leistung{
	abstract void vonHilfskraftBenutzt(HilfskraftSoftware software);
	abstract void vonGesellschafterBenutzt(GesellschafterSoftware software);
	abstract void vonBauarbeiterBenutzt(BauarbeiterSoftware software);
	abstract void vonServicetechnikerBenutzt(ServiceTechnikerSoftware software);
	abstract void vonTransportarbeiterBenutzt(TransportarbeiterSoftware software);
	abstract void vonObjektbewacherBenutzt(ObjektbewacherSoftware software);
	abstract void vonLeibwaechterBenutzt(LeibwaechterSoftware software);
	abstract void vonKaempferBenutzt(KaempferSoftware software);
	public abstract String toString();
}
