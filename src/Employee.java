public class Employee {
    String name;
    String lastname;
    int id;
    double salary;
    public Employee(String name, String lastname,int id,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayInfo(){
        System.out.println("Employee Id:"+ id);
        System.out.println("Employee Name:" + name);
        System.out.println("Employee LastName:" + lastname);
        System.out.println("Salary:" + salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ","abcd",101 , 50000.0);
        emp1.displayInfo();
    }
}
