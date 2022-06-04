class BinaryTree {
public static void main(String [] a){
BT __local_0;
int __local_1;
__local_0 = new BT();
__local_1 = __local_0.Start();
System.out.println(__local_1);
}
}
class BT{
public int Start(){
Tree __local_2;
int __local_3;
boolean __local_4;
boolean __local_5;
int __local_6;
int __local_7;
boolean __local_8;
boolean __local_9;
int __local_10;
boolean __local_11;
int __local_12;
boolean __local_13;
int __local_14;
boolean __local_15;
int __local_16;
boolean __local_17;
int __local_18;
boolean __local_19;
int __local_20;
boolean __local_21;
boolean __local_22;
int __local_23;
int __local_24;
int __local_25;
int __local_26;
int __local_27;
int __local_28;
int __local_29;
int __local_30;
int __local_31;
int __local_32;
int __local_33;
boolean __local_34;
boolean __local_35;
int __local_36;
int __local_37;
int __local_38;
Tree root;
boolean ntb;
int nti;
__local_2 = new Tree();
root = __local_2;
__local_3 = 16;
__local_4 = root.Init(__local_3);
ntb = __local_4;
__local_5 = root.Print();
ntb = __local_5;
__local_6 = 100000000;
System.out.println(__local_6);
__local_7 = 8;
__local_8 = root.Insert(__local_7);
ntb = __local_8;
__local_9 = root.Print();
ntb = __local_9;
__local_10 = 24;
__local_11 = root.Insert(__local_10);
ntb = __local_11;
__local_12 = 4;
__local_13 = root.Insert(__local_12);
ntb = __local_13;
__local_14 = 12;
__local_15 = root.Insert(__local_14);
ntb = __local_15;
__local_16 = 20;
__local_17 = root.Insert(__local_16);
ntb = __local_17;
__local_18 = 28;
__local_19 = root.Insert(__local_18);
ntb = __local_19;
__local_20 = 14;
__local_21 = root.Insert(__local_20);
ntb = __local_21;
__local_22 = root.Print();
ntb = __local_22;
__local_23 = 24;
__local_24 = root.Search(__local_23);
System.out.println(__local_24);
__local_25 = 12;
__local_26 = root.Search(__local_25);
System.out.println(__local_26);
__local_27 = 16;
__local_28 = root.Search(__local_27);
System.out.println(__local_28);
__local_29 = 50;
__local_30 = root.Search(__local_29);
System.out.println(__local_30);
__local_31 = 12;
__local_32 = root.Search(__local_31);
System.out.println(__local_32);
__local_33 = 12;
__local_34 = root.Delete(__local_33);
ntb = __local_34;
__local_35 = root.Print();
ntb = __local_35;
__local_36 = 12;
__local_37 = root.Search(__local_36);
System.out.println(__local_37);
__local_38 = 0;
return __local_38;
}
}
class Tree{
Tree left;
Tree right;
int key;
boolean has_left;
boolean has_right;
Tree my_null;
public boolean Init(int v_key){
boolean __local_39;
boolean __local_40;
boolean __local_41;
key = v_key;
__local_39 = false;
has_left = __local_39;
__local_40 = false;
has_right = __local_40;
__local_41 = true;
return __local_41;
}
public boolean SetRight(Tree rn){
boolean __local_42;
right = rn;
__local_42 = true;
return __local_42;
}
public boolean SetLeft(Tree ln){
boolean __local_43;
left = ln;
__local_43 = true;
return __local_43;
}
public Tree GetRight(){
return right;
}
public Tree GetLeft(){
return left;
}
public int GetKey(){
return key;
}
public boolean SetKey(int v_key){
boolean __local_44;
key = v_key;
__local_44 = true;
return __local_44;
}
public boolean GetHas_Right(){
return has_right;
}
public boolean GetHas_Left(){
return has_left;
}
public boolean SetHas_Left(boolean val){
boolean __local_45;
has_left = val;
__local_45 = true;
return __local_45;
}
public boolean SetHas_Right(boolean val){
boolean __local_46;
has_right = val;
__local_46 = true;
return __local_46;
}
public boolean Compare(int num1,int num2){
boolean __local_47;
int __local_48;
int __local_49;
boolean __local_50;
boolean __local_51;
boolean __local_52;
boolean __local_53;
boolean __local_54;
boolean ntb;
int nti;
__local_47 = false;
ntb = __local_47;
__local_48 = 1;
__local_49 = num2 + __local_48;
nti = __local_49;
__local_50 = num1 < num2;
if(__local_50){
__local_51 = false;
ntb = __local_51;
}
else{
__local_52 = num1 < nti;
__local_52 = !__local_52;
if(__local_52){
__local_53 = false;
ntb = __local_53;
}
else{
__local_54 = true;
ntb = __local_54;
}
}
return ntb;
}
public boolean Insert(int v_key){
Tree __local_55;
boolean __local_56;
boolean __local_57;
int __local_58;
boolean __local_59;
boolean __local_60;
Tree __local_61;
boolean __local_62;
boolean __local_63;
boolean __local_64;
boolean __local_65;
boolean __local_66;
Tree __local_67;
boolean __local_68;
boolean __local_69;
boolean __local_70;
boolean __local_71;
boolean __local_72;
Tree new_node;
boolean ntb;
boolean cont;
int key_aux;
Tree current_node;
__local_55 = new Tree();
new_node = __local_55;
__local_56 = new_node.Init(v_key);
ntb = __local_56;
current_node = this;
__local_57 = true;
cont = __local_57;
while(cont){
{
__local_58 = current_node.GetKey();
key_aux = __local_58;
__local_59 = v_key < key_aux;
if(__local_59){
{
__local_60 = current_node.GetHas_Left();
if(__local_60){
__local_61 = current_node.GetLeft();
current_node = __local_61;
}
else{
{
__local_62 = false;
cont = __local_62;
__local_63 = true;
__local_64 = current_node.SetHas_Left(__local_63);
ntb = __local_64;
__local_65 = current_node.SetLeft(new_node);
ntb = __local_65;
}
}
}
}
else{
{
__local_66 = current_node.GetHas_Right();
if(__local_66){
__local_67 = current_node.GetRight();
current_node = __local_67;
}
else{
{
__local_68 = false;
cont = __local_68;
__local_69 = true;
__local_70 = current_node.SetHas_Right(__local_69);
ntb = __local_70;
__local_71 = current_node.SetRight(new_node);
ntb = __local_71;
}
}
}
}
}
cont = cont;
}
__local_72 = true;
return __local_72;
}
public boolean Delete(int v_key){
boolean __local_73;
boolean __local_74;
boolean __local_75;
int __local_76;
boolean __local_77;
boolean __local_78;
Tree __local_79;
boolean __local_80;
boolean __local_81;
boolean __local_82;
Tree __local_83;
boolean __local_84;
boolean __local_85;
boolean __local_86;
boolean __local_87;
boolean __local_88;
boolean __local_89;
boolean __local_90;
boolean __local_91;
boolean __local_92;
boolean __local_93;
Tree current_node;
Tree parent_node;
boolean cont;
boolean found;
boolean is_root;
int key_aux;
boolean ntb;
current_node = this;
parent_node = this;
__local_73 = true;
cont = __local_73;
__local_74 = false;
found = __local_74;
__local_75 = true;
is_root = __local_75;
while(cont){
{
__local_76 = current_node.GetKey();
key_aux = __local_76;
__local_77 = v_key < key_aux;
if(__local_77){
__local_78 = current_node.GetHas_Left();
if(__local_78){
{
parent_node = current_node;
__local_79 = current_node.GetLeft();
current_node = __local_79;
}
}
else{
__local_80 = false;
cont = __local_80;
}
}
else{
__local_81 = key_aux < v_key;
if(__local_81){
__local_82 = current_node.GetHas_Right();
if(__local_82){
{
parent_node = current_node;
__local_83 = current_node.GetRight();
current_node = __local_83;
}
}
else{
__local_84 = false;
cont = __local_84;
}
}
else{
{
if(is_root){
__local_85 = current_node.GetHas_Right();
__local_85 = !__local_85;
__local_86 = current_node.GetHas_Left();
__local_86 = !__local_86;
__local_87 = __local_85 & __local_86;
if(__local_87){
__local_88 = true;
ntb = __local_88;
}
else{
__local_89 = this.Remove(parent_node,current_node);
ntb = __local_89;
}
}
else{
__local_90 = this.Remove(parent_node,current_node);
ntb = __local_90;
}
__local_91 = true;
found = __local_91;
__local_92 = false;
cont = __local_92;
}
}
}
__local_93 = false;
is_root = __local_93;
}
cont = cont;
}
return found;
}
public boolean Remove(Tree p_node,Tree c_node){
boolean __local_94;
boolean __local_95;
boolean __local_96;
boolean __local_97;
int __local_98;
Tree __local_99;
int __local_100;
boolean __local_101;
boolean __local_102;
boolean __local_103;
boolean __local_104;
boolean __local_105;
boolean __local_106;
boolean __local_107;
boolean __local_108;
boolean ntb;
int auxkey1;
int auxkey2;
__local_94 = c_node.GetHas_Left();
if(__local_94){
__local_95 = this.RemoveLeft(p_node,c_node);
ntb = __local_95;
}
else{
__local_96 = c_node.GetHas_Right();
if(__local_96){
__local_97 = this.RemoveRight(p_node,c_node);
ntb = __local_97;
}
else{
{
__local_98 = c_node.GetKey();
auxkey1 = __local_98;
__local_99 = p_node.GetLeft();
__local_100 = __local_99.GetKey();
auxkey2 = __local_100;
__local_101 = this.Compare(auxkey1,auxkey2);
if(__local_101){
{
__local_102 = p_node.SetLeft(my_null);
ntb = __local_102;
__local_103 = false;
__local_104 = p_node.SetHas_Left(__local_103);
ntb = __local_104;
}
}
else{
{
__local_105 = p_node.SetRight(my_null);
ntb = __local_105;
__local_106 = false;
__local_107 = p_node.SetHas_Right(__local_106);
ntb = __local_107;
}
}
}
}
}
__local_108 = true;
return __local_108;
}
public boolean RemoveRight(Tree p_node,Tree c_node){
boolean __local_109;
Tree __local_110;
int __local_111;
boolean __local_112;
Tree __local_113;
boolean __local_114;
boolean __local_115;
boolean __local_116;
boolean __local_117;
boolean __local_118;
boolean ntb;
__local_109 = c_node.GetHas_Right();
while(__local_109){
{
__local_110 = c_node.GetRight();
__local_111 = __local_110.GetKey();
__local_112 = c_node.SetKey(__local_111);
ntb = __local_112;
p_node = c_node;
__local_113 = c_node.GetRight();
c_node = __local_113;
}
__local_114 = c_node.GetHas_Right();
__local_109 = __local_114;
}
__local_115 = p_node.SetRight(my_null);
ntb = __local_115;
__local_116 = false;
__local_117 = p_node.SetHas_Right(__local_116);
ntb = __local_117;
__local_118 = true;
return __local_118;
}
public boolean RemoveLeft(Tree p_node,Tree c_node){
boolean __local_119;
Tree __local_120;
int __local_121;
boolean __local_122;
Tree __local_123;
boolean __local_124;
boolean __local_125;
boolean __local_126;
boolean __local_127;
boolean __local_128;
boolean ntb;
__local_119 = c_node.GetHas_Left();
while(__local_119){
{
__local_120 = c_node.GetLeft();
__local_121 = __local_120.GetKey();
__local_122 = c_node.SetKey(__local_121);
ntb = __local_122;
p_node = c_node;
__local_123 = c_node.GetLeft();
c_node = __local_123;
}
__local_124 = c_node.GetHas_Left();
__local_119 = __local_124;
}
__local_125 = p_node.SetLeft(my_null);
ntb = __local_125;
__local_126 = false;
__local_127 = p_node.SetHas_Left(__local_126);
ntb = __local_127;
__local_128 = true;
return __local_128;
}
public int Search(int v_key){
boolean __local_129;
int __local_130;
int __local_131;
boolean __local_132;
boolean __local_133;
Tree __local_134;
boolean __local_135;
boolean __local_136;
boolean __local_137;
Tree __local_138;
boolean __local_139;
int __local_140;
boolean __local_141;
boolean cont;
int ifound;
Tree current_node;
int key_aux;
current_node = this;
__local_129 = true;
cont = __local_129;
__local_130 = 0;
ifound = __local_130;
while(cont){
{
__local_131 = current_node.GetKey();
key_aux = __local_131;
__local_132 = v_key < key_aux;
if(__local_132){
__local_133 = current_node.GetHas_Left();
if(__local_133){
__local_134 = current_node.GetLeft();
current_node = __local_134;
}
else{
__local_135 = false;
cont = __local_135;
}
}
else{
__local_136 = key_aux < v_key;
if(__local_136){
__local_137 = current_node.GetHas_Right();
if(__local_137){
__local_138 = current_node.GetRight();
current_node = __local_138;
}
else{
__local_139 = false;
cont = __local_139;
}
}
else{
{
__local_140 = 1;
ifound = __local_140;
__local_141 = false;
cont = __local_141;
}
}
}
}
cont = cont;
}
return ifound;
}
public boolean Print(){
boolean __local_142;
boolean __local_143;
Tree current_node;
boolean ntb;
current_node = this;
__local_142 = this.RecPrint(current_node);
ntb = __local_142;
__local_143 = true;
return __local_143;
}
public boolean RecPrint(Tree node){
boolean __local_144;
Tree __local_145;
boolean __local_146;
boolean __local_147;
int __local_148;
boolean __local_149;
Tree __local_150;
boolean __local_151;
boolean __local_152;
boolean __local_153;
boolean ntb;
__local_144 = node.GetHas_Left();
if(__local_144){
{
__local_145 = node.GetLeft();
__local_146 = this.RecPrint(__local_145);
ntb = __local_146;
}
}
else{
__local_147 = true;
ntb = __local_147;
}
__local_148 = node.GetKey();
System.out.println(__local_148);
__local_149 = node.GetHas_Right();
if(__local_149){
{
__local_150 = node.GetRight();
__local_151 = this.RecPrint(__local_150);
ntb = __local_151;
}
}
else{
__local_152 = true;
ntb = __local_152;
}
__local_153 = true;
return __local_153;
}
}
