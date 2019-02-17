public class Artsfaculty {
    private String admissionnumber;
    private String fullName;
    private String course;

    public static String congratulationmessage( String fullName, String course, int admissionnumber ){
        return " congratulations, " + fullName + " you have just been admitted for: " + course + " your admission number is: " + admissionnumber;


    }

    public static void main(String[] args) {
    System.out.println(congratulationmessage("Tobiloba Moses", "Foreign languages", 14257698));
        System.out.println(congratulationmessage("Ayobami Demilade", "philosophy", 154257458));
    }

}
