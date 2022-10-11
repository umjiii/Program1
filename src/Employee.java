public abstract class Employee {
    protected String name;
    protected double salary;
    protected double cash;

    //default constructor
  public Employee() {}

    String getName(Employee theEmp)
    {
        return name;
    }

    double getSalary(Employee theEmp)
    {
        return salary;
    }

    double getCash(Employee theEmp)
    {
        return cash;
    }

    //employee's cash goes up by one paycheck ($1000)
    void getPaid()
    {
        this.cash = cash + 3000;
    }

    //Take double raise as percentage and increase salary by this amount
    public abstract void giveRaise(double raise);

}
