package LU.lv;

public class Variables_perimeter {
    public static void main(String[] args) {
        int side1 = 15;
        int side2 = 16;
        int side3 = 14;
        int side4 = 17;

        int result1 = side1 + side2 + side3 + side4;
        System.out.println(result1);

        int result = side1;
        result = result + side2;
        result += side3;
        result += side4;

        System.out.println("Perimetrs = "+result);


    }
}
