 class Employee {
    int salary;
    public Employee(int salary){
        this.salary =salary;
    }
 public void work (){
    System.out.println("The Employee is working as the clerk");

 }
 public int getSalary(){
    return salary;
 }  
}
class HR_manager extends Employee{
     
    public HR_manager(int salary){
    super(salary);
    }
    public void work(){
        System.out.println("The Hr manager is working in company:");
    }
    public void addEmployee(){
        System.out.println("The Adding a new Employee to the Company");

    }
}
public class Intexp5{
    public static void main (String []args){
        Employee e= new Employee(50000);
        HR_manager h = new HR_manager(70000);
        e.work();
        System.out.println("Employee salary is "+e.getSalary());
        h.work();
        System.out.println("HRmanager salary is "+h.getSalary());
        h.addEmployee();
    }
}