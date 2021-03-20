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


## SINGLETON - Criacional
* Este padrão garante a existência de apenas uma instância de uma classe, mantendo um ponto global de acesso ao seu objeto.  
-> Problema - Não permite que haja duas instâncias de uma classe durante a execução de uma aplicação. (Ex.: Conexão BD)  
-> Solução - Encapsular construtor, criar var que guarda instância, retornar a var a cada objeto criado.  


## Factory Method - Criacional 
* É um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.  
-> Problema - Criar um objeto sem especificar qual classe será utilizada.  
-> Solução - Criar uma interface para criar objetos 
