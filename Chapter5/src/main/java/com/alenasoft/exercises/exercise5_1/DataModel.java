package com.alenasoft.exercises.exercise5_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Luis Roberto Perez on 1/11/2016.
 */
public class DataModel {

    private Map<String, Integer> data;
    private List<DataView> dataViews;

    public DataModel() {
        this.data = new HashMap<String, Integer>();
        this.dataViews = new ArrayList<DataView>();
    }

    public void updateData(String categoryName, int value) {
        this.data.put(categoryName, value);
        this.notifiyViews();
    }

    public void attachDataView(DataView dataView) {
        this.dataViews.add(dataView);
    }

    private void notifiyViews(){
        for (DataView view: dataViews) {
            view.updateView(this.data);
        }
    }
}
