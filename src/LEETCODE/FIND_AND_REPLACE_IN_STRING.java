package LEETCODE;

public class FIND_AND_REPLACE_IN_STRING {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        String a  = "";
        int k;
        for(int i=0; i<s.length(); i++){
            k = 0;
            for(int j=0; j<indices.length; j++){
                if(i + sources[j].length()<=s.length()){
                    if(i == indices[j] && s.substring(i, i + sources[j].length()).equals(sources[j])){
                        a += targets[j];
                        k = 1;
                        i += sources[j].length()-1;
                        break;
                    }
                }
            }
            if (k==0) a += s.charAt(i);
        }
        return a;
    }
}
