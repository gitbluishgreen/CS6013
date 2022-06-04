class T5 {
public static void main(String [] a){
A __local_0;
int __local_1;
__local_0 = new A();
__local_1 = __local_0.go();
System.out.println(__local_1);
}
}
class A{
public int go(){
A __local_2;
int __local_3;
Class1 __local_4;
Class2 __local_5;
Class3 __local_6;
Class1 __local_7;
Class4 __local_8;
int __local_9;
int __local_10;
int __local_11;
Class1 c1;
Class2 c2;
Class3 c3;
Class1 c1_2;
Class1 c1_3;
Class2 c2_3;
Class4 c4;
int x;
int y;
__local_2 = this;
__local_3 = 2090;
x = __local_3;
y = x;
__local_4 = new Class1();
c1 = __local_4;
__local_5 = new Class2();
c2 = __local_5;
__local_6 = new Class3();
c3 = __local_6;
__local_7 = new Class1();
c1_2 = __local_7;
__local_8 = new Class4();
c4 = __local_8;
System.out.println(6);
__local_9 = 6;
x = __local_9;
__local_10 = c4.FMethod(c3);
y = __local_10;
__local_11 = 1337;
return __local_11;
}
}
class Class1{
public int AMethod(){
Class1 __local_12;
int __local_13;
int __local_14;
__local_12 = this;
__local_13 = 0;
System.out.println(__local_13);
__local_14 = 0;
return __local_14;
}
public int BMethod(){
Class1 __local_15;
int __local_16;
int __local_17;
__local_15 = this;
__local_16 = 1;
System.out.println(__local_16);
__local_17 = 1;
return __local_17;
}
public int CMethod(){
Class1 __local_18;
int __local_19;
int __local_20;
int __local_21;
int b;
__local_18 = this;
__local_19 = 2;
System.out.println(__local_19);
__local_20 = __local_18.BMethod();
b = __local_20;
__local_21 = 2;
return __local_21;
}
}
class Class2 extends Class1{
public int BMethod(){
Class2 __local_22;
int __local_23;
int __local_24;
__local_22 = this;
__local_23 = 3;
System.out.println(__local_23);
__local_24 = 3;
return __local_24;
}
public int DMethod(){
Class2 __local_25;
int __local_26;
int __local_27;
__local_25 = this;
__local_26 = 4;
System.out.println(__local_26);
__local_27 = 4;
return __local_27;
}
}
class Class3 extends Class2{
public int AMethod(){
Class3 __local_28;
int __local_29;
int __local_30;
__local_28 = this;
__local_29 = 7;
System.out.println(__local_29);
__local_30 = 7;
return __local_30;
}
public int DMethod(){
Class3 __local_31;
int __local_32;
int __local_33;
__local_31 = this;
__local_32 = 5;
System.out.println(__local_32);
__local_33 = 5;
return __local_33;
}
public int FMethod(Class1 x){
Class3 __local_34;
int __local_35;
int __local_36;
__local_34 = this;
__local_35 = 6;
System.out.println(__local_35);
__local_36 = 6;
return __local_36;
}
}
class Class4 extends Class3{
public int AMethod(){
Class4 __local_37;
int __local_38;
int __local_39;
int __local_40;
int y;
int fn_local1;
int fn_local2;
Class4 copy_obj;
__local_37 = this;
__local_38 = 8;
System.out.println(__local_38);
copy_obj = __local_37;
fn_local1 = 2;
System.out.println(fn_local1);
fn_local2 = copy_obj.BMethod();
__local_39 = 2;
y = __local_39;
__local_40 = 8;
return __local_40;
}
public int DMethod(){
Class4 __local_41;
int __local_42;
int __local_43;
int __local_38;
int __local_39;
int __local_40;
int y;
int fn_local1;
int fn_local2;
Class4 copy_obj;
Class4 copy_obj1;
__local_41 = this;
__local_42 = 9;
System.out.println(__local_42);
copy_obj1 = __local_41;
copy_obj = copy_obj1;
__local_38 = 8;
System.out.println(__local_38);
fn_local1 = 2;
System.out.println(fn_local1);
fn_local2 = copy_obj.BMethod();
__local_39 = 2;
y = __local_39;
__local_40 = 8;
__local_43 = __local_40;
return __local_43;
}
public int FMethod(Class2 x){
Class4 __local_44;
int __local_45;
int __local_46;
int __local_47;
int ab;
__local_44 = this;
__local_45 = 10;
System.out.println(__local_45);
__local_46 = __local_44.DMethod();
ab = __local_46;
System.out.println(ab);
__local_47 = 10;
return __local_47;
}
}
