package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {
 @Test
 public void test() {
	 boolean condition=true;
	 assertEquals(true, condition);
	 assertTrue(condition);
	 assertFalse(condition);
	 
 }
}
