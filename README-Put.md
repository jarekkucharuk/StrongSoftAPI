
# Obsługa metody PUT.

## Otrzymanie sumy liczb:

Polecenie na na url:

http://localhost:8080/pracownik
{
   
    "pracownikId": 4,

    "imie": "Ola",

    "nazwisko": "Wiśniewska",

    "email": "olawisnia@o2.pl",

    "pracownikAdresDTO":
 {

        "pracownikAdresId": 3,
 
        "ulica": "Kacza",
     
        "nrDomu": "14",
    
        "nrMieszkania": "10",
 
        "kodPocztowy": "20-999",
   
        "miasto": "Opole",
      
        "panstwo": "Polska"
 
   }

}

gdzie parametry po prawej stronie znaków ':' to dane pracownika, które chcemy dodać

