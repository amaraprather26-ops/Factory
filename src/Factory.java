public class Factory {

    //instance variables
    public int year_founded = 1798;
    public String factoryName = "Airplane Factory";
    public boolean isOpen = true;

    //scope is the whole class; can use the variables above anywhere


    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("Welcome to Amara's factory");
        new Factory(); // calls the constructor facory and makes a new one
        //only sout and constructor should be in psvm
    }

    /* constructor; special type of method
    has the same name as the class
    doesn't have void
     */
    public Factory(){
        factoryInfo();
        //not an instance variable-- reg, can be used in this constructor only
        String manager = "Amara";
        //object of type airplane
        Airplane plane1 = new Airplane();//calls airplane class/constructor
        System.out.println(plane1.name);

        Airplane plane2 = new Airplane();
        System.out.println(plane2.capacity);
    }

    public void factoryInfo(){
        System.out.println(factoryName + " est. " + year_founded);
        System.out.println(isOpen);
        }

}
