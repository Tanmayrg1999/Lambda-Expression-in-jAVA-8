package assignment7;
import java.util.Scanner;

//Interface CalculatorFace
interface CalculatorFace{
    public int calculate(int operand1,int operand2, String operator);
}   


public class Assignment7{

//performCalcultion Method

public static int performCalculation(int operand1, int operand2,String operator, CalculatorFace calculator){
        return calculator.calculate(operand1,operand2,operator);
    }
    
    
    public static void main(String[] args) {
        int o1,o2;
        String s;
        System.out.println("Enter Operand 1:");
        Scanner sc1=new Scanner(System.in);
        o1=sc1.nextInt();
        System.out.println("Enter Operand 2:");
        Scanner sc2=new Scanner(System.in);
        o2=sc2.nextInt();
        System.out.println("Enter Operator:");
        Scanner sc3=new Scanner(System.in);
        s=sc3.nextLine();
        Assignment7 a=new Assignment7();
        if(s.equals("-")){
        CalculatorFace c = (int num1, int num2,String s1) -> {
			return num1 - num2;
		};
		System.out.println("SUBSTACTION IS: " + a.performCalculation(o1,o2 , "-",c));
        }
        else if(s.equals("+")){
        CalculatorFace c = (int num1, int num2,String s1) -> {
			return num1 + num2;
		};
		System.out.println("ADDITION IS: " + a.performCalculation(o1, o2, "+",c));
        }
        else if(s.equals("*")){
        CalculatorFace c = (int num1, int num2,String s1) -> {
			return num1 * num2;
		};
		System.out.println("MULTIPLICATION: " + a.performCalculation(o1, o2, "*",c));
        }
         else if(s.equals("/")){
        CalculatorFace c = (int num1, int num2,String s1) -> {
			return num1 / num2;
		};
                if(o2!=0){
		System.out.println("DIVISON: " + a.performCalculation(o1, o2, "/",c));}
                else{
                    System.out.println("enter a valid operand");
                }
        }
        else{
            System.out.println("Enter a Valid Input Operand ");
        }
    }
}