package com.company.pr7;

import java.util.*;
import java.lang.*;

public class Double_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cards_st = scanner.nextLine().split(" ");
        LinkedList<Integer> cards_1 = new LinkedList<>();
        for (int i=0; i<cards_st.length; i++){
            cards_1.add(Integer.parseInt(cards_st[i]));
        }

        LinkedList <Integer> cards_2 = new LinkedList<>();
        cards_st = scanner.nextLine().split(" ");
        for (int i=0; i<cards_st.length; i++){
            cards_2.add(Integer.parseInt(cards_st[i]));
        }

        System.out.println(play(cards_1, cards_2));
    }

    public static String play(LinkedList cards_1, LinkedList cards_2){

        for (int i=0; i<106; i++){
            if (cards_1.size() == 0){
                return "second";
            } else if (cards_2.size() == 0){
                return "first";
            } else {
                Integer card_1 = (int) cards_1.getFirst();
                Integer card_2 = (int) cards_2.getFirst();
                if (card_1 != 0 && card_2!=0){
                    if (card_1 > card_2){
                        cards_1.addLast(card_1);
                        cards_1.addLast(card_2);
                        cards_1.remove(0);
                        cards_2.remove(0);
                    } else {
                        cards_2.addLast(card_1);
                        cards_2.addLast(card_2);
                        cards_2.remove(0);
                        cards_1.remove(0);
                    }
                } else if(card_1 == 9 || card_2==9){
                    if (card_1 == 0){
                        cards_1.addLast(card_1);
                        cards_1.addLast(card_2);
                        cards_1.remove(0);
                        cards_2.remove(0);
                    } else {
                        cards_2.addLast(card_1);
                        cards_2.addLast(card_2);
                        cards_2.remove(0);
                        cards_1.remove(0);
                    }
                }
            }
        }
        return "bolda";
    }
}