class LinkedList {
public static void main(String [] a){
LL __local_0;
int __local_1;
__local_0 = new LL();
__local_1 = __local_0.Start();
System.out.println(__local_1);
}
}
class Element{
int Age;
int Salary;
boolean Married;
public boolean Init(int v_Age,int v_Salary,boolean v_Married){
boolean __local_2;
Age = v_Age;
Salary = v_Salary;
Married = v_Married;
__local_2 = true;
return __local_2;
}
public int GetAge(){
return Age;
}
public int GetSalary(){
return Salary;
}
public boolean GetMarried(){
return Married;
}
public boolean Equal(Element other){
boolean __local_3;
int __local_4;
boolean __local_5;
boolean __local_6;
int __local_7;
boolean __local_8;
boolean __local_9;
boolean __local_10;
boolean __local_11;
int __local_12;
boolean __local_13;
boolean __local_14;
int __local_15;
boolean ret_val;
int aux01;
int aux02;
int nt;
__local_3 = true;
ret_val = __local_3;
__local_4 = other.GetAge();
aux01 = __local_4;
__local_5 = this.Compare(aux01,Age);
__local_5 = !__local_5;
if(__local_5){
__local_6 = false;
ret_val = __local_6;
}
else{
{
__local_7 = other.GetSalary();
aux02 = __local_7;
__local_8 = this.Compare(aux02,Salary);
__local_8 = !__local_8;
if(__local_8){
__local_9 = false;
ret_val = __local_9;
}
else{
if(Married){
__local_10 = other.GetMarried();
__local_10 = !__local_10;
if(__local_10){
__local_11 = false;
ret_val = __local_11;
}
else{
__local_12 = 0;
nt = __local_12;
}
}
else{
__local_13 = other.GetMarried();
if(__local_13){
__local_14 = false;
ret_val = __local_14;
}
else{
__local_15 = 0;
nt = __local_15;
}
}
}
}
}
return ret_val;
}
public boolean Compare(int num1,int num2){
boolean __local_16;
int __local_17;
int __local_18;
boolean __local_19;
boolean __local_20;
boolean __local_21;
boolean __local_22;
boolean __local_23;
boolean retval;
int aux02;
__local_16 = false;
retval = __local_16;
__local_17 = 1;
__local_18 = num2 + __local_17;
aux02 = __local_18;
__local_19 = num1 < num2;
if(__local_19){
__local_20 = false;
retval = __local_20;
}
else{
__local_21 = num1 < aux02;
__local_21 = !__local_21;
if(__local_21){
__local_22 = false;
retval = __local_22;
}
else{
__local_23 = true;
retval = __local_23;
}
}
return retval;
}
}
class List{
Element elem;
List next;
boolean end;
public boolean Init(){
boolean __local_24;
boolean __local_25;
__local_24 = true;
end = __local_24;
__local_25 = true;
return __local_25;
}
public boolean InitNew(Element v_elem,List v_next,boolean v_end){
boolean __local_26;
end = v_end;
elem = v_elem;
next = v_next;
__local_26 = true;
return __local_26;
}
public List Insert(Element new_elem){
List __local_27;
boolean __local_28;
boolean __local_29;
boolean ret_val;
List aux03;
List aux02;
aux03 = this;
__local_27 = new List();
aux02 = __local_27;
__local_28 = false;
__local_29 = aux02.InitNew(new_elem,aux03,__local_28);
ret_val = __local_29;
return aux02;
}
public boolean SetNext(List v_next){
boolean __local_30;
next = v_next;
__local_30 = true;
return __local_30;
}
public List Delete(Element e){
boolean __local_31;
int __local_32;
int __local_33;
int __local_34;
boolean __local_35;
boolean __local_36;
boolean __local_37;
int __local_38;
boolean __local_39;
List __local_40;
int __local_41;
int __local_42;
int __local_43;
List __local_44;
boolean __local_45;
int __local_46;
int __local_47;
int __local_48;
int __local_49;
List __local_50;
boolean __local_51;
Element __local_52;
int __local_53;
int __local_54;
boolean __local_55;
List my_head;
boolean ret_val;
boolean aux05;
List aux01;
List prev;
boolean var_end;
Element var_elem;
int aux04;
int nt;
my_head = this;
__local_31 = false;
ret_val = __local_31;
__local_32 = 0;
__local_33 = 1;
__local_34 = __local_32 - __local_33;
aux04 = __local_34;
aux01 = this;
prev = this;
var_end = end;
var_elem = elem;
var_end = !var_end;
ret_val = !ret_val;
__local_35 = var_end & ret_val;
while(__local_35){
{
__local_36 = e.Equal(var_elem);
if(__local_36){
{
__local_37 = true;
ret_val = __local_37;
__local_38 = 0;
__local_39 = aux04 < __local_38;
if(__local_39){
{
__local_40 = aux01.GetNext();
my_head = __local_40;
}
}
else{
{
__local_41 = 0;
__local_42 = 555;
__local_43 = __local_41 - __local_42;
System.out.println(__local_43);
__local_44 = aux01.GetNext();
__local_45 = prev.SetNext(__local_44);
aux05 = __local_45;
__local_46 = 0;
__local_47 = 555;
__local_48 = __local_46 - __local_47;
System.out.println(__local_48);
}
}
}
}
else{
__local_49 = 0;
nt = __local_49;
}
ret_val = !ret_val;
if(ret_val){
{
prev = aux01;
__local_50 = aux01.GetNext();
aux01 = __local_50;
__local_51 = aux01.GetEnd();
var_end = __local_51;
__local_52 = aux01.GetElem();
var_elem = __local_52;
__local_53 = 1;
aux04 = __local_53;
}
}
else{
__local_54 = 0;
nt = __local_54;
}
}
var_end = !var_end;
ret_val = !ret_val;
__local_55 = var_end & ret_val;
__local_35 = __local_55;
}
return my_head;
}
public int Search(Element e){
int __local_56;
boolean __local_57;
int __local_58;
int __local_59;
List __local_60;
boolean __local_61;
Element __local_62;
int int_ret_val;
List aux01;
Element var_elem;
boolean var_end;
int nt;
__local_56 = 0;
int_ret_val = __local_56;
aux01 = this;
var_end = end;
var_elem = elem;
var_end = !var_end;
while(var_end){
{
__local_57 = e.Equal(var_elem);
if(__local_57){
{
__local_58 = 1;
int_ret_val = __local_58;
}
}
else{
__local_59 = 0;
nt = __local_59;
}
__local_60 = aux01.GetNext();
aux01 = __local_60;
__local_61 = aux01.GetEnd();
var_end = __local_61;
__local_62 = aux01.GetElem();
var_elem = __local_62;
}
var_end = !var_end;
var_end = var_end;
}
return int_ret_val;
}
public boolean GetEnd(){
return end;
}
public Element GetElem(){
return elem;
}
public List GetNext(){
return next;
}
public boolean Print(){
int __local_63;
List __local_64;
boolean __local_65;
Element __local_66;
boolean __local_67;
List aux01;
boolean var_end;
Element var_elem;
aux01 = this;
var_end = end;
var_elem = elem;
var_end = !var_end;
while(var_end){
{
__local_63 = var_elem.GetAge();
System.out.println(__local_63);
__local_64 = aux01.GetNext();
aux01 = __local_64;
__local_65 = aux01.GetEnd();
var_end = __local_65;
__local_66 = aux01.GetElem();
var_elem = __local_66;
}
var_end = !var_end;
var_end = var_end;
}
__local_67 = true;
return __local_67;
}
}
class LL{
public int Start(){
List __local_68;
boolean __local_69;
boolean __local_70;
boolean __local_71;
Element __local_72;
int __local_73;
int __local_74;
boolean __local_75;
boolean __local_76;
List __local_77;
boolean __local_78;
int __local_79;
Element __local_80;
int __local_81;
int __local_82;
boolean __local_83;
boolean __local_84;
List __local_85;
boolean __local_86;
int __local_87;
Element __local_88;
int __local_89;
int __local_90;
boolean __local_91;
boolean __local_92;
List __local_93;
boolean __local_94;
Element __local_95;
int __local_96;
int __local_97;
boolean __local_98;
boolean __local_99;
int __local_100;
int __local_101;
int __local_102;
Element __local_103;
int __local_104;
int __local_105;
boolean __local_106;
boolean __local_107;
List __local_108;
boolean __local_109;
int __local_110;
List __local_111;
boolean __local_112;
int __local_113;
List __local_114;
boolean __local_115;
int __local_116;
int __local_117;
List head;
List last_elem;
boolean aux01;
Element el01;
Element el02;
Element el03;
__local_68 = new List();
last_elem = __local_68;
__local_69 = last_elem.Init();
aux01 = __local_69;
head = last_elem;
__local_70 = head.Init();
aux01 = __local_70;
__local_71 = head.Print();
aux01 = __local_71;
__local_72 = new Element();
el01 = __local_72;
__local_73 = 25;
__local_74 = 37000;
__local_75 = false;
__local_76 = el01.Init(__local_73,__local_74,__local_75);
aux01 = __local_76;
__local_77 = head.Insert(el01);
head = __local_77;
__local_78 = head.Print();
aux01 = __local_78;
__local_79 = 10000000;
System.out.println(__local_79);
__local_80 = new Element();
el01 = __local_80;
__local_81 = 39;
__local_82 = 42000;
__local_83 = true;
__local_84 = el01.Init(__local_81,__local_82,__local_83);
aux01 = __local_84;
el02 = el01;
__local_85 = head.Insert(el01);
head = __local_85;
__local_86 = head.Print();
aux01 = __local_86;
__local_87 = 10000000;
System.out.println(__local_87);
__local_88 = new Element();
el01 = __local_88;
__local_89 = 22;
__local_90 = 34000;
__local_91 = false;
__local_92 = el01.Init(__local_89,__local_90,__local_91);
aux01 = __local_92;
__local_93 = head.Insert(el01);
head = __local_93;
__local_94 = head.Print();
aux01 = __local_94;
__local_95 = new Element();
el03 = __local_95;
__local_96 = 27;
__local_97 = 34000;
__local_98 = false;
__local_99 = el03.Init(__local_96,__local_97,__local_98);
aux01 = __local_99;
__local_100 = head.Search(el02);
System.out.println(__local_100);
__local_101 = head.Search(el03);
System.out.println(__local_101);
__local_102 = 10000000;
System.out.println(__local_102);
__local_103 = new Element();
el01 = __local_103;
__local_104 = 28;
__local_105 = 35000;
__local_106 = false;
__local_107 = el01.Init(__local_104,__local_105,__local_106);
aux01 = __local_107;
__local_108 = head.Insert(el01);
head = __local_108;
__local_109 = head.Print();
aux01 = __local_109;
__local_110 = 2220000;
System.out.println(__local_110);
__local_111 = head.Delete(el02);
head = __local_111;
__local_112 = head.Print();
aux01 = __local_112;
__local_113 = 33300000;
System.out.println(__local_113);
__local_114 = head.Delete(el01);
head = __local_114;
__local_115 = head.Print();
aux01 = __local_115;
__local_116 = 44440000;
System.out.println(__local_116);
__local_117 = 0;
return __local_117;
}
}
