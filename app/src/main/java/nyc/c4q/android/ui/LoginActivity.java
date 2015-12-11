package nyc.c4q.android.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import nyc.c4q.android.R;

public class LoginActivity extends Activity {

  private EditText emailField;
  private EditText passwordField;
  private Button loginButton;
  //private final AuthenticationManager manager;

//  public LoginActivity() {
//    // TODO - fix this
//    manager = null;
//  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);


    emailField = (EditText)findViewById(R.id.email);
    passwordField = (EditText)findViewById(R.id.password);
    loginButton = (Button)findViewById(R.id.login);
    // TODO - load view hierarchy in R.layout.activity_login

    // TODO - get references to views, and other setup

    // TODO - call checkCredentials via OnClickListener
  }

  public void checkCredentials (View view){//(String email, String password) {
    String email = emailField.getText().toString();
    String password = passwordField.getText().toString();
    if (email.equals("c4q") && password.equals("c4q")){
            //(manager.validateLogin(email, password)) {
      // TODO - go to EmailListActivity
      Intent intent = new Intent(LoginActivity.this, EmailListActivity.class);
      //intent.setFlags(1);
      startActivity(intent);
    }
    else {
      // TODO launch alert dialog on failed login
      // check strings.xml for dialog
      new AlertDialog.Builder(LoginActivity.this)
              .setTitle(R.string.alert_dialog_title)
              .show();
    }
  }
}
