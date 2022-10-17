
/**
* Feedback Cha: analog zu Stuhl
*/


/**
 * Beschreiben Sie hier die Klasse Sofa.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
//Subklasse von Klasse Produkt. (Übernimmt alle Attribute/Var & Methoden von Oberklasse)
public class Sofa extends Produkt
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int kissen;

    /**
     * Konstruktor für Objekte der Klasse Sofa
     */
    public Sofa(int zustand, int holzeinheiten, int schrauben, int farbeinheiten, int kartoneinheiten, int produktionsZeit)
    {
        // Instanzvariable initialisieren -->nochmals anpassen
        super(zustand, holzeinheiten, schrauben, farbeinheiten, kartoneinheiten, produktionsZeit); 
        kissen = 0;
       
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    //Hier käme:
    //public int beispielMethode()
    //{
        // tragen Sie hier den Code ein
        
    //}
    //Definition der Get-Methoden, um die oben definierten Variablen abzurufen
    
    
    public int getKissen() {
        return kissen;
    }
    public void setKissen(int KissenFuerSofa){
        kissen = KissenFuerSofa;
    }
    
    
}
