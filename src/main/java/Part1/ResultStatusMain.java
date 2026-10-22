package Part1;

import static Part1.ResultStatus.scoreStatus;

public class ResultStatusMain {
    public static void main(String[] args)
    {
        int[] scores = {0, 49, 50, 74, 75, 100};
        for (int score : scores) {

            System.out.println(
                    "Score: " + score + " Status: " + scoreStatus(score)
            );
    }

}}
