public class Classroom {
    public int roomNumber;
    public String teacher;
    public boolean oneTable;

    public Classroom(){
        roomNumber = 300;
        teacher = "Mm. Huuge";
        oneTable = false;
        printInfo();

    }

    public Classroom(int pRoomNumber, String pTeacherName, boolean poneTable){
        roomNumber = pRoomNumber;
        teacher = pTeacherName;
        oneTable = poneTable;
        printInfo();
    }

    public void printInfo(){
        System.out.println(teacher + "'s room is room number " + roomNumber + ". It has a harkness table is " + oneTable);
    }
}
