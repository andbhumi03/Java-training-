import java.util.Scanner;
public class Unitconversion {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("kilometer");
        int kilometer =scanner.nextInt();
        int meters=1000*kilometer;
        int centimeter=10000*kilometer;

        System.out.println("distance in meter:" + meters);
        System.out.println("distance in centimeter:"+ centimeter);



    }
}
