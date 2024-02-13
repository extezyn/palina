import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("введите строку строченьку: ");

            String stroka = in.nextLine().toLowerCase().replaceAll(" ", "");
            String reversStroka = "";

            for (int i = stroka.length() - 1; i >= 0; i--)
                reversStroka += stroka.toCharArray()[i];

            if (stroka.equals(reversStroka))
                System.out.println("есть контакт - это палиндром");
            else {
                System.out.println("нет контакта - не палиндром");
                break;
            }
        }
    }
}