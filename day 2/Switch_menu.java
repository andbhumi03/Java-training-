import java.util.Scanner;
public class Switch_menu {
    public static void main (String [] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("1.pizza");
        System.out.println("2.burger");
        System.out.println("3.pasta");
        System.out.println("4.idli ");
        System.out.println("5.dosa");
        System.out.println("enter your Choice");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("you selected pizza");
                break;
            case 2:
                System.out.println("you selected burger");
                break;
            case 3:
                System.out.println("you selected pasta");
                break;
            case 4:
                System.out.println("you selected idli");
                break;
            case 5:
                System.out.println("you selected dosa");
                break;
            default:
                System.out.println("invalid choice");

        }



    }
}
