public class Teacher extends Person {
    private String office;
    
    public Teacher(String name, int age, String office) {
        super(name, age);
        this.office = office;
    }
 
    public String getOffice() {
        return office;
    }
    
    @Override public void display() {
        super.display();
        System.out.println(" [office: " + office + "]");
    }
}