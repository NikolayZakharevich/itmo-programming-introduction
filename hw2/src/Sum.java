public class Sum {
    public static void main(String[] args) {
        int result = 0;
        for (String arg : args) {
            if (arg == null || arg.length() == 0) {
                continue;
            }
            String[] parts = arg.split("\\p{javaWhitespace}+");
            for (String part : parts) {
                if (part.length() == 0) {
                    continue;
                }
                result += Integer.parseInt(part);
            }
        }
        System.out.println(result);
    }
}