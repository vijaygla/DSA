public class SubSetString {
    public static void subSet(String s,String curr,int i){
        if(i==s.length()){
            System.out.println(curr);
            return;
        }
        subSet(s, curr,i+1);
        subSet(s,curr+s.charAt(i),i+1);
    }
    public static void main(String[] args) {
        subSet("ABC", "",0);
    }
}
//also print 1 empty string its also a subset of any set
