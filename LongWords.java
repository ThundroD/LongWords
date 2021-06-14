package longWords;
import java.util.Arrays;
import java.util.Scanner;

public class LongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Scanner
		Scanner sc = new Scanner(System.in);
		//Create variables for the code
		String userInput;
		String longStr = "";
		int counter = 0;
		double average = 0;
		double countedLength = 0;
		
		//Create a do while loop to ask user to enter word
		do {
			System.out.println("Please enter a word: ");
			userInput = sc.nextLine(); // word is put into a variable
			longStr = longStr + " " + userInput; // new variable creates a long string of all word
			
		} while(!"0".equals(userInput)); //loop is stopped when user enters 0
		
		 String [] inputArray = longStr.split(" "); //create a String array from the string of all the words
		 String[] longWords = new String[inputArray.length - 2];
		 int first = 0;
	
		 for (int i = 0, j = 0; i < inputArray.length -1; i++) { //iterate through inputArray length until last which is 0
		     if (i != first) {
		    	 longWords[j++] = inputArray[i];
		     }
		 }
		 
		//Create for loop
        for (int x = 0; x < longWords.length; x++) { //Go through each word in array
        	countedLength += longWords[x].length(); //create variable that takes in all iterations
        	if(longWords[x].length()>=5) {//Check if word is bigger than 4 chars
                counter++;//Counter keeps track of how many words have more than 4 chars
            }
        	
        }//End of for loop 
        System.out.println("You entered " + counter + " words, that were longer than 4 characters.");//Print out how many words is larger than 4
        average = countedLength/longWords.length; //length of iterations / length of the array produces the average
        System.out.println("The average length of all the words you entered is, " + average + ".");//print out average number of characters of words larger than 4
        
		sc.close(); //close scanner
	}

}
