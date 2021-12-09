# Software-Testing-Java
Să se implementeze o metodă (funcție/procedură Java, C#, Python sau alte limbaje care permit
testare unitară și folosirea unui generator de mutanți) pentru una din problemele enunțate pe
paginile următoare (după observații și bibliografie).
Să se rezolve următoarele cerințe:
1. Să se genereze date de test folosind metode funcționale:
(a) partiționare în clase de echivalenţă,
(b) analiza valorilor de frontieră,
(c) partiționare în categorii.
Să se implementeze cele 3 seturi de test obținute folosind o librărie de testare unitară (e.g.
JUnit, MSTest, NUnit, PyUnit, etc.).
2. Să se transforme metoda într-un graf orientat şi, pe baza acestuia, să se genereze date de test
care realizează acoperire la nivel de
(a) instrucțiune,
(b) decizie,
(c) condiție.
Să se implementeze cele 3 seturi de test folosind o librărie de testare unitară.
3. Să se calculeze complexitatea metodei folosind formula lui McCabe, precum şi numărul de
circuite independente. Să se precizeze care sunt circuitele independente și să se
implementeze setul de test rezultat folosind o librărie de testare unitară.
4. Să se calculeze expresia regulată formată din nodurile grafului de la punctul 2, precum și
numărul de căi. Să se precizeze care sunt căile asociate grafului.
5. Să se folosească un generator de mutanți (e.g. Pitest sau alt utilitar) pentru a crea mutanți
pentru metoda implementată.
6. Să se ruleze seturile de test de la punctele 1, 2 și 3 contra mutanților generați şi să se explice
rezultatele. Includeți o captură de ecran a raportului generat de utilitar.
7. Să se creeze teste suplimentare pentru a omorî 2 dintre mutanții neechivalenți rămași în
viață. Includeți o captură de ecran a raportului generat de utilitar după omorârea mutanților.

Problema - Licență https://www.infoarena.ro/problema/licenta
Ajunsă în ultimul an de facultate, Mihaela se hotărăşte să îşi termine lucrarea de licenţă intitulată
„Polinomul minimal al unei rădăcini de ordin O într-o extindere algebrică de grad G”. Fiindcă în
lucrarea ei a obţinut rezultate legate de existenţa marţienilor, aceasta doreşte să se întâlnească cu
îndrumătorul ei, Decanul.
Din păcate, timpul nu e de partea ei. Mihaela are la dispoziţie o mulţime de intervale S de
dimensiune N la care poate veni în facultate.
Decanul este o persoană foarte ocupată, precum Mihaela, are la îndemână o mulţime de intervale T
de dimensiune M în care este la biroul său.
Mihaela are nevoie de exact K minute pentru a explica ideile prezente în lucrarea ei indrumătorului.
Pentru că eroina lucrează la conjectura P = NP vă roagă să găsiţi un interval de timp de fix K
secunde astfel încât ea să fie la facultate, iar profesorul ei îndrumător prezent în birou.
În caz că există mai multe soluţii de forma [X, Y], ea doreşte să afişaţi intervalul cu X minim. Dacă
nu există o soluţie atunci afişaţi -1 pe prima linie.
Date de intrare
Fişierul de intrare licenta.in conţine pe prima linie numărul natural K specificat în enunţ. Pe a doua
linie este un singur număr natural N reprezentând dimensiunea mulţimei S.
Următoarele N linii conţin câte 2 numere naturale separate prin câte un spaţiu: XS[i], YS[i]
specificând intervalele de minute în care Mihaela este la facultate. Intervalele sunt disjuncte două
câte două.
Următoarea linie conţine numărul natural M.
Următoarele M linii conţin câte 2 numere naturale separate prin câte un spaţiu: XT[j], YT[j]
specificând intervalele de minute în care profesorul este la biroul său. Intervalele sunt disjuncte
două câte două.
Date de ieşire
Prima linie conţine 2 numere naturale separate prin câte un spaţiu X Y, reprezentând intervalul de
timp în care Mihaela se întâlneşte cu Decanul.
Restricţii
1 ≤ K < 109
1 ≤ N ≤ 105
0 ≤ XS[i] < YS[i] < 109 oricare 1 ≤ i ≤ N
1 ≤ M ≤ 105
0 ≤ XT[j] < YT[j] < 109 oricare 1 ≤ j ≤ M
Pentru 40 de puncte 1 ≤ N * M ≤ 5 * 106
Pentru a lua 100 de puncte, you need to do it for the watch.
Exemplu
licenta.in
4
2
1 10 11 13 2
24
5 12
licenta.out
5 9
Explicaţie
Mihaela poate să ajungă la facultate în intervalele [1, 10]; [11, 13].
Decanul este în biroul său în intervalele [2, 4]; [5 12].
Se observă că dacă Miruna se întâlneşte începând cu minutul 5, aceasta reuşeşte să îi explice
întreaga lucrare de licenţă timp de 4 minute. Ca urmare, soluţia este intervalul [5, 9].
