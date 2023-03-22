class Solution {
    public int reverse(int x) {
      long s = 0;
      int f =0;
      if(x<0){x=x*-1;
      f=1;
      }
      while(x > 0){
          int r = x % 10;
          s = s*10 + r;
          x = x / 10;
      }  
      if(s >= Integer.MAX_VALUE)return 0;
      if(f==1)s=s*-1;
      return (int)s;
    }
}
