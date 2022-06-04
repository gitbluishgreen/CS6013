class T4 {
public static void main(String [] arg){
SegmentTree __local_0;
int __local_1;
__local_0 = new SegmentTree();
__local_1 = __local_0.test();
System.out.println(__local_1);
}
}
class SegmentTree{
int[] tree;
public int init(int[] arr){
SegmentTree __local_2;
int __local_3;
int __local_5;
int[] __local_6;
int l;
__local_2 = this;
__local_3 = arr.length;
l = __local_3;
__local_5 = 4 * l;
__local_6 = new int[__local_5];
tree = __local_6;
return 0;
}
public int max(int a,int b){
SegmentTree __local_8;
boolean __local_9;
int ret;
__local_8 = this;
__local_9 = a < b;
if(__local_9){
ret = b;
}
else{
ret = a;
}
return ret;
}
public int build_tree(int node,int start,int end,int[] arr){
SegmentTree __local_10;
int __local_12;
boolean __local_13;
int __local_15;
boolean __local_16;
boolean __local_17;
int __local_18;
int __local_20;
int __local_21;
boolean __local_22;
int __local_24;
int __local_25;
int __local_26;
boolean __local_27;
int __local_29;
int __local_31;
int __local_33;
int __local_34;
int __local_36;
int __local_38;
int __local_40;
int __local_41;
int __local_43;
int __local_45;
int __local_46;
int __local_48;
int __local_50;
int __local_51;
int __local_52;
int mid;
int r;
__local_10 = this;
__local_12 = end + 1;
__local_13 = start < __local_12;
__local_15 = start + 1;
__local_16 = end < __local_15;
__local_17 = __local_13 & __local_16;
if(__local_17){
{
__local_18 = arr[start];
tree[node] = __local_18;
}
}
else{
{
mid = 0;
__local_20 = mid + mid;
__local_21 = start + end;
__local_22 = __local_20 < __local_21;
while(__local_22){
{
__local_24 = mid + 1;
mid = __local_24;
}
__local_25 = mid + mid;
__local_26 = start + end;
__local_27 = __local_25 < __local_26;
__local_22 = __local_27;
}
__local_29 = mid - 1;
mid = __local_29;
__local_31 = 2 * node;
__local_33 = __local_31 + 1;
__local_34 = __local_10.build_tree(__local_33,start,mid,arr);
r = __local_34;
__local_36 = 2 * node;
__local_38 = __local_36 + 2;
__local_40 = mid + 1;
__local_41 = __local_10.build_tree(__local_38,__local_40,end,arr);
r = __local_41;
__local_43 = 2 * node;
__local_45 = __local_43 + 1;
__local_46 = tree[__local_45];
__local_48 = 2 * node;
__local_50 = __local_48 + 2;
__local_51 = tree[__local_50];
__local_52 = __local_10.max(__local_46,__local_51);
tree[node] = __local_52;
}
}
return 0;
}
public int range_query(int node,int start,int end,int l,int r){
SegmentTree __local_54;
boolean __local_55;
boolean __local_56;
boolean __local_57;
boolean __local_61;
boolean __local_62;
boolean __local_63;
int __local_64;
int __local_66;
int __local_67;
boolean __local_68;
int __local_70;
int __local_71;
int __local_72;
boolean __local_73;
int __local_75;
int __local_77;
int __local_79;
int __local_80;
int __local_82;
int __local_84;
int __local_86;
int __local_87;
int __local_88;
int ret_val;
int mid;
__local_54 = this;
__local_55 = end < l;
__local_55 = !__local_55;
__local_56 = r < start;
__local_56 = !__local_56;
__local_57 = __local_55 & __local_56;
__local_57 = !__local_57;
if(__local_57){
ret_val = 0-10000;
}
else{
{
__local_61 = start < l;
__local_61 = !__local_61;
__local_62 = r < end;
__local_62 = !__local_62;
__local_63 = __local_61 & __local_62;
if(__local_63){
__local_64 = tree[node];
ret_val = __local_64;
}
else{
{
mid = 0;
__local_66 = mid + mid;
__local_67 = start + end;
__local_68 = __local_66 < __local_67;
while(__local_68){
{
__local_70 = mid + 1;
mid = __local_70;
}
__local_71 = mid + mid;
__local_72 = start + end;
__local_73 = __local_71 < __local_72;
__local_68 = __local_73;
}

__local_75 = mid - 1;
mid = __local_75;
__local_77 = 2 * node;
__local_79 = __local_77 + 1;
__local_80 = __local_54.range_query(__local_79,start,mid,l,r);
__local_82 = 2 * node;
__local_84 = __local_82 + 2;
__local_86 = mid + 1;
__local_87 = __local_54.range_query(__local_84,__local_86,end,l,r);
__local_88 = __local_54.max(__local_80,__local_87);
ret_val = __local_88;
}
}
}
}
return ret_val;
}
public int update(int node,int start,int end,int idx,int val){
SegmentTree __local_89;
int __local_91;
boolean __local_92;
int __local_94;
boolean __local_95;
boolean __local_96;
int __local_98;
int __local_99;
boolean __local_100;
int __local_102;
int __local_103;
int __local_104;
boolean __local_105;
int __local_107;
int __local_109;
boolean __local_110;
int __local_112;
boolean __local_113;
boolean __local_114;
int __local_116;
int __local_118;
int __local_119;
int __local_121;
int __local_123;
int __local_125;
int __local_126;
int __local_128;
int __local_130;
int __local_131;
int __local_133;
int __local_135;
int __local_136;
int __local_137;
int ret_val;
int mid;
__local_89 = this;
__local_91 = end + 1;
__local_92 = start < __local_91;
__local_94 = start + 1;
__local_95 = end < __local_94;
__local_96 = __local_92 & __local_95;
if(__local_96){
tree[node] = val;
}
else{
{
mid = 0;
__local_98 = mid + mid;
__local_99 = start + end;
__local_100 = __local_98 < __local_99;
while(__local_100){
{
__local_102 = mid + 1;
mid = __local_102;
}
__local_103 = mid + mid;
__local_104 = start + end;
__local_105 = __local_103 < __local_104;
__local_100 = __local_105;
}
__local_107 = mid - 1;
mid = __local_107;
__local_109 = start - 1;
__local_110 = __local_109 < idx;
__local_112 = mid + 1;
__local_113 = idx < __local_112;
__local_114 = __local_110 & __local_113;
if(__local_114){
__local_116 = 2 * node;
__local_118 = __local_116 + 1;
__local_119 = __local_89.update(__local_118,start,mid,idx,val);
ret_val = __local_119;
}
else{
__local_121 = 2 * node;
__local_123 = __local_121 + 2;
__local_125 = mid + 1;
__local_126 = __local_89.update(__local_123,__local_125,end,idx,val);
ret_val = __local_126;
}
__local_128 = 2 * node;
__local_130 = __local_128 + 1;
__local_131 = tree[__local_130];
__local_133 = 2 * node;
__local_135 = __local_133 + 2;
__local_136 = tree[__local_135];
__local_137 = __local_89.max(__local_131,__local_136);
tree[node] = __local_137;
}
}
return 0;
}
public int test(){
SegmentTree __local_139;
int[] __local_141;
int __local_168;
int __local_169;
int __local_170;
int __local_172;
boolean __local_175;
boolean __local_177;
int __local_181;
int __local_183;
boolean __local_185;
int __local_187;
boolean __local_189;
int __local_196;
int __local_197;
int __local_204;
int __local_205;
boolean __local_208;
boolean __local_210;
int __local_214;
int __local_216;
boolean __local_218;
int __local_220;
boolean __local_222;
int x;
int y;
int ret;
int[] arr;
__local_139 = this;
__local_141 = new int[10];
arr = __local_141;
arr[0] = 1;
arr[1] = 15;
arr[2] = 31;
arr[3] = 2;
__local_169 = 0-1;
arr[4] = __local_169;
arr[5] = 42;
__local_170 = 1-7;
arr[6] = __local_170;
arr[7] = 1000;
arr[8] = 89;
arr[9] = 112;
__local_168 = __local_139.init(arr);
x = __local_168;
__local_172 = __local_139.build_tree(0,0,9,arr);
x = __local_172;
x = 0;
__local_175 = x < 10;
while(__local_175){
{
y = x;
__local_177 = y < 10;
while(__local_177){
{
__local_181 = __local_139.range_query(0,0,9,x,y);
System.out.println(__local_181);
}
__local_183 = y + 1;
y = __local_183;
__local_185 = y < 10;
__local_177 = __local_185;
}
}
__local_187 = x + 1;
x = __local_187;
__local_189 = x < 10;
__local_175 = __local_189;
}

__local_196 = 0-500;
__local_197 = __local_139.update(0,0,9,7,__local_196);
x = __local_197;
__local_204 = 0-250;
__local_205 = __local_139.update(0,0,9,9,__local_204);
x = __local_205;
x = 0;
__local_208 = x < 10;
while(__local_208){
{
y = x;
__local_210 = y < 10;
while(__local_210){
{
__local_214 = __local_139.range_query(0,0,9,x,y);
System.out.println(__local_214);
}
__local_216 = y + 1;
y = __local_216;
__local_218 = y < 10;
__local_210 = __local_218;
}
}
__local_220 = x + 1;
x = __local_220;
__local_222 = x < 10;
__local_208 = __local_222;
}
return 0;
}
}
