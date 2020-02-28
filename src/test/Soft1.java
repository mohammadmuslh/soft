package test;

import soft.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
 
class Soft1 {
	@Test
	void test() {
		Soft o = new Soft();
	int r =	o.add(100,200);
	assertEquals(300,r);
	}

}
