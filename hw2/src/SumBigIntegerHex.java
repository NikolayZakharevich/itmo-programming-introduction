import java.math.BigInteger;

public class SumBigIntegerHex {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ZERO;
        for (String arg : args) {
            if (arg == null || arg.length() == 0) {
                continue;
            }
            String[] parts = arg.split("\\p{javaWhitespace}+");
            for (String part : parts) {
                if (part.length() == 0) {
                    continue;
                }
                result = result.add(part.startsWith("0x") || part.startsWith("0X")
                        ? new BigInteger(part.substring(2), 16)
                        : new BigInteger(part));
            }
        }
        System.out.println(result);
    }
}
