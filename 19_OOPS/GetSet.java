public class GetSet {
    public static void main(String args[]) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());


    }
    
}

class Pen{
    private String color;
    private int tip;

    int getTip() {
        return this.tip;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
       this.tip = tip;
    }
}
