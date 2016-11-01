package com.alenasoft.exercises.exercise5_1;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Created by Luis Roberto Perez on 1/11/2016.
 */
public class BarChartView extends JPanel implements DataView {

    private final DefaultCategoryDataset dataset;

    public BarChartView() {
        this.dataset = new DefaultCategoryDataset();
    }

    public void updateView(Map<String, Integer> data) {
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            dataset.addValue(entry.getValue(), entry.getKey(), "People");
        }

        final ChartPanel chartPanel = new ChartPanel(this.createBarChart());
        chartPanel.setPreferredSize(new Dimension(450,400));
        this.removeAll();

        this.add(chartPanel);
        this.validate();
        this.repaint();
    }

    public JFreeChart createBarChart() {
        final JFreeChart chart = ChartFactory.createBarChart(
            "Bar Chart",         // chart title
            "Category",          // domain axis label
            "Value",             // range axis label
            dataset,             // data
            PlotOrientation.VERTICAL, // orientation
            true,                // include legend
            true,                // tooltips?
            false
        );

        return chart;
    }
}
