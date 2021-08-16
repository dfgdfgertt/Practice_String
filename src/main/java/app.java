import java.util.Scanner;

public class app {

    public static void main(String[] main){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào 1 chuỗi ký tự: ");
        String str = input.nextLine();

        System.out.println("\n" + str.toUpperCase());

        System.out.println("\n" +cutNumeric(str));
    }

    public static String cutNumeric(String str){
        str= str.replace("0", "");
        str= str.replace("1", "");
        str= str.replace("2", "");
        str= str.replace("3", "");
        str= str.replace("4", "");
        str= str.replace("5", "");
        str= str.replace("6", "");
        str= str.replace("7", "");
        str= str.replace("8", "");
        str= str.replace("9", "");
        return str;
    }
}
