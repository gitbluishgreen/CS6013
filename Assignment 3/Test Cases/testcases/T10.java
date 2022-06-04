class T10 {
public static void main(String [] args){
A __local_0;
int __local_1;
__local_0 = new A();
__local_1 = __local_0.help();
System.out.println(__local_1);
}
}
class A extends B{
int a;
public int get(){
A __local_2;
__local_2 = this;
return a;
}
public int help(){
A __local_3;
int __local_4;
int __local_5;
int x;
__local_3 = this;
__local_4 = 10;
a = __local_4;
__local_5 = __local_3.helpme(__local_3);
x = __local_5;
return x;
}
}
class B{
int a;
public int helpme(A obj){
B __local_6;
int __local_7;
int __local_8;
int __local_9;
int __local_10;
__local_6 = this;
__local_7 = 10;
a = __local_7;
__local_8 = obj.get();
__local_9 = a + __local_8;
System.out.println(__local_9);
__local_10 = 0;
return __local_10;
}
}
