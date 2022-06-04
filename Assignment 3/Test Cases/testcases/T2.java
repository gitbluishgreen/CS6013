class T2 {
public static void main(String [] arg){
A __local_0;
int __local_1;
__local_0 = new A();
__local_1 = __local_0.checker();
System.out.println(__local_1);
}
}
class A extends B{
int a;
int b;
int c;
public int init(){
A __local_2;
int __local_3;
int __local_4;
int __local_5;
int __local_6;
int __local_7;
__local_2 = this;
__local_3 = 5;
a = __local_3;
__local_4 = 10;
b = __local_4;
__local_5 = 15;
c = __local_5;
__local_6 = 65;
d = __local_6;
__local_7 = 100;
return __local_7;
}
public int checker(){
A __local_8;
int __local_9;
B __local_10;
C __local_11;
D __local_12;
int __local_13;
int __local_14;
int __local_15;
int __local_16;
int __local_17;
int __local_18;
int __local_19;
int __local_20;
int __local_21;
int __local_22;
int __local_23;
int __local_24;
int __local_25;
int __local_26;
int __local_27;
int __local_28;
int x;
B objB;
C objC;
D objD;
__local_8 = this;
__local_9 = __local_8.init();
x = __local_9;
__local_10 = new B();
objB = __local_10;
__local_11 = new C();
objC = __local_11;
__local_12 = new D();
objD = __local_12;
__local_13 = objB.init();
x = __local_13;
__local_14 = objC.init();
x = __local_14;
__local_15 = objD.init();
x = __local_15;
System.out.println(x);
__local_16 = objB.getA();
System.out.println(__local_16);
__local_17 = objB.getB();
System.out.println(__local_17);
__local_18 = objB.getC();
System.out.println(__local_18);
__local_19 = objC.getA();
System.out.println(__local_19);
__local_20 = objC.getB();
System.out.println(__local_20);
__local_21 = objC.getC();
System.out.println(__local_21);
__local_22 = objD.getA();
System.out.println(__local_22);
__local_23 = objD.getB();
System.out.println(__local_23);
__local_24 = objD.getC();
System.out.println(__local_24);
__local_25 = objB.getD();
System.out.println(__local_25);
__local_26 = objC.getD();
System.out.println(__local_26);
__local_27 = __local_8.getD();
System.out.println(__local_27);
__local_28 = 0;
return __local_28;
}
}
class B extends C{
int a;
int b;
int c;
public int init(){
B __local_29;
int __local_30;
int __local_31;
int __local_32;
int __local_33;
int __local_34;
__local_29 = this;
__local_30 = 20;
a = __local_30;
__local_31 = 25;
b = __local_31;
__local_32 = 30;
c = __local_32;
__local_33 = 55;
d = __local_33;
__local_34 = 1;
return __local_34;
}
public int getA(){
B __local_35;
__local_35 = this;
return a;
}
public int getB(){
B __local_36;
__local_36 = this;
return b;
}
public int getC(){
B __local_37;
__local_37 = this;
return c;
}
}
class C extends D{
int a;
int b;
int c;
public int init(){
C __local_38;
int __local_39;
int __local_40;
int __local_41;
int __local_42;
int __local_43;
__local_38 = this;
__local_39 = 35;
a = __local_39;
__local_40 = 40;
b = __local_40;
__local_41 = 45;
c = __local_41;
__local_42 = 60;
d = __local_42;
__local_43 = 2;
return __local_43;
}
public int getA(){
C __local_44;
__local_44 = this;
return a;
}
public int getB(){
C __local_45;
__local_45 = this;
return b;
}
public int getC(){
C __local_46;
__local_46 = this;
return c;
}
}
class D{
int a;
int b;
int c;
int d;
public int init(){
D __local_47;
int __local_48;
int __local_49;
int __local_50;
int __local_51;
int __local_52;
__local_47 = this;
__local_48 = 35;
a = __local_48;
__local_49 = 40;
b = __local_49;
__local_50 = 45;
c = __local_50;
__local_51 = 50;
d = __local_51;
__local_52 = 3;
return __local_52;
}
public int getA(){
D __local_53;
__local_53 = this;
return a;
}
public int getB(){
D __local_54;
__local_54 = this;
return b;
}
public int getC(){
D __local_55;
__local_55 = this;
return c;
}
public int getD(){
D __local_56;
__local_56 = this;
return d;
}
}
