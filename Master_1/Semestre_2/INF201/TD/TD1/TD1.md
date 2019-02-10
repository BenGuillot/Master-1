# Exercice 3.1

1. La classe Employe a deux fonctionnalités : l'affichage et le calcul du salaire. Il faut donc séparer les fonctionnalités par classe pour enfin respecter SRP. 

2. Si on change la méthode de calcul du salaire, on doit changer l'ensemble de la classe Employe pour changer le calcul du salaire.

3. Si l'affichage est remplacé par le stockage dans un fichier CSV, la classe entière va devoir dépendre des méthodes de stockage dans un fichier CSV alors que seule la méthode d'affichage en a besoin. Il faudra changer l'ensemble de la classe Employe pour faire cela. 

4. Creer une classe Employe avec juste des attributs et un constructeur. Construire une classe EmployeAffichage qui gère l'affichage d'un  Employe en paramètre. Construire une classe EmployeSalaire qui gère le calcul du salaire d'un Employe en paramètre. 

# Exercice 3.2

1. Creer une classe Employe. Creer une classe Vendeur qui hérite de Employe et qui redéfinit le calcul du salaire. 

2. Creer une classe Manager qui hérite de Employe et qui redéfinit le calcul du salaire. Il possède une liste de Employe pour calculer le salaire de ses employes. 

# Exercice 3.3

1. Cette solution ne respecte pas LSP car il ne faut pas faire l'héritage de la méthode avance pour le robot statique. En effet, ici, cela lance une exception. 

2. Quand on implémente la méthode avanceTous, effectivement, si il y a des robots statiques, il y aura forcément une exception de lancée. 

3. Créer une classe robot qui a direction et position comme attribut et juste son constructeur et la méthode tourne. Créer une classe RobotStatique et une classe RobotEnMouvement qui hérite de Robot. RobotStatique va avoir juste un constructeur. RobotEnMouvement va avoir une méthode supplémentaire avance. 

# Exercice 3.4

1. SimplePrinter est obligée d'implémenter tous les méthodes de l'interface Printer alors qu'elle n'en a pas forcément besoin (scan, fax et copy qui lancent des exceptions). 

2. Si on change l'implémentation de fax, il faut bien sûr changer son implémentation dans l'interface Printer, mais aussi dans la classe SimplePrinter alors que cette dernière n'en a pas besoin. 

3. Créer une interface Printer avec print, une interface Faxer avec fax, une interface Copyer avec copy et une interface Scanner avec scan. Ainsi, SimplePrinter va juste implémenter Printer. 

# Exercice 3.5

1. Ce code ne respecte pas DIP car une classe Metier de haut niveau dépend d'une méthode bas niveau. 

2. Créer une interface Logger et une méthode ConsoleLogger qui implémente cette interface. Créer une méthode dans la classe Metier qui a en paramètre Logger. Appeler la méthode de Logger, implémentée par ConsoleLogger. 