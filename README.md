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
