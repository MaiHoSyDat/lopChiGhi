public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student.setName("abc");
        Student.setClasses("C03");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }

}
