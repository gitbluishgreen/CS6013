class T9 {
public static void main(String [] args){
D __local_0;
int __local_1;
__local_0 = new D();
/*INLINE*/__local_1 = __local_0.funCall();
System.out.println(__local_1);
}
}
class D{
public int funCall(){
D __local_2;
int __local_3;
A __local_4;
int __local_5;
B __local_6;
int __local_7;
int __local_8;
int __local_9;
C __local_10;
int __local_11;
int __local_12;
A objA;
B objB;
int n;
__local_2 = this;
__local_3 = 5000;
n = __local_3;
__local_4 = new A();
objA = __local_4;
/*INLINE*/__local_5 = objA.funA(n);
n = __local_5;
System.out.println(n);
__local_6 = new B();
objB = __local_6;
__local_7 = 10000;
/*INLINE*/__local_8 = objB.funB(n,__local_7);
n = __local_8;
System.out.println(n);
objA = objB;
/*INLINE*/__local_9 = objA.funA(n);
n = __local_9;
System.out.println(n);
__local_10 = new C();
objB = __local_10;
/*INLINE*/__local_11 = objB.funB(n,n);
n = __local_11;
System.out.println(n);
/*INLINE*/__local_12 = objB.funC();
n = __local_12;
return n;
}
}
class A{
int numA;
public int funA(int a){
A __local_13;
int __local_14;
int __local_15;
int __local_16;
int numA;
__local_13 = this;
numA = a;
__local_14 = 10;
__local_15 = numA + __local_14;
numA = __local_15;
System.out.println(numA);
/*INLINE*/__local_16 = __local_13.funA2();
numA = __local_16;
return numA;
}
public int funA2(){
A __local_17;
int __local_18;
int __local_19;
__local_17 = this;
__local_18 = 1000;
__local_19 = numA + __local_18;
numA = __local_19;
return numA;
}
}
class B extends A{
int numB;
public int funC(){
B __local_20;
int __local_21;
int numB;
__local_20 = this;
/*INLINE*/__local_21 = __local_20.funOtherB();
numB = __local_21;
System.out.println(numB);
return numB;
}
public int funB(int numA,int numB){
B __local_22;
int __local_23;
int __local_24;
int __local_25;
__local_22 = this;
__local_23 = 200;
__local_24 = numB + __local_23;
numB = __local_24;
__local_25 = numA + numB;
numB = __local_25;
System.out.println(numB);
return numB;
}
public int funOtherB(){
B __local_26;
int __local_27;
int __local_28;
int numA;
__local_26 = this;
__local_27 = 500;
numA = __local_27;
__local_28 = numA + numB;
System.out.println(__local_28);
return numA;
}
}
class C extends B{
int numC;
public int funB(int numA,int numB){
C __local_29;
int __local_30;
int __local_31;
int __local_32;
__local_29 = this;
__local_30 = 2000;
__local_31 = numB + __local_30;
System.out.println(__local_31);
/*INLINE*/__local_32 = __local_29.funA(numC);
return __local_32;
}
}
