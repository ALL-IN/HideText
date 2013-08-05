package HiddenText;

/**
 * Author: Aleksey Alekseenko
 * Date: 05.08.13
 */
public class HideOnlyFirstChars extends HiddenView {


    @Override
    public StringBuilder hide(StringBuilder string) {

        if (properties.getProperty("hiddenText").equals("true")) {
            for (int i = 0; i < Integer.parseInt(properties.getProperty("quantityOfFirstChars")); i++) {
                string.setCharAt(i, '*');
            }
        }
        return string;
    }

}