package com.company;
//має бути 2 класи з цими трьома методами, перший числовий, інший для додавання

//має бути клас парсер, в класі мають бути наступні методи:
//isEnd чи закінчилося розпізнання поточного елемента (числа або математичної дії)
//apply метод, який продовжує приймати твій поточний елемент
//startNewParser повертає новий парсер, приймає чар
class MathExpression {
    //парсерліст
    //parser тільки додатні числа і тільки з +, може бути з повторенням

    // NumberParser parser = new NumberParser()

    //read about interfaces
    //конструктор

    NumParser parser = new NumParser();

    public MathExpression(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char item = expression.charAt(i);
            //if (parser.isEnd(item)) {
            //  parser = parser.startNewParser(item);
            // addToList(parser);
            //} else {
            //  parser.apply(item);
            //}
        }
    }
}