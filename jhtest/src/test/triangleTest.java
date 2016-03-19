package test;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Arrays;  
import java.util.Collection;    

import org.junit.Assert;  
import org.junit.Before;
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.junit.runners.Parameterized;  
import org.junit.runners.Parameterized.Parameters;  

import code.triangle;

@RunWith(Parameterized.class)
public class triangleTest{
	private double side1;
	private double side2;
	private double side3;
	private String expected;
	
	public triangleTest(double side1,double side2,double side3,String expected){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.expected = expected;
	}
	
	
	@Parameters
	public static Collection<Object[]> data(){
		
		return Arrays.asList(new Object[][]{
				{3,3,3,"equilateral triangle"},
				{3,4,5,"right triangle"},
				{3,3,5,"isosceles triangle"},
				{5,8,1,"not a triangle"},
				{5,6,7,"common triangle"},
				{1,1,Math.pow(2.0, 0.5),"right and isosceles triangle"},
				{4,6,Math.pow(52.0, 0.5),"right triangle"},
				{Math.pow(2.0, 0.5),Math.pow(2.0, 0.5),2,"right and isosceles triangle"}
		});
	}
	
	@Test
	public void testTriangle(){
		triangle tri = new triangle(side1,side2,side3);
		String type = tri.whatType();
		assertEquals(expected,type);
		
	}
}