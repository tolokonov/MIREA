package com.company.pr7;

import java.util.Stack;

public class Stack_ {
    public static String play(Stack cards_1, Stack cards_2){

        for (int i=0; i<106; i++){
            if (cards_1.size() == 0){
                System.out.println("Количество шагов равно: " + i);
                return "second";
            } else if (cards_2.size() == 0){
                System.out.println("Количество шагов равно: " + i);
                return "first";
            } else {
                Integer card_1 = (int) cards_1.peek();
                Integer card_2 = (int) cards_2.peek();
                if (card_1 != 0 && card_2!=0){
                    if (card_1 > card_2){
                        cards_1.pop();
                        cards_2.pop();
                        cards_1 = addLast(cards_1, card_1, card_2);
                    } else if (card_1 < card_2){
                        cards_1.pop();
                        cards_2.pop();
                        cards_2 = addLast(cards_2, card_2, card_1);
                    }
                } else if(card_1 == 9 || card_2==9){
                    if (card_1 == 0){
                        cards_1.pop();
                        cards_2.pop();
                        cards_1 = addLast(cards_1, card_1, card_2);
                    } else if (card_2 == 0){
                        cards_1.pop();
                        cards_2.pop();
                        cards_2 = addLast(cards_2, card_2, card_1);
                    }
                }
            }
        }
        return "bolda";
    }

    public static Stack addLast(Stack cards_1, Integer card_1, Integer card_2){
        Stack cards_2 = new Stack();
        for(int i=0; i<cards_1.size(); i++){
            cards_2.push(cards_1.peek());
        }
        cards_2.push(card_1);
        cards_2.push(card_2);
        Stack cards_3 = new Stack();
        for(int i=0; i<cards_2.size(); i++){
            cards_3.push(cards_2.peek());
        }
        return cards_3;
    }
}
