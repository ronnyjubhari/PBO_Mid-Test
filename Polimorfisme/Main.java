import java.util.Scanner;

class Main {
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		String name;
		int jumpemakaian;
		
		System.out.println("  Tipe             Harga   ");
		System.out.println("   31          Rp. 100.000 ");
		System.out.println("   32          Rp. 125.000 ");
		System.out.println("   33  	       Rp. 450.000 ");
		System.out.println("   34          Rp. 480.000 ");
		System.out.println("   35  	       Rp. 500.000 ");
		System.out.println("   40          Rp. 550.000 ");
		System.out.println("");
		
		System.out.print("Masukkan nama anda : ");
	    name = input.nextLine();
		System.out.print("Jumlah pemakaian meteran :");
		jumpemakaian = input.nextInt();
		
		Proses p = new Proses(name,jumpemakaian);
		Pelanggan l = new Proses(name,jumpemakaian);
		
		p.pilihan();
		p.pembayaran();
		p.cetak();
	}
}