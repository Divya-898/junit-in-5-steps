package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.juint.MyMath;

public class MyMathTest {
	
	MyMath mymath=new MyMath();
	
	@Before
	public void After() {
	System.out.println("before");
	
	}
	
	@After
	public void before() {
	System.out.println("After");
	
	}
	
	@BeforeClass
	public static void beforeClass() {
	System.out.println("beforeclass");
	
	}
	
	@AfterClass
	public static void afterClass() {
	System.out.println("afterclass");
	
	}
	
 @Test
 public void sumwith1numbers() {
	 //absence of failure is success
	 System.out.println("test1");
	 int result= mymath.sum(new int[] {3});
	 //check that result is 6
	 assertEquals(3, result);
			// System.out.println(result);
 }
 
 @Test
 public void sumwith3numbers() {
	 //absence of failure is success
	 System.out.println("test2");
	 int result= mymath.sum(new int[] {1,2,3});
	 //check that result is 6
	 assertEquals(6, result);
			// System.out.println(result);
 }
}
