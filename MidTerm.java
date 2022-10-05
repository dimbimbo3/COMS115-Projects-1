import java.util.StringTokenizer;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class MidTerm {
    private String grades;
    private final int sIndex = 0;
    private final int cIndex = 1;
    private final int gIndex = 2;
    private StringTokenizer tokenizer;
    private ArrayList<String> gradeArray;
    
    //Constructor, creates ArrayList gradeArray from the Tokens of grades
    public MidTerm(String s){
        grades = s;
        tokenizer = new StringTokenizer(grades, ",");
        gradeArray = new ArrayList();
        while(tokenizer.hasMoreTokens()){
            gradeArray.add(tokenizer.nextToken());
        }
    }
    
    //Returns gradeArray element sIndex, 0, which is the Student ID
    public String getStuID(){
        String student = gradeArray.get(sIndex);
        
        return student;
    }
    
    //Returns gradeArray element cIndex, 1, which is the Course ID
    public String getCorID(){
        String course = gradeArray.get(cIndex);
        
        return course;
    }
    
    //Loops through gradeArray from gIndex, 2, to determine the score total, the
    //lowest score to drop, the number of scores - 1 and the final score average
    public double getScore(){
        double total = 0;
        double lowest = 0;
        double avgScore = 0;
        double numOfScores = 0;
        
        total += Integer.parseInt(gradeArray.get(gIndex));
        lowest = Integer.parseInt(gradeArray.get(gIndex));
        for(int i = gIndex + 1; i < gradeArray.size(); i++){
            total += Integer.parseInt(gradeArray.get(i));
            if(Integer.parseInt(gradeArray.get(i)) < lowest)
                lowest = Integer.parseInt(gradeArray.get(i));
            numOfScores++;
        }
        
        total -= lowest;
        
        avgScore = total / numOfScores;
        
        return avgScore;
    }
    
    //Checks getScore() to determine the letter grade
    public String getGrade(){
        String grade = "";
        
        if(getScore() >= 89.50 && getScore() <= 100)
            grade = "A";
        else if(getScore() >= 86.50 && getScore() < 89.50)
            grade = "B+";
        else if(getScore() >= 79.50 && getScore() < 86.50)
            grade = "B";
        else if(getScore() >= 76.50 && getScore() < 79.50)
            grade = "C+";
        else if(getScore() >= 69.50 && getScore() < 76.50)
            grade = "C";
        else if(getScore() >= 59.50 && getScore() < 69.50)
            grade = "D";
        else if(getScore() >= 0 && getScore() < 59.50)
            grade = "F";
        
        return grade;
    }
    
    //Outputs all required information formatted into columns as a string
    public String toString(){
        String s = "";
        DecimalFormat formatter = new DecimalFormat("#.00");
        
        s = "[Student ID: " + getStuID() + "] ";
        s += "[Course ID: " + getCorID() + "] ";
        s += "[Final score: " + formatter.format(getScore()) + "] ";
        s += "[Student ID: " + getGrade() + "] ";
        
        return s;
    }
}