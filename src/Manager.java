class Manager extends UCHealthEmployee {
    double monthlysalary;

    Manager () { super(""); }

    Manager(String nm, double w)  { super(nm);
        monthlysalary = w; }

    void setSalary(double salary) { monthlysalary = salary; }

    double computePay()           { return monthlysalary; }

    void display() {
        System.out.println("Name: "+name+"\tMonthly Salary: "+ monthlysalary);
    }
}