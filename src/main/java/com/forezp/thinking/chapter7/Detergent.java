package com.forezp.thinking.chapter7;

import com.forezp.thinking.Print;

/**
 * Created by forezp on 2017/11/30.
 */
public class Detergent extends Cleanser {

    @Override
    public void subcribe() {
        append("Detergent.subcribe()");
        super.subcribe();
    }

    public void form() {
        append("form()");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.subcribe();
        detergent.form();
        Print.print(detergent);
        Print.print("------");
        Cleanser.main(args);

    }
}
