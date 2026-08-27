class Solution { 
    public int integerReplacement(int n) { 
        long num = n; 
        int count = 0; 
        
        while (num != 1) { 
            count++; 
            if (num % 2 == 0) { 
                num = num >> 1;
            } else { 
                if (num != 3 && (num & 2) == 2) { 
                    num = num + 1;
                } else { 
                    num = num - 1;
                } 
            } 
        } 
        return count; 
    } 
}
