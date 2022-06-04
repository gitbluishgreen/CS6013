class T6 {
public static void main(String [] arg){
A __local_0;
int __local_1;
__local_0 = new A();
__local_1 = __local_0.check();
System.out.println(__local_1);
}
}
class A extends B{
int a;
int b;
public int check(){
A __local_2;
int __local_3;
int __local_4;
B __local_5;
int __local_6;
int __local_7;
int __local_8;
int __local_9;
int __local_10;
int __local_11;
int __local_12;
int __local_13;
int __local_14;
int __local_15;
int __local_16;
int __local_17;
B obj;
int x;
__local_2 = this;
__local_3 = 10;
a = __local_3;
__local_4 = 20;
b = __local_4;
__local_5 = new B();
obj = __local_5;
__local_6 = obj.init();
x = __local_6;
__local_7 = a + b;
__local_8 = obj.getA();
__local_9 = __local_2.getA();
__local_10 = __local_8 + __local_9;
__local_11 = __local_7 + __local_10;
System.out.println(__local_11);
__local_12 = __local_2.getB();
System.out.println(__local_12);
__local_13 = 2;
__local_14 = 3;
__local_15 = 5;
__local_16 = __local_14 - __local_15;
__local_17 = __local_13 * __local_16;
return __local_17;
}
}
class B{
int a;
int b;
public int init(){
B __local_18;
int __local_19;
int __local_20;
int __local_21;
__local_18 = this;
__local_19 = 30;
a = __local_19;
__local_20 = 40;
b = __local_20;
__local_21 = 0;
return __local_21;
}
public int getA(){
B __local_22;
__local_22 = this;
return a;
}
public int getB(){
B __local_23;
__local_23 = this;
return b;
}
}
