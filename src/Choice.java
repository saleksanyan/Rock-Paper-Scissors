import java.util.Comparator;

public class Choice implements Comparable{
    private String choice;

    public Choice(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        return "choice = " + choice;
    }

    @Override
    public int compareTo(Object o2) {
        String s2 = (String) o2;
        if((choice.equalsIgnoreCase("Rock") && s2.equalsIgnoreCase("Paper")) ||
                choice.equalsIgnoreCase("Scissors") && s2.equalsIgnoreCase("Rock") ||
                choice.equalsIgnoreCase("Paper") && s2.equalsIgnoreCase("Scissors"))
            return -1;
        else if((choice.equalsIgnoreCase("Rock") && s2.equalsIgnoreCase("Scissors")) ||
                (choice.equalsIgnoreCase("Scissors") && s2.equalsIgnoreCase("Paper")) ||
                (choice.equalsIgnoreCase("Paper") && s2.equalsIgnoreCase("Rock")))
            return 1;
        else return 0;

    }
}
