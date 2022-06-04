class T4 {
public static void main(String [] args){
A __local_0;
int __local_1;
__local_0 = new A();
/*INLINE*/__local_1 = __local_0.start();
System.out.println(__local_1);
}
}
class A{
public int start(){
A __local_2;
int[] __local_3;
int __local_4;
int __local_5;
__local_2 = this;
/*INLINE*/__local_3 = __local_2.foo();
__local_4 = __local_3.length;
System.out.println(__local_4);
__local_5 = 0;
return __local_5;
}
public int[] foo(){
A __local_6;
int __local_7;
int[] __local_8;
__local_6 = this;
__local_7 = 5;
__local_8 = new int[__local_7];
return __local_8;
}
}
