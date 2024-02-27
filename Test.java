public class Test {
    public static void main(String[] args) {
        String[] userName = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String username = "";
        for (int i = 0; i < 5; i++) {
            String a = userName[(int) (Math.random()*26)];
            username = username + a;
        }
        System.out.println(username);
    }
}

