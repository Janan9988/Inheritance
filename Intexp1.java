class SingleInheritance{
    long salary = 40000;

}
class B extends SingleInheritance{
int bonus = 2000;
}

class Intexp1{
public static void main (String []args){
    B b = new B();
    System.out.println("The long value out put is :"+ b.salary);
    System.out.println("The value of int is :"+b.bonus);

}
}