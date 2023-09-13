class Bike {
    public void drive (){
        System.out.println("The Str 'RPM' is 2000 and it goies until the 8000 to 9000 'RPM' ");

    }
    
}
class Ktm_Adv extends Bike
{
    public void drive(){
        System.out.println("This bike also maintain the same 'RPM' But KTM Adventure is help full for adv activies");
    }
}
public class Intexp3{
    public static void  main (String args[]){
       /*  Bike b;
        Ktm_Adv k;
        b = new Bike();
        k = new Ktm_Adv();*/
        Bike b = new Bike();
        Ktm_Adv k = new Ktm_Adv();
        b.drive();
        k.drive();
    }
}