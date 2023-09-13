 class Animals {
 void bark(){
    System.out.println("The dog is barking");
 }
}
class Dog extends Animals
{
    void sound(){
        System.out.println("The Dog Sound is Midiyum");
    }
}
class Babydog extends Dog{
    void weep (){
        System.out.println("The dog was low ");
    }

}

public class Intexp4{
    public static void main(String []args){

    
    Babydog b = new Babydog();
    b.bark();
    b.weep();
    b.sound();

    }
}