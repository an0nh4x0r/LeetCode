package in.swapnilsingh;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {

    public void reverseString(char[] s) {
        int totalLength = s.length - 1;
        for (int i = 0; i < s.length / 2; ++i) {
            char emptyChar = s[i];
            s[i] = s[totalLength - i];
            s[totalLength - i] = emptyChar;
        }
    }

}
