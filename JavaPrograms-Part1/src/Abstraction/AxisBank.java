package Abstraction;

public class AxisBank extends Bank {

	public void saving() {
		System.out.println(" saving Regular");
	}

	public void current() {
		System.out.println(" current");
	}

	void salary() {
		System.out.println(" Salary");
	}

	void joint() {
		System.out.println("joint");
	}

	public static void main(String[] args) {
		AxisBank info = new AxisBank();
		info.branchDetails();
		info.current();
		info.salary();
		info.saving();
	}

}
