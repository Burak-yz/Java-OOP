package orn;
import java.util.List;
import java.util.ArrayList;

public class KutuphaneYonetimi implements IKutuphaneIslemleri {
    private List<Kitap> kitapListesi;
    
	public KutuphaneYonetimi() {
		
		this.kitapListesi = new ArrayList<>();
	}

	@Override
	public void kitapEkle(Kitap kitap) {
    kitapListesi.add(kitap);
    System.out.println("Kitap basarıyla eklendi: " + kitap.getBaslık());
	}

	@Override
	public void kitaplarıListele() {
		if(kitapListesi.isEmpty()) {
			System.out.println("Kütüphanede henüz kayıtlı kitap yok. ");
			return;
		}
		System.out.println("\n--- KÜTÜPHANEDEKİ KİTAPLAR ---");
        for(Kitap k:kitapListesi) {
        	System.out.println(k.toString());
        }
	}

	@Override
	public void kitapOduncAl(int kitapId) {
		Kitap kitap = kitapBul(kitapId);
        if(kitap!=null) {
        	if(!kitap.getOduncAlındıMı()) {
        		kitap.setOduncAlındıMı(true);
        		System.out.println(kitap.getBaslık()+" kitabını ödunc aldınız.");
        	}else {
        		System.out.println("!Bu kitap zaten baska birinde");
        	}
        } else {
        	System.out.println("Belirtilen ID ile kitap bulunamadı. ");
        }
	}

	@Override
	public void kitapIadeEt(int kitapId) {
		Kitap kitap = kitapBul(kitapId);
		if(kitap!=null) {
			if(kitap.getOduncAlındıMı()) {
				kitap.setOduncAlındıMı(false);
				System.out.println(kitap.getBaslık()+" kütüphaneye iade edildi");
			}else {
				System.out.println("Bu kitap zaten kütüphanede görünüyor");
			}
		} else {
			System.out.println("Belirtilen ID ile kitap bulunamadı. ");
		}
	}
	
	private Kitap kitapBul(int id) {
		for(Kitap k : kitapListesi) {
			if(k.getId()==id) {
				return k;
			}
		}
		
		return null;
	}
 
}
