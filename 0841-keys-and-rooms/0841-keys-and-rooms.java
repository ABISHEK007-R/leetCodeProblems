class Solution {
    public void rec(int start,List<List<Integer>> rooms,boolean[] bool){
    for(int i=0;i<rooms.get(start).size();i++){
        if(bool[rooms.get(start).get(i)]){
         continue;
        }
        else{
        bool[rooms.get(start).get(i)]=true;
        rec(rooms.get(start).get(i),rooms,bool);
        }
    }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean bool[]=new boolean[rooms.size()];
    bool[0]=true;
    rec(0,rooms,bool);
    boolean ans=true;  
    for(int i=0;i<bool.length;i++){
        ans=ans&&bool[i];
    } 
    return ans;
    }
}