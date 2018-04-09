package Exceptions;

/**
 *
 * @author codefluent
 */
public class UserRightsException extends Exception {
    public String UserRightsException() {
        return "Oh poop! This user does not have admin priveleges.";
    }
}
