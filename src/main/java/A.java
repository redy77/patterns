import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Viktor Bakakin
 */
public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().replaceAll(" ", "").split("");
        Map<String, Integer> strmap = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if (strmap.containsKey(str[i])) {
                strmap.put(str[i], strmap.get(str[i]) + 1);
            } else strmap.put(str[i], 1);
        }
//        for (int i = 0; i < str.length; i++) {
//            if (strmap.get(str[i]) == 1){
//                System.out.println(str[i]);
//            }
//        }

        strmap.keySet().stream()
                .filter(s -> strmap.get(s) > 1)
                .forEach(System.out::println);
        }
    }





