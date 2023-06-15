
import java.util.Scanner;

public class yes2nd {
    public static void main(String[] args) {
        //System.out.println("my name");
        Scanner abhi = new Scanner(System.in);
        //int i = abhi.nextInt();
        //System.out.println(i++);
        //System.out.println(++i);
        //System.out.println(i++ + ++i);
        //String name = "abhishek";
        //System.out.println(name);
        String name = abhi.nextLine();
        String lwer = name.toLowerCase();
        String lwe1 = name.replace(' ','_');
        String rpl1 = name.replace("<|name|>","Abhsihek");
        System.out.println(lwer);
        System.out.println(lwe1);
        System.out.println(rpl1);
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));


    }
}
