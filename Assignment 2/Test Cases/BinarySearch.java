class BinarySearch {
public static void main(String [] a){
BS __local_0;
int __local_1;
int __local_2;
__local_0 = new BS();
__local_1 = 20;
__local_2 = __local_0.Start(__local_1);
System.out.println(__local_2);
}
}
class BS{
int[] number;
int size;
public int Start(int sz){
int __local_3;
int __local_4;
int __local_5;
boolean __local_6;
int __local_7;
int __local_8;
int __local_9;
boolean __local_10;
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
boolean __local_22;
int __local_23;
int __local_24;
int __local_25;
boolean __local_26;
int __local_27;
int __local_28;
int __local_29;
boolean __local_30;
int __local_31;
int __local_32;
int __local_33;
boolean __local_34;
int __local_35;
int __local_36;
int __local_37;
int aux01;
int aux02;
__local_3 = this.Init(sz);
aux01 = __local_3;
__local_4 = this.Print();
aux02 = __local_4;
__local_5 = 8;
__local_6 = this.Search(__local_5);
if(__local_6){
__local_7 = 1;
System.out.println(__local_7);
}
else{
__local_8 = 0;
System.out.println(__local_8);
}
__local_9 = 19;
__local_10 = this.Search(__local_9);
if(__local_10){
__local_11 = 1;
System.out.println(__local_11);
}
else{
__local_12 = 0;
System.out.println(__local_12);
}
__local_13 = 20;
__local_14 = this.Search(__local_13);
if(__local_14){
__local_15 = 1;
System.out.println(__local_15);
}
else{
__local_16 = 0;
System.out.println(__local_16);
}
__local_17 = 21;
__local_18 = this.Search(__local_17);
if(__local_18){
__local_19 = 1;
System.out.println(__local_19);
}
else{
__local_20 = 0;
System.out.println(__local_20);
}
__local_21 = 37;
__local_22 = this.Search(__local_21);
if(__local_22){
__local_23 = 1;
System.out.println(__local_23);
}
else{
__local_24 = 0;
System.out.println(__local_24);
}
__local_25 = 38;
__local_26 = this.Search(__local_25);
if(__local_26){
__local_27 = 1;
System.out.println(__local_27);
}
else{
__local_28 = 0;
System.out.println(__local_28);
}
__local_29 = 39;
__local_30 = this.Search(__local_29);
if(__local_30){
__local_31 = 1;
System.out.println(__local_31);
}
else{
__local_32 = 0;
System.out.println(__local_32);
}
__local_33 = 50;
__local_34 = this.Search(__local_33);
if(__local_34){
__local_35 = 1;
System.out.println(__local_35);
}
else{
__local_36 = 0;
System.out.println(__local_36);
}
__local_37 = 999;
return __local_37;
}
public boolean Search(int num){
int __local_38;
boolean __local_39;
int __local_40;
int __local_41;
int __local_42;
int __local_43;
boolean __local_44;
int __local_45;
int __local_46;
int __local_47;
boolean __local_48;
int __local_49;
int __local_50;
int __local_51;
int __local_52;
boolean __local_53;
boolean __local_54;
boolean __local_55;
boolean __local_56;
boolean __local_57;
int __local_58;
boolean __local_59;
boolean __local_60;
boolean __local_61;
boolean bs01;
int right;
int left;
boolean var_cont;
int medium;
int aux01;
int nt;
__local_38 = 0;
aux01 = __local_38;
__local_39 = false;
bs01 = __local_39;
__local_40 = number.length;
right = __local_40;
__local_41 = 1;
__local_42 = right - __local_41;
right = __local_42;
__local_43 = 0;
left = __local_43;
__local_44 = true;
var_cont = __local_44;
while(var_cont){
{
__local_45 = left + right;
medium = __local_45;
__local_46 = this.Div(medium);
medium = __local_46;
__local_47 = number[medium];
aux01 = __local_47;
__local_48 = num < aux01;
if(__local_48){
__local_49 = 1;
__local_50 = medium - __local_49;
right = __local_50;
}
else{
__local_51 = 1;
__local_52 = medium + __local_51;
left = __local_52;
}
__local_53 = this.Compare(aux01,num);
if(__local_53){
__local_54 = false;
var_cont = __local_54;
}
else{
__local_55 = true;
var_cont = __local_55;
}
__local_56 = right < left;
if(__local_56){
__local_57 = false;
var_cont = __local_57;
}
else{
__local_58 = 0;
nt = __local_58;
}
}
var_cont = var_cont;
}
__local_59 = this.Compare(aux01,num);
if(__local_59){
__local_60 = true;
bs01 = __local_60;
}
else{
__local_61 = false;
bs01 = __local_61;
}
return bs01;
}
public int Div(int num){
int __local_62;
int __local_63;
int __local_64;
int __local_65;
boolean __local_66;
int __local_67;
int __local_68;
int __local_69;
int __local_70;
boolean __local_71;
int count01;
int count02;
int aux03;
__local_62 = 0;
count01 = __local_62;
__local_63 = 0;
count02 = __local_63;
__local_64 = 1;
__local_65 = num - __local_64;
aux03 = __local_65;
__local_66 = count02 < aux03;
while(__local_66){
{
__local_67 = 1;
__local_68 = count01 + __local_67;
count01 = __local_68;
__local_69 = 2;
__local_70 = count02 + __local_69;
count02 = __local_70;
}
__local_71 = count02 < aux03;
__local_66 = __local_71;
}
return count01;
}
public boolean Compare(int num1,int num2){
boolean __local_72;
int __local_73;
int __local_74;
boolean __local_75;
boolean __local_76;
boolean __local_77;
boolean __local_78;
boolean __local_79;
boolean retval;
int aux02;
__local_72 = false;
retval = __local_72;
__local_73 = 1;
__local_74 = num2 + __local_73;
aux02 = __local_74;
__local_75 = num1 < num2;
if(__local_75){
__local_76 = false;
retval = __local_76;
}
else{
__local_77 = num1 < aux02;
__local_77 = !__local_77;
if(__local_77){
__local_78 = false;
retval = __local_78;
}
else{
__local_79 = true;
retval = __local_79;
}
}
return retval;
}
public int Print(){
int __local_80;
boolean __local_81;
int __local_82;
int __local_83;
int __local_84;
boolean __local_85;
int __local_86;
int __local_87;
int j;
__local_80 = 1;
j = __local_80;
__local_81 = j < size;
while(__local_81){
{
__local_82 = number[j];
System.out.println(__local_82);
__local_83 = 1;
__local_84 = j + __local_83;
j = __local_84;
}
__local_85 = j < size;
__local_81 = __local_85;
}
__local_86 = 99999;
System.out.println(__local_86);
__local_87 = 0;
return __local_87;
}
public int Init(int sz){
int[] __local_88;
int __local_89;
int __local_90;
int __local_91;
boolean __local_92;
int __local_93;
int __local_94;
int __local_95;
int __local_96;
int __local_97;
int __local_98;
int __local_99;
int __local_100;
int __local_101;
boolean __local_102;
int __local_103;
int j;
int k;
int aux02;
int aux01;
size = sz;
__local_88 = new int[sz];
number = __local_88;
__local_89 = 1;
j = __local_89;
__local_90 = 1;
__local_91 = size + __local_90;
k = __local_91;
__local_92 = j < size;
while(__local_92){
{
__local_93 = 2;
__local_94 = __local_93 * j;
aux01 = __local_94;
__local_95 = 3;
__local_96 = k - __local_95;
aux02 = __local_96;
__local_97 = aux01 + aux02;
number[j] = __local_97;
__local_98 = 1;
__local_99 = j + __local_98;
j = __local_99;
__local_100 = 1;
__local_101 = k - __local_100;
k = __local_101;
}
__local_102 = j < size;
__local_92 = __local_102;
}
__local_103 = 0;
return __local_103;
}
}
