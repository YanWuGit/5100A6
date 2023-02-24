import java.util.Scanner;

public class WeightGrade {
    private Double fullPoints;
    private Double earnedPoints;
    private Double percentage;
    private Double percentageEarned;

    public WeightGrade(Double fullPoints, Double earnedPoints, Double percentage){
        this.fullPoints = fullPoints;
        this.earnedPoints = earnedPoints;
        this.percentage = percentage;
    } // constructor which is used in GUI

    public WeightGrade(){}



    public void takeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the total points of this assignment: ");
        setFullPoints(scanner.nextDouble());

        System.out.println("Please type in points you earned: ");
        setEarnedPoints(scanner.nextDouble());

        System.out.println("Please type in the percentage this assignment contribute to your final grades: ");
        setPercentage(scanner.nextDouble());
    } // take inputs from the user from terminal and update attribute values

    public void percentageEarned() {
        percentageEarned = getEarnedPoints() / getFullPoints() * getPercentage();
        System.out.println("You have earned " + percentageEarned + "% towards your final grade for this assignment.");
    } // calculate and output grades earned by the assignment in percentage


    public Double getFullPoints() {
        return fullPoints;
    }

    public void setFullPoints(Double fullPoints) {
        this.fullPoints = fullPoints;
    }

    public Double getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(Double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Double getPercentageEarned() {
        return percentageEarned;
    }

    public void setPercentageEarned(Double percentageEarned) {
        this.percentageEarned = percentageEarned;
    }
}

