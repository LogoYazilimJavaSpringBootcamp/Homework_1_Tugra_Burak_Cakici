package order;

import classess.Customer;
import classess.Firm;

public class Receipt {// Receipt sınıfı hem CustomerOrder, hem de FirmOrder değerlerini alıp onları genel bir formata çevirecek bir obje olacak.
	// Sınıfa özel değerler hem müşteri hem de firma sınıfının değerlerinin birleşimi olup, sipariş sınıflarından da sipariş ayı bilgisini alacak.
	// Müşteriler için firmName değeri bağımsız anlamına gelen "Independent" olacak.
	private String name;
	private String sector;
	private String registerMonth;
	private String firmName;
	private String orderMonth;
	private double price;
	
	
    // Farklı iki sınıfımız için iki farklı constructor değerimiz olacak. Aynı constructor fonksiyonunu farklı değerlerle kullanarak da overloading örneğimiz olacak.
	public Receipt(CustomerOrder customerOrder) {
		Customer c=customerOrder.getC();
		name=c.getName();
		sector=c.getSector();
		registerMonth=c.getRegisterMonth();
		firmName="Independent";
		orderMonth=customerOrder.getOrderMonth();
		price=customerOrder.getOrderPrice();
	}
	
	public Receipt(FirmOrder firmOrder) {
		Firm f=firmOrder.getF();
		name=f.getName();
		sector=f.getSector();
		registerMonth=f.getRegisterMonth();
		firmName=f.getFirmName();
		orderMonth=firmOrder.getOrderMonth();
		price=firmOrder.getOrderPrice();
	}
	
	
    // get-set metodları
	public String getName() {
		return name;
	}

	public String getSector() {
		return sector;
	}

	public String getRegisterMonth() {
		return registerMonth;
	}

	public String getFirmName() {
		return firmName;
	}

	public String getOrderMonth() {
		return orderMonth;
	}

	public double getPrice() {
		return price;
	}
	
	
	// toString
	public String toString() {
		return "Name:"+name+", Sector:"+sector+", Price:"+price+", Order Month:"+orderMonth;
	}
	
	
	
	

}
