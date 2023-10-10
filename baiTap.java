class lesson1 {
    static void reverse(char[] str, int start, int end)
    {
      
      char temp;
   
      while (start <= end) {
        
     
        temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        start++;
        end--;
      }
    }
   
    static char[] reverseWords(char[] s)
    {
      int word_begin = -1;
   
     
      int i = 0;
   
     
      while (i < s.length) {
                     
        if ((word_begin == -1) && (s[i] != ' ')) {
          word_begin = i;
        }
        if (word_begin != -1
            && ((i + 1 == s.length)
                || (s[i + 1] == ' '))) {
          reverse(s, word_begin, i);
          word_begin = -1;
        }
        i++;
      } 
   
      
      reverse(s, 0, (s.length - 1));
      return s;
    }
   
    
    public static void main(String[] args)
    {
      String s = "i like this program very much";
   
      
      char[] p = reverseWords(s.toCharArray());
      System.out.println(p);
    }
  }
   
  // +> much very program this like i