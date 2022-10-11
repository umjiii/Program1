public class AdministrativeAssistant extends Employee implements Hourly{

    int workHours;

    //constructor
    AdministrativeAssistant(String theName, double theSalary, int hours)
    {
        this.name = theName;
        this.salary = theSalary;
        this.workHours = hours;
    }

    public int getHoursWorked()
    {
        return this.workHours;
    }

    public int setHours(int hours)
    {
        this.workHours = hours;
        return hours;
    }

    @Override
    public void giveRaise(double raise) {
        this.salary += raise;
    }

    @Override
    void getPaid()
    {
        this.cash += salary * workHours;
    }
}
