public class SoftwareEngineer extends Employee {

    //constructor
    SoftwareEngineer(String theName, double theSalary)
    {
        name = theName;
        salary = theSalary;
        cash = 0;
    }

    public void giveRaise(double raise) {
        this.salary = salary * (1 + raise*0.01);
    }
}
