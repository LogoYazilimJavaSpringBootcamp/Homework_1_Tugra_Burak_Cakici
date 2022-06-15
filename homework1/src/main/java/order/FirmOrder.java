package order;

import classess.Firm;
import interfaces.CostDiscount;

public class FirmOrder implements CostDiscount {// FirmOrder firmaların siparişini tutmak amacıyla hazırlanan bir sınıf olacak.
	// Üye olarak firma objesi, fiyat ve sipariş ayı değerlerini alacak.
	private Firm f;
	private double orderPrice;
	private String orderMonth;

	public FirmOrder(Firm f,double price,String orderMonth) {// Constructor
		
		this.f=f;
		orderPrice=this.discountCost(price);
		this.orderMonth=orderMonth;
		
	}
	
	
    // get-set metodları
	public Firm getF() {
		return f;
	}
	
	



	public double getOrderPrice() {
		return orderPrice;
	}



	public String getOrderMonth() {
		return orderMonth;
	}



	public double discountCost(double price) {// Interface'den alınan bu method, firma müşterileri için yüzde 25 indirim yapıp fiyat değerini değiştirecek.
		
		return price*0.75;
	}
	
	

}
