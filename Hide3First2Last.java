package HiddenText;

/**
 * Author: Aleksey Alekseenko
 * Date: 02.08.13
 */
public class Hide3First2Last extends HiddenView {


    @Override
    public StringBuilder hide(StringBuilder string) {

        if (properties.getProperty("hiddenText").equals("true")) {
            for (int i = 0; i < Integer.parseInt(properties.getProperty("quantityOfFirstChars")); i++) {
                string.setCharAt(i, '*');
            }
            for (int i = 0; i < Integer.parseInt(properties.getProperty("quantityOfLastChars")); i++) {
                string.setCharAt(string.length() - 1 - i, '*');
            }
        }
        return string;
    }

}
