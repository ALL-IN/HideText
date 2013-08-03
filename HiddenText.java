package HiddenText;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * Author: Aleksey Alekseenko
 * Date: 02.08.13
 */
public class HiddenText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b)  {
            System.out.println("Enter anything");
            String text = scanner.next();
            HiddenView hiddenView = new Hide3First2Last();
            System.out.println(hiddenView.hide(new StringBuilder(text)));
            if (text.equals("enough")) {
                b = false;
            }
        }
    }
}
