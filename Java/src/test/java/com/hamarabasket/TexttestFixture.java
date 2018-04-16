package com.hamarabasket;

import com.hamarabasket.Item;
import com.hamarabasket.QualityRuleEngine;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("Indian Wine", 10, 20), //
                new Item("Forest Honey", 2, 0), //
                new Item("Movie Tickets", 5, 7), //
                new Item("Tooth Paste", 0, 80), //
                new Item("Soap", -1, 80),
                new Item("Shampoo", 23, 80)};
              
                

        QualityRuleEngine app = new QualityRuleEngine(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
