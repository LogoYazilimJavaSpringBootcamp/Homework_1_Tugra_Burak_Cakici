import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import classess.Customer;
import classess.Firm;
import order.CustomerOrder;
import order.FirmOrder;
import order.Receipt;

public class MainMethod {

	public static void main(String[] args) {
		// Q1:
		
		/* Java'nın platform bağımsızlığı:
		 * Java'da yazılan kodların derlenmesi ardından bu kodlar Java Sanal Makinası(JVM) tarafından sisteme anlaşılabilecek
		 * bir şekil olan Byte Code haline geliyor. Byte Code platformdan bağımsız şekilde JVM tarafından anlaşılabir. 
		 * JVM'de bu kodu kullanılan hangi platform olduğuna bağlı bir şekilde kodu çalıştırmaya hazır hale getiriyor.
		 * Temelde aynı olan herhangi bir kod Java'da bağımsız şekilde okunabilmek için kullanılan platform adına JVM üzerinden
		 * şekil değiştiriyor.
		 * 
		 * 
		 * 
		 */
		
		
		
		
		// Q2:
		/*
		 * Çoklu kalıtım: Java'da neden yok? Hangi dillerde neden var?
		 * Java dilinin çoklu kalıtımı desteklememesinin sebebi kalıtımı olan farklı sınıflarda aynı isimli fonksiyonlar olabileceği yüzündendir.
		 * Eğer bir fonkisyon A sınıfının kalıtımını sağladığı B ve C sınıflarında aynı isimde bulunuyorsa Java veya çoklu kalıtımı
		 * desteklemeyen diller bu fonksiyonları birbirlerinden ayıramaz. Bu problem Diamond Problem olarak adlandırılmıştır.
		 * C++, Python ve bazı diğer dillerde çoklu kalıtım imkanı olsa da kullanımına dikkat edilmesi gerekir. Teoride her ne kadar
		 * çoklu kalıtım fazla sınıf kalıtımı ile daha olanaklı bir ortam sağlasa da, kullanımı açısından risklidir.
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		// Q3:Build tool nedir? Java ekosistemindeki tool'lar? Collection framework.
		/*
		 * Build tool, çalıştırılabilir uygulamaları yaratmak amacıyla kullanılan araçtır. Bu araçlar uygulama yapımını mümkün 
		 * olabildiğince kolaylaştırmak için kullanılır.Kullanılan tool'a özel kütüphaneler ve dependency'lerle ürünü derleyip,
		 * paketleyip, kullanıma hazır hale getirirler. Java'daki en popüler build tool'lar Maven, Apache Ant ve Gradle'dır.
		 */
		
		System.out.println("Collections örnekleri");// ArrayList Q4 boyunca kullanıldı. 5 tip kullanıldı.
		System.out.println();
		System.out.println("List");
		List <Integer> intList=new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(4);
		intList.add(3);
		intList.add(5);
		
		System.out.println(intList.get(3));// 3 döndürür.
		System.out.println(intList.indexOf(4));// 2 döndürür.
		System.out.println(intList.size());// 5 döndürür.
		intList.remove(4);// Sondaki 5 siler.
		System.out.println(intList.size());// 4 döndürür.
		intList.add(3, 4);// 4. sıraya 4 numarayı ekler.
		System.out.println(intList.size());// 5 döndürür.
		System.out.println(intList.toString());
		
		System.out.println();
		System.out.println("LinkedList");
		System.out.println();
		
		LinkedList<Integer> intLinkedList=new LinkedList<Integer>();
		intLinkedList.add(1);
		intLinkedList.add(2);
		intLinkedList.add(4);
		intLinkedList.add(3);
		intLinkedList.add(5);
		System.out.println(intLinkedList.get(4));// 5 çıktısı alır.
		System.out.println(intLinkedList.indexOf(4));// 2 çıktısı alır.
		intLinkedList.remove(3);
		intLinkedList.add(3, 11);// 4. sıraya 11 eklenir.
		System.out.println(intLinkedList.toString());
		
		System.out.println();
		System.out.println("HashSet");
		System.out.println();
		
		HashSet<Integer> intHashSet=new HashSet();
		intHashSet.add(1);
		intHashSet.add(2);
		intHashSet.add(3);
		intHashSet.add(4);
		intHashSet.add(5);
		intHashSet.stream().forEach(t->System.out.println(t));// Elementlerin çıktısı
		intHashSet.remove(4);// 4'ü silmek.
		intHashSet.removeIf(it->it==3);// 3 e eşit elemanı siler.
		System.out.println(intHashSet.size());// Boyut 3 olan bir çıktı alır.
		System.out.println(intHashSet.toString());
		
		System.out.println();
		System.out.println("HashMap");
		System.out.println();
		
		HashMap<Integer,String> mapExample=new HashMap<Integer,String>();
		mapExample.put(1,"bir");
		mapExample.put(2,"iki");
		mapExample.put(3,"üç");
		mapExample.put(4,"dört");
		mapExample.put(5,"beş");
		System.out.println(mapExample.containsKey(5)); // 5 numaralı bir key var mı bool testi yapar.
		System.out.println(mapExample.containsValue("beş"));// beş isimli bir value var mı bool testi yapar.
		System.out.println(mapExample.get(5));// beş çıktısı alınır.
		mapExample.remove(4);// Key'i 4 olan elemanı silinir.
		mapExample.replace(1, "BİR");// Key değeri 1 olan elemanın value'sini değiştirir.
		System.out.println(mapExample.toString());
		System.out.println();
		
		
		// Q4:
		
		/*Maven komutları
		 * 
		 * mvn clean: Projeyi önceki maven inşaalarından kalan içerikleri temizler. Target klasorü içeriği silinir. 
		 * 
		 * mvn compile: Proje temizliğini ve doğruluğunu sağlayım compile eder.
		 * 
		 * mvn install: pom dosyasında belirtilen artifact'leri projeye ekleyerek projeyi inşa eder.
		 * 
		 * mvn package: Maven projesini JAR, WAR gibi belirlenen bir dosya tipi halinde paketler.
		 * 
		 * mvn validate: Projedeki her şeyin doğru olup olmadığını kontrol eder.
		 * 
		 * Fonksiyonların çıktısı figures klasörüne koyuldu.
		 */
		
		
		// MÜŞTERİ UYGULAMASI BASİT İMPLEMENTASYON
		
		// Öncelikle müşteri objelerini hayata geçirelim.
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();// Bu liste tüm müşterileri tutacak.
		
		Customer customer1=new Customer("Adam Jack","February","Cars");
		customerList.add(customer1);
		Customer customer2=new Customer("Declan Bryan","June","Cars");
		customerList.add(customer2);
		Customer customer3=new Customer("Ashley Jones","June","Pharmacy");
		customerList.add(customer3);
		Customer customer4=new Customer("Mia Wilkins","August","Daycare");
		customerList.add(customer4);
		Customer customer5=new Customer("James Waine","April","Daycare");
		customerList.add(customer5);
		Customer customer6=new Customer("Charles Lee","October","Clothing");
		customerList.add(customer6);
		Customer customer7=new Customer("Aston Warden","May","Clothing");
		customerList.add(customer7);
		Customer customer8=new Customer("Warren Heaskel","June","Cars");
		customerList.add(customer8);
		Customer customer9=new Customer("Ladis Washrom","February","Pharmacy");
		customerList.add(customer9);
		Customer customer10=new Customer("Oswald Osbert","January","Daycare");
		customerList.add(customer10);
		
		// Müşterilerimizin bir büyük versiyonu olan Firma için de aynı durum uygulanacak.
		
		ArrayList<Firm> firmList = new ArrayList<Firm>();// Bu liste tüm firmaları tutacak.
		
		Firm firm1=new Firm("Old Firm","Brian Wolls","February","Cars");
		firmList.add(firm1);
		Firm firm2=new Firm("Wanton","Heskey Pest","June","Clothing");
		firmList.add(firm2);
		Firm firm3=new Firm("Heights","Leighton Sutter","September","Pharmacy");
		firmList.add(firm3);
		Firm firm4=new Firm("Top Dolla","Dominik Falls","August","Daycare");
		firmList.add(firm4);
		Firm firm5=new Firm("Gain","Ciaran Welsh","August","Cars");
		firmList.add(firm5);
		Firm firm6=new Firm("Fenton","Arthur Morgan","December","Clothing");
		firmList.add(firm6);
		Firm firm7=new Firm("O'Driscolls","Dutch Van Der Linde","May","Cars");
		firmList.add(firm7);
		Firm firm8=new Firm("World End","Genesis Reyes","July","Clothing");
		firmList.add(firm8);
		Firm firm9=new Firm("Likes","Jane LoWall","March","Pharmacy");
		firmList.add(firm9);
		Firm firm10=new Firm("Shankies","Butters Nash","June","Daycare");
		firmList.add(firm10);
		
		// Sırada müşteriler için siparişleri oluşturmak var.
		
		// Oluşturduğumuz sınıflara paralel olarak iki farklı sipariş listesi oluşturulacak; Müşteriler için ve Firmalar için.
		
		ArrayList<CustomerOrder> cOrderList = new ArrayList<CustomerOrder>();// Müşteri siparişlerimiz burada tutulacak.
		
		CustomerOrder customerOrder1=new CustomerOrder(customer1,5000,"February");
		cOrderList.add(customerOrder1);
		CustomerOrder customerOrder2=new CustomerOrder(customer2,1000,"May");
		cOrderList.add(customerOrder2);
		CustomerOrder customerOrder3=new CustomerOrder(customer3,300,"July");
		cOrderList.add(customerOrder3);
		CustomerOrder customerOrder4=new CustomerOrder(customer4,9000,"June");
		cOrderList.add(customerOrder4);
		CustomerOrder customerOrder5=new CustomerOrder(customer5,200,"February");
		cOrderList.add(customerOrder5);
		CustomerOrder customerOrder6=new CustomerOrder(customer6,3400,"June");
		cOrderList.add(customerOrder6);
		CustomerOrder customerOrder7=new CustomerOrder(customer7,150,"February");
		cOrderList.add(customerOrder7);
		CustomerOrder customerOrder8=new CustomerOrder(customer8,4000,"June");
		cOrderList.add(customerOrder8);
		CustomerOrder customerOrder9=new CustomerOrder(customer9,500,"February");
		cOrderList.add(customerOrder9);
		CustomerOrder customerOrder10=new CustomerOrder(customer10,5000,"October");
		cOrderList.add(customerOrder10);
		
		
		// Şimdi de firmalar için.
		
        ArrayList<FirmOrder> fOrderList = new ArrayList<FirmOrder>();// Firma siparişlerimiz burada tutulacak.
		
        FirmOrder firmOrder1=new FirmOrder(firm1,1200,"November");
		fOrderList.add(firmOrder1);
		FirmOrder firmOrder2=new FirmOrder(firm2,400,"May");
		fOrderList.add(firmOrder2);
		FirmOrder firmOrder3=new FirmOrder(firm3,5000,"December");
		fOrderList.add(firmOrder3);
		FirmOrder firmOrder4=new FirmOrder(firm4,900,"June");
		fOrderList.add(firmOrder4);
		FirmOrder firmOrder5=new FirmOrder(firm5,12300,"February");
		fOrderList.add(firmOrder5);
		FirmOrder firmOrder6=new FirmOrder(firm6,400,"June");
		fOrderList.add(firmOrder6);
		FirmOrder firmOrder7=new FirmOrder(firm7,210,"April");
		fOrderList.add(firmOrder7);
		FirmOrder firmOrder8=new FirmOrder(firm8,6000,"March");
		fOrderList.add(firmOrder8);
		FirmOrder firmOrder9=new FirmOrder(firm9,3900,"February");
		fOrderList.add(firmOrder9);
		FirmOrder firmOrder10=new FirmOrder(firm10,15000,"June");
		fOrderList.add(firmOrder10);
		
		
		// Faturaları içerecek olan bir arraylist oluşturulacak.
		
		ArrayList<Receipt> receipts=new ArrayList<Receipt>();// Fatura listemiz müşteri ve firma siparişlerini kendi objesi altında kaydedecek.
		
		
		
		for(int i=0;i<10;i++) {// Müşteri ve firma siparişleri fatura olarak kaydoluyor.
			Receipt receiptCustomerHolder=new Receipt(cOrderList.get(i));
			Receipt receiptFirmHolder=new Receipt(fOrderList.get(i));
			receipts.add(receiptCustomerHolder);
			receipts.add(receiptFirmHolder);
			
		}
		
		
		Scanner scan=new Scanner(System.in);
        boolean bool=true;
		
		
		while(bool) {// Müşteriye özel basit bir arayüz. verilen seçeneklere bağlı olarak farklı sonuçlar girilebilir.
			System.out.println("Welcome. What would you like to do?");
			System.out.println("1. Create a new firm or customer account");// 1 tuşu girilirse yeni bir müşteri veya firma kaydı.
			System.out.println("2. Create a new Order");// 2 tuşu girilirse yeni bir sipariş
			System.out.println("3. See your receipts");// 3 tuşu girilirse müşteri veya firmanın faturaları
			System.out.println("4. Exit");// 4 tuşu girilirse sistemden çıkış
			String input=scan.nextLine();
			System.out.println();
			switch(input) {
			case "1":
				System.out.println("State whether you register as a Customer or a Firm");// Bu girişte firma veya müşteri kontrolü yapılacak.
				String firmOrCustomerForRegister=scan.nextLine();
				System.out.println();
				// Seçilen duruma göre yeni bir firma veya müşteri oluşacak. Oluşturulan üye de kendi tiplerinin listesine dahil olacak.
				// Degerler if case'ler içinde scanner tarafından alınacak.
				
				if(firmOrCustomerForRegister.equals("Firm")) {
					System.out.println("Firm Name:");
					String firmNameInput=scan.nextLine();
					System.out.println("Name:");
					String nameInput=scan.nextLine();
					System.out.println("Sector:");
					String sectorInput=scan.nextLine();
					System.out.println("Register Month:");
					String monthInput=scan.nextLine();
					Firm newFirm=new Firm(firmNameInput,nameInput,monthInput,sectorInput);
					firmList.add(newFirm);
					System.out.println("Firm registered");
					System.out.println();
					continue;
					
					
					
				}
				else if(firmOrCustomerForRegister.equals("Customer")) {
					System.out.println("Name:");
					String nameInput=scan.nextLine();
					System.out.println("Sector:");
					String sectorInput=scan.nextLine();
					System.out.println("Register Month:");
					String monthInput=scan.nextLine();
					Customer newCustomer=new Customer(nameInput,monthInput,sectorInput);
					customerList.add(newCustomer);
					System.out.println("Customer registered");
					System.out.println();
					continue;
					
					
				}
				// Girilen değer Customer veya Firm değilse ana sayfaya geri yönlendirilecek.
				else {
					System.out.println("Input value has no equivalent. Directing back to main page");
					System.out.println();
					continue;
					
					
				}
			case "2":
				System.out.println("State whether you want to continue as a Customer or a Firm");// Bu girişte firma veya müşteri kontrolü yapılacak.
				String firmOrCustomerForOrder=scan.nextLine();
				// Seçilen üyeye göre scanner kullanılarak yeni siparişler oluşturulacak. Yine if case yardımıyla.
				if(firmOrCustomerForOrder.equals("Firm")) {
					System.out.println("Firm Name:");
					String firmNameInput=scan.nextLine();
					// Stream kullanılarak firma objeleri listesinde girilen değer varlığı kontrol edilecek. Varsa o obje sipariş sınıfında kullanılacak.
					if(firmNameInput.equals(firmList.stream().filter(it -> it.getFirmName().equals(firmNameInput)).findFirst().orElse(null).getFirmName())) {
					    Firm holderFirm=firmList.stream().filter(it -> it.getFirmName().equals(firmNameInput)).findFirst().orElse(null);
					    System.out.println("Price:");
						String priceInput=scan.nextLine();
						System.out.println("Order Month:");
						String orderInput=scan.nextLine();
					    FirmOrder newOrder=new FirmOrder(holderFirm,Double.parseDouble(priceInput),orderInput);
					    System.out.println("Order Ready");
					    receipts.add(new Receipt(newOrder));
						System.out.println();
						continue;
					}
					
					
				}
				else if(firmOrCustomerForOrder.equals("Customer")) {
					System.out.println("Customer Name:");
					String customerNameInput=scan.nextLine();
					// Stream kullanılarak müşteri objeleri listesinde girilen değer varlığı kontrol edilecek. Varsa o obje sipariş sınıfında kullanılacak.
					if(customerNameInput.equals(customerList.stream().filter(it -> it.getName().equals(customerNameInput)).findFirst().orElse(null).getName())) {
					    Customer holderCustomer=customerList.stream().filter(it -> it.getName().equals(customerNameInput)).findFirst().orElse(null);
					    System.out.println("Price:");
						String priceInput=scan.nextLine();
						System.out.println("Order Month:");
						String orderInput=scan.nextLine();
					    CustomerOrder newOrder=new CustomerOrder(holderCustomer,Double.parseDouble(priceInput),orderInput);
					    System.out.println("Order Ready");
					    receipts.add(new Receipt(newOrder));
						System.out.println();
						continue;
					}
					
					
				}
				// Girilen değer Customer veya Firm değilse ana sayfaya geri yönlendirilecek.
				else {
					System.out.println("Input value has no equivalent. Directing back to main page");
					System.out.println();
					continue;
					
					
				}
				
			case "3":
				System.out.println("State whether you want to continue as a Customer or a Firm");// Bu girişte firma veya müşteri kontrolü yapılacak.
				String firmOrCustomerForListing=scan.nextLine();
				System.out.println();
				// Müşteri veya firma belirtildikten sonra bu üyenin ismi ile tüm faturalarını stream fonksiyonu ile çağrılacak.
				if(firmOrCustomerForListing.equals("Firm")) {
					System.out.println("State your Firm:");
					String firmForListingName=scan.nextLine();
					receipts.stream().forEach(ob -> {
						if(ob.getFirmName().equals(firmForListingName)) {
							System.out.println(ob.toString());
					}});// Filter kullanılmadan stream
					System.out.println();
					continue;
					
				}
				else if(firmOrCustomerForListing.equals("Customer")) {
					System.out.println("State your Name:");
					String customerForListingName=scan.nextLine();
					// Filter kullanılan stream
					receipts.stream().filter(it->it.getName().equals(customerForListingName)).forEach(ob -> System.out.println(ob.toString()));
					System.out.println();
					continue;
					
				}
				// Girilen değer Customer veya Firm değilse ana sayfaya geri yönlendirilecek.
				else {
					System.out.println("Input value has no equivalent. Directing back to main page");
					System.out.println();
					continue;
					
					
				}
				// Çıkış
			case "4":
				bool=false;
				break;
				
			}
		}
		
		
		
		
		System.out.println("People with c on their name");
		System.out.println();
		
		customerList.stream().forEach(it->{// İsimlerinde c olan isimler için liste.
			if(it.getName().contains("c")) {
				System.out.println(it.getName());
				
			}
		});
		
		System.out.println();
		System.out.println("The sum of the cost which a firm or a customer that registered in June");
		System.out.println();
		
		
		// Haziran ayında giriş yapan tüm müşteri ve firmaların toplam fatura tutarı.
		System.out.println(receipts.stream().filter(it->it.getRegisterMonth()=="June").mapToDouble(x->x.getPrice()).reduce(0, Double::sum));
		
		System.out.println();
		System.out.println("All receipts that are priced over 1500TL");
		System.out.println();
		
		
		receipts.stream().forEach(it->{// 1500 üzerindeki tüm faturalar.
			if(it.getPrice()>1500) {
				System.out.println(it.toString());
				
			}
		});
		
		System.out.println();
		System.out.println("The average of the cost of receipts which is bigger than 1500TL");
		System.out.println();
		
		// 1500TL üzerinde olan faturaların ortalaması.
		System.out.println(receipts.stream().filter(it->it.getPrice()>1500).mapToDouble(x->x.getPrice()).average().getAsDouble());
		
		System.out.println();
		System.out.println("The list of the customers whose receipts cost is less than 500TL");
		System.out.println();
		
		// 500TL den daha az harcaması olan isimler.
		receipts.stream().forEach(it->{
			if(it.getPrice()<500) {
				System.out.println(it.getName());
				
			}
		});
		
		System.out.println();
		System.out.println("The names of the sectors of the firms whose June cost average is less than 750TL");
		System.out.println();
		
		// Haziran ortalaması 750TL'den daha az olan firmaların sektör isimleri
		receipts.stream().forEach(it->{
			
			try {
				double firmAverage=receipts.stream().filter(hold->hold.getFirmName()==it.getFirmName()).filter(hold->hold.getOrderMonth()=="June").mapToDouble(x->x.getPrice()).average().getAsDouble();
				if(firmAverage<750.0) {
					System.out.println(it.getSector());
				}
				
			}
			
			catch(NoSuchElementException e) {// Exception ortalama değer koşulunu sağlamama durumunda fonksiyonun çalışmasını devam ettirmek için yazıldı.
				System.out.println(it.getFirmName()+" has an average over 750TL");
			}
		});
		
		
		
		
		
	}

	
}
