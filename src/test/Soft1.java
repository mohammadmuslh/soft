package test;

import soft.*;

 import static org.junit.Assert.*;
class Soft1 {
	
	void test() {
		Soft o = new Soft();
	int r =	o.add(100,200);
	assertEquals(300,r);
	}

}
