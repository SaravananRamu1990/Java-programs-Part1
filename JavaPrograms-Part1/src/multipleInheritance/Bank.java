package multipleInheritance;

public class Bank implements AxisBank,HdfcBank {
	public void test() {
		System.out.println(" test");
	}

	public void saving() {System.out.println(" savings");
		
	}

	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.test();
		bank.saving();
	}

	
}
