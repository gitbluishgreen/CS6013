class T6 {
public static void main(String [] args){
D __local_0;
int __local_1;
__local_0 = new D();
__local_1 = __local_0.funCall();
System.out.println(__local_1);
}
}
class D{
public int funCall(){
D __local_2;
A __local_3;
int __local_4;
int __local_5;
int __local_6;
A objA;
int x;
__local_2 = this;
__local_3 = new A();
objA = __local_3;
/*INLINE*/__local_4 = objA.funA();
x = __local_4;
System.out.println(x);
/*INLINE*/__local_5 = objA.funA2();
x = __local_5;
System.out.println(x);
__local_6 = 1;
return __local_6;
}
}
class A{
int numA;
public int funA(){
A __local_7;
int __local_8;
int __local_9;
int __local_10;
int numA;
__local_7 = this;
__local_8 = 100;
numA = __local_8;
__local_9 = 10;
__local_10 = numA + __local_9;
numA = __local_10;
System.out.println(numA);
return numA;
}
public int funA2(){
A __local_11;
int __local_12;
int __local_13;
__local_11 = this;
__local_12 = 50;
__local_13 = numA - __local_12;
numA = __local_13;
return numA;
}
}
