public class Student {
    static String name = "John";
    static String classes = "C02";

    Student() {
    }

    public static void setName(String name1) {
        name = name1;
    }

    public static void setClasses(String classes1) {
        classes = classes1;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
