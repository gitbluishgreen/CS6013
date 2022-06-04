class T3 {
public static void main(String [] arg){
Stack __local_0;
int __local_1;
__local_0 = new Stack();
__local_1 = __local_0.checker();
System.out.println(__local_1);
}
}
class Stack{
int[] arr_aux;
int up;
int size;
public int init(){
Stack __local_2;
int __local_3;
int[] __local_4;
int __local_5;
int __local_6;
int __local_7;
__local_2 = this;
__local_3 = 1;
__local_4 = new int[__local_3];
__local_2.arr_aux = __local_4;
__local_5 = 1;
__local_2.size = __local_5;
__local_6 = 0;
__local_2.up = __local_6;
__local_7 = 0;
return __local_7;
}
public int push(int x){
Stack __local_8;
int __local_9;
int __local_10;
int __local_11;
int __local_12;
boolean __local_13;
int __local_14;
int __local_15;
int[] __local_16;
int __local_17;
boolean __local_18;
int __local_19;
int __local_20;
int __local_21;
boolean __local_22;
int __local_23;
int __local_24;
int __local_25;
int __local_26;
int[] arr_new;
int i;
__local_8 = this;
arr_aux[up] = x;
__local_9 = 1;
__local_10 = up + __local_9;
up = __local_10;
__local_11 = 1;
__local_12 = up + __local_11;
__local_13 = size < __local_12;
if(__local_13){
{
__local_14 = 2;
__local_15 = __local_14 * size;
__local_16 = new int[__local_15];
arr_new = __local_16;
__local_17 = 0;
i = __local_17;
__local_18 = i < size;
while(__local_18){
{
__local_19 = arr_aux[i];
arr_new[i] = __local_19;
}
__local_20 = 1;
__local_21 = i + __local_20;
i = __local_21;
__local_22 = i < size;
__local_18 = __local_22;
}
arr_aux = arr_new;
__local_23 = 2;
__local_24 = __local_23 * size;
size = __local_24;
}
}
else{
__local_25 = 0;
i = __local_25;
}
__local_26 = 0;
return __local_26;
}
public int top(){
Stack __local_27;
int __local_28;
boolean __local_29;
int __local_30;
int __local_31;
int __local_32;
int __local_33;
int ret;
__local_27 = this;
__local_28 = 1;
__local_29 = up < __local_28;
if(__local_29){
__local_30 = 10000;
ret = __local_30;
}
else{
__local_31 = 1;
__local_32 = up - __local_31;
__local_33 = arr_aux[__local_32];
ret = __local_33;
}
return ret;
}
public int pop(){
Stack __local_34;
int __local_35;
boolean __local_36;
int __local_37;
int __local_38;
int __local_39;
int __local_40;
int __local_41;
int __local_42;
int ret;
__local_34 = this;
__local_35 = 1;
__local_36 = up < __local_35;
if(__local_36){
{
__local_37 = 10000;
ret = __local_37;
}
}
else{
{
__local_38 = 1;
__local_39 = up - __local_38;
__local_40 = arr_aux[__local_39];
ret = __local_40;
__local_41 = 1;
__local_42 = up - __local_41;
up = __local_42;
}
}
return ret;
}
public int print_stack(){
Stack __local_43;
int __local_44;
int __local_45;
int __local_46;
boolean __local_47;
int __local_48;
int __local_49;
int __local_50;
int __local_51;
int __local_52;
int __local_53;
boolean __local_54;
int __local_55;
int i;
__local_43 = this;
i = up;
__local_44 = 0;
__local_45 = 1;
__local_46 = i + __local_45;
__local_47 = __local_44 < __local_46;
while(__local_47){
{
__local_48 = arr_aux[i];
System.out.println(__local_48);
}
__local_49 = 1;
__local_50 = i - __local_49;
i = __local_50;
__local_51 = 0;
__local_52 = 1;
__local_53 = i + __local_52;
__local_54 = __local_51 < __local_53;
__local_47 = __local_54;
}
__local_55 = 0;
return __local_55;
}
public int checker(){
Stack __local_56;
int __local_57;
int __local_58;
int __local_59;
boolean __local_60;
int __local_61;
int __local_62;
int __local_63;
int __local_64;
boolean __local_65;
int __local_66;
int __local_67;
int __local_68;
int __local_69;
boolean __local_70;
int __local_71;
int __local_72;
int __local_73;
boolean __local_74;
int __local_75;
int x;
int i;
__local_56 = this;
__local_57 = __local_56.init();
x = __local_57;
System.out.println(x);
__local_58 = 0;
i = __local_58;
__local_59 = 10;
__local_60 = i < __local_59;
while(__local_60){
{
__local_61 = __local_56.push(i);
x = __local_61;
}
__local_62 = 1;
__local_63 = i + __local_62;
i = __local_63;
__local_64 = 10;
__local_65 = i < __local_64;
__local_60 = __local_65;
}
__local_66 = __local_56.print_stack();
x = __local_66;
__local_67 = __local_56.pop();
x = __local_67;
System.out.println(x);
__local_68 = __local_56.top();
System.out.println(__local_68);
__local_69 = 0;
__local_70 = __local_69 < up;
while(__local_70){
{
__local_71 = __local_56.top();
x = __local_71;
System.out.println(x);
__local_72 = __local_56.pop();
x = __local_72;
}
__local_73 = 0;
__local_74 = __local_73 < up;
__local_70 = __local_74;
}
__local_75 = 0;
return __local_75;
}
}
