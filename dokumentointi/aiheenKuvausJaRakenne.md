### Aiheen kuvaus ja rakenne

**Aihe**

To Do -lista jokaiselle kiireiselle ihmiselle. To Do -listaan on mahdollista luoda monia eri listoja, joissa on eri kohtia. Kun jotain To Do -listasta on saatu tehtyä, se menee listan alle ja vaihtaa väriä. To Do -lista sovelluksella on päävalikko, josta voi valita lisääkö uuden listan, tarkasteleeko listoja vai poistuuko ohjelmasta.

**Käyttäjät**

Yksittäinen henkilö.

**Käyttäjän toiminnot:**
* Valitsee toiminnon; "Uusi lista", "Selaa listoja", "Poistu"
* Uusi lista -kohdassa luodaan uusi lista
* Selaa listoja -kohdassa on mahdollisuus lisätä ja poistaa kohtia
* Poistu -kohdassa poistutaan sovelluksesta tallentaen muutokset

### Rakennekuvaus

ToDo -listan rakenne on yksinkertainen ja simppeli, jota olisi helppo laajentaa mm. kategorioilla ja muutokset tallentavalla tekstitiedostolla.

Ohjelman logiikka vaatii kolme luokkaa - Sovellus, ToDoLista ja Tehtava. Tehtava on yksinkertainen luokka, johon tallennetaan tehtävän kuvaus ja boolean-arvo siitä, onko tehtävä tehty vai tekemätön. Näitä Tehtava-olioita voi tallentaa ToDoLista-luokassa tehtyjen ja tekemättömien listalle. ToDoLista on yksi lista, jossa voi olla monta tehtävää. ToDoLista-luokalla on monta metodia, jolla se voi manipuloita ja muuttaa tehtävien tilaa ja järjestää niitä ajantasalle oikeisiin listoihin.

Sovellus-luokka on yhden ihmisen oma sovellus, johon voi tallentaa monta ToDoLista-oliota Tehtava-olioineen. Sovellus-luokka hoitaa listojen manipuloinnin ja toiminnan.

Main on vain luokka, joka käynnistää graafisen käyttöliittymän. Graafinen käyttöliittymä tuntee ToDoListan ja Sovelluksen, mutta ei tehtäviä. 


### Luokkakaavioita

**Määrittelyvaiheen luokkakaavio**

![Mitäs tähän voi laittaa](/dokumentointi/todolistaMaaritteluvaiheenLuokkakaavio.png)

**Tarkennettu luokkakaavio**

![Mitäs tähän voisi taas laittaa]
(/dokumentointi/todolistaTarkennettuLuokkakaavio.png)

**Luokkakaavioon otettu mukaan uusi luokka**

![Yolo]
(/dokumentointi/todolistaYhaTarkempiLuokkakaavio.png)

**Viimeisin luokkakaavio, josta on poistettu tekstikäyttöliittymä**

![Yesss]
(/dokumentointi/viimeisinLuokkakaavio.png)

### Sekvenssikaavioita

**Sekvenssikaavio ToDo-Listan luomisesta**

![Sekvenssikaavio](/dokumentointi/ToDo-ListanLuominen.png)

**Sekvenssikaavio ToDo-Listan tehtävien muuttamisesta tehdyiksi**

![Sekvenssikaavioo](/dokumentointi/tehtavienMuuttaminenTehdyksi.png)