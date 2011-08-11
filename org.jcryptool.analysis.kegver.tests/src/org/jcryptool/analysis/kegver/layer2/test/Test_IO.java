package org.jcryptool.analysis.kegver.layer2.test;


import org.jcryptool.analysis.kegver.layer2.IO;
import org.junit.Test;


public class Test_IO {
		
	private String getStrFile(Throwable inT){
		return inT.getStackTrace()[0].getMethodName();
	}

//	@Test
	public void test1(){
		IO aIO = IO.useFactory(this.getStrFile(new Throwable()));
		aIO.delete();
	}
	
//	@Test
	public void test2(){
		IO aIO = IO.useFactory(this.getStrFile(new Throwable()));
		String strText = "Hello world!";
		aIO.write(strText);
		strText = "Hello back!";
		aIO.write(strText);
		aIO.delete();
	}
	
//	@Test
	public void test3(){
		IO aIO = IO.useFactory(this.getStrFile(new Throwable()));
		String strText = "Hello world!";
		aIO.buffer_needsClose(strText);
		strText = "Hello back!";
		aIO.close();
		aIO.delete();
	}
	
//	@Test
	public void test4(){
		IO aIO = IO.useFactory(this.getStrFile(new Throwable()));
		String strText = "Hello worlddede!";
		aIO.write(strText);
	}
	
	@Test
	public void test5(){
		IO aIO = IO.useFactory();
		System.out.println(aIO);
	}
}