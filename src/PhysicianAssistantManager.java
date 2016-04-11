class PhysicianAssistantManager extends PhysicianAssistant implements ManagerInterface {
    double monthlysalary;

    PhysicianAssistantManager(String nm, double w) {
        super(nm, w);
    }

    public double managerComputePay() {
        return monthlysalary;
    }

    /*Pay is computed by adding the result of computingPay as though the employee is of type PhysicianAssistant, to the result of computingPay as though the employee is of type Manager.*/
    double computePay() {
        System.out.println("PhysicianAssistantManager: " + name + " " + super.computePay() + managerComputePay());
        return super.computePay() + managerComputePay();
    }

    void setSalary(double s) {
        monthlysalary = s;
    }

    public void managerDisplay() {
        System.out.println("Name: " + name + "\tMonthly Salary: " + monthlysalary);
    }

    void display() {
        super.display();
        managerDisplay();
    }
}