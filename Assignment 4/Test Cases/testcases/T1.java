class T1 {
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
B __local_5;
int __local_6;
int __local_7;
C __local_8;
int __local_9;
int __local_10;
A objA;
B objB;
int n;
__local_2 = this;
__local_3 = new A();
objA = __local_3;
/*INLINE*/__local_4 = objA.funA();
n = __local_4;
System.out.println(n);
__local_5 = new B();
objB = __local_5;
/*INLINE*/__local_6 = objB.funB();
n = __local_6;
System.out.println(n);
objA = objB;
/*INLINE*/__local_7 = objA.funA();
n = __local_7;
System.out.println(n);
__local_8 = new C();
objB = __local_8;
System.out.println(n);
/*INLINE*/__local_9 = objB.funC();
n = __local_9;
__local_10 = 1;
return __local_10;
}
}
class A{
int numA;
public int funA(){
A __local_11;
int __local_12;
int __local_13;
int __local_14;
__local_11 = this;
__local_12 = 100;
numA = __local_12;
__local_13 = 10;
__local_14 = numA + __local_13;
numA = __local_14;
System.out.println(numA);
return numA;
}
}
class B extends A{
int numB;
public int funC(){
B __local_15;
int __local_16;
int __local_17;
__local_15 = this;
__local_16 = __local_15.funOtherB();
numB = __local_16;
System.out.println(numB);
__local_17 = __local_15.funB();
numB = __local_17;
return numB;
}
public int funB(){
B __local_18;
int __local_19;
int __local_20;
__local_18 = this;
__local_19 = 200;
numB = __local_19;
__local_20 = numA + numB;
numB = __local_20;
System.out.println(numB);
return numB;
}
public int funOtherB(){
B __local_21;
__local_21 = this;
System.out.println(numB);
return numB;
}
}
class C extends B{
int numB;
public int funB(){
C __local_22;
int __local_23;
__local_22 = this;
System.out.println(numB);
__local_23 = __local_22.funA();
return __local_23;
}
}
