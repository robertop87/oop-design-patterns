package com.alenasoft.exercises.exercise5_1;

import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.awt.*;

/**
 * Created by Luis Roberto Perez on 1/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        DataModel data = new DataModel();
        BarChartView barChart = new BarChartView();
        data.attachDataView(barChart);

        data.updateData("Children", 155);
        data.updateData("Women", 55);
        data.updateData("Men", 35);

        DataPanel dataPanel = new DataPanel(data);

        ApplicationFrame app = new ApplicationFrame("Exercise 5.1: OOP & Design Patterns Cay Horstman");
        app.setSize(new Dimension(750, 450));
        app.setLayout(new BorderLayout());
        app.add(barChart, BorderLayout.CENTER);
        app.add(dataPanel, BorderLayout.EAST);

        RefineryUtilities.centerFrameOnScreen(app);
        app.setVisible(true);
    }
}
