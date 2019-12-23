package ReferenceType;

import java.util.Arrays;
import java.util.Scanner;

public class test_191220 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int sum = 0;
        Scanner sc=new Scanner(System.in);		// 키보드 입력 받는 값

        
    	for(int i=0; i<score.length; i++)
    	{
    		System.out.println("점수를 입력하세요");
    		score[i]=sc.nextInt();
    	}
        
    	for(int i=0; i<score.length; i++) {     	
    	sum=sum+score[i];
    	}
    	System.out.println("합계점수입니다.");
    	System.out.println(sum);
        System.out.println("평균성적입니다.");
        System.out.println(sum/score.length);
    }
}