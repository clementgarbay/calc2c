# calc2c - Clément GARBAY

## Avancement 

Analyse lexicale et compilation en code C terminée pour la piste verte, bleu et rouge. 
Tous les tests passent sauf 1 test de la piste verte (le numéro 26) : `1 / (1 - 1)`. En effet, dans l'état actuel du développement il n'y a aucun moyen de savoir si le dénominateur sera au final égal à 0 (sauf si c'est directement un entier égal à 0).

## Vérification d'erreurs pré-compilation en C

Différentes possibles erreurs sont testées avant la génération en code C. Parmi elles : vérification de types, vérification de l'existence de variable, vérification de la cohérence des opérateurs, vérification des problèmes d'immuabilités, vérification arithmétique, etc.

### Type checking

Une vérification de types est effectuée. 
Elle permet de prévenir les expressions non correctes, par exemple : `false == 3`. Une telle expression déclenchera une exception du type *IncompatibleTypeException*. 

### Operator acceptance

De plus, une vérification plus poussée concernant la cohérence des opérateurs associés aux expressions est effectuée. 
Des expressions comme `false + true` ou `!20` déclencherons une exception du type *IncompatibleOperatorException*.

### Undefined variable

L'existence des variables utilisées est également vérifiée. 
Un fichier contenant seulement `a = b + 2` déclenchera une exception du type *UndefinedVariableException* car la variable `b` n'est pas déclarée.

**/!\ Cette vérification n'est pour le moment pas présente pour les fonctions.**

### Immutability

Dans l'optique d'un langage immuable, la modification de la valeur d'une variable n'est pas autorisée. 
Par exemple, le code suivant produira une exception du type *ImmutableException* :
```
a = 23
a = 8 + a
```

**/!\ Cette vérification n'est pour le moment pas présente pour les fonctions.**

## Syntaxe

La syntaxe est assez commune à beaucoup de langage. 
Les opérateurs arithmétique `+`, `-`, `*` et `/` sont présents est utilisable sur des entiers. De même pour les opérateurs de comparaison d'ordre `<`, `>`, `<=` et `>=`.
Les opérateurs de comparaison d'équalité `==` et `!=` sont aussi présents et utilisables sur tout types de données. 
L'opérateur unitaire de négation `!` est utilisable seulement sur les booléens.

### Déclaration

```
variable = 34 - 2
```

### Conditionnelle

```
(2 == 2) ? 1 : 3
```

### Fonction

```
sum(x,y) x + y
> sum(8,17)
```