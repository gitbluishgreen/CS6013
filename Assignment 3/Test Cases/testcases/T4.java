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
int __local_4;
int __local_5;
int[] __local_6;
int __local_7;
int l;
__local_2 = this;
__local_3 = arr.length;
l = __local_3;
__local_4 = 4;
__local_5 = __local_4 * l;
__local_6 = new int[__local_5];
tree = __local_6;
__local_7 = 0;
return __local_7;
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
int __local_11;
int __local_12;
boolean __local_13;
int __local_14;
int __local_15;
boolean __local_16;
boolean __local_17;
int __local_18;
int __local_19;
int __local_20;
int __local_21;
boolean __local_22;
int __local_23;
int __local_24;
int __local_25;
int __local_26;
boolean __local_27;
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
int __local_38;
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
int __local_49;
int __local_50;
int __local_51;
int __local_52;
int __local_53;
int mid;
int r;
__local_10 = this;
__local_11 = 1;
__local_12 = end + __local_11;
__local_13 = start < __local_12;
__local_14 = 1;
__local_15 = start + __local_14;
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
__local_19 = 0;
mid = __local_19;
__local_20 = mid + mid;
__local_21 = start + end;
__local_22 = __local_20 < __local_21;
while(__local_22){
{
__local_23 = 1;
__local_24 = mid + __local_23;
mid = __local_24;
}
__local_25 = mid + mid;
__local_26 = start + end;
__local_27 = __local_25 < __local_26;
__local_22 = __local_27;
}
__local_28 = 1;
__local_29 = mid - __local_28;
mid = __local_29;
__local_30 = 2;
__local_31 = __local_30 * node;
__local_32 = 1;
__local_33 = __local_31 + __local_32;
__local_34 = __local_10.build_tree(__local_33,start,mid,arr);
r = __local_34;
__local_35 = 2;
__local_36 = __local_35 * node;
__local_37 = 2;
__local_38 = __local_36 + __local_37;
__local_39 = 1;
__local_40 = mid + __local_39;
__local_41 = __local_10.build_tree(__local_38,__local_40,end,arr);
r = __local_41;
__local_42 = 2;
__local_43 = __local_42 * node;
__local_44 = 1;
__local_45 = __local_43 + __local_44;
__local_46 = tree[__local_45];
__local_47 = 2;
__local_48 = __local_47 * node;
__local_49 = 2;
__local_50 = __local_48 + __local_49;
__local_51 = tree[__local_50];
__local_52 = __local_10.max(__local_46,__local_51);
tree[node] = __local_52;
}
}
__local_53 = 0;
return __local_53;
}
public int range_query(int node,int start,int end,int l,int r){
SegmentTree __local_54;
boolean __local_55;
boolean __local_56;
boolean __local_57;
int __local_58;
int __local_59;
int __local_60;
boolean __local_61;
boolean __local_62;
boolean __local_63;
int __local_64;
int __local_65;
int __local_66;
int __local_67;
boolean __local_68;
int __local_69;
int __local_70;
int __local_71;
int __local_72;
boolean __local_73;
int __local_74;
int __local_75;
int __local_76;
int __local_77;
int __local_78;
int __local_79;
int __local_80;
int __local_81;
int __local_82;
int __local_83;
int __local_84;
int __local_85;
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
__local_58 = 0;
__local_59 = 10000;
__local_60 = __local_58 - __local_59;
ret_val = __local_60;
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
__local_65 = 0;
mid = __local_65;
__local_66 = mid + mid;
__local_67 = start + end;
__local_68 = __local_66 < __local_67;
while(__local_68){
{
__local_69 = 1;
__local_70 = mid + __local_69;
mid = __local_70;
}
__local_71 = mid + mid;
__local_72 = start + end;
__local_73 = __local_71 < __local_72;
__local_68 = __local_73;
}
__local_74 = 1;
__local_75 = mid - __local_74;
mid = __local_75;
__local_76 = 2;
__local_77 = __local_76 * node;
__local_78 = 1;
__local_79 = __local_77 + __local_78;
__local_80 = __local_54.range_query(__local_79,start,mid,l,r);
__local_81 = 2;
__local_82 = __local_81 * node;
__local_83 = 2;
__local_84 = __local_82 + __local_83;
__local_85 = 1;
__local_86 = mid + __local_85;
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
int __local_90;
int __local_91;
boolean __local_92;
int __local_93;
int __local_94;
boolean __local_95;
boolean __local_96;
int __local_97;
int __local_98;
int __local_99;
boolean __local_100;
int __local_101;
int __local_102;
int __local_103;
int __local_104;
boolean __local_105;
int __local_106;
int __local_107;
int __local_108;
int __local_109;
boolean __local_110;
int __local_111;
int __local_112;
boolean __local_113;
boolean __local_114;
int __local_115;
int __local_116;
int __local_117;
int __local_118;
int __local_119;
int __local_120;
int __local_121;
int __local_122;
int __local_123;
int __local_124;
int __local_125;
int __local_126;
int __local_127;
int __local_128;
int __local_129;
int __local_130;
int __local_131;
int __local_132;
int __local_133;
int __local_134;
int __local_135;
int __local_136;
int __local_137;
int __local_138;
int ret_val;
int mid;
__local_89 = this;
__local_90 = 1;
__local_91 = end + __local_90;
__local_92 = start < __local_91;
__local_93 = 1;
__local_94 = start + __local_93;
__local_95 = end < __local_94;
__local_96 = __local_92 & __local_95;
if(__local_96){
tree[node] = val;
}
else{
{
__local_97 = 0;
mid = __local_97;
__local_98 = mid + mid;
__local_99 = start + end;
__local_100 = __local_98 < __local_99;
while(__local_100){
{
__local_101 = 1;
__local_102 = mid + __local_101;
mid = __local_102;
}
__local_103 = mid + mid;
__local_104 = start + end;
__local_105 = __local_103 < __local_104;
__local_100 = __local_105;
}
__local_106 = 1;
__local_107 = mid - __local_106;
mid = __local_107;
__local_108 = 1;
__local_109 = start - __local_108;
__local_110 = __local_109 < idx;
__local_111 = 1;
__local_112 = mid + __local_111;
__local_113 = idx < __local_112;
__local_114 = __local_110 & __local_113;
if(__local_114){
__local_115 = 2;
__local_116 = __local_115 * node;
__local_117 = 1;
__local_118 = __local_116 + __local_117;
__local_119 = __local_89.update(__local_118,start,mid,idx,val);
ret_val = __local_119;
}
else{
__local_120 = 2;
__local_121 = __local_120 * node;
__local_122 = 2;
__local_123 = __local_121 + __local_122;
__local_124 = 1;
__local_125 = mid + __local_124;
__local_126 = __local_89.update(__local_123,__local_125,end,idx,val);
ret_val = __local_126;
}
__local_127 = 2;
__local_128 = __local_127 * node;
__local_129 = 1;
__local_130 = __local_128 + __local_129;
__local_131 = tree[__local_130];
__local_132 = 2;
__local_133 = __local_132 * node;
__local_134 = 2;
__local_135 = __local_133 + __local_134;
__local_136 = tree[__local_135];
__local_137 = __local_89.max(__local_131,__local_136);
tree[node] = __local_137;
}
}
__local_138 = 0;
return __local_138;
}
public int test(){
SegmentTree __local_139;
int __local_140;
int[] __local_141;
int __local_142;
int __local_143;
int __local_144;
int __local_145;
int __local_146;
int __local_147;
int __local_148;
int __local_149;
int __local_150;
int __local_151;
int __local_152;
int __local_153;
int __local_154;
int __local_155;
int __local_156;
int __local_157;
int __local_158;
int __local_159;
int __local_160;
int __local_161;
int __local_162;
int __local_163;
int __local_164;
int __local_165;
int __local_166;
int __local_167;
int __local_168;
int __local_169;
int __local_170;
int __local_171;
int __local_172;
int __local_173;
int __local_174;
boolean __local_175;
int __local_176;
boolean __local_177;
int __local_178;
int __local_179;
int __local_180;
int __local_181;
int __local_182;
int __local_183;
int __local_184;
boolean __local_185;
int __local_186;
int __local_187;
int __local_188;
boolean __local_189;
int __local_190;
int __local_191;
int __local_192;
int __local_193;
int __local_194;
int __local_195;
int __local_196;
int __local_197;
int __local_198;
int __local_199;
int __local_200;
int __local_201;
int __local_202;
int __local_203;
int __local_204;
int __local_205;
int __local_206;
int __local_207;
boolean __local_208;
int __local_209;
boolean __local_210;
int __local_211;
int __local_212;
int __local_213;
int __local_214;
int __local_215;
int __local_216;
int __local_217;
boolean __local_218;
int __local_219;
int __local_220;
int __local_221;
boolean __local_222;
int __local_223;
int x;
int y;
int ret;
int[] arr;
__local_139 = this;
__local_140 = 10;
__local_141 = new int[__local_140];
arr = __local_141;
__local_142 = 0;
__local_143 = 1;
arr[__local_142] = __local_143;
__local_144 = 1;
__local_145 = 15;
arr[__local_144] = __local_145;
__local_146 = 2;
__local_147 = 31;
arr[__local_146] = __local_147;
__local_148 = 3;
__local_149 = 2;
arr[__local_148] = __local_149;
__local_150 = 4;
__local_151 = 0;
__local_152 = 1;
__local_153 = __local_151 - __local_152;
arr[__local_150] = __local_153;
__local_154 = 5;
__local_155 = 6;
__local_156 = 7;
__local_157 = __local_155 * __local_156;
arr[__local_154] = __local_157;
__local_158 = 6;
__local_159 = 1;
__local_160 = 7;
__local_161 = __local_159 - __local_160;
arr[__local_158] = __local_161;
__local_162 = 7;
__local_163 = 1000;
arr[__local_162] = __local_163;
__local_164 = 8;
__local_165 = 89;
arr[__local_164] = __local_165;
__local_166 = 9;
__local_167 = 112;
arr[__local_166] = __local_167;
__local_168 = __local_139.init(arr);
x = __local_168;
__local_169 = 0;
__local_170 = 0;
__local_171 = 9;
__local_172 = __local_139.build_tree(__local_169,__local_170,__local_171,arr);
x = __local_172;
__local_173 = 0;
x = __local_173;
__local_174 = 10;
__local_175 = x < __local_174;
while(__local_175){
{
y = x;
__local_176 = 10;
__local_177 = y < __local_176;
while(__local_177){
{
__local_178 = 0;
__local_179 = 0;
__local_180 = 9;
__local_181 = __local_139.range_query(__local_178,__local_179,__local_180,x,y);
System.out.println(__local_181);
}
__local_182 = 1;
__local_183 = y + __local_182;
y = __local_183;
__local_184 = 10;
__local_185 = y < __local_184;
__local_177 = __local_185;
}
}
__local_186 = 1;
__local_187 = x + __local_186;
x = __local_187;
__local_188 = 10;
__local_189 = x < __local_188;
__local_175 = __local_189;
}
__local_190 = 0;
__local_191 = 0;
__local_192 = 9;
__local_193 = 7;
__local_194 = 0;
__local_195 = 500;
__local_196 = __local_194 - __local_195;
__local_197 = __local_139.update(__local_190,__local_191,__local_192,__local_193,__local_196);
x = __local_197;
__local_198 = 0;
__local_199 = 0;
__local_200 = 9;
__local_201 = 9;
__local_202 = 0;
__local_203 = 250;
__local_204 = __local_202 - __local_203;
__local_205 = __local_139.update(__local_198,__local_199,__local_200,__local_201,__local_204);
x = __local_205;
__local_206 = 0;
x = __local_206;
__local_207 = 10;
__local_208 = x < __local_207;
while(__local_208){
{
y = x;
__local_209 = 10;
__local_210 = y < __local_209;
while(__local_210){
{
__local_211 = 0;
__local_212 = 0;
__local_213 = 9;
__local_214 = __local_139.range_query(__local_211,__local_212,__local_213,x,y);
System.out.println(__local_214);
}
__local_215 = 1;
__local_216 = y + __local_215;
y = __local_216;
__local_217 = 10;
__local_218 = y < __local_217;
__local_210 = __local_218;
}
}
__local_219 = 1;
__local_220 = x + __local_219;
x = __local_220;
__local_221 = 10;
__local_222 = x < __local_221;
__local_208 = __local_222;
}
__local_223 = 0;
return __local_223;
}
}
