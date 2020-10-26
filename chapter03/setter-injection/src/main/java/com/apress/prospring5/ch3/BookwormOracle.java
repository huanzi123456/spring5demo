package com.apress.prospring5.ch3;

/**
 *
 */
public class BookwormOracle implements Oracle {
    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public String defineMeaningOfLife() {
        return "百科全书是浪费金钱 -  去看看世界";
    }
}

