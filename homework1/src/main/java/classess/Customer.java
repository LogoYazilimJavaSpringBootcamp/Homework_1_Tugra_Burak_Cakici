package classess;


public class Customer {// Müşteri sınıfı isim, giriş ayı ve sektör gibi bilgiler içerecek.
	// Encapsulation doğrultusunda sadece sınıf metodları private değerlere erişebilir.
	
	private String name;
	private String registerMonth;
	private String sector;
	private static String[] Months={"January","February","March","April","May","June","July","August","September","October","November","December"};

	
	public Customer(String name, String month,String sector) {// Constructor
		super();
		if(checkMonth(month)!=true) {// checkMonth metodu girilen ay değerinin doğru bir değer olup olmadığına bakacak. 
			throw new IllegalArgumentException("Please enter a correct month");
		}
		else {
			this.name=name;
			registerMonth=month;
			this.sector=sector;
		}
		
		
		
		
	}
	
	// get-set metodları.
	
	public String getRegisterMonth() {
		return registerMonth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static boolean checkMonth(String month) {
		for(int i=0;i<12;i++) {
			if(Months[i].equals(month)) {
				return true;
			}
		}
		return false;
	}


	public String getSector() {
		return sector;
	}
	// toString metodu basit bir özet çıkartır.
	public String toString() {
		return "Name:"+name+", Register Month:"+registerMonth+", Sector:"+sector;
	}
	
	
	

	

}
