package com.github.pattern.template;

/**
 * TemplateClient
 *
 * @author echils
 * @since 2020-01-01 17:31:03
 */
public class TemplateClient {

    public static void main(String[] args) {
        Dumplings leekDumplings = new LeekDumplings();
        leekDumplings.execute();
        System.out.println("-----------------");
        Dumplings meatDumplings = new MeatDumplings();
        meatDumplings.execute();
    }
}
