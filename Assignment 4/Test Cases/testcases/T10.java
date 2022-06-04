class T10 {
public static void main(String [] args){
A __local_0;
int __local_1;
__local_0 = new A();
/*INLINE*/__local_1 = __local_0.start();
System.out.println(__local_1);
}
}
class A{
public int start(){
A __local_2;
boolean __local_3;
int __local_4;
int __local_5;
int __local_6;
int __local_7;
int __local_8;
int __local_9;
int __local_10;
int __local_11;
boolean __local_12;
boolean __local_13;
boolean __local_14;
int __local_15;
boolean __local_16;
int __local_17;
boolean __local_18;
int __local_19;
boolean __local_20;
int __local_21;
int __local_22;
int __local_23;
int __local_24;
int __local_25;
boolean x;
boolean y;
boolean z;
boolean m;
boolean n;
__local_2 = this;
__local_3 = false;
y = __local_3;
/*INLINE*/__local_4 = __local_2.a();
/*INLINE*/__local_5 = __local_2.b();
__local_6 = __local_4 + __local_5;
/*INLINE*/__local_7 = __local_2.b();
__local_8 = __local_6 * __local_7;
/*INLINE*/__local_9 = __local_2.a();
__local_10 = 1;
__local_11 = __local_9 + __local_10;
__local_12 = __local_8 < __local_11;
x = __local_12;
x = !x;
y = !y;
__local_13 = x & y;
y = __local_13;
x = !x;
__local_14 = x & y;
__local_14 = !__local_14;
z = __local_14;
y = !y;
m = y;
z = !z;
n = z;
x = !x;
if(x){
{
__local_15 = 1;
System.out.println(__local_15);
__local_16 = m & z;
__local_16 = !__local_16;
if(__local_16){
{
__local_17 = 100;
System.out.println(__local_17);
n = !n;
__local_18 = y & n;
if(__local_18){
{
__local_19 = 200;
System.out.println(__local_19);
}
}
else{
y = !y;
__local_20 = y & n;
if(__local_20){
{
__local_21 = 300;
System.out.println(__local_21);
}
}
else{
{
__local_22 = 400;
System.out.println(__local_22);
}
}
}
}
}
else{
{
__local_23 = 500;
System.out.println(__local_23);
}
}
}
}
else{
__local_24 = 3;
System.out.println(__local_24);
}
__local_25 = 3;
return __local_25;
}
public int a(){
A __local_26;
int __local_27;
int __local_28;
__local_26 = this;
__local_27 = 1;
System.out.println(__local_27);
__local_28 = 1;
return __local_28;
}
public int b(){
A __local_29;
int __local_30;
int __local_31;
__local_29 = this;
__local_30 = 2;
System.out.println(__local_30);
__local_31 = 2;
return __local_31;
}
}
