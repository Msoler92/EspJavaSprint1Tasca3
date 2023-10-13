Sprint 1, Tasca 3, Nivell 2, Exercici 1

"Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int). Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.

Important

Pot haver-hi restaurants amb el mateix nom amb diferent puntuació, però no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació."

Notes:
- La classe Restaurant sobreescriu els métodes equals() i hashCode() per definir igualtat entre instàncies de la classe.
- El main() comprova el bon funcionament d'aquests mètodes creant 4 instàncies, dues de les quals iguals, i comprovant que el HashSet no emmagatzema el duplicat.