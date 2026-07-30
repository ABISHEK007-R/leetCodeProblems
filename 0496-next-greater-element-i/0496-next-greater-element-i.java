class Solution {
    public int[] nextGreaterElement(int[] num1, int[] nums2) {
     Map<Integer,Integer> ansmap = new LinkedHashMap<>();
     Deque<Integer> stack=new ArrayDeque<>();
     stack.push(nums2[nums2.length-1]);
     ansmap.put(nums2[nums2.length-1],-1);
     for(int i=nums2.length-2;i>=0;i--){
        while(!stack.isEmpty()){
            if(nums2[i]<stack.peek()){
                ansmap.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
                break;
            }
            else{
                stack.pop();
            }
        }
        if(stack.isEmpty()){ansmap.put(nums2[i],-1);
        stack.push(nums2[i]);}
     } 
     int ans[]=new int[num1.length];
     for(int i=0;i<num1.length;i++){
        ans[i]=ansmap.get(num1[i]);
     }
     return ans;  
    }
}