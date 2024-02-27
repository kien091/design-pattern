package org.example;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
    @Override
    public int visit(Book book) {
        int cost;
        //apply 5$ discount if book price is greater than 50
        if(book.price() > 50)
        {
            cost = book.price()-5;
        }
        else
            cost = book.price();

        System.out.println("Book ISBN::"+book.isbnNumber() + " cost ="+cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(fruit.getName() + " cost = "+cost);
        return cost;
    }
}
