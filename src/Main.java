import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        String ip = "0.0.0.0";
        String ip1 = "191.168.0.1";
        String ip2 = "255.255.9.9";
        String ip3 = "255.255.9.10";
        Pattern pattern = Pattern.compile("^(0|[0-1]([0-9]{2})|(2([0-5]{2})))\\.(0|[0-1]([0-9]{2})|(2([0-5]{2})))\\.\\d\\.\\d$");
        Matcher matcher = pattern.matcher(ip);
        System.out.println(pattern.matcher(ip).find());
        System.out.println(pattern.matcher(ip1).find());
        System.out.println(pattern.matcher(ip2).find());
        System.out.println(pattern.matcher(ip3).find());

    }
}