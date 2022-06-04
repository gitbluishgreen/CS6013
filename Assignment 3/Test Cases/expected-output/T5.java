class T5 {
public static void main(String [] arg){
A __local_0;
int __local_1;
__local_0 = new A();
__local_1 = __local_0.solve();
System.out.println(__local_1);
}
}
class A{
int a;
int b;
public int average(int a,int b){
A __local_2;
int __local_4;
int __local_5;
int __local_7;
boolean __local_8;
int __local_10;
int __local_11;
int __local_12;
int __local_14;
boolean __local_15;
int __local_17;
int i;
__local_2 = this;
i = 0;
__local_4 = i + i;
__local_5 = a + b;
__local_7 = __local_5 + 1;
__local_8 = __local_4 < __local_7;
while(__local_8){
{
__local_10 = i + 1;
i = __local_10;
}
__local_11 = i + i;
__local_12 = a + b;
__local_14 = __local_12 + 1;
__local_15 = __local_11 < __local_14;
__local_8 = __local_15;
}
__local_17 = i - 1;
i = __local_17;
return i;
}
public int solve(){
A __local_18;
boolean __local_21;
boolean __local_23;
int __local_24;
int __local_26;
boolean __local_28;
int __local_30;
boolean __local_32;
int i;
int j;
__local_18 = this;
i = 0;
__local_21 = i < 4;
while(__local_21){
{
j = i;
__local_23 = j < 4;
while(__local_23){
{
__local_24 = __local_18.average(i,j);
System.out.println(__local_24);
}

__local_26 = j + 1;
j = __local_26;
__local_28 = j < 4;
__local_23 = __local_28;
}
}
__local_30 = i + 1;
i = __local_30;
__local_32 = i < 4;
__local_21 = __local_32;
}
return 0;
}
}
