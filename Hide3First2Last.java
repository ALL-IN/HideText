package HiddenText;

/**
 * Author: Aleksey Alekseenko
 * Date: 02.08.13
 */
public class Hide3First2Last implements HiddenView {

    @Override
    public StringBuilder hide(StringBuilder string, int quantityOfFirstChars, int quantityOfLastChars) {

        for (int i = 0; i < quantityOfFirstChars; i++){
            string.setCharAt(i, '*');
        }
        for (int i = 0; i < quantityOfLastChars; i++){
            string.setCharAt(string.length()-1-i, '*');
        }
        return string;
    }
}
