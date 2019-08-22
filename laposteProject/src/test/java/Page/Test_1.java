package Page;

import static org.junit.Assert.*;

import javax.swing.JSpinner;

import org.junit.Test;

public class Test_1 {
	
	private Timbre timbre=new Timbre();
	

	@Test
	public void test0() {
		timbre.setSpinner1(2);
		timbre.setSpinner2(0);
		//String total = timbre.getTotalStr(); A revoir...
		//assertEquals("18", total);
	}
	
	@Test
	public void test1() {
		timbre.setSpinner1(0);
		timbre.setSpinner2(5);
		//String total=timbre.getTotalStr(); A revoir...
		//assertEquals("5", total);
		
	}
	
	@Test
	public void test2() {
		timbre.setSpinner1(3);
		timbre.setSpinner2(3);
		//String total=timbre.getTotalStr(); A revoir...
		//assertEquals("30", total);
	}


}
