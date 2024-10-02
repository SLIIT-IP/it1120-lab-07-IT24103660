import java.util.Scanner;
 public class  IT24103660Lab7Q1_a {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    int sub1,sub2,sub3,sub4;
    double average;

    System.out.println("Enter marks for four subjects:");
    while(true){
      System.out.println("Enter subject mark 1: ");
      sub1 = sc.nextInt();
      System.out.println("Enter subject mark 2: ");
      sub2 = sc.nextInt();
      System.out.println("Enter subject mark 3: ");
      sub3 = sc.nextInt();
      System.out.println("Enter subject mark 4: ");
      sub4 = sc.nextInt();
      average = (sub1 + sub2 + sub3 + sub4)/ 4.0;
      System.out.println("Average is" +average);
    
      if (average >= 75 && average <= 100) {
        System.out.println("Grade: Distinction");
    } else if (average >= 50 && average < 75) {
        System.out.println("Grade: Credit");
    } else if (average >= 0 && average < 50) {
        System.out.println("Grade: Fail");
    }
   break;

    }  
 }
}