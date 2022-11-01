package weekThreeHomeworkOne;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void Save() {
		
		System.out.println("M��teri kaydedildi: " + customer.getId() );
	}
	
	public void Delete() {
		
		System.out.println("M��teri silindi: " + customer.getId() );
	}
	
	public void GiveCredit() {
		creditManager.Calculate();
		System.out.println("Kredi verildi.");
	}

}
