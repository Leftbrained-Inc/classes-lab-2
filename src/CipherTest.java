// Manual tests for the BCipher class
public class CipherTest {
    public static void main(String[] args) {
        System.out.println(new BCipher().encode("zYlyZ512 33zA3"));
        System.out.println(new BCipher().decode("Svool"));
        System.out.println(new BCipher().encode("ABCxyz"));
    }
}
