package nyc.c4q.android.ui;

public interface AuthenticationManager {
  boolean validateLogin(String email, String password);
}
