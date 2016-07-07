package demoProj;

import java.util.Scanner;

public class Calculator implements CalcSpec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcSpec calObj=new Calculator();
		int val1,val2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Value 1:");
		val1=input.nextInt();
		System.out.println("Enter Value 2:");
		val2=input.nextInt();
		System.out.println("Choose an Operation\n1.Add\n2.Sub\n3.Mul\n4.Div\nEnter your option:");
		int option=input.nextInt();
		switch(option)
		{
			case 1:System.out.println("Addition Result:"+calObj.add(val1,val2));
				   break;
			case 2:System.out.println("Subtraction Result:"+calObj.sub(val1,val2));
				   break;
			case 3:System.out.println("Multiplication Result:"+calObj.mul(val1,val2));
			       break;
			case 4:
				  try{
					System.out.println("Division Result:"+calObj.div(val1,val2));
			      }catch(ArithmeticException e)
			       {
			    	  System.out.println("Divide by Zero not possible");
			       }
				  break;
		   default:System.out.println("Choose a valid option!");
		}
		input.close();
	}

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public Integer sub(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public long mul(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public Integer div(Integer a, Integer b) throws ArithmeticException {
		// TODO Auto-generated method stub
		return a/b;
	}

}
