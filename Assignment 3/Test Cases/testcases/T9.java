class T9 {
public static void main(String [] arg){
A __local_0;
int __local_1;
__local_0 = new A();
__local_1 = __local_0.solve();
System.out.println(__local_1);
}
}
class A{
int n;
public int init(int N){
A __local_2;
int __local_3;
__local_2 = this;
__local_2.n = N;
__local_3 = 0;
return __local_3;
}
public B modulo(int a,int b){
A __local_4;
B __local_5;
int __local_6;
int __local_7;
boolean __local_8;
int __local_9;
int __local_10;
int __local_11;
boolean __local_12;
int __local_13;
int __local_14;
int __local_15;
int __local_16;
int __local_17;
int x;
int r;
int cnt;
B obj;
__local_4 = this;
__local_5 = new B();
obj = __local_5;
__local_6 = 0;
x = __local_6;
__local_7 = 0;
cnt = __local_7;
__local_8 = a < x;
__local_8 = !__local_8;
while(__local_8){
{
__local_9 = x + b;
x = __local_9;
__local_10 = 1;
__local_11 = cnt + __local_10;
cnt = __local_11;
}
__local_12 = a < x;
__local_12 = !__local_12;
__local_8 = __local_12;
}
__local_13 = x - b;
x = __local_13;
__local_14 = 1;
__local_15 = cnt - __local_14;
cnt = __local_15;
__local_16 = a - x;
__local_17 = obj.init(cnt,__local_16);
r = __local_17;
return obj;
}
public int solve(){
A __local_18;
int __local_19;
int __local_20;
int __local_21;
int __local_22;
boolean __local_23;
int __local_24;
B __local_25;
int __local_26;
int __local_27;
int __local_28;
int __local_29;
int __local_30;
int __local_31;
boolean __local_32;
int __local_33;
int rev;
B obj;
__local_18 = this;
__local_19 = 0;
rev = __local_19;
__local_20 = 123456789;
__local_21 = __local_18.init(__local_20);
rev = __local_21;
__local_22 = 0;
__local_23 = __local_22 < n;
while(__local_23){
{
__local_24 = 10;
__local_25 = __local_18.modulo(n,__local_24);
obj = __local_25;
__local_26 = 10;
__local_27 = __local_26 * rev;
__local_28 = obj.getRem();
__local_29 = __local_27 + __local_28;
rev = __local_29;
__local_30 = obj.getQ();
n = __local_30;
}
__local_31 = 0;
__local_32 = __local_31 < n;
__local_23 = __local_32;
}
System.out.println(rev);
__local_33 = 0;
return __local_33;
}
}
class B{
int q;
int r;
public int init(int x,int y){
B __local_34;
int __local_35;
__local_34 = this;
__local_34.q = x;
__local_34.r = y;
__local_35 = 0;
return __local_35;
}
public int getRem(){
B __local_36;
__local_36 = this;
return r;
}
public int getQ(){
B __local_37;
__local_37 = this;
return q;
}
}
