package brailleTranslation;

public class Solution {

    private static String chars = " abcdefghijklmnopqrstuvwxyz";

    private static String[] codes = { "000000", "100000", "110000", "100100", "100110", "100010", "110100", "110110",
            "110010", "010100", "010110", "101000", "111000", "101100", "101110", "101010", "111100", "111110",
            "111010", "011100", "011110", "101001", "111001", "010111", "101101", "101111", "101011" };

    public static String solution(String s) {
        return getBraille(s);
    }

    public static String getBraille(String text) {
        String output = "";
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (Character.isUpperCase(current)) {
                output += "000001";
            }
            output += codes[chars.indexOf(Character.toLowerCase(current))];
        }
        return output;
    }

}
