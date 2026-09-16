class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>  st=new HashSet<>();
        for(char c:s.toCharArray()){
            if(st.contains(c)) return c;
            st.add(c);
        }
        return 0;
    }
}