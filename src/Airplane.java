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

    public Airplane(int pCapacity){
        name = "Jeph";
        capacity = pCapacity;
        isTwoTier = false;
        length = 50;
        model = "Boeing 747";
    }

    public void printInfo(){
        System.out.println(name+ " " +model+ " " +capacity+ " " +length+ " " +isTwoTier);
    }
}
