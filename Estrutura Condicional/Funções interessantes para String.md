# Funções interessantes para String
## Checklist

* Formatar: toLowerCase(), toUpperCase(), trim()
* Recortar: substring(inicio), substring(inicio, fim)
* Substituir: Replace(char, char), Replace(string, string)
* Buscar: IndexOf, LastIndexOf
* str.Split(" ")


>toLowerCase() = transforma todo texto em letra minuscula ;


>toUpperCase() = transforma todo texto em letra maiuscula ;


>trim = retira espaçamento nas laterais dos textos ;


>substring() = Retira strings expecificas ;


>Replace() = Substitui caracteres ;


>IndexOf() = Busca posições ;


>LastIndexOf() = Busca a ultima posição de um caractere ;


~~~Javascript
String original = "abcde FGHIJ ABC abc DEFG ";
String s01 = original.toLowerCase();
String s02 = original.toUpperCase();
String s03 = original.trim();
String s04 = original.substring(2);
String s05 = original.substring(2, 9);
String s06 = original.replace('a', 'x');
String s07 = original.replace("abc", "xy");
int i = original.indexOf("bc");
int j = original.lastIndexOf("bc");
System.out.println("Original: -" + original + "-");
System.out.println("toLowerCase: -" + s01 + "-");
System.out.println("toUpperCase: -" + s02 + "-");
System.out.println("trim: -" + s03 + "-");
System.out.println("substring(2): -" + s04 + "-");
System.out.println("substring(2, 9): -" + s05 + "-");
System.out.println("replace('a', 'x'): -" + s06 + "-");
System.out.println("replace('abc', 'xy'): -" + s07 + "-");
System.out.println("Index of 'bc': " + i);
System.out.println("Last index of 'bc': " + j);
~~~


## Operação split

~~~Javascript
String s = "potato apple lemon";
String[] vect = s.split(" ");
String word1 = vect[0];
String word2 = vect[1];
String word3 = vect[2];
~~~