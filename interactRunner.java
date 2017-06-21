import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class interactRunner{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			Operations operation = new Operations();
			String exit = "no";
			while(!exit.equals("yes")){
				try{
				System.out.println("Choose operation by number");
				System.out.println("1. Adding");
				System.out.println("2. Substract");
				System.out.println("3. Divide");
				System.out.println("4. Multiply");
				int answer = Integer.parseInt(reader.readLine());
				switch(answer){
					case 1: operation.addOperation();
						break;
					case 2: operation.substractOperation();
						break;
					case 3: operation.divideOperation();
						break;
					case 4: operation.multiplyOperation();
						break;
				}
				System.out.println("exit? yes/no");
				exit = reader.readLine();
				}
				catch(IOException e){
					System.out.println("catch");
					
				}
				}
			}
		finally{
				reader.close();
			}
		}
	}
