### Desafio 09 - Instanciando objetos e acessando os atributos

Uma clínica veterinária te contratou para desenvolver um sistema de controle dos animais que eles cuidam.

A prioridade é gerenciar os cachorros, que são a maior parte dos animais da clínica.

O cliente te informou que precisa das seguintes informações dos cachorros: nome, raça, sexo e idade.

A partir dessas informações:

1) Crie um diagrama de classes (pode ser no StarUML ou com papel e caneta) para representar o domínio do problema;

2) Crie a classe Cachorro e adicione suas propriedades;

3) Crie uma classe Principal (com o método main), que instancia 2 objetos do tipo Cachorro;

4) Atribua valores às variáveis de instância dos objetos;

5) Acesse e imprima na saída os valores das variáveis de instância dos 2 objetos;

6) Analise a execução do programa usando a ferramenta de debug da IDE (e de preferência, com o plugin Java Visualizer).


### Desafio 10 - Composição de objetos e métodos

**1) Implementação de método**

Uma empresa contratou você para continuar o desenvolvimento de um sistema de folha de pagamentos.

A primeira funcionalidade que você deve desenvolver é o cálculo de salário de um funcionário.

A empresa forneceu o seguinte código já desenvolvido para você continuar a implementação:

```java
public class FolhaPagamento {
    
    double calcularSalario() {
        // TODO implementar
    }

}
```

O método calcularSalario deve receber os seguintes parâmetros para calcular o valor total do salário a pagar:

•Quantidade de horas normais trabalhadas;\
•Quantidade de horas extras trabalhadas;\
•Valor da hora normal;\
•Valor da hora extra.

Você deve calcular as respectivas quantidades de horas trabalhas pelos valores da hora, somar os valores obtidos e retornar o resultado.

Crie uma classe com o método main para invocar o método implementado e imprima o resultado (salário devido) na saída.

**2) Passando objeto como argumento de método**

O desenvolvedor sênior da empresa que te contratou revisou o seu código e pediu algumas alterações.

Você deve criar uma classe Funcionario com as seguintes propriedades:

•Nome\
•Quantidade de filhos

E também, deve criar uma classe ContratoTrabalho com as propriedades:

•Funcionário (ou seja, uma variável do tipo Funcionario);\
•Valor da hora normal;\
•Valor da hora extra.

Depois, você deve refatorar o método calcular da classe FolhaPagamento para receber um objeto do tipo ContratoTrabalho como parâmetro, substituindo os parâmetros de valores de hora.

Além disso, uma nova regra deve ser adicionada neste mesmo método:

Quando o funcionário possuir 1 ou mais filhos, você deve calcular um adicional de 10% no valor total do salário.

Crie métodos na classe Funcionario e ContratoTrabalho para que você possa "perguntar" ao objeto se o contrato possui ou não o adicional para filhos, tornando assim essas classes mais ricas.

**3) Composição e retorno de objeto**

Mais uma alteração foi solicitada para você.

Agora, você deve alterar o código do método calcularSalario da classe FolhaPagamento para retornar um novo tipo Holerite.

A classe Holerite deve ter as seguintes propriedades:

•Funcionário;\
•Valor total das horas normais;\
•Valor total das horas extras;\
•Valor do adicional para filhos.

Além disso, a classe Holerite deve possuir os seguintes comportamentos/métodos:

•Calcular valor total (deve somar todos os valores e chegar no valor total)\
•Imprimir (deve imprimir na saída todos os detalhes do holerite).


### Desafio 11 - Membros estáticos

Você se ingressou na equipe de desenvolvimento de um projeto open-source que visa criar uma biblioteca Java com diversas classes e métodos que calculam diversas fórmulas matemáticas simples ou complexas.

Esse projeto será muito importante para o mercado acadêmico e corporativo, pois os programadores não precisarão mais conhecer as fórmulas matemáticas a fundo para desenvolverem aplicações e jogos que necessitam delas.

O líder do projeto passou uma atividade para você:

Crie uma classe que servirá para agrupar métodos que calculam áreas de diversas formas geométricas. Pense em um nome legal para essa classe.

Agora, implemente um método estático nessa classe para calcular a área de um quadrado, a partir da medida de qualquer lado desse quadrado.

A fórmula para calcular a área de um quadrado é:

**área do quadrado = área²**

Depois que fizer isso, implemente um novo método para calcular a área de um círculo, dado um raio. A fórmula matemática neste caso é:

**área do círculo = raio² * &pi**

Você precisa saber: &pi (pronuncia-se "pi") é uma constante com o valor igual a 3.14159265358979323846.

Ao finalizar o desenvolvimento dos métodos utilitários, crie uma nova classe com o método main para testar os cálculos.