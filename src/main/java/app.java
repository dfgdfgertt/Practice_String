import java.util.Scanner;

public class app {

    public static void main(String[] main){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào 1 chuỗi ký tự: ");
        String str = input.nextLine();

        //Bai 1
        System.out.println("\n" + str.toUpperCase());

        //Bai 2
        System.out.println("\n" +cutNumeric(str));

        //Bai 3
        System.out.print("Nhập vào 1 ký tự: ");
        String c = input.nextLine();

        System.out.println("\n Ky tu " + c + "xuất hiện: " + countLoopString(str,c) + " lần");
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

    public static int countLoopString(String a, String b){
        int i =0;
        StringBuilder build = new StringBuilder(a);
        do{
            i++;
            build.deleteCharAt(build.indexOf(b));
        }while (build.indexOf(b) != -1);
        return i;
    }
}
