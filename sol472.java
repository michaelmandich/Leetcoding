class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        // program will go through each word, and then see if the beginning substring is part of 
        // another word, if it is, it will then see if there is another word (if not the same word,
        // that composes the remainder)
        // it will do so first by checking the length of the remaining letters, seeing if each word 
        // will even fit, if so it will test the number of letters its being compared to , if it 
        // matches then the remaining substring will be tested against all words. if it makes it 
        // all the way to the end of the word, the word is flagged correct. if the current word  
        // fits,it will continue on and check all potential trees to see if one combo works. 
    List<String> Concats = new ArrayList<String>();
        for(int currentWord = 0; currentWord<words.length ; currentWord++){
            if (isConcat(words,currentWord, words[currentWord]) == 1){
                System.out.println(words[currentWord]);
                Concats.add(words[currentWord]);
            }
        }
        return Concats;
    }
    public int isConcat(String[] listOfWords, int skip, String word){
        for(int i = 0; i<listOfWords.length;i++){
            if ((i == skip)||(listOfWords[i].length()>word.length())){
                continue;
            }
            if (word.equals(listOfWords[i])){
                return 1;
            }
            if ((word.substring(0,(listOfWords[i].length()))).equals(listOfWords[i])){
                if ((isConcat(listOfWords, skip, word.substring(listOfWords[i].length()))) == 1){
                    return 1;
                }
                continue; 
            }
        }
        return 0; 
    }
}
