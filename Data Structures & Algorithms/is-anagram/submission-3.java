class Solution {
    public boolean isAnagram(String s, String t) {
     int n = s.length();
     int m = t.length();

     if(n!=m){
        return false;
     }

     int freqArr[] = new int[26];

    // check 
    for(int i=0;i<n;i++){
        int ch = s.charAt(i);
        freqArr[ch-'a']++;

    }
    
    // minus 
    for(int i=0;i<m;i++){
        int ch = t.charAt(i);
        freqArr[ch-'a']--;
    }

    // check 
    for(int i=0;i<26;i++){
        if(freqArr[i]!=0){
            return false;
        }
    }

    return true;
    }
}
