class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean a[][]=new boolean [101][3];
        for(int num:nums1) a[num][0]=true;
        for(int num:nums2) a[num][1]=true;
        for(int num:nums3) a[num][2]=true;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<101;i++){
            int cnt=0;
            for(int j=0;j<3;j++){
                if(a[i][j])cnt++;
            }
            if(cnt>=2) ans.add(i);
        } 
        return ans;
    }
}