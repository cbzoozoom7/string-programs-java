import java.util.*;

public class StringPrograms
{

	//Problem 1 - makeAbba

	//Given two strings, a and b, return the result of putting them together in the order abba,
	//e.g. "Hi" and "Bye" returns "HiByeByeHi".

	//makeAbba("Hi", "Bye") ? "HiByeByeHi"
	//makeAbba("Yo", "Alice") ? "YoAliceAliceYo"
	//makeAbba("What", "Up") ? "WhatUpUpWhat"

	public String makeAbba(String a, String b)
	{

		return a+b+b+a;
	}


	//Problem 2	- firstHalf

		//Given a string of even length, return the first half.
		//So the string "WooHoo" yields "Woo".

		//firstHalf("WooHoo") ? "Woo"
		//firstHalf("HelloThere") ? "Hello"
		//firstHalf("abcdef") ? "abc"

		public String firstHalf(String str)
		{
			return str.substring(0,str.length()/2);
		}

		//Problem 3	- left2

		//Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
		//The string length will be at least 2.

		//left2("Hello") ? "lloHe"
		//left2("java") ? "vaja"
		//left2("Hi") ? "Hi"

		public String left2(String str)
		{

			//if the length <= 2 return the string else

			//string firstTwo = str.substring(0,3)
			//string rest = str.substring(3)
			if (str.length() <= 2) {
				return str;
			} else {
				return str.substring(3) + str.substring(0,3);
			}

		}


		//Problem 4- lastTwo

		//Given a string of any length, return a new string where the last 2 chars,
		//if present, are swapped, so "coding" yields "codign".

		//lastTwo("coding") ? "codign"
		//lastTwo("cat") ? "cta"
		//lastTwo("ab") ? "ba"



		public String lastTwo(String str)
		{
	  		return str.substring(0,str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2,str.length()-1);
		}


		//Problem 5- makeTags


		//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
		//In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
		//Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

		//makeTags("i", "Yay") ? "<i>Yay</i>"
		//makeTags("i", "Hello") ? "<i>Hello</i>"
		//makeTags("cite", "Yay") ? "<cite>Yay</cite>"



		public String makeTags(String tag, String word)
		{
			return "<" + tag + ">" + word + "</" + tag + ">";

		}

		//Problem 6- buildBackwards

		//Given a string word, return a string that displays the original
		//string backwards


		//buildBackwards("abcdefghijklmnopqrstuvwxyz") ? "zyxvutsrqponmlkjihgfedcbc"
		//buildBackwards("cat"); ? tac
		//buildBackwards("whooohoo"); ? "oohooohw"



		public String buildBackwards(String word)
		{
			String tmp = "";
			for (int a = word.length()-1; a > 0; a--) {
				tmp = tmp + word.substring(a-1,a);
			}
			return tmp;
		}

		//Problem 7- onlyVowels

		//Given a string word, return a string that only contains the vowels in the
		//original string. MUST USE A FOR LOOP

		//onlyVowels("sequoia") ? "euoia"
		//onlyVowels("bookie"); ? "ooie"
		//onlyVowels("roadie") ? "oaie"



		public String onlyVowels(String word)
		{
			String tmp = "";
			for (int a = 0; a < word.length(); a++) {
				if (word.substring(a,a+1).equalsIgnoreCase("a") || word.substring(a,a+1).equalsIgnoreCase("e") || word.substring(a,a+1).equalsIgnoreCase("i") || word.substring(a,a+1).equalsIgnoreCase("o") || word.substring(a,a+1).equalsIgnoreCase("u")) {
					tmp = tmp+word.substring(a,a+1);
				}
			}
			return tmp;
		}


		//Problem 8- onlyConsonantsBackwards

		//Given a string word, return a string that only contains the consonants in the
		//original string backwards. MUST USE A FOR LOOP

		//onlyConsonantsBackwards("gyms") ? smyg""
		//onlyConsonantsBackwards("bellwether"); ? "rhtwllb"
		//onlyConsonantsBackwards("accoutrements") ? "stnmrtcc"



		public String onlyConsonantsBackwards(String word)
		{
			String tmp = "";
			for (int a = word.length(); a > 0; a--) {
				if (!word.substring(a-1,a).equalsIgnoreCase("a") && !word.substring(a-1,a).equalsIgnoreCase("e") && !word.substring(a-1,a).equalsIgnoreCase("i") && !word.substring(a-1,a).equalsIgnoreCase("o") && !word.substring(a-1,a).equalsIgnoreCase("u")) {
					tmp = tmp+word.substring(a-1,a);
				}
			}
			return tmp;

		}

		//Problem 9- isPalidrome

		//Given a string word, return true if the given string is a palidrome.

		//One of the rules for converting English to Pig Latin state: If a word begins with a consonant
		//move the consonant to the end of the word and add “ay”. Thus dog becomes “ogday” and
		//“crisp” becomes “ripcay”.


		//isPalidrome("madam") ? true
		//isPalidrome("solos") ? true
		//isPalidrome("hello") ? false

		//*************NOTE MUST CALL buildBackwards method. do not recreate backwards method

		public boolean isPalidrome(String word)
		{
			if (word.equals(buildBackwards(word))) {
				return true;
			} else {
				return false;
			}

		}

		//Problem 10- countVowelsInString
		//Given a string, count the number of vowels in the string

		//countVowelsInString("madam") ? 2
		//countVowelsInString("solos dog") ? 3
		//countVowelsInString("hello there") ? 4



		public int countVowelsInString(String word)
		{
			int count = 0;
			for (int a = 0; a < word.length(); a++) {
				if (word.substring(a,a+1).equalsIgnoreCase("a") || word.substring(a,a+1).equalsIgnoreCase("e") || word.substring(a,a+1).equalsIgnoreCase("i") || word.substring(a,a+1).equalsIgnoreCase("o") || word.substring(a,a+1).equalsIgnoreCase("u")) {
					count++;
				}
			}
		return count;
		}

		//Problem 11- countTotalVowels -ArrayList
		//Given an Array of words, return a count of all the vowels in the list

		//countTotalVowels(myWords) ? 6 for words madam, solos and hello



		public int countTotalVowels(ArrayList<String> words) {
			int count = 0;
			for (int a = 0; a < words.size(); a++) {
				for (int b = 0; b < words.get(a).length(); b++) {
					if (words.get(a).substring(b,b+1).equalsIgnoreCase("a") || words.get(a).substring(b,b+1).equalsIgnoreCase("e") || words.get(a).substring(b,b+1).equalsIgnoreCase("i") || words.get(a).substring(b,b+1).equalsIgnoreCase("o") || words.get(a).substring(b,b+1).equalsIgnoreCase("u")) {
						count++;
					}
				}
			}
			return count;
		}

		//Problem 13-  - getFirstAndLastName
		//Given a full name, getFirstAndLastName will seperate
		//the first and last name by a space.
		public void getFirstAndLastName(String fullName) {

			String fName = fullName.substring(0,fullName.indexOf(" "));
			String lName = fullName.substring(fullName.indexOf(" ")+1,fullName.length()-1);
		}



    	//Problem 12- sortWords -Arrays EXTRA CREDIT USE COMPARETO()
    	//Given an Array of words, returns an array of sorted words

    	//sortWords(w) ? "apple", "cat","catipilar", "music","tall","zebra"



    	public String[] sortWords(String[] words)
    	{

    		return words;
    	}
}