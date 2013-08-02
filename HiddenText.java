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
    static HiddenView hiddenView;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("hiddenText.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (properties.getProperty("hiddenText").equals("true")) {
            hiddenView = new Hide3First2Last();
            System.out.println(hiddenView.hide(new StringBuilder(text)));
        } else if (properties.getProperty("hiddenText").equals("false")) {
            System.out.println(text);
        }
    }


}
