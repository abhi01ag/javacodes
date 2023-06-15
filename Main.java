

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("this is the program  to calculate the percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total marks");
        float total = sc.nextInt();
        System.out.println("enter the marks in english");
        int english = sc.nextInt();
        System.out.println("enter the marks in maths");
        int maths = sc.nextInt();
        System.out.println("enter the marks in sst");
        int sst = sc.nextInt();
        System.out.println("enter the marks in science");
        int science = sc.nextInt();
        System.out.println("enter the marks in hindi");
        int hindi = sc.nextInt();
        System.out.println("total marks obtained is");
        float totalobtained = english+maths+science+sst+hindi;
        System.out.println(totalobtained);
        float percentage = (totalobtained/total)*100;
        System.out.print("your percentage is ");
        System.out.println(percentage);



    }
}
