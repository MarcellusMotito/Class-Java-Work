public class nestedifexample {
    public static void main(String[] args) {
        boolean studied = false;
        boolean wellrested = true;
        if (wellrested){
            System.out.println("Bestof luck today!");
            if (studied){
                System.out.println("You are prepared for the exams!");
            }
        } else {
            System.out.println("Study before your exams");
        }
    }
    
}
