class Nurse extends HourlyEmployee {
    Nurse (String nm, double w) { super(nm, w); }
    void display() {
        System.out.println("Name: "+name+"\tHours: "+hours +"\tRate: "+rate);
    }
}