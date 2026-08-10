class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int s1 = 0;
        int s2 = 0;
        int count = 0;
        while(s1<g.length && s2<s.length){
            if(s[s2] >= g[s1]){
                count++;
                s2++;
                s1++;
            }else if(s[s2]<g[s1]){
                s2++;
            }else{
                s1++;
            }
        }
        return count;
    }
}