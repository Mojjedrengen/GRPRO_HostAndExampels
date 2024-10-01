class Demo01oct {
    static void test() {
        University uni = new University();
        uni.addPerson(new Student("Bo", 19, false));
        uni.addPerson(new Student("Ea", 20, false));
        uni.addPerson(new Student("Ib", 21, true));
        uni.addPerson(new Teacher("Claus", 51, "EHK@4F10"));
        uni.show();
    }
}