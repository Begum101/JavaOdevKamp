package weekThreeHomeworkOne;

public class Program {
	public static void main(String[] args) {
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		
		System.out.println(sayi1);
		
		//stack 
		//heap
		//integer değer tiptir ve stack'te tutulur
		
		int[] sayilar1 = new int[] {1, 2, 3};
		int[] sayilar2 = new int[] {10, 20, 30};
		sayilar1 = sayilar2;
		
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]);
		
		//array referans tiptir ve heap'te tutulur.
		
		CreditManager creditManager = new CreditManager(); //new dediğin anda hesapte bir referans oluşur. (instance creation)
		creditManager.Calculate();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("Ankara");
		
		CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager() );
		customerManager.GiveCredit();
		
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.setTaxNumber("10000");
		company.setCompanyName("Arçelik");
		company.setId(100);
		
		CustomerManager customerManager2 = new CustomerManager(new Person(), new TeacherCreditManager());
		customerManager2.GiveCredit();
		
		Person person = new Person();
		person.getNationalIdentity();
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		
	} 

}
