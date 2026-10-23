package Others.Part1;

public class UseEnum {

    public static void main(String[] args) {


        int grade = 10;
        ResultStatus status = null;

        if ( ! ( grade < 0 || grade > 100))
        {

            if (grade < 50)
            {
                status = ResultStatus.FAIL;
            }
            else if ( grade > 49 && grade < 75)
            {
                status = ResultStatus.SUPPLEMENATRY;
            }
            else
                {
                status = ResultStatus.PASS;
                }


            System.out.println( status );

        }
        else {
            System.out.println("Invalid grade");
        }




    }

}
