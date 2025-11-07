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

    /*constructor; special type of method
    has the same name as the class
    doesn't have void
     */
    public Factory(){
        factoryInfo();
        String manager = "Mx. Bradford";
        //not an instance variable-- reg, can be used in this constructor only

    }

    public void factoryInfo(){
        System.out.println(factoryName + " est. " + year_founded);
        System.out.println(isOpen);
        }

}
