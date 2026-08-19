class Solution {
    public int maxDistinct(String s) {
     Map<Character,Integer> ans=new HashMap<>();
     for(int i=0;i<s.length();i++){
        ans.put(s.charAt(i),1);
     }   
     return ans.size();
    }
}