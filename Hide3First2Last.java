package HiddenText;

/**
 * Author: Aleksey Alekseenko
 * Date: 02.08.13
 */
public class Hide3First2Last implements HiddenView {

    @Override
    public StringBuilder hide(StringBuilder string) {
        string.setCharAt(0, '*');
        string.setCharAt(1, '*');
        string.setCharAt(2, '*');
        string.setCharAt(string.length()-1, '*');
        string.setCharAt(string.length()-2, '*');
        return string;
    }
}
