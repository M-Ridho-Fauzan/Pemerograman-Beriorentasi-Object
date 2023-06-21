package classDanObject_P2;

//Daur Hidup object
//Diciptakan > Di Gunakan > Di Hancurkan
//+ Penciptaan Object Disebut Instansi
//+ Dan, Penciptaan Object akan memanggil method khusus yg disebut Konstruktor
//# dan di java hanya ada konstruktor

//= MODUL
//Modul adalah unit dekomposisi
//contoh: implementasi modul di java adalah: package, class, dst

//= Akses property class
//- public --> bisa di akses semua class dan di luar package
//- private --> Hanya bisa di akses sendiri
//- protected --> Bisa di akses turunan nya (coomingson di s7 an)
//- default --> Hanya bisa di akses di 1 package saja

//NB: - final agar isi tidak ber ubah2
//	- static agar tidak usah di definisikan lagi di main
// # dan kombinasi dari final & static yakni final static biasa di gunakan untuk konstanta

public class AksesPropertyClass {
	double panjang;
    double lebar;	
  
//	Contoh public
    public AksesPropertyClass(double panjang, double lebar) {
        this.panjang = panjang;//mengunakan this. ini berarti menurujuk variable yang ada di class public ini
        this.lebar = lebar;
    }

	public double randomEw() {
		return panjang * lebar;
	}

	
}



















