package org.jcryptool.analysis.kegver.test;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.jcryptool.analysis.kegver.layer3.U;
import org.junit.Test;

public class POK_Proof1Test {
	
	final static private BigInteger g = BigInteger.valueOf(2);
	final static private BigInteger h = BigInteger.valueOf(3);
	final static double a = U.log(g, h);
	
	@Test
	public void test(){
		
	}

	@Test
	public void testPOK_Proof1() {
		POK_Proof1 aPOK = new POK_Proof1(g, a, h);
		System.out.println(aPOK.evaluate());
		
	}

	@Test
	public void testPok_g_pow_a_equal_h() {
		fail("Not yet implemented");
	}

	@Test
	public void testPok_h_pow_b_equal_g() {
		fail("Not yet implemented");
	}

}
