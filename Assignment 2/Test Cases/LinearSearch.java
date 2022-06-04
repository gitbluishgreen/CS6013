class LinearSearch {
public static void main(String [] a){
LS __local_0;
int __local_1;
int __local_2;
__local_0 = new LS();
__local_1 = 10;
__local_2 = __local_0.Start(__local_1);
System.out.println(__local_2);
}
}
class LS{
int[] number;
int size;
public int Start(int sz){
int __local_3;
int __local_4;
int __local_5;
int __local_6;
int __local_7;
int __local_8;
int __local_9;
int __local_10;
int __local_11;
int __local_12;
int __local_13;
int __local_14;
int aux01;
int aux02;
__local_3 = this.Init(sz);
aux01 = __local_3;
__local_4 = this.Print();
aux02 = __local_4;
__local_5 = 9999;
System.out.println(__local_5);
__local_6 = 8;
__local_7 = this.Search(__local_6);
System.out.println(__local_7);
__local_8 = 12;
__local_9 = this.Search(__local_8);
System.out.println(__local_9);
__local_10 = 17;
__local_11 = this.Search(__local_10);
System.out.println(__local_11);
__local_12 = 50;
__local_13 = this.Search(__local_12);
System.out.println(__local_13);
__local_14 = 55;
return __local_14;
}
public int Print(){
int __local_15;
boolean __local_16;
int __local_17;
int __local_18;
int __local_19;
boolean __local_20;
int __local_21;
int j;
__local_15 = 1;
j = __local_15;
__local_16 = j < size;
while(__local_16){
{
__local_17 = number[j];
System.out.println(__local_17);
__local_18 = 1;
__local_19 = j + __local_18;
j = __local_19;
}
__local_20 = j < size;
__local_16 = __local_20;
}
__local_21 = 0;
return __local_21;
}
public int Search(int num){
int __local_22;
boolean __local_23;
int __local_24;
boolean __local_25;
int __local_26;
int __local_27;
int __local_28;
boolean __local_29;
int __local_30;
boolean __local_31;
int __local_32;
boolean __local_33;
int __local_34;
int __local_35;
int __local_36;
boolean __local_37;
int j;
boolean ls01;
int ifound;
int aux01;
int aux02;
int nt;
__local_22 = 1;
j = __local_22;
__local_23 = false;
ls01 = __local_23;
__local_24 = 0;
ifound = __local_24;
__local_25 = j < size;
while(__local_25){
{
__local_26 = number[j];
aux01 = __local_26;
__local_27 = 1;
__local_28 = num + __local_27;
aux02 = __local_28;
__local_29 = aux01 < num;
if(__local_29){
__local_30 = 0;
nt = __local_30;
}
else{
__local_31 = aux01 < aux02;
__local_31 = !__local_31;
if(__local_31){
__local_32 = 0;
nt = __local_32;
}
else{
{
__local_33 = true;
ls01 = __local_33;
__local_34 = 1;
ifound = __local_34;
j = size;
}
}
}
__local_35 = 1;
__local_36 = j + __local_35;
j = __local_36;
}
__local_37 = j < size;
__local_25 = __local_37;
}
return ifound;
}
public int Init(int sz){
int[] __local_38;
int __local_39;
int __local_40;
int __local_41;
boolean __local_42;
int __local_43;
int __local_44;
int __local_45;
int __local_46;
int __local_47;
int __local_48;
int __local_49;
int __local_50;
int __local_51;
boolean __local_52;
int __local_53;
int j;
int k;
int aux01;
int aux02;
size = sz;
__local_38 = new int[sz];
number = __local_38;
__local_39 = 1;
j = __local_39;
__local_40 = 1;
__local_41 = size + __local_40;
k = __local_41;
__local_42 = j < size;
while(__local_42){
{
__local_43 = 2;
__local_44 = __local_43 * j;
aux01 = __local_44;
__local_45 = 3;
__local_46 = k - __local_45;
aux02 = __local_46;
__local_47 = aux01 + aux02;
number[j] = __local_47;
__local_48 = 1;
__local_49 = j + __local_48;
j = __local_49;
__local_50 = 1;
__local_51 = k - __local_50;
k = __local_51;
}
__local_52 = j < size;
__local_42 = __local_52;
}
__local_53 = 0;
return __local_53;
}
}
