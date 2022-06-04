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
int[] __local_4;
__local_2 = this;
__local_4 = new int[1];
__local_2.arr_aux = __local_4;
__local_2.size = 1;
__local_2.up = 0;
return 0;
}
public int push(int x){
Stack __local_8;
int __local_10;
int __local_12;
boolean __local_13;
int __local_15;
int[] __local_16;
boolean __local_18;
int __local_19;
int __local_21;
boolean __local_22;
int __local_24;

int[] arr_new;
int i;
__local_8 = this;
arr_aux[up] = x;
__local_10 = up + 1;
up = __local_10;
__local_12 = up + 1;
__local_13 = size < __local_12;
if(__local_13){
{
__local_15 = 2 * size;
__local_16 = new int[__local_15];
arr_new = __local_16;
i = 0;
__local_18 = i < size;
while(__local_18){
{
__local_19 = arr_aux[i];
arr_new[i] = __local_19;
}
__local_21 = i + 1;
i = __local_21;
__local_22 = i < size;
__local_18 = __local_22;
}
arr_aux = arr_new;
__local_24 = 2 * size;
size = __local_24;
}
}
else{
i = 0;
}
return 0;
}
public int top(){
Stack __local_27;
boolean __local_29;
int __local_32;
int __local_33;
int ret;
__local_27 = this;
__local_29 = up < 1;
if(__local_29){
ret = 10000;
}
else{

__local_32 = up - 1;
__local_33 = arr_aux[__local_32];
ret = __local_33;
}
return ret;
}
public int pop(){
Stack __local_34;
boolean __local_36;
int __local_39;
int __local_40;
int __local_42;
int ret;
__local_34 = this;
__local_36 = up < 1;
if(__local_36){
{
ret = 10000;
}
}
else{
{
__local_39 = up - 1;
__local_40 = arr_aux[__local_39];
ret = __local_40;
__local_42 = up - 1;
up = __local_42;
}
}
return ret;
}
public int print_stack(){
Stack __local_43;
int __local_46;
boolean __local_47;
int __local_48;
int __local_50;
int __local_53;
boolean __local_54;
int i;
__local_43 = this;
i = up;
__local_46 = i + 1;
__local_47 = 0 < __local_46;
while(__local_47){
{
__local_48 = arr_aux[i];
System.out.println(__local_48);
}
__local_50 = i - 1;
i = __local_50;
__local_53 = i + 1;
__local_54 = 0 < __local_53;
__local_47 = __local_54;
}
return 0;
}
public int checker(){
Stack __local_56;
int __local_57;
boolean __local_60;
int __local_61;
int __local_63;
boolean __local_65;
int __local_66;
int __local_67;
int __local_68;
boolean __local_70;
int __local_71;
int __local_72;
boolean __local_74;
int x;
int i;
__local_56 = this;
__local_57 = __local_56.init();
x = __local_57;
System.out.println(x);
i = 0;
__local_60 = i < 10;
while(__local_60){
{
__local_61 = __local_56.push(i);
x = __local_61;
}
__local_63 = i + 1;
i = __local_63;
__local_65 = i < 10;
__local_60 = __local_65;
}
__local_66 = __local_56.print_stack();
x = __local_66;
__local_67 = __local_56.pop();
x = __local_67;
System.out.println(x);
__local_68 = __local_56.top();
System.out.println(__local_68);
__local_70 =  0 < up;
while(__local_70){
{
__local_71 = __local_56.top();
x = __local_71;
System.out.println(x);
__local_72 = __local_56.pop();
x = __local_72;
}
__local_74 = 0 < up;
__local_70 = __local_74;
}
return 0;
}
}
