import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int rev = 0;
      int ld = n % 10;
      while(n > 0)
      {
        int r = n % 10;
        rev = rev * 10 + r;
        n = n / 10;
      }
      int fd = rev % 10;
      int sum = fd + ld;
      System.out.println(sum);
      
	}
}