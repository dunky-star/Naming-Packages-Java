package com.dunky.game;

import java.util.List;

/**
 * Created by Geoffrey Duncan Opiyo on 01/06/23.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
