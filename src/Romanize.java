import java.util.HashMap;
import java.util.Map;

// Implementation with a bit of Spaghetti-code
public class Romanize implements Romanization {

    public Map<String, String> replacements = new HashMap<>();

    // replacements for cyr -> latin
    public void setReplacements() {
        replacements.put("а", "a");
        replacements.put("б", "b");
        replacements.put("в", "v");
        replacements.put("г", "g");
        replacements.put("д", "d");
        replacements.put("е", "e");
        replacements.put("ё", "yo");
        replacements.put("ж", "zh");
        replacements.put("з", "z");
        replacements.put("и", "i");
        replacements.put("й", "j");
        replacements.put("к", "k");
        replacements.put("л", "l");
        replacements.put("м", "m");
        replacements.put("н", "n");
        replacements.put("о", "o");
        replacements.put("п", "p");
        replacements.put("р", "r");
        replacements.put("с", "s");
        replacements.put("т", "t");
        replacements.put("у", "u");
        replacements.put("ф", "f");
        replacements.put("х", "x");
        replacements.put("ц", "cz");
        replacements.put("ч", "ch");
        replacements.put("ш", "sh");
        replacements.put("щ", "shh");
        replacements.put("ъ", "");
        replacements.put("ы", "y'");
        replacements.put("ь", "`");
        replacements.put("э", "e`");
        replacements.put("ю", "yu");
        replacements.put("я", "ya");
    }

    // replacements for latin -> cyr
    public void setReplacementsReverse() {
        replacements.put("a", "а");
        replacements.put("b", "б");
        replacements.put("v", "в");
        replacements.put("g", "г");
        replacements.put("d", "д");
        replacements.put("e", "е");
        replacements.put("yo","ё");
        replacements.put("zh", "ж");
        replacements.put("z", "з");
        replacements.put("i", "и");
        replacements.put("j", "й");
        replacements.put("k", "к");
        replacements.put("l", "л");
        replacements.put("m", "м");
        replacements.put("n", "н");
        replacements.put("o", "о");
        replacements.put("p", "п");
        replacements.put("r", "р");
        replacements.put("s", "с");
        replacements.put("t", "т");
        replacements.put("u", "у");
        replacements.put("f", "ф");
        replacements.put("x","х");
        replacements.put("cz","ц");
        replacements.put("ch","ч");
        replacements.put("sh","ш");
        replacements.put("shh", "щ");
        replacements.put("", "ъ");
        replacements.put("y'", "ы");
        replacements.put("`","ь");
        replacements.put("e`","э");
    }

    // Method to translate the input string, ignores uppercase
    @Override
    public String CyrillicToLatin(String val) {
        val = val.toLowerCase();
        setReplacements();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < val.length(); i++) {
            String c = String.valueOf(val.charAt(i));
            String latin = replacements.get(c);
            output.append(latin != null ? latin : c);
        }
        return output.toString();
    }

    // Reverse method, ignores uppercase,
    // uses the different method due to two-letter
    // combinations for some letters
    @Override
    public String LatinToCyrillic(String val) {
        val = val.toLowerCase();
        setReplacementsReverse();
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i < val.length()) {
            if (i < val.length() - 1) {
                String key = val.substring(i, i + 2).toLowerCase();
                String cyrillic = replacements.get(key);
                if (cyrillic != null) {
                    output.append(cyrillic);
                    i += 2;
                    continue;
                }
            }

            String key = val.substring(i, i + 1).toLowerCase();
            String cyrillic = replacements.get(key);
            if (cyrillic != null) {
                output.append(cyrillic);
            } else {
                output.append(val.charAt(i));
            }
            i++;
        }
        return output.toString();
    }
}
