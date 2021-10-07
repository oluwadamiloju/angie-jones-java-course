package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {
//        Person person = new Person();
        Employee employee = new Employee();
//        person.getAge();
        employee.getAge(); //employee has access to member of person class because it inherits from person
    }
}
