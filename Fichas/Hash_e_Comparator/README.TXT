------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

Este projecto tem como objectivo mostrar a utiliza��o de estruturas baseadas em 
Hash e em Tree.
Em termos de Hash, utiliza-se o HashSet. 
A utiliza��o de Tree reflecte-se nas classes TreeSet e TreeMap.

Para a correcta utiliza��o destas colec��es � necess�rio:
- definir a fun��o de Hash, hashcode(), nos objectos contidos na colec��o
- definir a fun��o de compara��o, para a correcta utiliza��o
de estruturas ordenadas. Isso pode ser feito de duas formas:
a) definir um m�todo compareTo, na classe e que corresponder� � ordem natural
b) definir uma classe comparadora, com a implementa��o de um m�todo compare, que permite ter a
possibilidade de parametrizar as estruturas de dados pela ordem de compara��o desejada.


ConjuntoPontos_Hash, � uma classe que guarda os objectos Ponto2D numa colec��o 
implementada em HashSet.

ConjuntoPontos_Tree, � uma classe que guarda os objectos Ponto2D numa colec��o
ordenada implementada em TreeSet.

TabuleiroApostas � uma classe que mant�m uma TreeMap em que as chaves s�o objectos
complexos (normalmente utiliz�mos apenas tipos simples ou String para as chaves)..
Dessa forma � necess�rio parametrizar o TreeMap pela m�todo de compara��o que
determina a ordem relativa de duas inst�ncias de Ponto2D.

Nota: complete as classes com os m�todos que falta desenvolver.