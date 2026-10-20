package U1T6_Labs.U1T6_Lab2;

public class ChatBotRunner {
    static void main(String[] args) {
        ChatBot chatBot = new ChatBot("ChatGPT", 7);
        chatBot.greeting("debbie");
        chatBot.weather();
        double meters = chatBot.convertFeetToMeters(10);
        System.out.println("10 feet is " + meters + " meters.");
        chatBot.favoriteNumber(10);
        int sum = chatBot.addNumbers(1, 2, 3);
        System.out.println("The sum of 1, 2, and 3 is " + sum + ".");
        String goodbyeMessage = chatBot.goodbye();
        System.out.println(goodbyeMessage);
        chatBot.friendname("Sid");
        chatBot.friendage(25);
        System.out.println(chatBot.friendFavoriteColor("blue"));
        System.out.println(chatBot.friendLeastFavoriteNumber());
        System.out.println(chatBot.friendFavoriteFood("pizza"));
        System.out.println(chatBot.friendFavoriteNumber(17));
    }
}
