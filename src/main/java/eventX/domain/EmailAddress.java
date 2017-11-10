package eventX.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import java.io.Serializable;

/**
 * Created by SQIM-User on 2017/08/11.
 */
@Getter
@Setter
public class EmailAddress implements Serializable{//, Comparable<EmailAddress> {

    public String id;
    public String emailAddress;

    public EmailAddress() {
    }

    public EmailAddress(Builder builder) {
        this.id = builder.id;
        this.emailAddress = builder.emailAddress;
    }

    public static class Builder {
        private String id, emailAddress;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public EmailAddress build() {
            return new EmailAddress(this);
        }
    }


    /*public int compareTo(EmailAddress emailAddress) {
        return id.compareTo(emailAddress.id);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailAddress email = (EmailAddress) o;

        return id.equals(email.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}