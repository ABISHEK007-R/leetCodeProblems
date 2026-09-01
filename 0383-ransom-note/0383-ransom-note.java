class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character,Integer> map=new HashMap<>();
    Map<Character,Integer> map1=new HashMap<>();
    for(int i=0;i<magazine.length();i++){
        map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
    }
        for(int i=0;i<ransomNote.length();i++){
        map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0)+1);
    }  
        for(int i=0;i<ransomNote.length();i++){
        if(map1.get(ransomNote.charAt(i))>map.getOrDefault(ransomNote.charAt(i),0)){
            return false;
        }
    } 
    return true;
    }
}