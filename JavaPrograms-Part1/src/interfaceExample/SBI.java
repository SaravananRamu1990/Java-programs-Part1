package interfaceExample;

import org.testng.annotations.Test;

@Test
public class SBI implements Bank {

	
	public void saving() {System.out.println("saving regular");
		
	}

	public void current() {System.out.println("current");
		
	}

	public void salary() {
	System.out.println("salary");
	}

	public void joint() {
		System.out.println("joint");
	}

	public void branchDetails() {
		System.out.println("Thanajavur main");
	}
	public static void main(String[] args) {
	SBI info= new SBI();
	info.branchDetails();
	info.current();
	info.joint();
	info.salary();
	info.saving();
	}

}
