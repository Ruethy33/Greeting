import java.util.Scanner;
public class HelloName {
	public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello," + name + "! What is your favorite color?");
		String FavoriteColor = userInput.nextLine();
		System.out.println("Interesting, but " + FavoriteColor + " is kind of a boring color!");
		System.out.println("What is your favorite Sport?");
		String FavoriteSport = userInput.nextLine();
		System.out.println("That is really boring, but cool!");
		System.out.println("Tell Steve that he needs to go kiss a woman!");
		String Steve = userInput.nextLine();
		System.out.println("Thank you!");
		}
}
	