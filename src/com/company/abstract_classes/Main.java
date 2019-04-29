package com.company.abstract_classes;

public class Main {
    public static void main(String[] args) {
        AbstractLetter letter = new E();
        letter.print(false);
        letter.print(true);

        //Abstract
        //Base
        //Skeleton
    }
}


abstract class AbstractLetter {

    int getASCIICode(boolean isUpperCase) {
        char character = getLetter(isUpperCase).charAt(0);
        return (int) character;
    }

    abstract String getLetter();

    String getLetter(boolean isUpperCase) {
//        if (isUpperCase) {
//            return getLetter().toUpperCase();
//        } else {
//            return getLetter().toLowerCase();
//        }
        return isUpperCase ? getLetter().toUpperCase() : getLetter().toLowerCase();
    }

    void print(boolean isUpperCase) {
        System.out.printf("Letter: '%s', ASCII Code: '%s'\n", getLetter(isUpperCase), getASCIICode(isUpperCase));
    }

    void print() {
        boolean defaultValue = false;
        print(defaultValue);
    }
}

class A extends AbstractLetter {

    @Override
    String getLetter() {
        return "a";
    }
}
class B extends AbstractLetter {
    @Override
    String getLetter() {
        return "b";
    }
}
class C extends AbstractLetter {
    @Override
    String getLetter() {
        return "c";
    }
}

class D extends AbstractLetter {

    @Override
    String getLetter() {
        return "d";
    }
}

class E extends AbstractLetter {
    @Override
    String getLetter() {
        return "e";
    }
}
class F extends AbstractLetter {
    @Override
    String getLetter() {
        return "f";
    }
}


