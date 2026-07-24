package part01;
import     java.util.Scanner;
public class part01 {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		
		String text = "Write a message:";
		
		int terminalWidth = 80;
		int spacesNeeded = (terminalWidth - text.length()) / 2;
		
		String padding = " ".repeat(Math.max(0, spacesNeeded));
		
		
		System.out.println(padding + text);
		
		
		
		
		String message = scanner.nextLine();
		System.out.println(message);
		
	
		String text1 = ("");
		int terminalLength = 80;
		int spacesReq = (terminalLength - text1.length())/2;
		
		String pads = " ".repeat(Math.max(0,spacesReq));
		
		System.out.println(pads + text1);
		
		
		
		scanner.close();
		 
		
		
		
		
		

		
	}
}
