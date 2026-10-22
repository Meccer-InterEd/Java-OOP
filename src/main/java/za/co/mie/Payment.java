package za.co.mie;

abstract class Payment {
    public abstract void pay(double amount);
//    Abstract means hiding implementation with aim to show only relevant functionalities
//    You cannot create an object directly from an abstract class
//    Subclasses implement pay because it is a required function/method by the abstract class they inherit
}