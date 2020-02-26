package project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CenterNameTest {
	Health_System hs=new Health_System();
	@Test
	void centerTest() {
		assertEquals(true, hs.validCenterName("Kmc"));
	}
	@Test
	void centerSize() {
		assertEquals(true,hs.validSize("Kmc"));
	}

}