package orn;
import java.util.Scanner;

public class Main {

	public static void ekranıTemizle() {
		for(int i=0;i<50;i++) {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
    KutuphaneYonetimi yonetim =new KutuphaneYonetimi();
	Scanner scanner=new Scanner(System.in);
	yonetim.kitapEkle(new Kitap(1,"Nutuk","Mustafa Kemal Atatürk"));
	yonetim.kitapEkle(new Kitap(2,"Suc Ve Ceza","Dostoyevski"));
	yonetim.kitapEkle(new Kitap(3,"Simyacı","Paulo Coelho"));
	yonetim.kitapEkle(new Kitap(4,"Beyaz Leke","Aslı Arslan2"));
	
	ekranıTemizle();
	
	boolean calısıyor = true;
	while(calısıyor) {
		System.out.println("\n===== KÜTÜPHANE YÖNETİM SİSTEMİ ====");
		System.out.println("1. Kitapları Listele");
		System.out.println("2. Yeni Kitap Ekle");
		System.out.println("3. Kitap Ödunc Al");
		System.out.println("4. Kitap İade Et");
		System.out.println("0. Çıkış");
		System.out.println("Seçiminiz: ");
		
		int secim = scanner.nextInt();
		scanner.nextLine();
		
		switch(secim) {
		case 1:
			yonetim.kitaplarıListele();
			break;
		case 2:
			System.out.println("Kitap ID: ");
			int id=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Kitap Adı: ");
			String baslık=scanner.nextLine();
			System.out.println("Yazar Adı: ");
			String yazar=scanner.nextLine();
			
			yonetim.kitapEkle(new Kitap(id,baslık,yazar));
			break;
		case 3:	
			System.out.println("Ödünc alınacak Kitap ID: ");
			int oduncid=scanner.nextInt();
			yonetim.kitapOduncAl(oduncid);
			break;
		case 4:	
			System.out.println("İade edilecek Kitap ID: ");
			int iadeid=scanner.nextInt();
			yonetim.kitapIadeEt(iadeid);
			break;	
		case 0:
			calısıyor=false;
			System.out.println("Sistemden çıkılıyor.İyi günler!");
			break;
		default:
			System.out.println("Gecersiz bir tuslama yaptınız!!!");
		}
	 }
	scanner.close();
 }
	
}
