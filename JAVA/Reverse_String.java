class Solution 
{
public void reverseString(char[] s) 
{
char [] reverse=new char[s.length];
int j=0;
for (int i=s.length-1;i>=0;i--)
  reverse[j++]=s[i];//coying reverse of array s
 for(int k=0;k<s.length;k++)
   s[k]=reverse[k];
}
}

