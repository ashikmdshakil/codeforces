import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if(word.toCharArray().length >=1 && word.toCharArray().length <=100){
            int countUpperCase = 0;
            for(char letter: word.toCharArray()){
                if(letter >= 65 && letter <= 90){
                    ++ countUpperCase;
                }
            }
            if(countUpperCase > word.toCharArray().length/2){
                System.out.println(word.toUpperCase());
            }
            else if(countUpperCase == word.toCharArray().length/2){
                System.out.println(word.toLowerCase());
            }
            else{
                System.out.println(word.toLowerCase());
            }
        }
    }
}
