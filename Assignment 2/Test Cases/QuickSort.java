class QuickSort {
public static void main(String [] a){
QS __local_0;
int __local_1;
int __local_2;
__local_0 = new QS();
__local_1 = 10;
__local_2 = __local_0.Start(__local_1);
System.out.println(__local_2);
}
}
class QS{
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
int aux01;
__local_3 = this.Init(sz);
aux01 = __local_3;
__local_4 = this.Print();
aux01 = __local_4;
__local_5 = 9999;
System.out.println(__local_5);
__local_6 = 1;
__local_7 = size - __local_6;
aux01 = __local_7;
__local_8 = 0;
__local_9 = this.Sort(__local_8,aux01);
aux01 = __local_9;
__local_10 = this.Print();
aux01 = __local_10;
__local_11 = 0;
return __local_11;
}
public int Sort(int left,int right){
int __local_12;
boolean __local_13;
int __local_14;
int __local_15;
int __local_16;
boolean __local_17;
boolean __local_18;
int __local_19;
int __local_20;
int __local_21;
boolean __local_22;
boolean __local_23;
boolean __local_24;
boolean __local_25;
int __local_26;
int __local_27;
int __local_28;
boolean __local_29;
boolean __local_30;
boolean __local_31;
int __local_32;
int __local_33;
int __local_34;
int __local_35;
boolean __local_36;
boolean __local_37;
boolean __local_38;
int __local_39;
int __local_40;
int __local_41;
int __local_42;
int __local_43;
int __local_44;
int __local_45;
int __local_46;
int __local_47;
int __local_48;
int v;
int i;
int j;
int nt;
int t;
boolean cont01;
boolean cont02;
int aux03;
__local_12 = 0;
t = __local_12;
__local_13 = left < right;
if(__local_13){
{
__local_14 = number[right];
v = __local_14;
__local_15 = 1;
__local_16 = left - __local_15;
i = __local_16;
j = right;
__local_17 = true;
cont01 = __local_17;
while(cont01){
{
__local_18 = true;
cont02 = __local_18;
while(cont02){
{
__local_19 = 1;
__local_20 = i + __local_19;
i = __local_20;
__local_21 = number[i];
aux03 = __local_21;
__local_22 = aux03 < v;
__local_22 = !__local_22;
if(__local_22){
__local_23 = false;
cont02 = __local_23;
}
else{
__local_24 = true;
cont02 = __local_24;
}
}
cont02 = cont02;
}
__local_25 = true;
cont02 = __local_25;
while(cont02){
{
__local_26 = 1;
__local_27 = j - __local_26;
j = __local_27;
__local_28 = number[j];
aux03 = __local_28;
__local_29 = v < aux03;
__local_29 = !__local_29;
if(__local_29){
__local_30 = false;
cont02 = __local_30;
}
else{
__local_31 = true;
cont02 = __local_31;
}
}
cont02 = cont02;
}
__local_32 = number[i];
t = __local_32;
__local_33 = number[j];
number[i] = __local_33;
number[j] = t;
__local_34 = 1;
__local_35 = i + __local_34;
__local_36 = j < __local_35;
if(__local_36){
__local_37 = false;
cont01 = __local_37;
}
else{
__local_38 = true;
cont01 = __local_38;
}
}
cont01 = cont01;
}
__local_39 = number[i];
number[j] = __local_39;
__local_40 = number[right];
number[i] = __local_40;
number[right] = t;
__local_41 = 1;
__local_42 = i - __local_41;
__local_43 = this.Sort(left,__local_42);
nt = __local_43;
__local_44 = 1;
__local_45 = i + __local_44;
__local_46 = this.Sort(__local_45,right);
nt = __local_46;
}
}
else{
__local_47 = 0;
nt = __local_47;
}
__local_48 = 0;
return __local_48;
}
public int Print(){
int __local_49;
boolean __local_50;
int __local_51;
int __local_52;
int __local_53;
boolean __local_54;
int __local_55;
int j;
__local_49 = 0;
j = __local_49;
__local_50 = j < size;
while(__local_50){
{
__local_51 = number[j];
System.out.println(__local_51);
__local_52 = 1;
__local_53 = j + __local_52;
j = __local_53;
}
__local_54 = j < size;
__local_50 = __local_54;
}
__local_55 = 0;
return __local_55;
}
public int Init(int sz){
int[] __local_56;
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
int __local_67;
int __local_68;
int __local_69;
int __local_70;
int __local_71;
int __local_72;
int __local_73;
int __local_74;
int __local_75;
int __local_76;
int __local_77;
size = sz;
__local_56 = new int[sz];
number = __local_56;
__local_57 = 0;
__local_58 = 20;
number[__local_57] = __local_58;
__local_59 = 1;
__local_60 = 7;
number[__local_59] = __local_60;
__local_61 = 2;
__local_62 = 12;
number[__local_61] = __local_62;
__local_63 = 3;
__local_64 = 18;
number[__local_63] = __local_64;
__local_65 = 4;
__local_66 = 2;
number[__local_65] = __local_66;
__local_67 = 5;
__local_68 = 11;
number[__local_67] = __local_68;
__local_69 = 6;
__local_70 = 6;
number[__local_69] = __local_70;
__local_71 = 7;
__local_72 = 9;
number[__local_71] = __local_72;
__local_73 = 8;
__local_74 = 19;
number[__local_73] = __local_74;
__local_75 = 9;
__local_76 = 5;
number[__local_75] = __local_76;
__local_77 = 0;
return __local_77;
}
}
