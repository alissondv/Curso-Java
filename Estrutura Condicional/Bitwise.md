## Operadores bitwise
| Operador  | Significado |
| ------------- | ------------- |
| &  | Operação "E" bit a bit  |
| \|  | Operação "OU" bit a bit  |
| ^  | Operação "OU-exclusivo" bit a bit |


| C1  | C2 | C1 e C2 |                      | C1  | C2 | C1 ou C2 |                                          | C1  | C2 | C1 xor C2 |
| ------------- | ------------- |           | ------------- | ------------- | ------------- |              | ------------- | ------------- |------------- | 
| F | F | F |                               | F | F | F |                                                    | F | F | F |
| F | V | F |                               | F | V | V |                                                       | F | V | V |
| V | F | F |                               | V | F | V |                                                   | V | F | V |
| V | V | V |                               | V | V | V |                                                       | V | V | F |


| C1  | C2 | C1 ou C2 |                         
| ------------- | ------------- | ------------- | 
| F | F | F |
| F | V | V |
| V | F | V |
| V | V | F |


| C1  | C2 | C1 xor C2 |
| ------------- | ------------- | ------------- | 
| F | F | F |
| F | V | V |
| V | F | V |
| V | V | F |
# DEMO
~~~Javascript
int n1 = 89;
int n2 = 60;
System.out.println(n1 & n2);
System.out.println(n1 | n2);
System.out.println(n1 ^ n2);
~~~


## Aplicação comum: verificar bit
~~~Javascript
package course;
import java.util.Scanner;
public class Program {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int mask = 0b100000;
int n = sc.nextInt();
if ((n & mask) != 0) {
System.out.println("6th bit is true!");
}
else {
System.out.println("6th bit is false");
}
sc.close();
}
 }
~~~