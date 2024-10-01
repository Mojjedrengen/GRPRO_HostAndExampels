public class Student extends Person {
    private boolean sps;
    
    public Student(String name, int age, boolean sps) {
        super(name, age);
        this.sps = sps;
    }
    
    public boolean getSps() {
        return sps;
    }
        
    @Override public void display() {
        super.display();
        System.out.println(" [sps: " + sps + "]");
    }
}