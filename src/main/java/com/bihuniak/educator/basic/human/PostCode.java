package com.bihuniak.educator.basic.human;

import javax.persistence.Embeddable;

@Embeddable
public class PostCode {

   private String kod;
    private int prefix;

    public PostCode(int prefix,String kod) {
        this.kod = kod;
        this.prefix = prefix;
    }
    public PostCode() {
    }

}
