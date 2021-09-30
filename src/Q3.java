import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.Random;

public class Q3 {

    public static void q3() {
        String x = "";
        String y = "a";
        Checksum cs1 = new CRC32();
        Checksum cs2 = new CRC32();
        long crc_x = 0;
        long crc_y = 1;

        while (x != y && crc_x != crc_y){

            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 10;
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);
            StringBuilder buffer2 = new StringBuilder(targetStringLength);
            for (int i = 0; i < targetStringLength; i++) {
                int randomLimitedInt = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);

                int randomLimitedInt2 = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer2.append((char) randomLimitedInt2);


            }
            x = buffer.toString();
            y = buffer2.toString();

            byte b1[] = x.getBytes();
            byte b2[] = y.getBytes();

            cs1.update(b1, 0, b1.length);
            cs2.update(b2, 0, b2.length);

            crc_x = cs1.getValue();
            crc_y = cs2.getValue();
            cs1.reset();
            cs2.reset();
        }

        System.out.println("String 1: " + x + " String 2: " + y);
    }

    public static void main(String[] args) {
        q3();
    }
}
