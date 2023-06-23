import java.util.Scanner;

public class Ahsdfhvskf {
    /*Написать метод,
    который будет принимать строку и символ.
    А затем выведет на экран число, равное тому,
    сколько раз этот символ встречается в строке.
    Затем в main считать из консоли строку,
    потом символ, и вызвать этот метод.
     */

    public static int asdfsdfdsv(String sdfadf, char dfgsdfgdsd) {
        int count = 0;

        for (int i = 0; i < sdfadf.length(); i++) {
            if (sdfadf.charAt(i) == dfgsdfgdsd) {
                count++;
            }
        }
        System.out.println("Число вхождений символа " + dfgsdfgdsd + " " + "в строку: " + count);
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String sdfadf = scanner.nextLine();
        System.out.println("Введите символ:");
        char dfgsdfgdsd = scanner.next().charAt(0);

        asdfsdfdsv(sdfadf, dfgsdfgdsd);


    }
}
