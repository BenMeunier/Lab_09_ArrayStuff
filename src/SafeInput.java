import java.util.Scanner;
class SafeInput
{
    /**
     * Get a string which contains atleast one character
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt of the user
     * @retrun a String response that is not zero length
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ":");
            retString = pipe.nextLine();
        } while (retString.length() == 0); //get character

        return retString;

    }


    /**
     * Calculates and prints the sum and average of an array of integers.
     *
     * @param dataPoints The array of integers to calculate the sum and average of.
     */
    public static void ArrayProj(int[] dataPoints) {
        int sum = 0;
        for (int dataPoint : dataPoints) {
            sum += dataPoint;
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of your random dataPoints is: " + sum);
        System.out.printf("Your average of the random dataPoints is: %.2f%n", average);
    }

    /**
     * Get an int value within a specified numeric rnage
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not include range info
     * @param low - low end of inclusive rnage
     * @param high - high end of inclusive range
     * @return - int value within the inclusive range
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nNumber is out of range ["+ low + "-" + high + "]: "+ retVal);
                }

            }

            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int:" + trash);
            }
        }while(!done);
        return retVal;
    }

    /**
     * Get an int value with no contraints
     * @param pipe - Scanner instance to read the data System.in in cost cases
     * @param prompt - input prompt msg should not include range info
     * @return - unconstrained int value
     */

    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);
        return retVal;
    }

    /**
     * get a double value within an inclusive range
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not contain range info
     * @param low - low vlaue inclusive
     * @param high - high value inclusive
     * @return - double value within the specified inclusive range
     */

    public static double getRangedDouble(Scanner pipe, String prompt, int low, int high)

    {
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt + "[" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]; " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        }while(!done);
        return retVal;
    }

    /**
     * Get an unconstrained double value
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt - input msg should not contain range info
     * @return - an unconstrained double value
     */

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ":");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        }while(!done);
        return retVal;
    }

    /**
     * Get a [Y/N] confirmation from the user
     * @param pipe - Scanner instance to read the data System.in in most cases
     * @param prompt -input prompt msg for user does not need [Y/N]
     * @return - true for yes false for no
     */

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = true;
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N] ");
            response = pipe.nextLine();
            if(response.equalsIgnoreCase("Y"))
            {
                gotAVal = true;
                retVal = true;
            }
            else if(response.equalsIgnoreCase("N"))
            {
                gotAVal = true;
                retVal = false;
            }
            else
            {
                System.out.println("You must answere [Y/N]! " + response );
            }
        }while(!gotAVal);
        return retVal;
    }

    /**
     * Get a string that matches a RegEx pattern! This is a very powerful method
     * @param pipe- Scanner instance to read the data System.in in most cases
     * @param prompt - prompt for user
     * @param regExPattern- java style RegEx pattern to constrain the input
     * @return a String that matches the RegEx pattern supplied
     */

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if(response.matches(regExPattern))
            {
                gotAVal = true;
            }
            else
            {
                System.out.println("\n" + response + "must match the patter " + regExPattern);
                System.out.println("Tru again!");
            }
        }while(!gotAVal);
        return response;
    }


}
