public class SumFloat {
    public static void main(String[] args) {
        float result = 0;
        for (String arg : args) {
            if (arg == null || arg.length() == 0) {
                continue;
            }
            String[] parts = arg.split("[\\p{javaWhitespace}\u00A0\u2007\u202F]+");
            for (String part : parts) {
                if (part.length() == 0) {
                    continue;
                }
                result += Float.parseFloat(part);
            }
        }
        System.out.println(result);
    }
}