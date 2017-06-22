import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Operations{
	Calculator calculator;
	BufferedReader reader;
	float a;
	float b;

	public void typing(){
		reader = new BufferedReader(new InputStreamReader(System.in));
		try{
		System.out.println("Type first number");
		a = Float.parseFloat(reader.readLine());
		System.out.println("Type second number");
		b = Float.parseFloat(reader.readLine());
		}
		catch(IOException e){
		}
	}
	
	public void addOperation(){
		calculator = new Calculator();
		typing();
		calculator.add(a, b);
		System.out.println("Result : " + calculator.getResult());
		calculator.cleanResult();
		
		}
	public void substractOperation(){
		calculator = new Calculator();
			typing();
			calculator.substract(a, b);
			System.out.println("Result : " + calculator.getResult());
			calculator.cleanResult();
			}
			
	public void divideOperation(){
		calculator = new Calculator();
			typing();
			calculator.divide(a, b);
			System.out.println("Result : " + calculator.getResult());
			calculator.cleanResult();
		}
	public void multiplyOperation(){
		calculator = new Calculator();
			typing();
			calculator.multiply(a, b);
			System.out.println("Result : " + calculator.getResult());
			calculator.cleanResult();
	
	}
	
}