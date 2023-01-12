class Solution {
    public int reverse(int x) {
        double holding = 0;
        int temp = x;  
        while ((temp/10) != 0){
            holding = holding*10 + (temp%10); \\ this loop is to get all but the last digit, so it stop directly before that when the number is down to it's last digit
            temp = temp/10;
        }
        holding = holding*10 + (temp%10);
        temp = temp/10; \\ two more lines to get the last digit after while loop stops
        if (holding<=-2147483647||holding>=2147483647){
            return 0; \\ error handling
        }
        int backup = (int)holding; \\casting the double back into an integer in the case that it was not too large. 
        return backup; 
    }
}

\\ This program attempts to reverse an integer, for error handling, it has line 11-13, in the case that reversing it puts it out of integer range. The reason it is 
\\ cast back and forth as a double and integer is because otherwise it will have spillover and we wont know whether there was spillover on the reversal.  
