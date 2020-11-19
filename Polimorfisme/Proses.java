import java.util.Scanner;

class Proses extends Pelanggan{
	
	Scanner input = new Scanner(System.in);
	private int tiperumah;
	private int bayar;
	private int totalharga;
	private int kembalian;
	private int biaya=0;
	boolean loop=true;
	
	public Proses(String nama,int pemakaian){
		super(nama,pemakaian);
	}		
	
    protected void pilihan(){
	    while(loop){
		
		System.out.print("Tipe Rumah(31/32/33/34/35/40) : ");
		tiperumah = input.nextInt();
		
		switch(tiperumah){
	            case 31 :
	                biaya = 100000;
	                System.out.println("Biaya : "+biaya);
	                
	                loop = false;
	                break;
	            case 32 :
	                 biaya = 125000;
	                 System.out.println("Biaya : "+biaya);
	                 
	                 loop= false;
	                break;
	                case 33 :
	               biaya =  450000;
	                 System.out.println("Biaya : "+biaya);
	                   loop= false;
	                break;
	                case 34 :
	               biaya =  480000;
	                 System.out.println("Biaya : "+biaya);
	                   loop= false;
	                break;
	                  case 35 :
	               biaya =  500000;
	                 System.out.println("Biaya : "+biaya);
	                   loop= false;
	                break;
	                  case 40 :
	               biaya =  550000;
	                 System.out.println("Biaya : "+biaya);
	                   loop= false;
	                break;
	                
	                
	            default :
	                System.out.println();
	                System.out.println("Tipe rumah anda tidak ada coba lagi");
	                break;
	        }
		}
	}
	
	
	protected void pembayaran(){
		
		totalharga = getPemakaian()*biaya;
		System.out.println("Total Harga    : "+totalharga);
			
		System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		bayar= input.nextInt();
			
			
		while(bayar<totalharga){
			
			if(bayar<totalharga){
				
				System.out.println("uang anda kurang mohon masukkan dengan nominal yang lebih besar");
				
	            System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
			
				}else{
				
				System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
				}
	
		
		}	
	}
	
	protected void cetak(){
		System.out.println("");
		System.out.println("=====Cetak Hasil Pembayaran=====");
		System.out.println("Nama pelanggan : "+  getNama());
		System.out.println("Total Harga    : "+ totalharga);
		System.out.println("Bayar          : "+ bayar);
		System.out.println("Kembaliaan     : "+ (bayar-totalharga));
		System.out.println("=====Cetak Hasil Pembayaran=====");	
	}
}

