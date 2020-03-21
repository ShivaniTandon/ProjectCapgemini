package healthcareproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CenterNameTest {
	//Test Cases
	HealthSystem hs=new HealthSystem(); //object creation of class which includes the methods of testing
	
	@Test
	void centerNameTest() { //checking the name and the initial letter of the name (capital letter)
		assertEquals(true,hs.validCenterName("Kmc"));
	}
	@Test
	void centerNameSize() {//checking the size of the center name, checks if the size is not zero
		assertEquals(true,hs.validSize("kmc"));
	}

}