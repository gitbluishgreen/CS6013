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
int __local_3;
int __local_4;
int __local_5;
int __local_6;
int __local_7;
boolean __local_8;
int __local_9;
int __local_10;
int __local_11;
int __local_12;
int __local_13;
int __local_14;
boolean __local_15;
int __local_16;
int __local_17;
int i;
__local_2 = this;
__local_3 = 0;
i = __local_3;
__local_4 = i + i;
__local_5 = a + b;
__local_6 = 1;
__local_7 = __local_5 + __local_6;
__local_8 = __local_4 < __local_7;
while(__local_8){
{
__local_9 = 1;
__local_10 = i + __local_9;
i = __local_10;
}
__local_11 = i + i;
__local_12 = a + b;
__local_13 = 1;
__local_14 = __local_12 + __local_13;
__local_15 = __local_11 < __local_14;
__local_8 = __local_15;
}
__local_16 = 1;
__local_17 = i - __local_16;
i = __local_17;
return i;
}
public int solve(){
A __local_18;
int __local_19;
int __local_20;
boolean __local_21;
int __local_22;
boolean __local_23;
int __local_24;
int __local_25;
int __local_26;
int __local_27;
boolean __local_28;
int __local_29;
int __local_30;
int __local_31;
boolean __local_32;
int __local_33;
int i;
int j;
__local_18 = this;
__local_19 = 0;
i = __local_19;
__local_20 = 4;
__local_21 = i < __local_20;
while(__local_21){
{
j = i;
__local_22 = 4;
__local_23 = j < __local_22;
while(__local_23){
{
__local_24 = __local_18.average(i,j);
System.out.println(__local_24);
}
__local_25 = 1;
__local_26 = j + __local_25;
j = __local_26;
__local_27 = 4;
__local_28 = j < __local_27;
__local_23 = __local_28;
}
}
__local_29 = 1;
__local_30 = i + __local_29;
i = __local_30;
__local_31 = 4;
__local_32 = i < __local_31;
__local_21 = __local_32;
}
__local_33 = 0;
return __local_33;
}
}
