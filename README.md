Pattern Observateur / Observé (Observer / Observable en anglais)

![Schema du pattern Observer](Schema.png)

Si dans un programme, une méthode x doit être déclenchée à chaque fois qu’une méthode y l’est ou le décide.<br />
Première solution (pas la bonne) l’attente active :<br />
	main interroge y tous les 10ms : « as-tu fait g() ? »<br />
	Si oui, appel de x.f()<br />

Mauvaise solution car :<br />
consomme du CPU<br />
ralentit toute l’application<br />
mauvais couplage : main doit tout savoir<br />
impossible à maintenir surtout si nombreux observateurs et observés<br />

Bonne solution utilisation du paterne Observer :<br />
y signale à x qu’une màj a eu lieu (x.notify())<br />
car x s’est préalablement enregistré auprès y<br />
x.notify() décide comment réagir<br />

Y ne connaît pas ce que X fait mais elle sait que quand quelque chose change chez elle, elle doit le signaler. Bon découplage des choses. Elle sait quelle doit prévenir X car au début du programme X c’est enregistré chez Y.<br />
En résumé chez Y il y a une interface observer qui contient la méthode notify() donc dans le code de Y on aura x.notify() pour prévenir X.<br />

Nouvelles méthodes dans la classe de Y :<br />
y.notifyObservers() (a.k.a. notifyObservers)<br />
y.addObserver(Observer o) (addSubscriber)<br />
y.removeObserver(Observer o) (RemoveSubscriber)<br />

Défaut de ce pattern, il ne faut pas oublier de se désinscrire si on ne l’utilise plus et notify() n‘est pas discriminant, il alerte tout les inscrit même si pas concerné.

