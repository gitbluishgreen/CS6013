class T8 {
public static void main(String [] args){
D __local_0;
int __local_1;
int __local_2;
int __local_3;
int __local_4;
__local_0 = new D();
__local_1 = 2;
__local_2 = 3;
__local_3 = 4;
/*INLINE*/__local_4 = __local_0.funCall(__local_1,__local_2,__local_3);
System.out.println(__local_4);
}
}
class D{
public int funCall(int a,int b,int c){
D __local_5;
A __local_6;
int __local_7;
int __local_8;
A objA;
int x;
__local_5 = this;
__local_6 = new A();
objA = __local_6;
/*INLINE*/__local_7 = objA.funA(a,b,c);
x = __local_7;
System.out.println(x);
x = c;
System.out.println(x);
__local_8 = objA.funA2();
x = __local_8;
System.out.println(x);
return x;
}
}
class A{
int numA;
public int funA(int numA,int numB,int numC){
A __local_9;
int __local_10;
int __local_11;
int __local_12;
int __local_13;
int __local_14;
__local_9 = this;
__local_10 = 100;
__local_11 = numA + __local_10;
numA = __local_11;
__local_12 = 10;
__local_13 = numA + __local_12;
numA = __local_13;
__local_14 = numA + numB;
System.out.println(__local_14);
return numA;
}
public int funA2(){
A __local_15;
int __local_16;
int __local_17;
__local_15 = this;
__local_16 = 50;
__local_17 = numA - __local_16;
numA = __local_17;
return numA;
}
}
