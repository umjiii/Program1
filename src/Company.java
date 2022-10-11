import java.util.*;

public class Company {

    static Scanner kb = new Scanner(System.in);
    static String option;

    public static void mainMenu()
    {
        System.out.println("""
                What do you want to do?
                \ta.\tAdd an Employee
                \tb.\tList all Employees
                \tc.\tGive an Employee a raise
                \td.\tGive Paychecks
                \te.\tChange someone's hours
                \tf.\tQuit""");
        option = kb.nextLine();
    }


    public static void main (String[] args)
    {
        mainMenu();

        //operation variables
        int hoursWorking;
        double salary;
        boolean hourlyStatus;
        String name;
        String answer;

        //initialize employee arrays
        ArrayList<Employee> employees = new ArrayList<>(5);
        ArrayList<Employee> hourly = new ArrayList<>(5);

        //loop through user inputs, process option they select
        // while (true) {
            switch (option) {
                case "a":
                    if (employees.get(4) == null) //OutOfBounds exception, since there is nothing at index = 4. Trying to work out way to find minimum index where employees.get(i) = null, allowing us to fill it.
                    {
                        System.out.println("What is their name?");
                        name = kb.nextLine();
                        System.out.println("What is their salary (yearly or hourly)?");
                        salary = kb.nextDouble();
                        System.out.println("Are they an hourly worker? (Y/N)");
                        answer = kb.nextLine();

                        //input validation
                        while (!answer.equalsIgnoreCase("N") || !answer.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Invalid response. Please answer with \"Y\" or \"N\":");
                            answer = kb.nextLine();
                        }

                        //set employee to hourly or not
                        if (answer.equalsIgnoreCase("Y")) {
                            hourlyStatus = true;
                            System.out.println("How many hours per week do they work?");
                            hoursWorking = kb.nextInt();
                            AdministrativeAssistant newEmp = new AdministrativeAssistant(name, salary, hoursWorking);
                            employees.add(newEmp);
                            hourly.add(newEmp);
                        }
                        else if (answer.equalsIgnoreCase("N"))
                        {
                            hourlyStatus = false;
                            SoftwareEngineer newEmp = new SoftwareEngineer(name, salary);
                            employees.add(newEmp);
                        }
                        mainMenu();
                        option = kb.nextLine();
                        break;
                    }
                    else
                    {
                        System.out.println("The maximum number of employees has been reached. Please choose a different option.");
                        mainMenu();
                        option = kb.nextLine();
                        break;
                    }
            }
       // }





    }
}
