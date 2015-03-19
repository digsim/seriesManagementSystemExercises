To get help type following command in the console:
```
python serieManagementSystem.py --help
```

To create a new exercise empty structure type:
```
python serieManagementSystem.py --make-new-exercise
```

To build a new serie:
(First check that the corresponding .cfg file is correctly setup)
```
python serieManagementSystem.py --build-serie
```
You will be prompted for the serie number, answer and then the system will generate everything for a given serie; the solution and creates a zip file for Moodle containing all ressources.

To create all the series
```
python serieManagementSystem.py --build-all-series
```
This creates a big zip file with all the series and their solutions. Just upload this zip to Moodle, extract it and voilà!

To generate a quick pdf preview for a given exercice
```    
python serieManagementSystem.py --preview-exercise
```

To generate a quick pdf preview for a given exercice solution
```
python serieManagementSystem.py --preview-solution
```

To create a single PDF containing all series and the associated solutions as they were distributed
```    
python serieManagementSystem.py --make-workbook
```

To create a single PDF containing the collection of exercises
```
python serieManagementSystem.py --make-catalogue
```

==========================================================================================

Notes de l'auteur du logiciel SMS: Andreas Ruppen
http://digsim.is-a-geek.com/bricoles/seriesmanagementsystem.html

==========================================================================================

SerieManagementSystem, ou bien SMS pour les intimes est un utilitaire permettant de gérer de manière efficace les séries d’exercices. Définissons d’abord ce qu’est une série d’exercices:

> Une série d’exercices est un ensemble ordonné d’exercices. Le plus souvent ces exercices sont imprimés sur une page avec un certain style afin d’être distribués aux étudiants. Une série d’exercices est normalement accompagnée d’un corrigé. Le corrigé possède les mêmes caractéristiques visuelles que la série d’exercices.

Dans le but de proposer des exercices intéressants aux étudiants, chaque année une partie des exercices est revue, une autre partie est ajoutée et une partie n’est plus utilisée. Au lieu de refaire chaque année tous les séries et corrigés à la main et de recommencer le travail à zéro, il serait intéressant de pouvoir réutiliser le travail des années précédentes. C’est le but de SMS.
La plus petite unité dans SMS n’est pas une série d’exercices, mais un seul exercice. Un exercice est composé de la donnée, du corrigé associé ainsi que de matériel supplémentaire comme du code source (une fois pour la donnée et une fois pour la solution). En se basant sur cette structure, il est possible de créer une sorte de base de données d’exercices. Pour créer une nouvelle série d’exercices, il suffit dès lors de choisir dans la base de données les exercices constituant la série d’exercices et le reste du travail et fait automatiquement.

Comment cet utilitaire construit-il une série d’exercices? Étant donné que j’ai développé le logiciel, il est fortement adapté à mes besoins et au système de publication de séries d’exercices utilisé ici à l’université de Fribourg. La plupart des cours et leurs séries d’exercices associées sont distribués via la plateforme Moodle. C’est pour cela que SMS propose deux manières pour créer une série d’exercices:

   1. Création d’un fichier zip contenant tous les documents relatifs à cette série d’exercices.
   2. Création d’un fichier zip contenant toutes les séries d’exercices, chacune dans un sous-répertoire.

La deuxième manière est certainement la plus utile puisqu’elle permet ensuite une mis à jour rapide du site. La structure d’une série d’exercices est la suivante:
Serie1

    * donne
        * serie1.pdf
        * donne_s1_eXX.zip
    * solution
        * solution1.pdf
        * solution_s1_eXX.zip

La même structure est ensuite utilisée sur Moodle pour distribuer les exercices et solutions avec le matériel supplémentaire associé. Ceci a l’avantage d’être rapide et efficace. Si la série vient avec des documents supplémentaires (compressé dans donne_s1_eXX.zip) il suffit de de donner accès au répertoire donne, sinon il suffit de faire un lien vers le fichier serie1.pdf.

Comment ce système fonctionne-t-il? La génération des séries et solutions et délégué à LaTeX. Ceci permet une présentation sobre et classe et donne toujours des résultats agréables à lire. L’utilitaire est en fait un script python qui travaille ensuite sur la hiérarchie de dossiers, contenant exercices et solution. Il faut donc absolument respecter certaines contraintes. Le dossier contenant un exercice doit être nommé ex1, ex2, ex3 et ainsi de suite et doit contenir la structure suivante:

    * code
        * donne
        * solution
    * latex
        * exo1.tex
        * exo1sol.tex
        * resources
            * code
            * figures

