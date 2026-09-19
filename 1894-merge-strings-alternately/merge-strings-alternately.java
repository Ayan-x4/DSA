class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mix = word1+word2;
        String MSA = "";
            for (int i = 0; i < mix.length() ; i++) {
                if(i<word1.length()){
                    char ch = word1.charAt(i);
                    MSA += ch;
                }
                if(i<word2.length()){
                    char ch = word2.charAt(i);
                    MSA += ch;
                }




            }
        return MSA;
    }
}