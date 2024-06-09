import java.util.Scanner;

public class Ipallilos {
    private String _onoma;
    private String _epwnimo;
    private String _email;
    private String _username;
    private String _kwdikos;

    public Ipallilos(String onoma, String epwnimo, String email, String username, String kwdikos) {
        this._onoma = onoma;
        this._epwnimo = epwnimo;
        this._email = email;
        this._username = username;
        this._kwdikos = kwdikos;
    }

    public static boolean eisodos(String username, String kwdikos, Ipallilos[] users) {
        for (Ipallilos user : users) {
            if (user._username.equals(username) && user._kwdikos.equals(kwdikos)) {
                return true;
            }
        }
        return false;
    }
}
