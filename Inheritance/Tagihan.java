import java.util.Scanner;

class TagihanPLN extends Pelanggan{
	
	private double jPakai; 
	private int bBeban;
	private double tHarga;
	private int bayar;
	private double kembalian;
	
    void proses(){
    	
    	boolean loop = true;
		tHarga = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(loop)
    	{
    		System.out.print("Masukkan Tipe Rumah: ");
			byte tipe = input.nextByte();
    		switch(tipe)
	    	{
	    		case 31 :
	    			bBeban = 100000;
	    			loop = false;
	    			break;
	    		case 32 :
	    			bBeban = 125000;
	    			loop = false;
	    			break;
	    		case 33 :
	    			bBeban = 450000;
	    			loop = false;
	    			break;
	    		case 34 :
	    			bBeban = 480000;
	    			loop = false;
	    			break;
	    		case 35 :
	    			bBeban = 500000;
	    			loop = false;
	    			break;
	    		case 40 :
	    			bBeban = 550000;
	    			loop = false;
	    			break;
	    		default :
	    			System.out.println("Tidak ada dalam pilihan. Silahkan Pilih Ulang");
	    			System.out.println("");
	    			break;
	    	}
    	}	
    	
		System.out.print("Jumlah Meteran Pemakaian : ");
		jPakai = input.nextDouble();
		
		tHarga = jPakai * bBeban;

	}
	
    public double getHarga(){
        return tHarga;
    }
    
    public void setBayar(int bayar){
		this.bayar = bayar;
	}
    
    public int getBayar(){
        return bayar;
    }    
    
    public void setKembalian(int bayar){
		kembalian = bayar - tHarga;
	}
	
	public double getKembalian(){
		return kembalian;
	}
    
    public void showStruk(){
 
        System.out.println("\n\n     Struk Pembayaran PLN      ");
        System.out.println("===============================");
        System.out.println("Nama Pelanggan        : " +getNama());
        System.out.println("=================================");
        System.out.println("Total Harga           : Rp." +(int)getHarga());
        System.out.println("Uang Pembayaran       : Rp." +getBayar());
        System.out.println("Kembalian             : Rp." +getKembalian());
    }
}