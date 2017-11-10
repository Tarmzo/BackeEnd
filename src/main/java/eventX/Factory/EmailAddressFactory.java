package eventX.Factory;

import eventX.domain.EmailAddress;

import java.util.Map;

/**
 * Created by SQIM-User on 2017/08/14.
 */
public class EmailAddressFactory {

   public static EmailAddress getEmailAddress(Map<String, String> values) {
       EmailAddress emailAddress = new EmailAddress.Builder()
               .id(values.get("id"))

               .emailAddress(values.get("email"))
               .build();
       return emailAddress;
   }
}