Si on ne respecte pas cette structure, le script ne peut pas interpréter l’exercice. On voit qu’il y a deux répertoires: code et latex. Le répertoire code contient tous les documents annexes qui sont distribués avec la série (chez moi en général du code, d’où le nom du répertoire). Il y a un sous-répertoire pour les documents à distribuer avec la donnée et un sous-répertoire pour les documents à distribuer avec la solution. Le répertoire latex contient la donnée de l’exercice ainsi que sa solution. Ce répertoire possède aussi un sous-répertoire resources. Là-dedans on peut mettre toutes les ressources utilisées pour l’énoncé et la solution (chez moi c’est soit du code soit des figures). Il est à noter que pour inclure des fichiers dans le code LaTeX il faut précéder le chemin vers le fichier par \includepath/, ce qui donnerait par exemple:
```
\begin{figure}[h]
\centering
\includegraphics[width=8cm]{\includepath/figures/dijkstra.png}
\caption{Routers and their distances}
\label{fig:dijkstra}
\end{figure}
```
pour inclure la figure dijkstra.png située dans le répertoire figures.

Une fois que la base de données contenant tous les exercices est créée, il faut configurer le script. Là aussi le script demande à trouver certains fichiers à un endroit précis. Il faut au minimum quatre fichiers (cpationnames.tex, sms.sty, lecture.cfg et le fichier bibtex) et trois répertoires (logos, Series_properties et le répertoire Exercices). Le fichier captionnames.tex contient les traductions de certains éléments de LaTeX comme le nom des figures, tables et code source (listing). Le fichier sms.sty définit l’aspect graphique de la série d’exercices. Le fichier lecture.cfg configure de manière globale le script. Le répertoire logos contient les logos (du group de recherche, de l’institut) à mettre sur les documents. Le répertoire Series_properties contient les fichiers définissant les séries d’exercices et le répertoire Exercices contient toutes les structures d’exercices comme discuté ci-dessus. Examinons à présent le contenu du fichier lecture.cfg:
```
[Config]
# Name of the directory containing all series
moodleOutputDir: Series
removeUnzipped: true
createZip: false
# should the last visited be updated in the bibtex file
updateBibTex: true
# command for viewing the pdf file
opencmd: open
# sets the verbosity of the application 50(CRITICAL), 40(ERROR), 30(WARNING), 20(INFO), 10(DEBUG), 0(NOTSET)
debugLevel: 20
# add the \clearpage at the end of each exercice.
# The \clearpage command ends the current page and causes all figures and tables that have so far appeared in the input to be printed. 
addClearPage: true
# Use pdftk instead of gs
usepdftk: false
# Folder containting the config files for each series
seriesConfigDir: Series_properties
# Folder containing the individual exercises
exoDirName:Exercices
# Output folder containig the generated series
outputDir: /Users/ruppena/SwitchDrive/GL_15/Exercicses/

[Lecture]
name: Software Engineering I -- Object-oriented methods
lecturer: Prof. Jacques Pasquier \& Andreas Ruppen
year: SP 2015
# bibtex file
bibtex: bibdb.bib
# these bib tex entries will always be cited.
nocite: WEBGL
exercisetext: Serie
solutiontext: Solution
contenttext: Content
headertitle: Exercises


[Logo]
#set the logo top right
#unilogo: A_global_nb
unilogo: UNF_Logo_100pr_pos
#set the logo top left
groupelogo: softeng

[PDF]
# no special characters here, pdflatex does not seem to like them much
pdfkeyword: Software Engineering I -- Object-oriented methods
pdftitle: Exercises
pdfauthor: Jacques Pasquier, Andreas Ruppen
```
On voit qu’il y a quatre sections: Config, Lecture, Logo et PDF. Le fichier est bien commenté et se passe de commentaires. Les options proposées sont normalement suffisantes pour l’adapter à une multitude de cours.

Comment est-ce qu’on construit une nouvelle série d’exercices? Pour cela il faut créer un fichier dans le répertoire Series_properties. Le fichier doit être nommé comme suit: serie+numéro de la série.cfg, ce qui donnerait pour la série 3 par exemple serie3.cfg. Tout comme le fichier lecture.cfg, il s’agit d’un fichier de configuration pour le script. Voici à quoi ressemble une série d’exercices:
```
[Serie]
titles: War driving,HTTP over telnet
exo-numbers: 3,4
```
On voit qu’il y a deux clés: titles et exo-numbers. Les titles sont utilisés pour faire un résumé de la série d’exercices alors que la partie exo-numbers définit quels exercices sont à inclure dans la série d’exercices.
À partir de là il suffit de lancer le script dans le même répertoire que le fichier lecture.cfg. Le script propose une option d’aide (--help) qui explique en détail comment utiliser les différents paramètres au script. Pour compiler la série d’exercices 4 par exemple, il faut appeler le script comme suit:
serieManagementSystem.py --build-serie -s 4
ou bien pour compiler toutes les series d’exercices:
serieManagementSystem.py --build-all-series
Vu que le cours est configuré entièrement via le fichier lecture.cfg, le même script peut être utilisé pour gérer plusieurs cours différents en parallèle. 

