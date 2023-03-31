// Manual tests for Romanize class
public class RomanizationTest {
    public static void main(String[] args) {
        String test = "Привет, мой ПРЕКРАСНЕЙШИЙ друг! 123";
        Romanize rom = new Romanize();
        String result = rom.CyrillicToLatin(test);
        System.out.println(result);
        System.out.println(rom.LatinToCyrillic(result));
    }
}
