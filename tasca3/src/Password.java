public class Password {
    public static boolean passwordValidator(String password) {
        boolean validPass = false;

        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numCount++;
            }
        }

        if ((password.length() >= 8)
                && (numCount >= 2)) {
            validPass = true;
        }

        return validPass;
    }
}
