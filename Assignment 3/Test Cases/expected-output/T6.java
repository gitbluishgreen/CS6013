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
B __local_5;
int __local_6;
int __local_7;
int __local_8;
int __local_9;
int __local_10;
int __local_11;
int __local_12;
int __local_17;
B obj;
int x;
__local_2 = this;
a = 10;
b = 20;
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
__local_17 = 0-4;
return __local_17;
}
}
class B{
int a;
int b;
public int init(){
B __local_18;
__local_18 = this;
a = 30;
b = 40;
return 0;
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
