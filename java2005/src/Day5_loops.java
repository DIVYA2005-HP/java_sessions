public class Day5_loops {

    public static void main(String[] args) {
        
        String c = "classroom";
        System.out.println(c.length());

        System.out.println(c.charAt(0));

        //substring - a part of a string in a sequence

        System.out.println(c.substring(2,3 ));
        System.out.println("hello".equals("hello"));
        System.out.println(c.substring(c.length()-1));

        String a = "marker";
        System.out.println(a.substring(a.length()-3));
        System.out.println("hello"+2+2);
    }

        /*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3 */

        for(int count=1;count<=10;count++){
            System.out.println("divya");

            int countXX(String str) {
                int count=0;
                for(int i=0;i<str.length()-1;i++){
                  String s =str.substring(i,i+2);
                  if(s.equals("xx")){
                  count++;
                }
              }
              return count;
              }
              
    
    
    
    
}
