package correcter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char randomLetter;
        String firstLetter, secondLetter, thirdLetter;
        String inputText = scanner.nextLine();
        String[] message = inputText.split("");
        List<String> encryptedMessage = new ArrayList<String>(); 
        
        for (String str : message) {
            System.out.print(str);
        }
        System.out.println("");
        
        // Tripling and creating one error per three letters.
        for (int i = 0; i < message.length; i++) {
            int error = random.nextInt(2);
            for (int j = 0; j <= 2; j++) {
            System.out.print(message[i]);
            if (j == error){
                
                    // Checking if the error letter is not duplicated.
                    do {
                        randomLetter = (char) ('a' + random.nextInt(26));
                    } while (message[i].equals(Character.toString(randomLetter))); // If yes repeat
                    
                    encryptedMessage.add(Character.toString(randomLetter));
                } else {
                    encryptedMessage.add(message[i]);
                }
            }
        }
        
        System.out.println("");
        for (String str : encryptedMessage) {
        System.out.print(str);
        }
        System.out.println("");
        
        // Decoding by comparing 2 letter per triplet
        for (int i = 0; i < encryptedMessage.size(); i+=3) {
            firstLetter = encryptedMessage.get(i);
            secondLetter = encryptedMessage.get(i + 1);
            thirdLetter = encryptedMessage.get(i + 2);
            if (thirdLetter.equals(firstLetter)) {
                System.out.print(firstLetter);
            } else {
                System.out.print(secondLetter);
            }
        }
    }
}
