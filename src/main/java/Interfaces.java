public interface Interfaces {

    // blueprint that tells a class wat it must do but doesnt care how
    // it does it


    // Think of an interface like a remote control blueprint.
    // The blueprint says, "Every remote must have a powerOn() button
    // and a volumeUp() button." But it leaves it up to Sony, Samsung, or
    // Apple to write the internal code for how their specific TV turns on.


   /* •
    Methods have no bodies: By default, you only write the method names and return types.
    No curly braces {} with logic inside.
•   Classes implement them: A class signs the contract using the implement keyword,
    forcing that class to write the actual code for those methods.
  • No instances: You cannot create an object out of an interface directly
   (e.g., new RemoteControl() ❌ is impossible)
*/

    void processPayment(double amount);


}

