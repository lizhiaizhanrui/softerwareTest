package code;

import java.text.DecimalFormat;


public class triangle {
	private double side1;
	private double side2;
	private double side3;
	
	public triangle(double side1,double side2,double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public String whatType(){
		String type = null;
		if((side1 + side2 > side3) && 
				   (side1 + side3 > side2) &&
				   (side2 + side3 > side1)){
			        //判断是否为等腰直角三角形
					if(((side1 == side2) && (Math.pow(Math.pow(side1,2.0) + Math.pow(side2,2.0),0.5) == side3))||
						((side2 == side3) && (Math.pow(Math.pow(side2,2.0) + Math.pow(side3,2.0),0.5) == side1)) ||
						((side1 == side3) && (Math.pow(Math.pow(side1,2.0) + Math.pow(side3,2.0),0.5) == side2))
						){
						type = "right and isosceles triangle";
					}
					//判断是否为直角三角形
					else if(Math.pow(Math.pow(side1,2.0) + Math.pow(side2,2.0),0.5) == side3 ||
					   Math.pow(Math.pow(side2,2.0) + Math.pow(side3,2.0),0.5) == side1 ||	
					   Math.pow(Math.pow(side1,2.0) + Math.pow(side3,2.0),0.5) == side2){
						type = "right triangle";
					}
					//判断是否为等腰三角形
					else if(((side1 == side2) && (side1 != side3)) || ((side1 == side3) && (side1 != side2)) ||
							((side2 == side3) && (side1 != side2))){
						type = "isosceles triangle";
					}
					//判断是否为等边三角形
					else if((side1 == side2) && (side2 == side3)){
						type = "equilateral triangle";
					}
					
					else{
						type = "common triangle";
					}
				}
				else{
					type = "not a triangle";
				}
		return type;
	}

}
