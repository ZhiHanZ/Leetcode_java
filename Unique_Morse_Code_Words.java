class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        //Creating an array contains all candidates.
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        //creating a set which contains unique elements in words.
        Set<String> Swords = new HashSet();
        for (String word: words)
        {
            StringBuilder code = new StringBuilder();
            //StringBuilder is faster than StringBuffer, However it is not a thread-safe method.
            for (char c : word.toCharArray())
                code.append(MORSE[c-'a']);
            Swords.add(code.toString());
        }
        return Swords.size();
        
    }
}