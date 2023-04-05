public class Registr {
    public static boolean registr(String login, String password,
                                  String confirmPassword) {
        try {
            inputLog(login);
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
            inputPass(password);
            if (password.length() >= 20) {
                throw new WrongPasswordException();
            }
            return password.equals(confirmPassword);
        } catch (WrongLoginException e) {
            System.err.println("такой логин нельзя создать");
        } catch (WrongPasswordException e) {
            System.err.println("пароль неверный");
        }
        return false;
    }

    public static void inputLog(String login) {
        if (!login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongPasswordException();
        }
    }
    public static void inputPass(String password) {
        if (!password.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongPasswordException();
        }
    }


}
