package ImageHoster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidatorCheck {

    private Pattern pattern;
    private Matcher matcher;
    private static final String PASSWORD_ALPHANUMERIC_REGEX = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[$&+,:;=?@#|])[A-Za-z0-9$&+,:;=?@#|]+$"; // regex to check for alphanumberic and special char.

    public PasswordValidatorCheck() {
        pattern = Pattern.compile(PASSWORD_ALPHANUMERIC_REGEX);
    }

    public boolean checkPasswordRegex(String userPassword) {
        matcher = pattern.matcher(userPassword);
        return matcher.matches();
    }
}
