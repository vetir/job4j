package decoder;

import java.util.Base64;

public class HelloBase64 {
    public static void main(String[] args) {
        String msg = "Hello, Base64!";
        Base64.Encoder enc = Base64.getEncoder();
        byte[] encbytes = enc.encode(msg.getBytes());
        for (int i = 0; i < encbytes.length; i++) {
            System.out.printf("%c", (char) encbytes[i]);
            if (i != 0 && i % 4 == 0)
                System.out.print(' ');
        }
        System.out.println();
        Base64.Decoder dec = Base64.getDecoder();
        byte[] decbytes = dec.decode(encbytes);
        System.out.println(new String(decbytes));

        String msg1 = "SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==";
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decYandex = decoder.decode(msg1);
        System.out.println(new String(decYandex));

    }
}
