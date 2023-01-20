### Desafio 09 - Instanciando objetos e acessando os atributos

Uma cl�nica veterin�ria te contratou para desenvolver um sistema de controle dos animais que eles cuidam.

A prioridade � gerenciar os cachorros, que s�o a maior parte dos animais da cl�nica.

O cliente te informou que precisa das seguintes informa��es dos cachorros: nome, ra�a, sexo e idade.

A partir dessas informa��es:

1) Crie um diagrama de classes (pode ser no StarUML ou com papel e caneta) para representar o dom�nio do problema;

2) Crie a classe Cachorro e adicione suas propriedades;

3) Crie uma classe Principal (com o m�todo main), que instancia 2 objetos do tipo Cachorro;

4) Atribua valores �s vari�veis de inst�ncia dos objetos;

5) Acesse e imprima na sa�da os valores das vari�veis de inst�ncia dos 2 objetos;

6) Analise a execu��o do programa usando a ferramenta de debug da IDE (e de prefer�ncia, com o plugin Java Visualizer).


### Desafio 10 - Composi��o de objetos e m�todos

**1) Implementa��o de m�todo**

Uma empresa contratou voc� para continuar o desenvolvimento de um sistema de folha de pagamentos.

A primeira funcionalidade que voc� deve desenvolver � o c�lculo de sal�rio de um funcion�rio.

A empresa forneceu o seguinte c�digo j� desenvolvido para voc� continuar a implementa��o:

```java
public class FolhaPagamento {
    
    double calcularSalario() {
        // TODO implementar
    }

}
```

O m�todo calcularSalario deve receber os seguintes par�metros para calcular o valor total do sal�rio a pagar:

�Quantidade de horas normais trabalhadas;\
�Quantidade de horas extras trabalhadas;\
�Valor da hora normal;\
�Valor da hora extra.

Voc� deve calcular as respectivas quantidades de horas trabalhas pelos valores da hora, somar os valores obtidos e retornar o resultado.

Crie uma classe com o m�todo main para invocar o m�todo implementado e imprima o resultado (sal�rio devido) na sa�da.

**2) Passando objeto como argumento de m�todo**

O desenvolvedor s�nior da empresa que te contratou revisou o seu c�digo e pediu algumas altera��es.

Voc� deve criar uma classe Funcionario com as seguintes propriedades:

�Nome\
�Quantidade de filhos

E tamb�m, deve criar uma classe ContratoTrabalho com as propriedades:

�Funcion�rio (ou seja, uma vari�vel do tipo Funcionario);\
�Valor da hora normal;\
�Valor da hora extra.

Depois, voc� deve refatorar o m�todo calcular da classe FolhaPagamento para receber um objeto do tipo ContratoTrabalho como par�metro, substituindo os par�metros de valores de hora.

Al�m disso, uma nova regra deve ser adicionada neste mesmo m�todo:

Quando o funcion�rio possuir 1 ou mais filhos, voc� deve calcular um adicional de 10% no valor total do sal�rio.

Crie m�todos na classe Funcionario e ContratoTrabalho para que voc� possa "perguntar" ao objeto se o contrato possui ou n�o o adicional para filhos, tornando assim essas classes mais ricas.

**3) Composi��o e retorno de objeto**

Mais uma altera��o foi solicitada para voc�.

Agora, voc� deve alterar o c�digo do m�todo calcularSalario da classe FolhaPagamento para retornar um novo tipo Holerite.

A classe Holerite deve ter as seguintes propriedades:

�Funcion�rio;\
�Valor total das horas normais;\
�Valor total das horas extras;\
�Valor do adicional para filhos.

Al�m disso, a classe Holerite deve possuir os seguintes comportamentos/m�todos:

�Calcular valor total (deve somar todos os valores e chegar no valor total)\
�Imprimir (deve imprimir na sa�da todos os detalhes do holerite).


### Desafio 11 - Membros est�ticos

Voc� se ingressou na equipe de desenvolvimento de um projeto open-source que visa criar uma biblioteca Java com diversas classes e m�todos que calculam diversas f�rmulas matem�ticas simples ou complexas.

Esse projeto ser� muito importante para o mercado acad�mico e corporativo, pois os programadores n�o precisar�o mais conhecer as f�rmulas matem�ticas a fundo para desenvolverem aplica��es e jogos que necessitam delas.

O l�der do projeto passou uma atividade para voc�:

Crie uma classe que servir� para agrupar m�todos que calculam �reas de diversas formas geom�tricas. Pense em um nome legal para essa classe.

Agora, implemente um m�todo est�tico nessa classe para calcular a �rea de um quadrado, a partir da medida de qualquer lado desse quadrado.

A f�rmula para calcular a �rea de um quadrado �:

**�rea do quadrado = �rea�**

Depois que fizer isso, implemente um novo m�todo para calcular a �rea de um c�rculo, dado um raio. A f�rmula matem�tica neste caso �:

**�rea do c�rculo = raio� * &pi**

Voc� precisa saber: &pi (pronuncia-se "pi") � uma constante com o valor igual a 3.14159265358979323846.

Ao finalizar o desenvolvimento dos m�todos utilit�rios, crie uma nova classe com o m�todo main para testar os c�lculos.