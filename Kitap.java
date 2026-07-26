package orn;

public class Kitap {

	private int id;
	private String baslık;
	private String yazar;
	private boolean oduncAlındıMı;
	
	
	public Kitap(int id, String baslık, String yazar) {
		this.id = id;
		this.baslık = baslık;
		this.yazar = yazar;
		this.oduncAlındıMı=false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBaslık() {
		return baslık;
	}
	public void setBaslık(String baslık) {
		this.baslık = baslık;
	}
	public String getYazar() {
		return yazar;
	}
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public boolean getOduncAlındıMı() {
		return oduncAlındıMı;
	}
  
	public void setOduncAlındıMı(boolean oduncAlındıMı) {
		this.oduncAlındıMı = oduncAlındıMı;
	}

	public String toString() {
		String durum = oduncAlındıMı ? "Ödünç verildi" : "Kütüphanede";
		return String.format("Id:%d | Kitap:%-25s | Yazar:%-25s | Durum:%-15s",id,baslık,yazar,durum);
	}
} 
