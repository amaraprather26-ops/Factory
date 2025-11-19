public class Airplane {
    public int capacity;
    public String name;
    public String model;
    public boolean isTwoTier;
    public int length;
    //default constructor- exists by default even if not written out
    public Airplane(){
        name = "Jeph";
        capacity = 262;
        isTwoTier = false;
        length = 50;
        model = "Boeing 747";
    }

    public Airplane(int pCapacity, String pName, String pmodel, int plength, boolean pdoubledecker){
        name = pName;
        //must be in container value order
        capacity = pCapacity;
        isTwoTier = pdoubledecker;
        length = plength;
        model = pmodel;
    }

    public void printInfo(){
        System.out.println(name + " " +model+ " " +capacity+ " " +length+ " " +isTwoTier);
        //to add readability add "words" that state the variable name that the variable print value matches
    }

}
