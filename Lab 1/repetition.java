import java.io.*;

public class repetition {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input the height: ");
		int height;
		try {
			height = Integer.parseInt(input.readLine());
			input.close();
		} catch (IOException e) {
			System.out.println("Error! Something is wrong with your input.");
			return;
		} catch (NumberFormatException nfe) {
			System.out.println("Error! You did not enter a valid number.");
			return;
		}

		for (int i = 1; i <= height; i++) {
			for (int spaces = 1; spaces <= height - i; spaces++) {
				System.out.print(" ");
			}
			for (int stars = 1; stars <= (i * 2) - 1; stars++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}

}
