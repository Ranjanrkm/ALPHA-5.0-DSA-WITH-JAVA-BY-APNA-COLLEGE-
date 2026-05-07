public class charAt1 {

    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String firstName = "Ranjan";
        String lastName = "Mahato";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        printLetters(fullName);
    }
    
}
