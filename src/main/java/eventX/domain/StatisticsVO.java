package eventX.domain;

import java.util.ArrayList;
import java.util.List;

public class StatisticsVO {
    private String date;

    private List<List<String>> rows = new ArrayList();

    private boolean isFilled;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public List<List<String>> getRows() {
        return rows;
    }

    public void setRows(List<List<String>> rows) {
        this.rows = rows;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
}
