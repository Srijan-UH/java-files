import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		// Your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Dividing this number by 0");
        try {
            System.out.println(n/0);
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Program completed");
	}
}