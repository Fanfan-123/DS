class Solution {
        public static int reverse(int x) {
       //用数学思维来看
        int rpc = 0;
        while (x != 0)
        {
            int newrpc = rpc*10 + x%10;
            if ((newrpc - x%10)/10 != rpc) {return 0;}
            rpc = newrpc;
            x = x/10;
        }
        return rpc;
    }
} 
