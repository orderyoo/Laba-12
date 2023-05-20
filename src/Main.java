import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш ip: ");
        String ipv4 = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1([0-9]{2})|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1([0-9]{2})|2[0-4][0-9]|25[0-5])$");
        if(pattern.matcher(ipv4).find()){
            System.out.println("Корректный IP");
        } else {
            System.out.println("Неверный IP");
        }
    }
}