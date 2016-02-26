### Aiheen kuvaus ja rakenne

**Aihe**

To Do -lista jokaiselle kiireiselle ihmiselle. To Do -listaan on mahdollista luoda monia eri listoja, joissa on eri kohtia. Kun jotain To Do -listasta on saatu tehty�, se menee listan alle ja vaihtaa v�ri�. To Do -lista sovelluksella on p��valikko, josta voi valita lis��k� uuden listan, tarkasteleeko listoja vai poistuuko ohjelmasta.

**K�ytt�j�t**

Yksitt�inen henkil�.

**K�ytt�j�n toiminnot:**
* Valitsee toiminnon; "Uusi lista", "Selaa listoja", "Poistu"
* Uusi lista -kohdassa luodaan uusi lista
* Selaa listoja -kohdassa on mahdollisuus lis�t� ja poistaa kohtia
* Poistu -kohdassa poistutaan sovelluksesta tallentaen muutokset

### Rakennekuvaus

ToDo -listan rakenne on yksinkertainen ja simppeli, jota olisi helppo laajentaa mm. kategorioilla ja muutokset tallentavalla tekstitiedostolla.

Ohjelman logiikka vaatii kolme luokkaa - Sovellus, ToDoLista ja Tehtava. Tehtava on yksinkertainen luokka, johon tallennetaan teht�v�n kuvaus ja boolean-arvo siit�, onko teht�v� tehty vai tekem�t�n. N�it� Tehtava-olioita voi tallentaa ToDoLista-luokassa tehtyjen ja tekem�tt�mien listalle. ToDoLista on yksi lista, jossa voi olla monta teht�v��. ToDoLista-luokalla on monta metodia, jolla se voi manipuloita ja muuttaa teht�vien tilaa ja j�rjest�� niit� ajantasalle oikeisiin listoihin.

Sovellus-luokka on yhden ihmisen oma sovellus, johon voi tallentaa monta ToDoLista-oliota Tehtava-olioineen. Sovellus-luokka hoitaa listojen manipuloinnin ja toiminnan.

Main on vain luokka, joka k�ynnist�� graafisen k�ytt�liittym�n. Graafinen k�ytt�liittym� tuntee ToDoListan ja Sovelluksen, mutta ei teht�vi�. 


### Luokkakaavioita

**M��rittelyvaiheen luokkakaavio**

![Mit�s t�h�n voi laittaa](/dokumentointi/todolistaMaaritteluvaiheenLuokkakaavio.png)

**Tarkennettu luokkakaavio**

![Mit�s t�h�n voisi taas laittaa]
(/dokumentointi/todolistaTarkennettuLuokkakaavio.png)

**Luokkakaavioon otettu mukaan uusi luokka**

![Yolo]
(/dokumentointi/todolistaYhaTarkempiLuokkakaavio.png)

**Viimeisin luokkakaavio, josta on poistettu tekstik�ytt�liittym�**

![Yesss]
(/dokumentointi/viimeisinLuokkakaavio.png)

### Sekvenssikaavioita

**Sekvenssikaavio ToDo-Listan luomisesta**

![Sekvenssikaavio](/dokumentointi/ToDo-ListanLuominen.png)

**Sekvenssikaavio ToDo-Listan teht�vien muuttamisesta tehdyiksi**

![Sekvenssikaavioo](/dokumentointi/tehtavienMuuttaminenTehdyksi.png)