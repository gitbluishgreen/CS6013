class T9 {
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
A __local_13;
int __local_14;
int __local_15;
int __local_16;
int numA;
A __local_17;
int __local_18;
int __local_19;
int a;
B __local_22;
int __local_23;
int __local_24;
int __local_25;
int numA_in;
int numB_in;
A __local_131;
int __local_141;
int __local_151;
int __local_161;
int numA1;
A __local_171;
int __local_181;
int __local_191;
B __local_202;
int __local_212;
int numB2;
B __local_262;
int __local_272;
int __local_282;
int numA2;
__local_2 = this;
__local_3 = 5000;
n = __local_3;
__local_4 = new A();
objA = __local_4;
__local_13 = objA;
a = n;
numA = a;
__local_14 = 10;
__local_15 = numA + __local_14;
numA = __local_15;
System.out.println(numA);
__local_17 = __local_13;
__local_18 = 1000;
__local_19 = __local_17.numA + __local_18;
__local_17.numA = __local_19;
__local_16 = __local_17.numA;
numA = __local_16;
__local_5 = numA;
n = __local_5;
System.out.println(n);
__local_6 = new B();
objB = __local_6;
__local_7 = 10000;
__local_22 = objB;
numA_in = n;
numB_in = __local_7;
__local_23 = 200;
__local_24 = numB_in + __local_23;
numB_in = __local_24;
__local_25 = numA_in + numB_in;
numB_in = __local_25;
System.out.println(numB_in);
__local_8 = numB_in;
n = __local_8;
System.out.println(n);
objA = objB;
__local_131 = objA;
numA1 = a;
__local_141 = 10;
__local_151 = numA1 + __local_141;
numA1 = __local_151;
System.out.println(numA1);
__local_171 = __local_131;
__local_181 = 1000;
__local_191 = __local_171.numA + __local_181;
__local_171.numA = __local_191;
__local_161 = __local_171.numA;
numA1 = __local_161;
__local_9 = numA1;
n = __local_9;
System.out.println(n);
__local_10 = new C();
objB = __local_10;
__local_11 = objB.funB(n,n);
n = __local_11;
System.out.println(n);
__local_202 = objB;
__local_262 = __local_202;
__local_272 = 500;
numA2 = __local_272;
__local_282 = numA2 + __local_262.numB;
System.out.println(__local_282);
__local_212 = numA2;
numB2 = __local_212;
System.out.println(numB2);
__local_12 = numB2;
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
A __local_17;
int __local_18;
int __local_19;
__local_13 = this;
numA = a;
__local_14 = 10;
__local_15 = numA + __local_14;
numA = __local_15;
System.out.println(numA);
__local_17 = __local_13;
__local_18 = 1000;
__local_19 = __local_17.numA + __local_18;
__local_17.numA = __local_19;
__local_16 = __local_17.numA;
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
B __local_26;
int __local_27;
int __local_28;
int numA;
__local_20 = this;
__local_26 = __local_20;
__local_27 = 500;
numA = __local_27;
__local_28 = numA + __local_26.numB;
System.out.println(__local_28);
__local_21 = numA;
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
__local_32 = __local_29.funA(numC);
return __local_32;
}
}
