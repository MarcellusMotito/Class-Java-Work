public class ifelseifExample {
    public static void main(String[] args) {
        int testscore =44 ;
        String grade;
        if(testscore>=90){
            grade ="A";
        } else if (testscore>=70){
            grade="B";
        } else if(testscore>=60){
            grade="C";
        } else if (testscore>=50){
            grade="D";
        } else if(testscore>=40){
            grade="E";
        } else {
            grade="F";
        }
        System.out.println("Your grade for this test is = " + grade);

    }
}