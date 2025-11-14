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

        Airplane plane3 = new Airplane();
        plane3.name = "john";
        plane3.model = "Boeing 737";
        plane3.isTwoTier = false;
        plane3.capacity = 400;
        plane3.length = 70;
        System.out.println(plane3.name + " " +  plane3.length + plane3.model + plane3.isTwoTier + plane3.capacity);
        System.out.println();

        Airplane plane4 = new Airplane();
        System.out.println(plane4.name  + " " + plane4.model + plane4.isTwoTier + plane4.capacity + plane4.length);

        Airplane plane5 = new Airplane(300);
        System.out.println(plane5.capacity);
    }

    public void factoryInfo(){
        System.out.println(factoryName + " est. " + year_founded);
        System.out.println(isOpen);
        }

}
