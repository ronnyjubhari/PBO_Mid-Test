class Pelanggan{
	
	protected String nama;
	protected byte tipe;

	public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
		this.nama = nama;
	}
	
    public int getTipe(){
        return this.tipe;
    }
    
    public void setTipe(byte tipe){
		this.tipe = tipe;
	}
}