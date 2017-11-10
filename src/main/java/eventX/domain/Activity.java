package eventX.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by SQIM-User on 2017/08/11.
 */

@Getter
@Setter
public class Activity implements Serializable{
    public String name;
    public String activityDescription;
    public int points;
    public String ID;

    public Activity(){

    }

    public Activity(Builder builder) {
        this.name = builder.name;
        this.activityDescription = builder.activityDescription;
        this.points = builder.points;
    }

    public static class Builder {
        private String name;
        private String activityDescription;
        private int points;
        private String ID;

        public Builder id(String value){
            this.ID = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder activityDescription(String value){
            this.activityDescription = value;
            return this;
        }

        public Builder points(int value){
            this.points = value;
            return this;
        }


        public Activity build(){
            return new Activity(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        return ID.equals(activity.ID);
    }

    @Override
    public int hashCode() {
        return ID.hashCode();
    }
}
