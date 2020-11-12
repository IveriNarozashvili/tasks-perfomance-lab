package task1;

import java.math.BigInteger;

public class NotationApp {

    public static void main(String[] args) {
        System.out.println(intoBase(Integer.parseInt(args[0]), args[1]));
    }

    public static String intoBase(int nb, String base) {
        String result = "useage";

        switch (base) {
            case "binary":
                result = toBinary(nb);
                break;
            case "ternary":
                result = toTernary(nb);
                break;
            case ("hex"):
                result = toHex(nb);
                break;
        }
        return result;
    }

    private static String toHex(int nb) {
        return Integer.toHexString(nb).toUpperCase();
    }

    private static String toTernary(int nb) {
        BigInteger result = new BigInteger(String.valueOf(nb));
        return result.toString(3);
    }

    private static String toBinary(int nb) {
        return Integer.toBinaryString(nb);
    }
}
