import java.util.Scanner;

public class app {

    public static void main(String[] main){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào 1 chuỗi ký tự: ");
        String str = input.nextLine();

        System.out.println("\n" + str.toUpperCase());

    }
}
