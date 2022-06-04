class TreeVisitor {
public static void main(String [] a){
TV __local_0;
int __local_1;
__local_0 = new TV();
__local_1 = __local_0.Start();
System.out.println(__local_1);
}
}
class TV{
public int Start(){
Tree __local_2;
int __local_3;
boolean __local_4;
boolean __local_5;
int __local_6;
int __local_7;
boolean __local_8;
int __local_9;
boolean __local_10;
int __local_11;
boolean __local_12;
int __local_13;
boolean __local_14;
int __local_15;
boolean __local_16;
int __local_17;
boolean __local_18;
int __local_19;
boolean __local_20;
boolean __local_21;
int __local_22;
MyVisitor __local_23;
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
int __local_34;
int __local_35;
int __local_36;
int __local_37;
boolean __local_38;
boolean __local_39;
int __local_40;
int __local_41;
int __local_42;
Tree root;
boolean ntb;
int nti;
MyVisitor v;
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
__local_9 = 24;
__local_10 = root.Insert(__local_9);
ntb = __local_10;
__local_11 = 4;
__local_12 = root.Insert(__local_11);
ntb = __local_12;
__local_13 = 12;
__local_14 = root.Insert(__local_13);
ntb = __local_14;
__local_15 = 20;
__local_16 = root.Insert(__local_15);
ntb = __local_16;
__local_17 = 28;
__local_18 = root.Insert(__local_17);
ntb = __local_18;
__local_19 = 14;
__local_20 = root.Insert(__local_19);
ntb = __local_20;
__local_21 = root.Print();
ntb = __local_21;
__local_22 = 100000000;
System.out.println(__local_22);
__local_23 = new MyVisitor();
v = __local_23;
__local_24 = 50000000;
System.out.println(__local_24);
__local_25 = root.accept(v);
nti = __local_25;
__local_26 = 100000000;
System.out.println(__local_26);
__local_27 = 24;
__local_28 = root.Search(__local_27);
System.out.println(__local_28);
__local_29 = 12;
__local_30 = root.Search(__local_29);
System.out.println(__local_30);
__local_31 = 16;
__local_32 = root.Search(__local_31);
System.out.println(__local_32);
__local_33 = 50;
__local_34 = root.Search(__local_33);
System.out.println(__local_34);
__local_35 = 12;
__local_36 = root.Search(__local_35);
System.out.println(__local_36);
__local_37 = 12;
__local_38 = root.Delete(__local_37);
ntb = __local_38;
__local_39 = root.Print();
ntb = __local_39;
__local_40 = 12;
__local_41 = root.Search(__local_40);
System.out.println(__local_41);
__local_42 = 0;
return __local_42;
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
boolean __local_43;
boolean __local_44;
boolean __local_45;
key = v_key;
__local_43 = false;
has_left = __local_43;
__local_44 = false;
has_right = __local_44;
__local_45 = true;
return __local_45;
}
public boolean SetRight(Tree rn){
boolean __local_46;
right = rn;
__local_46 = true;
return __local_46;
}
public boolean SetLeft(Tree ln){
boolean __local_47;
left = ln;
__local_47 = true;
return __local_47;
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
boolean __local_48;
key = v_key;
__local_48 = true;
return __local_48;
}
public boolean GetHas_Right(){
return has_right;
}
public boolean GetHas_Left(){
return has_left;
}
public boolean SetHas_Left(boolean val){
boolean __local_49;
has_left = val;
__local_49 = true;
return __local_49;
}
public boolean SetHas_Right(boolean val){
boolean __local_50;
has_right = val;
__local_50 = true;
return __local_50;
}
public boolean Compare(int num1,int num2){
boolean __local_51;
int __local_52;
int __local_53;
boolean __local_54;
boolean __local_55;
boolean __local_56;
boolean __local_57;
boolean __local_58;
boolean ntb;
int nti;
__local_51 = false;
ntb = __local_51;
__local_52 = 1;
__local_53 = num2 + __local_52;
nti = __local_53;
__local_54 = num1 < num2;
if(__local_54){
__local_55 = false;
ntb = __local_55;
}
else{
__local_56 = num1 < nti;
__local_56 = !__local_56;
if(__local_56){
__local_57 = false;
ntb = __local_57;
}
else{
__local_58 = true;
ntb = __local_58;
}
}
return ntb;
}
public boolean Insert(int v_key){
Tree __local_59;
boolean __local_60;
boolean __local_61;
int __local_62;
boolean __local_63;
boolean __local_64;
Tree __local_65;
boolean __local_66;
boolean __local_67;
boolean __local_68;
boolean __local_69;
boolean __local_70;
Tree __local_71;
boolean __local_72;
boolean __local_73;
boolean __local_74;
boolean __local_75;
boolean __local_76;
Tree new_node;
boolean ntb;
Tree current_node;
boolean cont;
int key_aux;
__local_59 = new Tree();
new_node = __local_59;
__local_60 = new_node.Init(v_key);
ntb = __local_60;
current_node = this;
__local_61 = true;
cont = __local_61;
while(cont){
{
__local_62 = current_node.GetKey();
key_aux = __local_62;
__local_63 = v_key < key_aux;
if(__local_63){
{
__local_64 = current_node.GetHas_Left();
if(__local_64){
__local_65 = current_node.GetLeft();
current_node = __local_65;
}
else{
{
__local_66 = false;
cont = __local_66;
__local_67 = true;
__local_68 = current_node.SetHas_Left(__local_67);
ntb = __local_68;
__local_69 = current_node.SetLeft(new_node);
ntb = __local_69;
}
}
}
}
else{
{
__local_70 = current_node.GetHas_Right();
if(__local_70){
__local_71 = current_node.GetRight();
current_node = __local_71;
}
else{
{
__local_72 = false;
cont = __local_72;
__local_73 = true;
__local_74 = current_node.SetHas_Right(__local_73);
ntb = __local_74;
__local_75 = current_node.SetRight(new_node);
ntb = __local_75;
}
}
}
}
}
cont = cont;
}
__local_76 = true;
return __local_76;
}
public boolean Delete(int v_key){
boolean __local_77;
boolean __local_78;
boolean __local_79;
int __local_80;
boolean __local_81;
boolean __local_82;
Tree __local_83;
boolean __local_84;
boolean __local_85;
boolean __local_86;
Tree __local_87;
boolean __local_88;
boolean __local_89;
boolean __local_90;
boolean __local_91;
boolean __local_92;
boolean __local_93;
boolean __local_94;
boolean __local_95;
boolean __local_96;
boolean __local_97;
Tree current_node;
Tree parent_node;
boolean cont;
boolean found;
boolean ntb;
boolean is_root;
int key_aux;
current_node = this;
parent_node = this;
__local_77 = true;
cont = __local_77;
__local_78 = false;
found = __local_78;
__local_79 = true;
is_root = __local_79;
while(cont){
{
__local_80 = current_node.GetKey();
key_aux = __local_80;
__local_81 = v_key < key_aux;
if(__local_81){
__local_82 = current_node.GetHas_Left();
if(__local_82){
{
parent_node = current_node;
__local_83 = current_node.GetLeft();
current_node = __local_83;
}
}
else{
__local_84 = false;
cont = __local_84;
}
}
else{
__local_85 = key_aux < v_key;
if(__local_85){
__local_86 = current_node.GetHas_Right();
if(__local_86){
{
parent_node = current_node;
__local_87 = current_node.GetRight();
current_node = __local_87;
}
}
else{
__local_88 = false;
cont = __local_88;
}
}
else{
{
if(is_root){
__local_89 = current_node.GetHas_Right();
__local_89 = !__local_89;
__local_90 = current_node.GetHas_Left();
__local_90 = !__local_90;
__local_91 = __local_89 & __local_90;
if(__local_91){
__local_92 = true;
ntb = __local_92;
}
else{
__local_93 = this.Remove(parent_node,current_node);
ntb = __local_93;
}
}
else{
__local_94 = this.Remove(parent_node,current_node);
ntb = __local_94;
}
__local_95 = true;
found = __local_95;
__local_96 = false;
cont = __local_96;
}
}
}
__local_97 = false;
is_root = __local_97;
}
cont = cont;
}
return found;
}
public boolean Remove(Tree p_node,Tree c_node){
boolean __local_98;
boolean __local_99;
boolean __local_100;
boolean __local_101;
int __local_102;
Tree __local_103;
int __local_104;
boolean __local_105;
boolean __local_106;
boolean __local_107;
boolean __local_108;
boolean __local_109;
boolean __local_110;
boolean __local_111;
boolean __local_112;
boolean ntb;
int auxkey1;
int auxkey2;
__local_98 = c_node.GetHas_Left();
if(__local_98){
__local_99 = this.RemoveLeft(p_node,c_node);
ntb = __local_99;
}
else{
__local_100 = c_node.GetHas_Right();
if(__local_100){
__local_101 = this.RemoveRight(p_node,c_node);
ntb = __local_101;
}
else{
{
__local_102 = c_node.GetKey();
auxkey1 = __local_102;
__local_103 = p_node.GetLeft();
__local_104 = __local_103.GetKey();
auxkey2 = __local_104;
__local_105 = this.Compare(auxkey1,auxkey2);
if(__local_105){
{
__local_106 = p_node.SetLeft(my_null);
ntb = __local_106;
__local_107 = false;
__local_108 = p_node.SetHas_Left(__local_107);
ntb = __local_108;
}
}
else{
{
__local_109 = p_node.SetRight(my_null);
ntb = __local_109;
__local_110 = false;
__local_111 = p_node.SetHas_Right(__local_110);
ntb = __local_111;
}
}
}
}
}
__local_112 = true;
return __local_112;
}
public boolean RemoveRight(Tree p_node,Tree c_node){
boolean __local_113;
Tree __local_114;
int __local_115;
boolean __local_116;
Tree __local_117;
boolean __local_118;
boolean __local_119;
boolean __local_120;
boolean __local_121;
boolean __local_122;
boolean ntb;
__local_113 = c_node.GetHas_Right();
while(__local_113){
{
__local_114 = c_node.GetRight();
__local_115 = __local_114.GetKey();
__local_116 = c_node.SetKey(__local_115);
ntb = __local_116;
p_node = c_node;
__local_117 = c_node.GetRight();
c_node = __local_117;
}
__local_118 = c_node.GetHas_Right();
__local_113 = __local_118;
}
__local_119 = p_node.SetRight(my_null);
ntb = __local_119;
__local_120 = false;
__local_121 = p_node.SetHas_Right(__local_120);
ntb = __local_121;
__local_122 = true;
return __local_122;
}
public boolean RemoveLeft(Tree p_node,Tree c_node){
boolean __local_123;
Tree __local_124;
int __local_125;
boolean __local_126;
Tree __local_127;
boolean __local_128;
boolean __local_129;
boolean __local_130;
boolean __local_131;
boolean __local_132;
boolean ntb;
__local_123 = c_node.GetHas_Left();
while(__local_123){
{
__local_124 = c_node.GetLeft();
__local_125 = __local_124.GetKey();
__local_126 = c_node.SetKey(__local_125);
ntb = __local_126;
p_node = c_node;
__local_127 = c_node.GetLeft();
c_node = __local_127;
}
__local_128 = c_node.GetHas_Left();
__local_123 = __local_128;
}
__local_129 = p_node.SetLeft(my_null);
ntb = __local_129;
__local_130 = false;
__local_131 = p_node.SetHas_Left(__local_130);
ntb = __local_131;
__local_132 = true;
return __local_132;
}
public int Search(int v_key){
boolean __local_133;
int __local_134;
int __local_135;
boolean __local_136;
boolean __local_137;
Tree __local_138;
boolean __local_139;
boolean __local_140;
boolean __local_141;
Tree __local_142;
boolean __local_143;
int __local_144;
boolean __local_145;
Tree current_node;
int ifound;
boolean cont;
int key_aux;
current_node = this;
__local_133 = true;
cont = __local_133;
__local_134 = 0;
ifound = __local_134;
while(cont){
{
__local_135 = current_node.GetKey();
key_aux = __local_135;
__local_136 = v_key < key_aux;
if(__local_136){
__local_137 = current_node.GetHas_Left();
if(__local_137){
__local_138 = current_node.GetLeft();
current_node = __local_138;
}
else{
__local_139 = false;
cont = __local_139;
}
}
else{
__local_140 = key_aux < v_key;
if(__local_140){
__local_141 = current_node.GetHas_Right();
if(__local_141){
__local_142 = current_node.GetRight();
current_node = __local_142;
}
else{
__local_143 = false;
cont = __local_143;
}
}
else{
{
__local_144 = 1;
ifound = __local_144;
__local_145 = false;
cont = __local_145;
}
}
}
}
cont = cont;
}
return ifound;
}
public boolean Print(){
boolean __local_146;
boolean __local_147;
boolean ntb;
Tree current_node;
current_node = this;
__local_146 = this.RecPrint(current_node);
ntb = __local_146;
__local_147 = true;
return __local_147;
}
public boolean RecPrint(Tree node){
boolean __local_148;
Tree __local_149;
boolean __local_150;
boolean __local_151;
int __local_152;
boolean __local_153;
Tree __local_154;
boolean __local_155;
boolean __local_156;
boolean __local_157;
boolean ntb;
__local_148 = node.GetHas_Left();
if(__local_148){
{
__local_149 = node.GetLeft();
__local_150 = this.RecPrint(__local_149);
ntb = __local_150;
}
}
else{
__local_151 = true;
ntb = __local_151;
}
__local_152 = node.GetKey();
System.out.println(__local_152);
__local_153 = node.GetHas_Right();
if(__local_153){
{
__local_154 = node.GetRight();
__local_155 = this.RecPrint(__local_154);
ntb = __local_155;
}
}
else{
__local_156 = true;
ntb = __local_156;
}
__local_157 = true;
return __local_157;
}
public int accept(Visitor v){
int __local_158;
int __local_159;
int __local_160;
int nti;
__local_158 = 333;
System.out.println(__local_158);
__local_159 = v.visit(this);
nti = __local_159;
__local_160 = 0;
return __local_160;
}
}
class Visitor{
Tree l;
Tree r;
public int visit(Tree n){
boolean __local_161;
Tree __local_162;
int __local_163;
int __local_164;
boolean __local_165;
Tree __local_166;
int __local_167;
int __local_168;
int __local_169;
int nti;
__local_161 = n.GetHas_Right();
if(__local_161){
{
__local_162 = n.GetRight();
r = __local_162;
__local_163 = r.accept(this);
nti = __local_163;
}
}
else{
__local_164 = 0;
nti = __local_164;
}
__local_165 = n.GetHas_Left();
if(__local_165){
{
__local_166 = n.GetLeft();
l = __local_166;
__local_167 = l.accept(this);
nti = __local_167;
}
}
else{
__local_168 = 0;
nti = __local_168;
}
__local_169 = 0;
return __local_169;
}
}
class MyVisitor extends Visitor{
public int visit(Tree n){
boolean __local_170;
Tree __local_171;
int __local_172;
int __local_173;
int __local_174;
boolean __local_175;
Tree __local_176;
int __local_177;
int __local_178;
int __local_179;
int nti;
__local_170 = n.GetHas_Right();
if(__local_170){
{
__local_171 = n.GetRight();
r = __local_171;
__local_172 = r.accept(this);
nti = __local_172;
}
}
else{
__local_173 = 0;
nti = __local_173;
}
__local_174 = n.GetKey();
System.out.println(__local_174);
__local_175 = n.GetHas_Left();
if(__local_175){
{
__local_176 = n.GetLeft();
l = __local_176;
__local_177 = l.accept(this);
nti = __local_177;
}
}
else{
__local_178 = 0;
nti = __local_178;
}
__local_179 = 0;
return __local_179;
}
}
