import java.util.ArrayList;

public class UCHealthEmployeeSummary {

    private ArrayList<UCHealthEmployee> employees;

    public UCHealthEmployeeSummary() {
        employees = new ArrayList<>();
    }

    public void enqueue(UCHealthEmployee e) {
        employees.add(e);
    }

    public UCHealthEmployee find(String name) {
        return employees.stream().filter(e -> e.name.equals(name)).findFirst().orElse(null);
    }

    public void setHours(String name, double hours) {
        find(name).setHours(hours);
    }

    public void setSalary(String name, double salary) {
        find(name).setHours(salary);
    }

    public void setPatients(String name, double patients) {
        find(name).setHours(patients);
    }

    public double payroll() {
        return employees.stream().mapToDouble(UCHealthEmployee::computePay).sum();
    }

    public void display() {
        employees.stream().forEachOrdered(e -> e.display());
    }

}