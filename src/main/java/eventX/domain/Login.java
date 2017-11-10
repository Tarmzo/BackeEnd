package eventX.domain;

import lombok.Data;

/**
 * Created by SQIM-User on 2017/10/07.
 */
@Data
public class Login {
    public String id;
    public String username;
    public String password;

    public Login(){

    }

    public Login(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
    }
    public static class Builder {
        private String id, username, password;

        public Builder ID(String id) {
            this.id = id;
            return this;
        }

        public Builder username(String nm) {
            this.username = nm;
            return this;
        }

        public Builder password(String pssword) {
            this.password = pssword;
            return this;
        }


        public Login build() {
            return new Login(this);
        }
    }
}
