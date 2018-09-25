/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.utils;

import javafx.util.StringConverter;

/**
 *
 * @author HP
 */
public class Converter {

    public static StringConverter<Object> getConverter() {
        StringConverter<Object> sc = new StringConverter<Object>() {
            @Override
            public String toString(Object t) {
                return t == null ? null : t.toString();
            }

            @Override
            public Object fromString(String string) {
                return string;
            }
        };

        return sc;
    }
}
