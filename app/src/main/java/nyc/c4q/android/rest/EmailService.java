package nyc.c4q.android.rest;

import java.util.List;
import nyc.c4q.android.model.Email;

public interface EmailService {
  List<Email> getEmails();
}
