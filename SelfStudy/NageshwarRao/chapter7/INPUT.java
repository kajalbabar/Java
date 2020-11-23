import java.io.*;
import java.util.*;
public class INPUT {
	public static void main(String args[]) throws IOException {
		InputStreamReader IR = new InputStreamReader(System.in); 
		BufferedReader input = new BufferedReader(IR);
		Scanner sc = new Scanner(System.in);

		String k = sc.next();
		System.out.println("String " + k);
		System.out.println("Entered string " + input.readLine());
	}
}
