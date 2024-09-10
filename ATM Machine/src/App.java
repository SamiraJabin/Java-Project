public class App {
    public static void main(String[] args) throws Exception {
        MachineFeatures machine = new MachineFeatures();
        Location location = new Location("India", "202001", "Uttar Pradesh", "Aligarh", "AP", "XYZ, Marris Road");
        CurrencyComposition composition = new CurrencyComposition(500, 500, 1000, 5000, 100000);
        User user = new User("Samira", 123456, "984989732658", 673, 20000, 07, 2030);
        ATM atm = new ATM("12349", location, composition);

        machine.checkUserBalance(user);
        machine.seeComposition(composition);
        machine.createATM(location, composition);
        composition = new CurrencyComposition(50, 5, 100, 50, 10);
        machine.updateATMComposition(atm, composition);
        machine.seeComposition(composition);

        machine.withdraw(2000, user, atm);
    }
}
