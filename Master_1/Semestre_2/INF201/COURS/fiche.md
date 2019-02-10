## SRP

SRP consiste à créer une classe par fonctionnalité. Cela permet d'éviter qu'une autre classe dépende de plusieurs fonctionnalités à la fois alors qu'elle en dépend que d'une seule. Si une classe possède plusieurs responsabilités, elle aura plusieurs raisons de changer. 
Il n'est pas nécessaire de découpler les responsabilités si les changements n’ont aucun risque de se produire, ou s’ils se produisent toujours ensemble. (ex : Employe, EmployeSalaire, EmployeCoordonnees). 

## OCP

OCP consiste à utiliser l'héritage, l'abstraction de classes et le polymorphisme pour pouvoir facilement étendre des modules mais sans devoir les modifier. (ex : Employe, Vendeur, Manager). 

## LSP 

LSP consiste à utiliser de l'héritage pour pouvoir avoir des méthodes communes. Si une sous classe ne doit pas implémenter une méthode, il ne faut pas l'implémenter dans la classe mère. (ex : Robot, RobotStatique, RobotDynamique). 

## ISP

ISP consiste à utiliser des interfaces découpées en fonction des besoins et ne pas regrouper une grosse inrterface pour tous les besoins. (ex : Printer, Scanner, Copyer, Faxer comme interfaces et SimplePrinter implémente uniquement Printer). 

## DIP 

DIP consiste à ce que les modules haut niveau ne doivent pas dépendre de modules bas niveau. Pour cela, on crée une méthode dans la classe métier M qui prend en paramètre une interface I. On crée une classe B qui implémente l'interface I. Dans la méthode de A, on appelle donc l'interface I avec la méthode implémentée par B. (ex : Classe Metier, Interface Logger, Classe ConsoleLogger qui implémente Logger). 