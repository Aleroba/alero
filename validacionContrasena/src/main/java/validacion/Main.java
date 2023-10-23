package validacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su contraseña: ");
        String password = scanner.nextLine();
        
        System.out.println("Confirme su contraseña: ");
        String confirmPassword = scanner.nextLine();
        
        try {
            if (password.equals(confirmPassword) && PasswordValidator.isValidPassword(password)) {
                System.out.println("Contraseña válida y confirmada con éxito.");
            } else {
                System.out.println("Las contraseñas no coinciden o no cumplen con los requisitos.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
