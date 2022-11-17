package ph.hombre.ron;

public class RAE {
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private String reversed_alphabet;


    public RAE() {
        this.reversed_alphabet = new StringBuilder(alphabet).reverse().toString();
    }

    private char[] algorithm_round(char[] in) {
        int length = in.length;

        char[] out = new char[length];

        for (int i = 0; i < length; i++) {
            int index = alphabet.indexOf(in[i]);
            if(index < 0)
                out[i] = in[i];
            else
                out[i] = reversed_alphabet.charAt(index);
        }

        return out;
    }
    public String encrypt(String input) {
        char[] out = input.toCharArray();

        for(int i = 0; i < 1; i++) {
            out = algorithm_round(out);
        }

        return new String(out);
    }

    public String decrypt(String input) {
        return encrypt(input);
    }
}