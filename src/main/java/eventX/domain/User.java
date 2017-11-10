package eventX.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private String userID;

    private String name;

    private String surname;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty(message = "Please enter your password")
    @Size(min = 3, max =10, message = "Your password must atleast be betwene 3 and  10 characters")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
    private Boolean isAuthenticated;

    public User(Builder builder) {
        this.userID = builder.id;
        this.name = builder.username;
        this.surname = builder.lname;
        this.email = builder.email;
        this.password = builder.password;
    }

    public User() {

    }

    public static class Builder {
        private String id, username,lname, email, password;

        public Builder ID(String id) {
            this.id = id;
            return this;
        }

        public Builder username(String nm) {
            this.username = nm;
            return this;
        }

        public Builder surname(String snam) {
            this.lname = snam;
            return this;
        }

        public Builder email(String em) {
            this.email = em;
            return this;
        }


        public Builder password(String pssword) {
            this.password = pssword;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}