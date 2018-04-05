import java.util.ArrayList;

public class UniqueMorseCodeWords {
	public int uniqueMorseRepresentations(String[] words) {
        String[] morses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        ArrayList<String> result = new ArrayList<>();
        for(String word : words){
            String morse = "";
            for(int i=0 ; i<word.length() ; i++){
                int index =(int)(word.charAt(i)) - 97;
                 morse += morses[index];
            }
            boolean isNotDup = true;
            for(String r : result){
                if(r.equals(morse)){
                    isNotDup &= false;
                }
            }    
            if(isNotDup){
                result.add(morse);
            }
        }
        return result.size();
    }
}
