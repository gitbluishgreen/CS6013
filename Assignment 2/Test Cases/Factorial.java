class Factorial {
public static void main(String [] a){
Fac __local_0;
int __local_1;
int __local_2;
__local_0 = new Fac();
__local_1 = 10;
__local_2 = __local_0.ComputeFac(__local_1);
System.out.println(__local_2);
}
}
class Fac{
public int ComputeFac(int num){
int __local_3;
boolean __local_4;
int __local_5;
int __local_6;
int __local_7;
int __local_8;
int __local_9;
int num_aux;
__local_3 = 1;
__local_4 = num < __local_3;
if(__local_4){
__local_5 = 1;
num_aux = __local_5;
}
else{
__local_6 = 1;
__local_7 = num - __local_6;
__local_8 = this.ComputeFac(__local_7);
__local_9 = num * __local_8;
num_aux = __local_9;
}
return num_aux;
}
}
