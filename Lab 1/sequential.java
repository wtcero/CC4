import java.io.*;

public class sequential {

	public static void main(String[] args) {
		double height, base;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Input base of triangle: ");
		try {
			base = Double.parseDouble(reader.readLine());
		} catch (IOException e) {
			System.out.println("Error! Something is wrong with your input.");
			return;
		} catch (NumberFormatException nfe) {
			System.out.println("Error! You did not enter a valid number.");
			return;
		}

		System.out.print("Input height of triangle: ");
		try {
			height = Double.parseDouble(reader.readLine());
			reader.close();
		} catch (IOException e) {
			System.out.println("Error! Something is wrong with your input.");
			return;
		} catch (NumberFormatException nfe) {
			System.out.println("Error! You did not enter a valid number.");
			return;
		}

		double area = 1.0 / 2 * base * height;

		System.out.println("The area of the triangle is: " + area);
	}
}