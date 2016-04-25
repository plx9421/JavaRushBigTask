package org.javarush.bigtask.view;

import org.javarush.bigtask.controller.Controller;
import org.javarush.bigtask.model.ModelData;

/**
 * Created by Alexey on 28.03.2016.
 */
public interface View {
    void refresh(ModelData modelData);

    void setController(Controller controller);
}
