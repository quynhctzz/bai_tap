class GFG {
    static void reverse(char[] str, int start, int end)
    {
      // Temporary variable
      // to store character
      char temp;
   
      while (start <= end) {
        // Swapping the first
        // and last character
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
   
      //  /* temp is for word boundary */
      int i = 0;
   
      /*STEP 1 of the above algorithm */
      while (i < s.length) {
   
        /*This condition is to make sure that the
                string start with valid character (not
                space) only*/
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
      } /* End of while */
   
      /*STEP 2 of the above algorithm */
      reverse(s, 0, (s.length - 1));
      return s;
    }
   
    // Driver Code
    public static void main(String[] args)
    {
      String s = "i like this program very much";
   
      // Function call
      char[] p = reverseWords(s.toCharArray());
      System.out.println(p);
    }
  }
   
  // This code is contributed by Srj_27.