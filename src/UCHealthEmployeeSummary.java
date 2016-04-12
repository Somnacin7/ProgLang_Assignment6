import java.util.ArrayList;
import java.util.stream.Collectors;

public class UCHealthEmployeeSummary {

    private ArrayList<UCHealthEmployee> employees;

    public UCHealthEmployeeSummary() {
        employees = new ArrayList<>();
    }

    public void enqueue(UCHealthEmployee e) {
        employees.add(e);
    }

    public UCHealthEmployee find(String name) {
        for (UCHealthEmployee e : employees) {
            if (e.name.equals(name))
                return e;
        }
        return null;
    }

    public void setHours(String name, double hours) {
        employees.stream().filter(e -> e.name.equals(name))
                .forEach(e -> e.setHours(hours));
    }

    public void setSalary(String name, double salary) {
        employees.stream().filter(e -> e.name.equals(name))
                .forEach(e -> e.setSalary(salary));
    }

    public void setPatients(String name, double patients) {
        employees.stream().filter(e -> e.name.equals(name))
                .forEach(e -> e.setPatients(patients));
    }

    public double payroll() {
        return employees.stream().mapToDouble(UCHealthEmployee::computePay).sum();
    }

    public void display() {
        employees.stream().forEachOrdered(e -> e.display());
    }

}