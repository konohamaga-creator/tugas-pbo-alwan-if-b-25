/*Object ada properti dan juga ada methode*/
/*Properti/atribut dari seseorang misal: 1. Rambut coklat, 2. Mata hitam, 3. Kulit putih, 4. Baju merah, 5. tinggi 6 kaki, 6. Berat 75kg*/
/*Methode/aksi dari seseorang adalah: 1. Makan/eat(), 2. Tidur/sleep(), 3. Berjalan/walk(), 4. Berlari/run()*/
/*Objek adalah gabungan dari atribut dan methode ketika berbicara bahwa orang(atau apapun selain orang) adalah sebuah objek*/
/*Class adalah kumpulan dari objek-objek yang memiliki karakteristrik yang sama*/
/*Contoh class: 1. class Human, 2. class Animal, 3. class Plant*/
/*Laptop saya adalah objek, tapi laptop adalah class, pake logika ajah (intinya ada di kata "saya"*/
/*Class(abstrak) adalah blueprint atau prototype untuk sekumpulan objek dengan tipe yang serupa*/
/*Objek adalah suatu hal dengan keunikan nyata dengan properti dan aksi*/
/*Dalam satu class bisa membuat banyak objek sesuai dengan kebutuhan*/
/*Kemampuan/methode/aksi/behavior*/
/*Objek adalah segala sesuatu yang ada didunia ini, berbagai benda di sekitar adalah objek nyata yang dapat dilihat*/
/*class adalah sesuatu yang tak ada wujud, sedang object adalah memiliki wujud*/
/*Sebelum class, maka kita tentukan dahulu objek*/
/*Karakteristik objek, state= atribut, behaviour=melakukan sesuatu/perilaku*/
/*INSTANTIATION= NamaKelas namaObjek = new namaKonstruktor();*/
/*Instansiasi adalah proses penciptaan objek berdasar kelas yang ada*/
/*diameter adalah garis*/
/*membuat class dibiasakan dengan kapital pada huruf pertama*/
/*konstruktor adalah methode yang sama dengan nama kelas*/
/*Nilai lingkaran tak ada, tapi jika lingkaran1 maka ada*/
/*Perbedaan objek mana yang memanggil sangatlah penting untuk melihat value yang sebenarnya diinginkan*/
/*nilai phi adalah pengecualian mutlak*/


package P2;


public class BagianClass {
    public static void main(String[] args) {
        //instansiasi
//        Lingkaran lingkaran1 = new Lingkaran();
//        Lingkaran lingkaran2 = new Lingkaran();
//        
//        Cylinder cylinder1 = new Cylinder();

          Lingkaran l1 = new Lingkaran();
          
          Cylinder c1 = new Cylinder();
//        
        
        //pemberian value

        
//       
//          l1.jari = 6;
//       
//          System.out.printf("Nilai dari luas lingkaran adalah: %.2f%n", + l1.hitungLuas());
        
            c1.jari = 6;
            c1.tinggi = 103;
            
            System.out.println("Volume dari cylinder adalah: " + c1.hitungVolume());
           
          
        
        
        
//        System.out.println("Object lingkaran 1 dibuat: ");
//        System.out.println("Jari lingkaran 1 = " + lingkaran1.jari);
//        System.out.println("Phi lingkaran 1 = " + lingkaran1.phi);
//        System.out.println("luas lingkaran 1 = " + lingkaran1.luas);
//        
//        System.out.println("jari lingkaran 2 adalah: " + lingkaran2.jari);
///*========================================================================================================================*/
//     
//        
//       
//        
//        System.out.println("Object cylinder 1 telah dibuat: ");
//        System.out.println("Volume tabung/cylinder adalah: " + cylinder1.volume);
        
        
    }
    
    
}

class Lingkaran{

	double jari;
	double luas;
	final double PHI = 3.14;
	
	double hitungLuas(){
	
	luas = PHI * jari * jari;
	return luas;
    }
} 

class Cylinder {
    double jari;
    double tinggi;
    final double PHI = 3.14;

    double hitungVolume() {
        // Luas alas lingkaran dikali tinggi
        return PHI * jari * jari * tinggi; 
    }
}
