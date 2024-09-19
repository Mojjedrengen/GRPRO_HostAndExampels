public class sep19 
{
    public static void main(String[] args)
    {
        
    }
    
    public static void AccountTest() {
        Account account = new Account();
        
        account.deposit(-100f);
        System.out.println(account.getBalance());
        account.deposit(1000f);
        System.out.println(account.getBalance());
        account.withdraw(100f);
        System.out.println(account.getBalance());
        account.withdraw(-300f);
        System.out.println(account.getBalance());
    }
    
    public static void studentTest() {
        Student student = new Student("Børge", 35);
        student.display();
        student.birthday();
        student.display();
    }
    
    public static void courseTest() {
        Course course = new Course();
        
        course.addStudent(new Student("Jens Jensen", 20));
        course.addStudent(new Student("Børge Bo Larsen", 19));
        course.addStudent(new Student("Ib Ibsen", 20));
        
        course.showStudents();
    }
}


