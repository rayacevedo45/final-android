package nyc.c4q.android;

import android.app.Application;
import android.app.NotificationManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import nyc.c4q.android.rest.FakeEmailService;

public class EmailApplication extends Application {
  public static final int EMAIL_POLL_IN_SEC = 5;

  public static final int MILLIS_PER_SEC = 1000;
  public static final int DELAY_MILLIS = EMAIL_POLL_IN_SEC * MILLIS_PER_SEC;

  private static final FakeEmailService emailService = new FakeEmailService();

  private HandlerThread handlerThread;
  private NotificationManager notificationManager;
  private Runnable emailCheck;

  @Override public void onCreate() {
    super.onCreate();

    // TODO - finish this
    notificationManager = null;

    handlerThread = new HandlerThread("email-timer");
    handlerThread.start();
    Looper looper = handlerThread.getLooper();
    final Handler handler = new Handler(looper);

    emailCheck = new Runnable() {
      @Override public void run() {
        if (emailService.hasNewMail()) {

          // TODO
          // 1) get the most recent email and..
          // a) send a notification to the user notifying of the new email
          // b) use R.string.you_got_email as title
          // c) use R.string.notification_email_from (accounting for who sent the email)
          // d) when user clicks on notification, go to EmailDetailActivity

        }


        handler.postDelayed(emailCheck, DELAY_MILLIS);
      }
    };

    handler.postDelayed(emailCheck, DELAY_MILLIS);
  }
}
