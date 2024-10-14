
# Application Moroccan Footballers

Cette application Android présente une galerie de footballeurs marocains, utilisant une `RecyclerView` pour afficher la liste des joueurs. Les utilisateurs peuvent voir les détails des joueurs, les rechercher, et ajuster leur évaluation à l'aide d'une `RatingBar`. L'application comprend également un écran de démarrage (splash screen) et une fonctionnalité de partage.

## Objectifs

- Réaliser différents types d’animations.
- Créer un écran de démarrage pour l'application mobile.
- Comprendre l’utilisation d’un `RecyclerView` pour l’affichage des listes de données.
- Créer des menus au sein de l’application.
- Mettre en place une `RecyclerView` avec filtrage des données via une barre de recherche.
- Utiliser des images cerclées (CircularView, CircleImageView) pour afficher les photos des joueurs.
- Utiliser la bibliothèque Glide pour le chargement et l’affichage des images.

## Fonctionnalités

### 1. Splash Screen

L'application démarre avec un écran d'accueil animé (Splash Screen) qui s'affiche pendant quelques secondes avant de rediriger l'utilisateur vers l'écran principal.

### 2. RecyclerView des Joueurs

L'interface principale de l'application affiche une liste des footballeurs marocains avec leur photo, leur nom et leur note. Cette liste est implémentée à l’aide d’une `RecyclerView`, permettant un affichage performant et optimisé des données.

### 3. Barre de Recherche

Une barre de recherche permet aux utilisateurs de filtrer la liste des joueurs par nom. Au fur et à mesure que l'utilisateur tape, la liste est automatiquement mise à jour pour correspondre à la recherche.

### 4. Modification de la Note (RatingBar)

En cliquant sur un joueur, une fenêtre contextuelle (popup) s’affiche, permettant à l’utilisateur de modifier la note attribuée au joueur à l’aide d’une `RatingBar`.

### 5. Partage des Détails

L’application offre la possibilité de partager les informations des joueurs via les réseaux sociaux ou autres applications, en utilisant la fonctionnalité de partage Android intégrée.

## Bibliothèques Utilisées

- **Glide** : Utilisée pour le chargement et la mise en cache des images des footballeurs à partir d'URLs.
- **RecyclerView** : Pour l'affichage performant d'une liste de joueurs défilable.
- **SearchView** : Pour permettre la recherche et le filtrage des joueurs.
- **RatingBar** : Permet aux utilisateurs de noter les joueurs.

## Vidéo démonsrative

https://github.com/user-attachments/assets/0f542b70-9bad-4029-bd62-66510f99fa89


