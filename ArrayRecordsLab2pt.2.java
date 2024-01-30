import java.util.Scanner;

public class ArrayRecords {
    static Scanner sc = new Scanner(System.in);

    public static void main(String arg[]) {
        System.out.println("------The INPUT------");
        int a, alpha, fnum;
        int record[];
        // fields and field size
        System.out.print("Enter how many Fields? ");
        fnum = sc.nextInt();
        int esize[] = new int[fnum];
        int esizetype[] = new int[fnum];
        //counters
        for (int count = 0; count < fnum; count++) {
            System.out.println(
                    "1. char \t2. int\n3. float\t4. double\nWhat type will the number " + (count + 1) + " field be?");
            int ftype = sc.nextInt();
            esizetype[count] = ftype;
            switch (ftype) {
                case 1:
                    esize[count] = 1;
                    break;
                case 2:
                    esize[count] = 4; // Assuming int takes 4 bytes
                    break;
                case 3:
                    esize[count] = 4; // Assuming float takes 4 bytes
                    break;
                case 4:
                    esize[count] = 8; // Assuming double takes 8 bytes
                    break;
                default:
                    System.out.println("Try again");
                    count--;
            }
        }
        // input Dimension
        System.out.print("Enter the desired dimension: ");
        a = sc.nextInt();
        // input Dimension Sizes
        record = new int[a];
        for (int count = 0; count < a; count++) {
            System.out.print("Enter the number " + (count + 1) + " dimension size: ");
            record[count] = sc.nextInt();
        }
        // Display Dimension and Sizes
        System.out.print("\nThe Given record is: A");
        for (int i = 0; i < record.length; i++) {
            System.out.print("[" + record[i] + "]");
        }
        System.out.println("\n");
        // input Address
        System.out.print("Enter Alpha Value to be used in the Address Calculation: ");
        alpha = sc.nextInt();
        System.out.println("Enter address to find");
        int recordToFind[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter A" + (i + 1) + ": ");
            recordToFind[i] = sc.nextInt();
        }
        // Display the Address
        System.out.print("\nThe Address to find is: A");
        for (int i = 0; i < recordToFind.length; i++) {
            System.out.print("[" + recordToFind[i] + "]");
        }
        System.out.println("\n");
        // Computation Address Calculation
        long summation = 0;
        for (int i = 0; i < recordToFind.length; i++) {
            int product = recordToFind[i];
            for (int j = (i + 1); j < record.length; j++) {
                product = product * record[j];
            }
            summation = summation + product;
        }
        // compute e-size
        long sizetotal = 0;
        for (int count = 0; count < esize.length; count++) {
            sizetotal += esize[count];
        }
        long amma = alpha + (summation * sizetotal);
        // compute extra e-size
        System.out.println("What will you search?");
        for (int count = 0; count < esize.length; count++) {
            switch (esizetype[count]) {
                case 1:
                    System.out.println((count + 1) + ". char[" + esize[count] + "]");
                    break;
                case 2:
                    System.out.println((count + 1) + ". int");
                    break;
                case 3:
                    System.out.println((count + 1) + ". float");
                    break;
                case 4:
                    System.out.println((count + 1) + ". double");
                    break;
                default:
            }
        }
        int extra = sc.nextInt();
        for (int count = 1; count < extra; count++) {
            amma = amma + esize[(count - 1)];
        }
        System.out.println("------The OUTPUT------");
        // Output Address Calculation
        System.out.println("The address calculation solution is: " + amma);
        // Output Total Number
        System.out.println("The total number of elements: " + getTotalNumberOfElement(record));
    }

    static int getTotalNumberOfElement(int[] arr) {
        int sum = 1;
        for (int c = 0; c < arr.length; c++) {
            sum = sum * arr[c];
        }
        return sum;
    }
}
