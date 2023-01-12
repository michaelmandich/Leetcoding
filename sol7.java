class Solution {
    public int reverse(int x) {
        double holding = 0;
        int temp = x;  
        while ((temp/10) != 0){
            holding = holding*10 + (temp%10);
            temp = temp/10;
        }
        holding = holding*10 + (temp%10);
        temp = temp/10;
        if (holding<=-2147483647||holding>=2147483647){
            return 0; 
        }
        int backup = (int)holding;
        return backup; 
    }
}

\\ This program attempts to reverse an integer, for error handling, it has line 11-13, in the case that reversing it puts it out of integer range. The reason it is 
\\ cast back and forth as a double and integer is because otherwise it will have spillover and we wont know whether there was spillover on the reversal.  
