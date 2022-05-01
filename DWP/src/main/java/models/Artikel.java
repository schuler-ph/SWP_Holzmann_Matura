package models;

public class Artikel {
	private int ArtikelId;
	private String Bezeichnung;
	private String Beschreibung;
	private double VerkaufspreisNetto;
	private int LieferantId;
	
	public Artikel() { this(0, "", "", 0.0, 0); }
	public Artikel (int ArtikelId, String Bezeichnung, String Beschreibung, double VerkaufspreisNetto, int LieferantId) {
		this.ArtikelId  = ArtikelId;
		this.Bezeichnung  = Bezeichnung;
		this.Beschreibung  = Beschreibung;
		this.VerkaufspreisNetto  = VerkaufspreisNetto;
		this.LieferantId  = LieferantId;
	}
	
	
	public int getArtikelId() {
		return ArtikelId;
	}
	public void setArtikelId(int artikelId) {
		ArtikelId = artikelId;
	}
	public String getBezeichnung() {
		return Bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		Bezeichnung = bezeichnung;
	}
	public String getBeschreibung() {
		return Beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		Beschreibung = beschreibung;
	}
	public double getVerkaufspreisNetto() {
		return VerkaufspreisNetto;
	}
	public void setVerkaufspreisNetto(double verkaufspreisNetto) {
		VerkaufspreisNetto = verkaufspreisNetto;
	}
	public int getLieferantId() {
		return LieferantId;
	}
	public void setLieferantId(int lieferantId) {
		LieferantId = lieferantId;
	}
	
	@Override
	public String toString() {
		return "Artikel [ArtikelId=" + ArtikelId + ", Bezeichnung=" + Bezeichnung + ", Beschreibung=" + Beschreibung
				+ ", VerkaufspreisNetto=" + VerkaufspreisNetto + ", LieferantId=" + LieferantId + "]";
	}
}