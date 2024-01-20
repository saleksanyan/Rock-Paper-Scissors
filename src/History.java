import java.util.ArrayList;

public class History {

    private ArrayList<String> history = new ArrayList<>();

    public ArrayList<String> getHistory() {
        return history;
    }

    public void addHistory(String lastGameResults) {
        history.add(lastGameResults);
    }

}
