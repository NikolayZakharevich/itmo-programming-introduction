import java.math.BigInteger;

public class SumLongHex {
    public static void main(String[] args) {
        long result = 0;
        for (String arg : args) {
            if (arg == null || arg.length() == 0) {
                continue;
            }
            String[] parts = arg.split("\\p{javaWhitespace}+");
            for (String part : parts) {
                if (part.length() == 0) {
                    continue;
                }
                result += part.startsWith("0x") || part.startsWith("0X")
                        ? new BigInteger(part.substring(2), 16).longValue()
                        : Long.parseLong(part, 10);
            }
        }
        System.out.println(result);
    }
}
