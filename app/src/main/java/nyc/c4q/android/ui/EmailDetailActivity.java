package nyc.c4q.android.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import nyc.c4q.android.R;
import nyc.c4q.android.model.Email;

public class EmailDetailActivity extends FragmentActivity {
  EmailDetailFragment fragmentEmailDetail;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_email_detail);

    Email email = (Email) getIntent().getSerializableExtra("email");
    if (savedInstanceState == null) {
      fragmentEmailDetail = EmailDetailFragment.newInstance(email);
      FragmentManager fragmentManager = getSupportFragmentManager();
      FragmentTransaction ft = fragmentManager.beginTransaction();
      ft.replace(R.id.email_detail_container, fragmentEmailDetail);
      ft.commit();
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.items, menu);
    return true;
  }
}
