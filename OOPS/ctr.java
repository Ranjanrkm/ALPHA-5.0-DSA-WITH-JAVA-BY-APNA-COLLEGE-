public class ctr {
    public static void main(String[] args) {
        A ref = new A();
        ref.show();
    }
}


class A{
    int a; String name;
    // A(){
    //     a = 1; name = "Pragati";
    // }
    void show(){
        System.out.println(a+" "+name);
    }
}
