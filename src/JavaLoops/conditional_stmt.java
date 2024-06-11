package JavaLoops;

public class conditional_stmt
{
        public static void main(String[] args)
        {
            conditional_stmt obj = new conditional_stmt();
            obj.nestedif();

        }


            public void switchcode()
        {

            int day = 3;
            String dayName;

            // Switch statement to determine the name of the day based on the day number
            switch (day) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Invalid day";
                    break;
            }

            System.out.println("The day is: " + dayName);
        }

        public void nestedif()
        {
            int number = 0;

            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("The number is positive and even.");
                } else {
                    System.out.println("The number is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
            System.out.println("End of code");


        }




    }

