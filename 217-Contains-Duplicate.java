class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> n=new HashSet<>();
        for(int num:nums){
            if(!n.isEmpty()&&n.contains(num)){
                return true;
            }
            n.add(num);
        }
        return false;
    }
}