package correcter;
import java.util.*;

//Class Encoder {
//    
//   int    seed;
//   String encodingType;
//  
//    public Cezar(String encodingType, int seed){
//        
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String message = scanner.nextLine();
        char[] encryptedMessage = message.toCharArray();

	// Simple encoding [Moving to class in future]
        for (int i = 0; i < encryptedMessage.length; i++) {
            int k = random.nextInt(5) + 1; //Seed per loop iteration.
            if (i % 3 == 0) {
                encryptedMessage[i] += k; //Switching symbol.
            }
        }

        System.out.println(encryptedMessage);
    }
}
