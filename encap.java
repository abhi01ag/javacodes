class student{

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


public class encap {
    public static void main(String[] args) {
        student obj = new student();
        obj.setAge(18);
        obj.setName("abhi");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
}
