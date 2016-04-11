class PhysicianAssistant extends HourlyEmployee {
    double perPatientRate;
    double PatientsSeen;

    PhysicianAssistant (String nm, double p) {
        super(nm);
        perPatientRate = p;
    }

    void setPatientRate(double ptrate) { perPatientRate = ptrate; }

    void setPatients(double patients) { PatientsSeen = patients; }

    double computePay() { return perPatientRate*PatientsSeen; }

    void display() {
        System.out.println("Name: "+name+"\tperPatientRate: "+perPatientRate +"\tPatientSeen: "+PatientsSeen);
    }
}