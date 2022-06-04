class BubbleSort {
public static void main(String [] a){
BBS __local_0;
int __local_1;
int __local_2;
__local_0 = new BBS();
__local_1 = 10;
__local_2 = __local_0.Start(__local_1);
System.out.println(__local_2);
}
}
class BBS{
int[] number;
int size;
public int Start(int sz){
int __local_3;
int __local_4;
int __local_5;
int __local_6;
int __local_7;
int __local_8;
int aux01;
__local_3 = this.Init(sz);
aux01 = __local_3;
__local_4 = this.Print();
aux01 = __local_4;
__local_5 = 99999;
System.out.println(__local_5);
__local_6 = this.Sort();
aux01 = __local_6;
__local_7 = this.Print();
aux01 = __local_7;
__local_8 = 0;
return __local_8;
}
public int Sort(){
int __local_9;
int __local_10;
int __local_11;
int __local_12;
int __local_13;
boolean __local_14;
int __local_15;
int __local_16;
int __local_17;
boolean __local_18;
int __local_19;
int __local_20;
int __local_21;
int __local_22;
boolean __local_23;
int __local_24;
int __local_25;
int __local_26;
int __local_27;
int __local_28;
int __local_29;
int __local_30;
int __local_31;
int __local_32;
boolean __local_33;
int __local_34;
int __local_35;
boolean __local_36;
int __local_37;
int nt;
int i;
int aux02;
int aux04;
int aux05;
int aux06;
int aux07;
int j;
int t;
__local_9 = 1;
__local_10 = size - __local_9;
i = __local_10;
__local_11 = 0;
__local_12 = 1;
__local_13 = __local_11 - __local_12;
aux02 = __local_13;
__local_14 = aux02 < i;
while(__local_14){
{
__local_15 = 1;
j = __local_15;
__local_16 = 1;
__local_17 = i + __local_16;
__local_18 = j < __local_17;
while(__local_18){
{
__local_19 = 1;
__local_20 = j - __local_19;
aux07 = __local_20;
__local_21 = number[aux07];
aux04 = __local_21;
__local_22 = number[j];
aux05 = __local_22;
__local_23 = aux05 < aux04;
if(__local_23){
{
__local_24 = 1;
__local_25 = j - __local_24;
aux06 = __local_25;
__local_26 = number[aux06];
t = __local_26;
__local_27 = number[j];
number[aux06] = __local_27;
number[j] = t;
}
}
else{
__local_28 = 0;
nt = __local_28;
}
__local_29 = 1;
__local_30 = j + __local_29;
j = __local_30;
}
__local_31 = 1;
__local_32 = i + __local_31;
__local_33 = j < __local_32;
__local_18 = __local_33;
}
__local_34 = 1;
__local_35 = i - __local_34;
i = __local_35;
}
__local_36 = aux02 < i;
__local_14 = __local_36;
}
__local_37 = 0;
return __local_37;
}
public int Print(){
int __local_38;
boolean __local_39;
int __local_40;
int __local_41;
int __local_42;
boolean __local_43;
int __local_44;
int j;
__local_38 = 0;
j = __local_38;
__local_39 = j < size;
while(__local_39){
{
__local_40 = number[j];
System.out.println(__local_40);
__local_41 = 1;
__local_42 = j + __local_41;
j = __local_42;
}
__local_43 = j < size;
__local_39 = __local_43;
}
__local_44 = 0;
return __local_44;
}
public int Init(int sz){
int[] __local_45;
int __local_46;
int __local_47;
int __local_48;
int __local_49;
int __local_50;
int __local_51;
int __local_52;
int __local_53;
int __local_54;
int __local_55;
int __local_56;
int __local_57;
int __local_58;
int __local_59;
int __local_60;
int __local_61;
int __local_62;
int __local_63;
int __local_64;
int __local_65;
int __local_66;
size = sz;
__local_45 = new int[sz];
number = __local_45;
__local_46 = 0;
__local_47 = 20;
number[__local_46] = __local_47;
__local_48 = 1;
__local_49 = 7;
number[__local_48] = __local_49;
__local_50 = 2;
__local_51 = 12;
number[__local_50] = __local_51;
__local_52 = 3;
__local_53 = 18;
number[__local_52] = __local_53;
__local_54 = 4;
__local_55 = 2;
number[__local_54] = __local_55;
__local_56 = 5;
__local_57 = 11;
number[__local_56] = __local_57;
__local_58 = 6;
__local_59 = 6;
number[__local_58] = __local_59;
__local_60 = 7;
__local_61 = 9;
number[__local_60] = __local_61;
__local_62 = 8;
__local_63 = 19;
number[__local_62] = __local_63;
__local_64 = 9;
__local_65 = 5;
number[__local_64] = __local_65;
__local_66 = 0;
return __local_66;
}
}
