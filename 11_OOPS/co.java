class Demo{

    int a = 10;
    String b = "Pragati";

    void Show(){
        System.out.println(a+" "+b);
    }
}

class co{
    public static void main(String args[]){
        Demo r = new Demo();  //Demo = r;
        r.Show();             //r = new Demo();
    }
}