# Design Pattern  

### Componentes: 
* **Nome** - Essência do padrão  
* **Problema** - O problema que ele resolve  
* **Solução** - Como cada elemento se comunica, as classes em si etc  
* **Consequências** - Benefícios e malefícios que trazem  

### Tipos de padrões de projeto do GoF:  
* **Padrão criacional** - Padrões que abstraem o processo de instanciação  
* **Padrão estrutural** - Compõem classes e objetos em estruturas maiores  
* **Padrão comportamental** - Definem as responsabilidades entre objetos e classes  


## Singleton - Criacional
* Este padrão garante a existência de apenas uma instância de uma classe, mantendo um ponto global de acesso ao seu objeto.  
-> Problema - Não permite que haja duas instâncias de uma classe durante a execução de uma aplicação. (Ex.: Conexão BD)  
-> Solução - Encapsular construtor, criar var que guarda instância, retornar a var a cada objeto criado.  


## Factory Method - Criacional 
* É um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.  
-> Problema - Criar um objeto sem especificar qual classe será utilizada.  
-> Solução - Criar uma interface para criar objetos  


## Builder - Criacional 
* Builder é um padrão de projeto de software criacional que permite a separação da construção de um objeto complexo da sua representação, de forma que o mesmo processo de construção possa criar diferentes representações.  
-> Problema - Criar objetos complexos especificando apenas seu tipo e conteúdo.  
-> Solução - Isolar a forma que os passos reais usados na criação de objetos complexos tomam, de modo que o processo possa ser usado novamente para a criação de um conjunto de objetos simples de igual forma a criação do primeiro.  

## Abstract Factory - Criacional 
* É um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.
<p align="center">
  <img src="https://refactoring.guru/images/patterns/diagrams/abstract-factory/structure.png">
</p>


## MVC - Padrão de Arquitetura
* MVC é um **padrão de arquitetura** de software, separando sua aplicação em 3 camadas. A camada de interação do usuário(view), a camada de manipulação dos dados(model) e a camada de controle(controller).


## Decorator - Estrutural 
* O Decorator é um padrão de projeto estrutural que permite que você acople novos comportamentos para objetos ao colocá-los dentro de invólucros de objetos que contém os comportamentos.  
-> Problema - Adicionar novas funcionalidades em um objeto existente sem mexer em sua estrutura.  
-> Solução - Usando Agregação ou Composição e criando uma "pilha" de objetos através da criação de uma classe Decorator que guarda o próximo objeto da pilha.  
<p align="center">
  <img src="https://refactoring.guru/images/patterns/diagrams/decorator/structure.png?id=8c95d894aecce5315cc1">
</p>

## Strategy/Policy - Comportamental  
* É um padrão de design comportamental que permite definir uma família de algoritmos, colocar cada um deles em uma classe separada e tornar seus objetos intercambiáveis.  
-> Problema - O problema principal que o strategy tenta resolver, é diminuir o acoplamento entre classes bases de classes derivadas.  
-> Solução -  Encapsule detalhes da interface em uma classe base e oculte detalhes da implementação em classes derivadas.
<p align="center">
  <img src="https://refactoring.guru/images/patterns/diagrams/strategy/structure-2x.png?id=5bd791857c3bab419bcf" width = 450>
</p>


## State - Comportamental  
* O State é um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando o estado do programa muda.  
- Essa estrutura pode ser parecida com o padrão **Strategy**, mas há uma diferença chave. No padrão State, os estados em particular podem estar cientes de cada um e iniciar transições de um estado para outro, enquanto que estratégias quase nunca sabem sobre as outras estratégias.  
<p align="center">
  <img src="https://refactoring.guru/images/patterns/diagrams/state/structure-pt-br.png?id=50efedb80eab6994524b" width = 500>
</p>


## Adapter - Estrutural  
* Padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.  