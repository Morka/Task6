/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Leistung{
	public abstract void vonSecurityStufe1Benutzt(SecurityStufe1 security);
	public abstract void vonSecurityStufe2Benutzt(SecurityStufe2 security);
	public abstract void vonSecurityStufe3Benutzt(SecurityStufe3 security);
	public abstract void vonSecurityStufe4Benutzt(SecurityStufe4 security);
	public abstract void vonSecurityStufe5Benutzt(SecurityStufe5 security);
	
	public abstract String toString();
}
