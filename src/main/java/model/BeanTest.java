package model;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        ArrayList<Quotes> quotes = new ArrayList<>();
        Quotes quote1 = new Quotes();
        Quotes quote2 = new Quotes();
        Quotes quote3 = new Quotes();
        Quotes quote4 = new Quotes();
        Quotes quote5 = new Quotes();

        quote1.setAuthorFirstName("Douglas");
        quote1.setAuthorLastName("Adams");
        quote1.setQuote("I love deadlines. I love the whooshing noise they make as they go by.");

        quote2.setAuthorFirstName("Mark");
        quote2.setAuthorLastName("Twain");
        quote2.setQuote("Clothes make the man. Naked people have little or no influence on society.");

        quote3.setAuthorFirstName("Kurt");
        quote3.setAuthorLastName("Vonnegut");
        quote3.setQuote("The universe is a big place, perhaps the biggest.");

        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for(Quotes quote : quotes) {
            System.out.println(quote.getAuthorFirstName() + " " + quote.getAuthorLastName());
            System.out.println(quote.getQuote());
        }

    }

}