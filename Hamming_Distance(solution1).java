class Solution {
    public int hammingDistance(int x, int y) {
	    return Integer.bitCount(x^y);//Integer.bitCount API will return the number of non-zero digit in a decimal number; 
	    //x^y is the XOR  operation between x and y
        
    }
}