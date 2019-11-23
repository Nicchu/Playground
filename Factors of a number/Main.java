import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int Number = sc.nextInt();
      int i;
      for(i = 1; i <= Number; i++)
      {
        if(Number % i == 0)
        {
          System.out.println(i);
        }
      }
	}
}