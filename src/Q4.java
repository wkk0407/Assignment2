import java.util.Random;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class Q4 {

    public static void q4() {
        Checksum cs1 = new CRC32();
        Checksum cs2 = new CRC32();
        Random rand = new Random();

        String x = "F3264372DF76FFC3633C38176796C19A";
        Long y = Long.valueOf(0);
        long crc_x = 1;
        long crc_y = 0;
        byte b1[] = x.getBytes();
        cs1.update(b1, 0, b1.length);
        crc_x = cs1.getValue();

        while (crc_x != crc_y){
            y = rand.nextLong();
            byte b2[] = y.toString().getBytes();
            cs2.update(b2, 0, b2.length);
            crc_y = cs2.getValue();
            cs2.reset();
        }


        System.out.println("String 1: " + x + " String 2: " + y);
    }

    public static void main(String[] args) {
        q4();
    }
}
