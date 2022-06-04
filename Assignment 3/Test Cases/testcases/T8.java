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
int __local_3;
int __local_4;
int[] __local_5;
int __local_6;
int __local_7;
int __local_8;
int __local_9;
int __local_10;
__local_2 = this;
n = N;
__local_3 = 1;
__local_4 = N + __local_3;
__local_5 = new int[__local_4];
fib = __local_5;
__local_6 = 0;
__local_7 = 0;
fib[__local_6] = __local_7;
__local_8 = 1;
__local_9 = 1;
fib[__local_8] = __local_9;
__local_10 = 0;
return __local_10;
}
public int solve(){
Fibonacci __local_11;
int __local_12;
int __local_13;
int __local_14;
int __local_15;
int __local_16;
boolean __local_17;
int __local_18;
int __local_19;
int __local_20;
int __local_21;
int __local_22;
int __local_23;
int __local_24;
int __local_25;
int __local_26;
int __local_27;
int __local_28;
boolean __local_29;
int __local_30;
int i;
__local_11 = this;
__local_12 = 8;
__local_13 = __local_11.init(__local_12);
i = __local_13;
__local_14 = 2;
i = __local_14;
__local_15 = 1;
__local_16 = n + __local_15;
__local_17 = i < __local_16;
while(__local_17){
{
__local_18 = 1;
__local_19 = i - __local_18;
__local_20 = fib[__local_19];
__local_21 = 2;
__local_22 = i - __local_21;
__local_23 = fib[__local_22];
__local_24 = __local_20 + __local_23;
fib[i] = __local_24;
}
__local_25 = 1;
__local_26 = i + __local_25;
i = __local_26;
__local_27 = 1;
__local_28 = n + __local_27;
__local_29 = i < __local_28;
__local_17 = __local_29;
}
__local_30 = fib[n];
return __local_30;
}
}
