import java.util.HashMap;
import java.util.Map;

public class Q1 {

    public static void q1() {
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "ENTQGWPCXVDSRJLKIYMFUOHABZ";

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < key.length(); i++) {
            map.put(key.charAt(i), letter.charAt(i));
        }

        String ciphertext = "HCBJLFMEXQFCGREYTCCEYGQLFESXTGHEMMXSGJFQLFFCGQLYRLUMGCEQTSLMGQXFMGBGMNBFCXMFXRGTLRREEJQHEMPLXJPLWWXJFLEQLVGNUFTLRRELJNGXJPOXJTCGQNBFCGCEFFGYTLRREXFHLKGUOEPEXJHXFCESXFFSGMCYXGKTLRREEJQHGJFLJFCEFNGPXJMHXFCEJRTLRREMUTCEMRLUMGFYEOMTLRREEJQFCGRLLJTLRREEJQRGRLYBTLRREEJQRUTCJGMMBLUKJLHBLUMEBFCXJPMEYGRUTCLWERUTCJGMMQXQBLUGDGYMGGMUTCEFCXJPEMEQYEHXJPLWERUTCJGMMYGESSBTLRREJLHBLUEMKRGTLRREMEXQESXTGTLRREDGYBRUTCTLJWUMGQTLRREXQLJFFCXJKFCGJBLUMCLUSQJFFESKTLRREMEXQFCGCEFFGY";
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++) {
            plaintext.append(map.get(ciphertext.charAt(i)));
        }

        System.out.println(plaintext.toString());
    }

    public static void main(String[] args) {
        q1();
    }
}
