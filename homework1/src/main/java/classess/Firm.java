package classess;

public class Firm extends Customer {// Firma sınıfı müşteri sınıfından kalıtım yaparak müşteri değer ve fonksiyonlarını kullanabilir. Ekstra olarak sadece firmName girilecek.
	private String firmName;
	
	
	public Firm(String firmName,String name, String month,String sector) {// Constructor
		super(name, month,sector);
		this.firmName=firmName;
		
	}
	
	// get-set metodları

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	// Customer toString metodu her ne kadar firm için de kullanılabiliyor olsa da polimorfizm örneği adına böyle bir değişiklik yapıldı.
	public String toString() {
		return "Firm Name:"+firmName+super.toString();
	}
	
	

}
