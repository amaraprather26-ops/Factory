public class Classroom {
    public int roomNumber;
    public String teacher;
    public boolean oneTable;

    public static void main(String[] args) {
        System.out.println("My Classroom");
        Classroom();
    }

    public Classroom(){
        roomNumber = 300;
        teacher = "Mm. Huuge";
        oneTable = false;

    }

    public Classroom(int pRoomNumber, String pTeacherName, boolean poneTable){
        roomNumber = pRoomNumber;
        teacher = pTeacherName;
        oneTable = poneTable;
        printInfo();
    }

    public void printInfo(){
        System.out.println(roomNumber + teacher + oneTable);
    }
}
