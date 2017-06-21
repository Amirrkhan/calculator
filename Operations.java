import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Operations{
	Calculator calculator;
	BufferedReader reader;
	public void addOperation(){
		calculator = new Calculator();
		reader = new BufferedReader(new InputStreamReader(System.in));
		try{
		System.out.println("Type first number");
		float a = Float.parseFloat(reader.readLine());
		System.out.println("Type second number");
		float b = Float.parseFloat(reader.readLine());
		calculator.add(a, b);
		System.out.println("Result : " + calculator.getResult());
		calculator.cleanResult();
		}
		catch(IOException e){
		
		}
		}
	public void substractOperation(){
		calculator = new Calculator();
		reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Type first number");
			float a = Float.parseFloat(reader.readLine());
			System.out.println("Type second number");
			float b = Float.parseFloat(reader.readLine());
			calculator.substract(a, b);
			System.out.println("Result : " + calculator.getResult());
			calculator.cleanResult();
			}
		catch(IOException e){
			
			}
	}
	public void divideOperation(){
		calculator = new Calculator();
		reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Type first number");
			float a = Float.parseFloat(reader.readLine());
			System.out.println("Type second number");
			float b = Float.parseFloat(reader.readLine());
			calculator.divide(a, b);
			System.out.println("Result : " + calculator.getResult());
			calculator.cleanResult();
		}
		catch(IOException e){
			
		}
	}
	public void multiplyOperation(){
		calculator = new Calculator();
		reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Type first number");
			float a = Float.parseFloat(reader.readLine());
			System.out.println("Type second number");
			float b = Float.parseFloat(reader.readLine());
			calculator.multiply(a, b);
			System.out.println("Result : " + calculator.getResult());
			calculator.cleanResult();
		}
		catch(IOException e){
			
		}
	}
	
}