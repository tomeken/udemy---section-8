public class Wallet {
}

//    Projekt B.4
//        Napisz program który zawiera klasę Wallet, która jest abstrakcyjną reprezentacją portfela.
// Klasa ta ma 3 konkretne realizacje w postaci DollarWallet, FrancWallet, ZlotyWallet.
// Dodatowo mamy abastrakcyjną klasę Money oraz jej realizacje Dollar, Franc, Zloty.
// Zapewnij możliwości dodawania dowolnych rodzajów pieniędzy do portfela,
// przeliczania na dowolny rodzaj waluty. Dodatkowo mamy wypłaty, podgląd ilości zgromadzonej gotówki.
//        Zapewnij możliwości utworzenia nowego portfela na podstawie już istniejącego, np.
//
//        DollarWallet d = new DollarWallet();
//        FrancWallet f = new FrancWallet(d);
//        oraz odpowiednie konwersje gotówki
//
//        Dollar dollar = new Dollar(1200);
//        Franc franc = new Franc(dollar);