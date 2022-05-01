package models;

public class Lieferant {
	private int LieferantId;
	private String Name;
	private String Email;
	private String Ort;
	private String PLZ;
	private String Strasze;
	private String Hnr;
	private String Land;
	
	public Lieferant() { this(0, "", "", "", "", "", "", "" ); }
	
	public Lieferant( int LieferantId, String Name, String Email, String Ort, String PLZ, String Strasze, String Hnr, String Land) {
		this.LieferantId = LieferantId;
		this.Name = Name;
		this.Email = Email;
		this.Ort = Ort;
		this.PLZ = PLZ;
		this.Strasze = Strasze;
		this.Hnr = Hnr;
		this.Land = Land;
	}
	

	public int getLieferantId() {
		return LieferantId;
	}

	public void setLieferantId(int lieferantId) {
		LieferantId = lieferantId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getOrt() {
		return Ort;
	}

	public void setOrt(String ort) {
		Ort = ort;
	}

	public String getPLZ() {
		return PLZ;
	}

	public void setPLZ(String pLZ) {
		PLZ = pLZ;
	}

	public String getStrasze() {
		return Strasze;
	}

	public void setStrasze(String strasze) {
		Strasze = strasze;
	}

	public String getHnr() {
		return Hnr;
	}

	public void setHnr(String hnr) {
		Hnr = hnr;
	}

	public String getLand() {
		return Land;
	}

	public void setLand(String land) {
		Land = land;
	}

	@Override
	public String toString() {
		return "Lieferant [LieferantId=" + LieferantId + ", Name=" + Name + ", Email=" + Email + ", Ort=" + Ort
				+ ", PLZ=" + PLZ + ", Strasze=" + Strasze + ", Hnr=" + Hnr + ", Land=" + Land + "]";
	}	
}