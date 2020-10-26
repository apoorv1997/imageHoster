package ImageHoster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidatorCheck {

    private Pattern pattern;
    private Matcher matcher;
    private static final String PASSWORD_CHECK_REGEX = "[a-zA-Z0-9\\-#\\.\\(\\)\\/%&@$*^\\s]{0,40}";

    public PasswordValidatorCheck() {
        pattern = Pattern.compile(PASSWORD_CHECK_REGEX);
    }

    public boolean checkPasswordRegex(String userPassword) {
        matcher = pattern.matcher(userPassword);
        return matcher.matches();
    }
}
