package validacion;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Verificar longitud mínima
        if (password.length() < 8) {
            return false;
        }

        // Verificar si contiene espacios en blanco
        if (password.contains(" ")) {
            return false;
        }

        // Verificar si contiene al menos un carácter en mayúscula, un número y un carácter especial
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (isSpecialChar(c)) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasDigit && hasSpecialChar;
    }

    private static boolean isSpecialChar(char c) {
        String specialChars = "!@#$%^&*()_+";
        return specialChars.contains(String.valueOf(c));
    }
}