package order;

import classess.Customer;
import interfaces.CostDiscount;

public class CustomerOrder implements CostDiscount {// CustomerOrder müşterilerin siparişini tutmak amacıyla hazırlanan bir sınıf olacak.
	// Üye olarak müşteri objesi, fiyat ve sipariş ayı değerlerini alacak.
	private Customer c;
	private double orderPrice;
	private String orderMonth;

	public CustomerOrder(Customer c, double price, String orderMonth) {// Constructor
		
		this.c=c;
		this.orderMonth=orderMonth;
		orderPrice=this.discountCost(price);
	}

	public double discountCost(double price) {// Interface'den alınan bu method, tekil müşteriler için yüzde 20 indirim yapıp fiyat değerini değiştirecek.
		
		return price*0.80;
	}
	
	
	// get-set metodları
	public Customer getC() {
		return c;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public String getOrderMonth() {
		return orderMonth;
	}


}
