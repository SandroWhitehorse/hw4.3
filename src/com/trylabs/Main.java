package com.trylabs;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	int marks[]=new int[18];
	Random random=new Random();
	int sum1_6=0;//результат по обязательной программе
	int sum7_12=0;//результат по дополнительной программе
	int sum13_18=0;//результат по свободной программе
	for (int i=0; i<marks.length; i++ ){
	    marks[i]=random.nextInt(10);
        if (i<6) sum1_6= sum1_6 + marks[i];
        if ((i>=6)&&(i<12)) sum7_12 =sum7_12 + marks[i];
        else sum13_18 = sum13_18+marks[i];
        }

        if (sum1_6>sum7_12&&sum1_6>sum13_18) System.out.println("в обязательной программе спрортсмен достиг лучших результатов");

		if (sum7_12>sum13_18&&sum7_12>sum1_6) System.out.println("в дополнительной программе спортсмен достиг лучших результатов ");
		if (sum13_18>sum1_6&&sum13_18>sum7_12) System.out.println("в Свободной программе спортсмен достиг лучших результатов");

		if (sum7_12==sum13_18&&sum7_12==sum1_6)
			System.out.println(" спортсмен одинаково хорош во всех программах");
		if (sum1_6==sum7_12)
			System.out.println("Спортсмен одинаково хорош в обязательной и дополнительной программах ");
		if (sum1_6==sum13_18)
			System.out.println("спортсмен одинаково хорош в обязательной и свободной программе");
		if (sum7_12==sum13_18) System.out.println("спортсмен одинаково хорош в дополнительной и свободной программе");
    }

	}


