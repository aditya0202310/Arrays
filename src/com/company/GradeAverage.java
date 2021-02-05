package com.company;

public class GradeAverage {
    private static int scores [];

    public GradeAverage(int [] s){
        scores = s;
    }
    public double mean(int first, int last){
        double sum = 0;
        for(int i = first; i < last; i++){
            sum = sum + scores[i];
        }
        return sum/scores.length;
    }
    public boolean showsImprovement(){
        double sum = 0;
        for(int i = 0; i < scores.length - 1; i++){
            if(scores[i] <= scores[i+1]){
                return true;
            }
        }
        return false;
    }
    public double finalGrade(){
          double sum = 0;
        if(this.showsImprovement()){

            for(int i = scores.length/2; i < scores.length; i++){
                sum = sum + scores[i];

            }
        }
        return sum/ ;
    }

    public static void main(String[] args) {
        int s1 [] = {20, 50, 50, 70, 80};
        int s2 [] = {20, 50, 50, 30, 90};
        int s3 [] = {20,50,50,85};
        GradeAverage sr1 = new GradeAverage(s1);
        System.out.println(sr1.mean(0,scores.length));
        System.out.println(sr1.showsImprovement());
        System.out.println(sr1.finalGrade());
//        GradeAverage sr2 = new GradeAverage(s2);
//        System.out.println(sr2.mean(0, scores.length));
//        System.out.println(sr2.showsImprovement());
//        System.out.println(sr2.finalGrade());
//        GradeAverage sr3 = new GradeAverage(s3);
//        System.out.println(sr3.mean(0, scores.length));
//        System.out.println(sr3.showsImprovement());
//        System.out.println(sr3.finalGrade());
    }

}
