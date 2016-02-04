# calc2c - Clément GARBAY

## Avancement 

Analyse lexicale et compilation en code C terminée pour la piste verte, bleu et rouge. 

## Pour aller plus loin

Les tests de la piste rouge ne me semblait pas complet. J'en ai donc rajouté. 
Ils permettent notamment de vérifier l'existence de la function appelée, la cohérence du nombre d'arguments, de faire l'ensemble des vérifications d'erreurs dans le body de la fonction et de vérifier le bon type lors de l'appel d'une fonction (type de retour). 
Il n'était pas forcément demandé de vérifier toutes ces caractéristiques mais cela m'a semblé intéressant à réaliser.

## Blocages

Tous les tests passent sauf 1 test de la piste verte (le numéro 26) : `1 / (1 - 1)`. En effet, dans l'état actuel du développement il n'y a aucun moyen de savoir si le dénominateur sera au final égal à 0 (sauf si c'est directement un entier égal à 0).
De même 1 test de la piste rouge ne passe pas (le numéro 10) :
```
even(x) x==0 ? true : odd(x-1)
odd(x) x==1 ? true : even(x-1)
even(4)
```
En effet, j'effectue une vérification du bon typage d'une conditionnelle. Plus précisément, le type des deux expressions doivent être égaux (cf. type(true) == type(odd(x-1)) ). Or, les fonctions étant mutuellement récursives il est impossible de savoir le type de `even` sans connaître celui de `odd` et vice-versa. Notons que sans cette vérification poussée des types, ce test passe.

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

### Immutability

Dans l'optique d'un langage immuable, la modification de la valeur d'une variable n'est pas autorisée. 
Par exemple, le code suivant produira une exception du type *ImmutableException* :
```
a = 23
a = 8 + a
```

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