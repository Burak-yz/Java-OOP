package orn;

public interface IKutuphaneIslemleri {
  void kitapEkle(Kitap kitap);
  void kitaplarıListele();
  void kitapOduncAl(int kitapId);
  void kitapIadeEt(int kitapId);
}
