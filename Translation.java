import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        int j = word1.toCharArray().length - 1;
        String output = "";
        try {
            if(word1.toCharArray().length <= 100 && word2.toCharArray().length <=100){
                for(int i = 0; i< word1.toCharArray().length; i++){
                    if(word1.toCharArray()[i] == word2.toCharArray()[j-i] && word1.toCharArray()[i] >=97 && word2.toCharArray()[j-i]<= 122){
                        output = "YES";
                    }
                    else{
                        output = "NO";
                        break;
                    }
                }
                System.out.println(output);
            }
        } catch (Exception e) {
            System.out.println("NO");
        }
    }
}
