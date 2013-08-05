package HiddenText;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * Author: Aleksey Alekseenko
 * Date: 02.08.13
 */
public abstract class HiddenView {
    Properties properties;

    public abstract StringBuilder hide(StringBuilder string);

    public HiddenView() {
        properties = loadProperties();
        if (isNotValidData()) {
            System.out.println("Properties file isn't valid");
            System.exit(0);
        }
    }

    private boolean isNotValidData() {
        return !(properties.getProperty("hiddenText").equals("true") && properties.getProperty("hiddenText").equals("false")
                && isInteger(properties.getProperty("quantityOfFirstChars"))
                && isInteger(properties.getProperty("quantityOfLastChars"))
                && Integer.parseInt(properties.getProperty("quantityOfFirstChars")) > 0
                && Integer.parseInt(properties.getProperty("quantityOfFirstChars")) > 0);
    }

    private Properties loadProperties() {
        Properties properties = new Properties();
        try {
            System.out.println("Enter property file location");
            Scanner scanner = new Scanner(System.in);
            String fileLocation = scanner.next();
            properties.load(new FileInputStream(fileLocation));
        } catch (IOException e) {
            System.out.println("Properties didnt load");
            System.exit(0);
        }
        return properties;
    }

    private boolean isInteger(String quantityOfChars) {
        try {
            Integer.parseInt(quantityOfChars);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


}
