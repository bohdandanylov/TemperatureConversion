import java.util.Scanner;

public class Temperature {


    public static final String ANSI_RESET  = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[36m";
    public static final String ANSI_RED    = "\033[0;31m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {

        Scanner scanFirstTempSystem = new Scanner(System.in);
        System.out.print(ANSI_YELLOW
                + "The value in which temperature measurement system do you want to convert?" + "\n"
                + ANSI_RESET);
        System.out.print(ANSI_YELLOW
                + "Select a temperature scale from the list below: " + "\n"
                + ANSI_RESET);
        System.out.print("(1) Celsius   " + "(2) Fahrenheit   " + "(3) Kelvin" + "\n");
        System.out.print("(4) Rankin    " + "(5) Reaumur      " + "(6) Newton" + "\n");
        System.out.print("(7) Delisle   " + "(8) Leiden       " + "(9) Romer\n");
        int firstTempSystem = scanFirstTempSystem.nextInt();

        double firstValueDegree = 0;

        switch (firstTempSystem) {

            case 1: {
                System.out.println("\n" + "You have chosen Celsius");
                System.out.println("Enter degrees in Celsius:");
                firstValueDegree = scanFirstTempSystem.nextDouble();
                break;
            }

            case 2: {
                System.out.println("\n" + "You have chosen Fahrenheit");
                System.out.println("Enter degrees in Fahrenheit:");
                firstValueDegree = scanFirstTempSystem.nextDouble();
                break;
            }

            case 3: {
                System.out.println("\n" + "You have chosen Kelvin");
                System.out.println("Enter degrees in Kelvin:");
                firstValueDegree = scanFirstTempSystem.nextDouble();
                break;
            }

            case 4: {
                System.out.println("\n" + "You have chosen Rankin");
                System.out.println("Enter degrees in Rankin:");
                firstValueDegree = scanFirstTempSystem.nextDouble();
                break;
            }

            case 5: {
                System.out.println("\n" + "You have chosen Reaumur");
                System.out.println("Enter degrees in Reaumur:");
                firstValueDegree = scanFirstTempSystem.nextDouble();
                break;
            }

            case 6: {
                System.out.println("\n" + "You have chosen Newton");
                System.out.println("Enter degrees in Newton:");
                firstValueDegree = scanFirstTempSystem.nextDouble();
                break;
            }

            case 7: {
                System.out.println("\n" + "You have chosen Delisle");
                System.out.println("Enter degrees in Delisle:");
                firstValueDegree = scanFirstTempSystem.nextDouble();
                break;
            }

            case 8: {
                System.out.println("\n" + "You have chosen Leiden");
                System.out.println("Enter degrees in Leiden:");
                firstValueDegree = scanFirstTempSystem.nextDouble();
                break;
            }

            case 9: {
                System.out.println("\n" + "You have chosen Romer");
                System.out.println("Enter degrees in Romer:");
                firstValueDegree = scanFirstTempSystem.nextDouble();
                break;
            }

            default: {
                System.out.println("\n" + "Not a valid choice");
                break;
            }

        }

        Scanner scanSecondTempSystem = new Scanner(System.in);
        System.out.print(ANSI_YELLOW
                + "\n" + "What temperature measurement system do you want to convert the value to?"+"\n"
                + ANSI_RESET);
        System.out.print(ANSI_YELLOW
                + "Select a temperature scale from the list below: "+"\n"
                + ANSI_RESET);
        System.out.print("(1) Celsius   "+"(2) Fahrenheit   "+"(3) Kelvin"+"\n");
        System.out.print("(4) Rankin    "+"(5) Reaumur      "+"(6) Newton"+"\n");
        System.out.print("(7) Delisle   "+"(8) Leiden       "+"(9) Romer\n");
        int secondTempSystem = scanSecondTempSystem.nextInt();

        if (firstTempSystem == secondTempSystem) {
            System.out.println(ANSI_PURPLE
                    + "\n" + "Result: " + firstValueDegree
                    + ANSI_RESET);
            System.exit(1);
        }

        double secondValueDegree = 0;

        switch (secondTempSystem) {

            case 1: {
                System.out.println("\n" + "You have chosen Celsius");
                break;
            }

            case 2: {
                System.out.println("\n" + "You have chosen Fahrenheit");
                break;
            }

            case 3: {
                System.out.println("\n" + "You have chosen Kelvin");
                break;
            }

            case 4: {
                System.out.println("\n" + "You have chosen Rankin");
                break;
            }

            case 5: {
                System.out.println("\n" + "You have chosen Reaumur");
                break;
            }

            case 6: {
                System.out.println("\n" + "You have chosen Newton");
                break;
            }

            case 7: {
                System.out.println("\n" + "You have chosen Delisle");
                break;
            }

            case 8: {
                System.out.println("\n" + "You have chosen Leiden");
                break;
            }

            case 9: {
                System.out.println("\n" + "You have chosen Romer");
                break;
            }

            default: {
                System.out.println(ANSI_RED
                        + "\n" + "Not a valid choice!"
                        + ANSI_RESET);
                break;
            }

        }
//-----------------------------------------------------------------------Celsius to =>
        if (firstTempSystem == 1 && secondTempSystem == 2) {

            secondValueDegree = (firstValueDegree * 9 / 5) + 32;

        } else if (firstTempSystem == 1 && secondTempSystem == 3) {

            secondValueDegree = firstValueDegree + 273.15;

        } else if (firstTempSystem == 1 && secondTempSystem == 4) {

            secondValueDegree = firstValueDegree * 9 / 5 + 491.67;

        } else if (firstTempSystem == 1 && secondTempSystem == 5) {

            secondValueDegree = firstValueDegree * 4 / 5;

        } else if (firstTempSystem == 1 && secondTempSystem == 6) {

            secondValueDegree = firstValueDegree * 0.33;

        } else if (firstTempSystem == 1 && secondTempSystem == 7) {

            secondValueDegree = firstValueDegree * 1.5 - 100;

        } else if (firstTempSystem == 1 && secondTempSystem == 8) {

            secondValueDegree = firstValueDegree + 253;

        } else if (firstTempSystem == 1 && secondTempSystem == 9) {

            secondValueDegree = firstValueDegree * 21 / 40 +7.5;
//-----------------------------------------------------------------------Celsius to =>
//--------------------------------------------------------------------Fahrenheit to =>
        } else if (firstTempSystem == 2 && secondTempSystem == 1) {

            secondValueDegree = (firstValueDegree - 32) * 5 / 9;

        } else if (firstTempSystem == 2 && secondTempSystem == 3) {

            secondValueDegree = (firstValueDegree - 32) * 5 / 9 + 273.15;

        } else if (firstTempSystem == 2 && secondTempSystem == 4) {

            secondValueDegree = firstValueDegree + 459.67;

        } else if (firstTempSystem == 2 && secondTempSystem == 5) {

            secondValueDegree = (firstValueDegree - 32) * 4 / 9;

        } else if (firstTempSystem == 2 && secondTempSystem == 6) {

            secondValueDegree = (firstValueDegree - 32) * 0.18333;

        } else if (firstTempSystem == 2 && secondTempSystem == 7) {

            secondValueDegree = (firstValueDegree - 32) * 0.83333;

        } else if (firstTempSystem == 2 && secondTempSystem == 8) {

            secondValueDegree = (firstValueDegree / 1.8) + 235.222222;

        } else if (firstTempSystem == 2 && secondTempSystem == 9) {

            secondValueDegree = (firstValueDegree / 3.428571) - 1.833333;
//--------------------------------------------------------------------Fahrenheit to =>
//------------------------------------------------------------------------Kelvin to =>
        } else if (firstTempSystem == 3 && secondTempSystem == 1) {

            secondValueDegree = firstValueDegree - 273.15;

        } else if (firstTempSystem == 3 && secondTempSystem == 2) {

            secondValueDegree = (firstValueDegree * 1.8) - 459.67;

        } else if (firstTempSystem == 3 && secondTempSystem == 4) {

            secondValueDegree = firstValueDegree * 1.8;

        } else if (firstTempSystem == 3 && secondTempSystem == 5) {

            secondValueDegree = (firstValueDegree / 1.25) - 218.52;

        } else if (firstTempSystem == 3 && secondTempSystem == 6) {

            secondValueDegree = (firstValueDegree / 3.030303) - 90.1395;

        } else if (firstTempSystem == 3 && secondTempSystem == 7) {

            secondValueDegree = (firstValueDegree * -1.5) + 559.725;

        } else if (firstTempSystem == 3 && secondTempSystem == 8) {

            secondValueDegree = firstValueDegree - 20.15;

        } else if (firstTempSystem == 3 && secondTempSystem == 9) {

            secondValueDegree = (firstValueDegree / 1.904762) - 135.90375;
//------------------------------------------------------------------------Kelvin to =>
//------------------------------------------------------------------------Rankin to =>
        } else if (firstTempSystem == 4 && secondTempSystem == 1) {

            secondValueDegree = (firstValueDegree / 1.8) - 273.15;

        } else if (firstTempSystem == 4 && secondTempSystem == 2) {

            secondValueDegree = firstValueDegree - 459.67;

        } else if (firstTempSystem == 4 && secondTempSystem == 3) {

            secondValueDegree = firstValueDegree / 1.8;

        } else if (firstTempSystem == 4 && secondTempSystem == 5) {

            secondValueDegree = (firstValueDegree / 2.25) - 218.52;

        } else if (firstTempSystem == 4 && secondTempSystem == 6) {

            secondValueDegree = (firstValueDegree / 5.454545) - 90.1395;

        } else if (firstTempSystem == 4 && secondTempSystem == 7) {

            secondValueDegree = (firstValueDegree / 1.2) + 559.725;

        } else if (firstTempSystem == 4 && secondTempSystem == 8) {

            secondValueDegree = (firstValueDegree / 1.8) - 20.15;

        } else if (firstTempSystem == 4 && secondTempSystem == 9) {

            secondValueDegree = (firstValueDegree / 3.428571) - 135.90375;
//------------------------------------------------------------------------Rankin to =>
//-----------------------------------------------------------------------Reaumur to =>
        } else if (firstTempSystem == 5 && secondTempSystem == 1) {

            secondValueDegree = firstValueDegree * 1.25;

        } else if (firstTempSystem == 5 && secondTempSystem == 2) {

            secondValueDegree = (firstValueDegree * 2.25) + 32;

        } else if (firstTempSystem == 5 && secondTempSystem == 3) {

            secondValueDegree = (firstValueDegree * 1.25) + 273.15;

        } else if (firstTempSystem == 5 && secondTempSystem == 4) {

            secondValueDegree = (firstValueDegree * 2.25) + 491.67;

        } else if (firstTempSystem == 5 && secondTempSystem == 6) {

            secondValueDegree = firstValueDegree / 2.424242;

        } else if (firstTempSystem == 5 && secondTempSystem == 7) {

            secondValueDegree = (firstValueDegree * -1.875) + 150;

        } else if (firstTempSystem == 5 && secondTempSystem == 8) {

            secondValueDegree = (firstValueDegree * 1.25) + 253;

        } else if (firstTempSystem == 5 && secondTempSystem == 9) {

            secondValueDegree = (firstValueDegree / 1.52381) + 7.5;
//-----------------------------------------------------------------------Reaumur to =>
//------------------------------------------------------------------------Newton to =>
        } else if (firstTempSystem == 6 && secondTempSystem == 1) {

            secondValueDegree = (firstValueDegree * 1.25) + 253;

        } else if (firstTempSystem == 6 && secondTempSystem == 2) {

            secondValueDegree = (firstValueDegree * 1.25) + 253;

        } else if (firstTempSystem == 6 && secondTempSystem == 3) {

            secondValueDegree = (firstValueDegree * 1.25) + 253;

        } else if (firstTempSystem == 6 && secondTempSystem == 4) {

            secondValueDegree = (firstValueDegree * 1.25) + 253;

        } else if (firstTempSystem == 6 && secondTempSystem == 5) {

            secondValueDegree = (firstValueDegree * 1.25) + 253;

        } else if (firstTempSystem == 6 && secondTempSystem == 7) {

            secondValueDegree = (firstValueDegree * 1.25) + 253;

        } else if (firstTempSystem == 6 && secondTempSystem == 8) {

            secondValueDegree = (firstValueDegree * 1.25) + 253;

        } else if (firstTempSystem == 6 && secondTempSystem == 9) {

            secondValueDegree = (firstValueDegree / 1.52381) + 7.5;
//------------------------------------------------------------------------Newton to =>
//-----------------------------------------------------------------------Delisle to =>
        } else if (firstTempSystem == 7 && secondTempSystem == 1) {

            secondValueDegree = (firstValueDegree / -1.5) + 100;

        } else if (firstTempSystem == 7 && secondTempSystem == 2) {

            secondValueDegree = (firstValueDegree * -1.2) + 212;

        } else if (firstTempSystem == 7 && secondTempSystem == 3) {

            secondValueDegree = (firstValueDegree * -1.5) + 373.15;

        } else if (firstTempSystem == 7 && secondTempSystem == 4) {

            secondValueDegree = (firstValueDegree * -1.2) + 671.67;

        } else if (firstTempSystem == 7 && secondTempSystem == 5) {

            secondValueDegree = (firstValueDegree / -1.875) + 80;

        } else if (firstTempSystem == 7 && secondTempSystem == 6) {

            secondValueDegree = (firstValueDegree * -4.545455) + 33;

        } else if (firstTempSystem == 7 && secondTempSystem == 8) {

            secondValueDegree = (firstValueDegree / -1.5) + 353;

        } else if (firstTempSystem == 7 && secondTempSystem == 9) {

            secondValueDegree = (firstValueDegree / -2.857143) + 60;
//-----------------------------------------------------------------------Delisle to =>
//------------------------------------------------------------------------Leiden to =>
        } else if (firstTempSystem == 8 && secondTempSystem == 1) {

            secondValueDegree = firstValueDegree - 253;

        } else if (firstTempSystem == 8 && secondTempSystem == 2) {

            secondValueDegree = (firstValueDegree * 1.8) - 423.4;

        } else if (firstTempSystem == 8 && secondTempSystem == 3) {

            secondValueDegree = firstValueDegree + 20.15;

        } else if (firstTempSystem == 8 && secondTempSystem == 4) {

            secondValueDegree = (firstValueDegree * 1.8) + 36.27;

        } else if (firstTempSystem == 8 && secondTempSystem == 5) {

            secondValueDegree = (firstValueDegree / 1.25) - 202.4;

        } else if (firstTempSystem == 8 && secondTempSystem == 6) {

            secondValueDegree = (firstValueDegree / -1.5) + 353;

        } else if (firstTempSystem == 8 && secondTempSystem == 7) {

            secondValueDegree = (firstValueDegree / -1.5) + 529.5;

        } else if (firstTempSystem == 8 && secondTempSystem == 9) {

            secondValueDegree = (firstValueDegree / 1.904762) - 125.325;
//------------------------------------------------------------------------Leiden to =>
//-------------------------------------------------------------------------Romer to =>
        } else if (firstTempSystem == 9 && secondTempSystem == 1) {

            secondValueDegree = (firstValueDegree * 1.904762) - 14.285714;

        } else if (firstTempSystem == 9 && secondTempSystem == 2) {

            secondValueDegree = (firstValueDegree * 3.428571) + 6.285714;

        } else if (firstTempSystem == 9 && secondTempSystem == 3) {

            secondValueDegree = (firstValueDegree * 1.904762) + 258.864286;

        } else if (firstTempSystem == 9 && secondTempSystem == 4) {

            secondValueDegree = (firstValueDegree * 3.428571) + 465.955714;

        } else if (firstTempSystem == 9 && secondTempSystem == 5) {

            secondValueDegree = (firstValueDegree * 1.52381) - 11.428571;

        } else if (firstTempSystem == 9 && secondTempSystem == 6) {

            secondValueDegree = (firstValueDegree / 1.590909) - 4.714286;

        } else if (firstTempSystem == 9 && secondTempSystem == 7) {

            secondValueDegree = (firstValueDegree * -2.857143) + 171.428571;

        } else if (firstTempSystem == 9 && secondTempSystem == 8) {

            secondValueDegree = (firstValueDegree * 1.904762) + 238.714286;

        }

        System.out.println(ANSI_PURPLE
                + "\n" + "Result:" + secondValueDegree + "\n"
                + ANSI_RESET);

    }

}