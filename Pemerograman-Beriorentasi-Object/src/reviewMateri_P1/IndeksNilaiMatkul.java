package reviewMateri_P1;

import java.util.Scanner;

public class IndeksNilaiMatkul {

    public String hitungIndeksNilai (Integer nilai) {
        if (nilai == null) {
            return "Nilai Harus Di isi!!";
        }
        else if ( nilai >= 81 && nilai <= 100 ){
           return "A";
        } 
        else if ( nilai >= 76 && nilai <= 80 ){
           return "AB";
        }
        else if ( nilai >= 56 && nilai <= 75 ){
           return "B";
        }
        else if ( nilai >= 51 && nilai <= 55 ){
           return "BC";
        }
        else if ( nilai >= 41 && nilai <= 50 ){
           return "C";
        }
        else if ( nilai >= 21 && nilai <= 40 ){
           return "D";
        }
        else if ( nilai >= 0 && nilai <= 20 ){
           return "E";
        }
        else {
        	return "nilai diluar jangkauan";
        }
    }
    public static void main(String[] args) {
        IndeksNilaiMatkul TL = new IndeksNilaiMatkul();
        Scanner scanner = new Scanner(System.in);
	    System.out.println("masukan nilai -1 untuk menghentikan ");
	    
		    Integer nilai;
		    while(true) {
		    System.out.println("Isi nilai index: ");
		    nilai = scanner.nextInt();
		    if(nilai == -1) {
		    	break;
		    	}
		    String nilaiindeks = TL.hitungIndeksNilai(nilai);
		   System.out.println("Indeks nilai: " + nilaiindeks);
		}
    } 
}



