 class Animals  {
    public void makesound(){
        System.out.println("The dog make sound howw howw");

    }
    
}
class Child extends Animals
{
    public void makesound(){
        System.out.println("The dog some time sit quite");
    }
}
class Intexp2
{
    public static void main (String[]args){
        Child c;
        Animals a;
        c = new Child();
        c.makesound();
        a = new Animals();
        a.makesound();

    }
}