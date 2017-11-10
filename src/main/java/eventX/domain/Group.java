package eventX.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.*;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
/**
 * Created by SQIM-User on 2017/08/14.
 */
public class Group {
    public String ID;
    public String name;
    public String groupDescription;
    public String manager;

    public Group(){

    }

    public Group(Builder builder) {
        this.ID = builder.ID;
        this.name = builder.name;
        this.groupDescription = builder.groupDescription;
        this.manager = builder.manager;
    }

    public static class Builder {
        private String ID, name, groupDescription, manager;

        public Builder ID(String id) {
            this.ID = id;
            return this;
        }

        public Builder name(String nm) {
            this.name = nm;
            return this;
        }

        public Builder gDescription(String groupDescription) {
            this.groupDescription = groupDescription;
            return this;
        }

        public Builder manager(String manager) {
            this.manager = manager;
            return this;
        }

        public Group build() {
            return new Group(this);
        }
    }
}
