 class demo{

    StringBuffer name1() {
        StringBuffer Varnam1;
        Varnam1 = new StringBuffer("abhi");
        Varnam1.append("shek");
//        String Varname = new String("abhi");
        return Varnam1;
    }
    String name2() {
//        String name;
//        name = "abhi";

        return "abhi";
    }


}

public class arr {
    public static void main(String[] args) {
        int[] arr = {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = new int[4];
        arr1[1] = 4;
        arr1[2] = 6;
        arr1[0] = 9;

        for (int n:arr){
            System.out.println(n);
        }
        System.out.println("  \n");
        for (int n:arr1){
            System.out.println(n);
        }
        demo obj1 = new demo();
//        demo obj2 = new demo();
        System.out.println(obj1.name1());
        System.out.println(obj1.name2());
        System.out.println(obj1.name1().equals(obj1.name2()));

        System.out.println();
    }
}