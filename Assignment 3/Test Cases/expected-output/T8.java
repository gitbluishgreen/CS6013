class T8 {
public static void main(String [] args){
Fibonacci __local_0;
int __local_1;
__local_0 = new Fibonacci();
__local_1 = __local_0.solve();
System.out.println(__local_1);
}
}
class Fibonacci{
int[] fib;
int n;
public int init(int N){
Fibonacci __local_2;
int __local_4;
int[] __local_5;
__local_2 = this;
n = N;
__local_4 = N + 1;
__local_5 = new int[__local_4];
fib = __local_5;
fib[0] = 0;
fib[1] = 1;
return 0;
}
public int solve(){
Fibonacci __local_11;
int __local_16;
boolean __local_17;
int __local_19;
int __local_20;
int __local_22;
int __local_23;
int __local_24;
int __local_26;
int __local_28;
boolean __local_29;
int __local_30;
int i;
__local_11 = this;
i = __local_11.init(8);
i = 2;
__local_16 = n + 1;
__local_17 = i < __local_16;
while(__local_17){
{
__local_19 = i - 1;
__local_20 = fib[__local_19];
__local_22 = i - 2;
__local_23 = fib[__local_22];
__local_24 = __local_20 + __local_23;
fib[i] = __local_24;
}
__local_26 = i + 1;
i = __local_26;
__local_28 = n + 1;
__local_29 = i < __local_28;
__local_17 = __local_29;
}
__local_30 = fib[n];
return __local_30;
}
}
