# pglp_3_5
Illustration du principe d’inversion des dépendances (DIP)


### Réponse 1 ###

Ce code ne respecte pas le principe DIP, car la classe metier a une dependance au niveau du code a la classe LocalDateTime,  

ceci implique que les deux ne peuvent pas étre dépoloyés séparément , ou même compilé séparément.  

Unchamgement dans la classe LocalDateTime nécessite une recompilation de la classe metier.
