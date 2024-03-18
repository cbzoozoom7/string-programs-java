import java.util.*;

public class StringProgramsTester
{

    public static void main(String[] args)
    {

    	//make a new instance of StringPrograms.java
    	StringPrograms test = new StringPrograms();


    	Scanner scan = new Scanner(System.in);

    	System.out.println("*****Main Menu*****");





    	System.out.println("Problem 1-makeAbba");
    	System.out.println("Problem 2-firstHalf");
    	System.out.println("Problem 3-left2");
    	System.out.println("Problem 4-lastTwo");
    	System.out.println("Problem 5-makeTags");
    	System.out.println("Problem 6-buildBackwards");
    	System.out.println("Problem 7-onlyVowels");
    	System.out.println("Problem 8-onlyConsonants");
    	System.out.println("Problem 9-isPalidrome");
    	System.out.println("Problem 10-countVowelsInString");
    	System.out.println("Problem 11-countTotalVowel");
    	System.out.println("Problem 12- Sorting Word Extra Credit*****");
    	System.out.println("Problem 13-getFirstAndLastName\n");


		System.out.println("Enter in a selection");
    	int choice = scan.nextInt();




    	if (choice==1)
    	{
    		System.out.println("Running Problem 1-makeAbba");
    		System.out.println(test.makeAbba("Hi", "Bye"));
    		System.out.println(test.makeAbba("Yo", "Alice"));
    		System.out.println(test.makeAbba("What", "Up"));

    	}
    	else if (choice==2)
    	{
    		System.out.println("Running Problem 2-firstHalf");
    		System.out.println(test.firstHalf("WooHoo"));
    		System.out.println(test.firstHalf("HelloThere"));
    		System.out.println(test.firstHalf("abcdef"));

    	}
    	else if (choice==3)
    	{
    		System.out.println("Running Problem 3-left2");
    		System.out.println(test.left2("Hello"));
    		System.out.println(test.left2("java"));
    		System.out.println(test.left2("Hi"));

    	}
    	else if (choice==4)
    	{
    		System.out.println("Running Problem 4-lastTwo");
    		System.out.println(test.lastTwo("coding"));
    		System.out.println(test.lastTwo("cat"));
    		System.out.println(test.lastTwo("ab"));

    	}
    	else if (choice==5)
    	{
    		System.out.println("Running Problem 5- makeTags");
    		System.out.println(test.makeTags("i", "Yay"));
    		System.out.println(test.makeTags("i", "Hello"));
    		System.out.println(test.makeTags("cite", "Yay"));

    	}

    	else if (choice==6)
    	{
    		System.out.println("Running Problem 6- buildBackwards");
    		System.out.println(test.buildBackwards("abcdefghijklmnopqrstuvwxyz"));
    		System.out.println(test.buildBackwards("cat"));
    		System.out.println(test.buildBackwards("whooohoo"));

    	}



    	else if (choice==7)
    	{
    		System.out.println("Running Problem 7- onlyVowels");
    		System.out.println(test.onlyVowels("sequoia"));
    		System.out.println(test.onlyVowels("bookie"));
    		System.out.println(test.onlyVowels("roadie"));

    	}
		else if (choice==8)
    	{
    		System.out.println("Running Problem 8- onlyConsonantsBackwards");
    		System.out.println(test.onlyConsonantsBackwards("gyms"));
    		System.out.println(test.onlyConsonantsBackwards("bellwether"));
    		System.out.println(test.onlyConsonantsBackwards("accoutrements"));

    	}
		else if (choice==9)
    	{
    		System.out.println("Running Problem 9- isPalidrome");
    		System.out.println(test.isPalidrome("madam"));
    		System.out.println(test.isPalidrome("solos"));
    		System.out.println(test.isPalidrome("hello"));

    	}
		else if (choice==10)
    	{
    		System.out.println("Running Problem 10- countVowelsInString");
    		System.out.println(test.countVowelsInString("madam"));
    		System.out.println(test.countVowelsInString("solos dog"));
    		System.out.println(test.countVowelsInString("hello there"));

    	}
		else if (choice==11)
    	{
    		System.out.println("Running Problem 11- countTotalVowels-ArrayList");

    		ArrayList<String> myWords = new ArrayList<String>();

    		myWords.add("madam");
    		myWords.add("solos");
    		myWords.add("hello");

    		System.out.println(test.countTotalVowels(myWords));






    	}
    	else if (choice==12)
    	{
    		System.out.println("Running Problem 12- Sorting Word");

    		String[] w = {"zebra" , "tall", "music", "apple", "cat", "catipilar"};





    		String[] result = test.sortWords(w);

    		for (int i=0; i < result.length; i++)
    		{

    			System.out.println(result[i]);
    		}

    	}

    	else if (choice==13)
    	{
    		System.out.println("Running Problem 13- getFirstAndLastName");
    		test.getFirstAndLastName("Blake Fall");
    		test.getFirstAndLastName("Jacob Medel");
    		test.getFirstAndLastName("Carlie Dodd");

    	}


























    }
}
