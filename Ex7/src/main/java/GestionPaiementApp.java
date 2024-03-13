public class GestionPaiementApp {
    public static void main(String[] args) {
    Commande carte1 = new Commande(100.0, new CarteCredit(200, 1234, "1234 5678 9012 3456"));

    Commande paypal1 = new Commande(50.0, new Paypal(50.0, 5678, "Sam@gmail.com"));
    carte1.processPayment();
    paypal1.processPayment();
    Paypal p1= new Paypal(150,223344,"Sam@gmail.com");
    p1.effectuerPaiement(200.25);

    }
}
