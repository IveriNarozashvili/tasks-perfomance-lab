package task4;

public class StringCheckApp {
    public static void main(String[] args) {
        System.out.println(isEquals(args[0], args[1]) ? "OK" : "KO");
    }

    private static boolean isEquals(String arg0, String arg1) {
        if (!arg1.contains("*") && arg0.length() != arg1.length()){
            return false;
        }

        for (int i = 0; i < arg0.length(); i++) {
            if (arg0.charAt(i) == arg1.charAt(i)) {
                continue;
            } else {
                if (arg1.charAt(i) != '*') {
                    return false;
                }

                int j = i;
                while (j <= arg1.length()-1  && arg1.charAt(j) == '*') {
                    j++;
                }
            }
        }
        return true;
    }
}
