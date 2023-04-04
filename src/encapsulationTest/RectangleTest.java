package encapsulationTest;

public class RectangleTest {

    public static void main(String[] args){

        Rectangle r = new Rectangle(20,30);

        int lgh = r.getLength();
        int bth = r.getBreadth();

        int Area = lgh * bth;

        System.out.println("Area " + Area);

        r.setBreadth(50);
        r.setLength(60);

        int ln = r.getLength();
        int br = r.getBreadth();

        int newArea = ln * br;

        System.out.println("newArea " + newArea);



    }

}
