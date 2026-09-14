class Solution {
    public String longestCommonPrefix(String[] str) {

        String prefix = "";

       
        if (str.length == 0) {
            return "";
        }

      
        if (str.length == 1) {
            return str[0];
        }

      
        for (int i = 0; i < str[0].length(); i++) {

            char ch = str[0].charAt(i);

            
            for (int j = 1; j < str.length; j++) {

               
                if (i >= str[j].length() || str[j].charAt(i) != ch) {
                    return prefix;
                }
            }

           
            prefix += ch;
        }

        return prefix;
    }
}
