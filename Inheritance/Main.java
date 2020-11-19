import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		
		int bayar = 0;
		int kembalian = 0;
		
		TagihanPLN t = new TagihanPLN(); 		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("  Tipe             Harga   ");
		System.out.println("   31          Rp. 100.000 ");
		System.out.println("   32          Rp. 125.000 ");
		System.out.println("   33  	       Rp. 450.000 ");
		System.out.println("   34          Rp. 480.000 ");
		System.out.println("   35  	       Rp. 500.000 ");
		System.out.println("   40          Rp. 550.000 ");
		System.out.println("");
		
		System.out.print("Masukkan Nama Anda : ");
		String nama = input.nextLine();
		t.setNama(nama);
							
		t.proses();
				
		System.out.println("Total Harga : Rp. "+(int)t.getHarga());
		
		System.out.print("Masukkan Jumlah Bayar = Rp. ");
		bayar = input.nextInt();
		
		t.setBayar(bayar);
		
		t.setKembalian(kembalian);
		t.getKembalian(); 		
		t.showStruk();
		
	}
}