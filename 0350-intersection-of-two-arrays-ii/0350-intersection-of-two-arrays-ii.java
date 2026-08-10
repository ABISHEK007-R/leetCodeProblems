class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     List<Integer> temp=new ArrayList<>();
     int a=nums1.length;
     int b=nums2.length;
     for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
          if(nums1[i]==nums2[j]){
            temp.add(nums1[i]);
            nums2[j]=-1;
            break;
          }
        }
     }
     int res[]= new int[temp.size()];
     int i = 0;

for (int num : temp) {
    res[i] = num;
    i++;
}
     return res;
    }
}