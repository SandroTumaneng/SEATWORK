class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class seatworkSeven{

    
    static void checkPassword(String password) throws PasswordException {

        
        if (password.length() < 10) {
            throw new PasswordException(
                "Password is too short. It must be at least 10 characters long."
            );
        } else {
            System.out.println("Password accepted. Access granted.");
        }
    }

 
    public static void main(String[] args) {

        try {
            checkPassword("Mahirapnapassword"); // 
        } catch (PasswordException e) {
            System.out.println("User-Defined Exception: " + e.getMessage());
        }
    }
}