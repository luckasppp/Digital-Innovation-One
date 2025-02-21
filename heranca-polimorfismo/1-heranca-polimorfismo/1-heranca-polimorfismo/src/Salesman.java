public /*non-sealed*/ class Salesman extends Employee {
    private double comission;
    private double salary;

    public Salesman() {
    }

    public Salesman(String code, String name, String address, int age, double salary, double comission) {
        super(code, name, address, age, salary);
        this.comission = comission;
    }

    @Override
    public String getCode() {
        return "S" + super.getCode();
    }

    public double getComission() {
        return comission;
    }
    public void setComission(double comission) {
        this.comission = comission;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
