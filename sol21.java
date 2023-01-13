class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1); \\ the core of this algorithm, basically looks at each string and if it doesn't line up with any of the
                \\ other prefixes or similar letters in each, it moves on until it finds one that it does, and it does this for every string in the string list. 
            }
        }
        return prefix;
    }
}
\\ a program that will take the longest "common prefix" meaning the longest string of letters in a string in the string array strs. 
