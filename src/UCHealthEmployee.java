abstract class UCHealthEmployee {
    String name;

    UCHealthEmployee() {}
    UCHealthEmployee (String nm) { name = nm; }
    abstract double computePay();
    void display () {}
    void setHours(double hrs) {}
    void setPatients(double patients) {}
    void setSalary(double salary) { System.out.println("NO!"); }
}