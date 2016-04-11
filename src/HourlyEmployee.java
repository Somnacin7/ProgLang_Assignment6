

class HourlyEmployee extends UCHealthEmployee {
    double rate;
    double hours;

    HourlyEmployee(String nm) { super(nm); }
    HourlyEmployee(String nm, double r) { super(nm);
        rate = r; }
    void setRate(double r)    { rate  = r; }
    void setHours(double hrs) { hours = hrs; }
    double computePay()       { return rate*hours; }
}