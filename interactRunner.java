import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class interactRunner{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			Calculator add = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				try{
				System.out.println("Type first number");
				int a = Integer.parseInt(reader.readLine());
				System.out.println("Type second number");
				int b = Integer.parseInt(reader.readLine());
				add.add(a, b);
				System.out.println("Result : " + add.getResult());
				add.cleanResult();
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
