/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.achartengine.chartdemo.demo.chart;

import com.codename1.ui.Component;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BoxLayout;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.ChartFactory;
import org.achartengine.chart.BarChart;
import org.achartengine.chart.BubbleChart;
import org.achartengine.chart.CombinedXYChart;
import org.achartengine.chart.CubicLineChart;
import org.achartengine.chart.LineChart;
import org.achartengine.chart.PointStyle;
import org.achartengine.compat.Color;
import org.achartengine.compat.Context;
import org.achartengine.compat.Intent;
import org.achartengine.compat.Paint;
import org.achartengine.model.RangeCategorySeries;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.model.XYValueSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/**
 *
 * @author shannah
 */
public class ChartsInBoxLayout {

    Form form;

    public ChartsInBoxLayout() {
        form = new Form("Charts in Box Layout");
        form.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        Context context = new Context();
        Component chart1 = getTemperatureChart(context);
        //chart1.setHeight(300);
        //chart1.setWidth(300);
        chart1.setPreferredH(500);
        
        form.addComponent(chart1);
        Component chart2 = getCombinedTemperatureChart(context);
        chart2.setPreferredH(500);
        //chart2.setHeight(300);
        //chart2.setWidth(300);
        
        form.addComponent(chart2);
        
        
        

    }
    
    public Form getForm(){
        return form;
    }

    protected void setChartSettings(XYMultipleSeriesRenderer renderer, String title, String xTitle,
            String yTitle, double xMin, double xMax, double yMin, double yMax, int axesColor,
            int labelsColor) {
        renderer.setChartTitle(title);
        renderer.setXTitle(xTitle);
        renderer.setYTitle(yTitle);
        renderer.setXAxisMin(xMin);
        renderer.setXAxisMax(xMax);
        renderer.setYAxisMin(yMin);
        renderer.setYAxisMax(yMax);
        renderer.setAxesColor(axesColor);
        renderer.setLabelsColor(labelsColor);
    }

    private Component getTemperatureChart(Context context) {
        double[] minValues = new double[]{-24, -19, -10, -1, 7, 12, 15, 14, 9, 1, -11, -16};
        double[] maxValues = new double[]{7, 12, 24, 28, 33, 35, 37, 36, 28, 19, 11, 4};

        XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
        RangeCategorySeries series = new RangeCategorySeries("Temperature");
        int length = minValues.length;
        for (int k = 0; k < length; k++) {
            series.add(minValues[k], maxValues[k]);
        }
        dataset.addSeries(series.toXYSeries());
        int[] colors = new int[]{Color.CYAN};
        XYMultipleSeriesRenderer renderer = buildBarRenderer(colors);
        setChartSettings(renderer, "Monthly temperature range", "Month", "Celsius degrees", 0.5, 12.5,
                -30, 45, Color.GRAY, Color.LTGRAY);
        renderer.setBarSpacing(0.5);
        renderer.setXLabels(0);
        renderer.setYLabels(10);
        renderer.addXTextLabel(1, "Jan");
        renderer.addXTextLabel(3, "Mar");
        renderer.addXTextLabel(5, "May");
        renderer.addXTextLabel(7, "Jul");
        renderer.addXTextLabel(10, "Oct");
        renderer.addXTextLabel(12, "Dec");
        renderer.addYTextLabel(-25, "Very cold");
        renderer.addYTextLabel(-10, "Cold");
        renderer.addYTextLabel(5, "OK");
        renderer.addYTextLabel(20, "Nice");
        renderer.setMargins(new int[]{30, 70, 10, 0});
        renderer.setYLabelsAlign(Paint.Align.RIGHT);
        XYSeriesRenderer r = (XYSeriesRenderer) renderer.getSeriesRendererAt(0);
        r.setDisplayChartValues(true);
        r.setChartValuesTextSize(12);
        r.setChartValuesSpacing(3);
        r.setGradientEnabled(true);
        r.setGradientStart(-20, Color.BLUE);
        r.setGradientStop(20, Color.GREEN);
        //ChartFactory.getRangeBarChartView(context, dataset, renderer, BarChart.Type.HEAPED)
        return ChartFactory.getRangeBarChartView(context, dataset, renderer, BarChart.Type.DEFAULT).getPeer();
    }

    private Component getCombinedTemperatureChart(Context context) {
        String[] titles = new String[]{"Crete Air Temperature", "Skiathos Air Temperature"};
        List<double[]> x = new ArrayList<double[]>();
        for (int i = 0; i < titles.length; i++) {
            x.add(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        }
        List<double[]> values = new ArrayList<double[]>();
        values.add(new double[]{12.3, 12.5, 13.8, 16.8, 20.4, 24.4, 26.4, 26.1, 23.6, 20.3, 17.2,
            13.9});
        values.add(new double[]{9, 10, 11, 15, 19, 23, 26, 25, 22, 18, 13, 10});
        int[] colors = new int[]{Color.GREEN, Color.rgb(200, 150, 0)};
        PointStyle[] styles = new PointStyle[]{PointStyle.CIRCLE, PointStyle.DIAMOND};
        XYMultipleSeriesRenderer renderer = buildRenderer(colors, styles);
        renderer.setPointSize(5.5f);
        int length = renderer.getSeriesRendererCount();
        for (int i = 0; i < length; i++) {
            XYSeriesRenderer r = (XYSeriesRenderer) renderer.getSeriesRendererAt(i);
            r.setLineWidth(5);
            r.setFillPoints(true);
        }
        setChartSettings(renderer, "Weather data", "Month", "Temperature", 0.5, 12.5, 0, 40,
                Color.LTGRAY, Color.LTGRAY);

        renderer.setXLabels(12);
        renderer.setYLabels(10);
        renderer.setShowGrid(true);
        renderer.setXLabelsAlign(Paint.Align.RIGHT);
        renderer.setYLabelsAlign(Paint.Align.RIGHT);
        renderer.setZoomButtonsVisible(true);
        renderer.setPanLimits(new double[]{-10, 20, -10, 40});
        renderer.setZoomLimits(new double[]{-10, 20, -10, 40});

        XYValueSeries sunSeries = new XYValueSeries("Sunshine hours");
        sunSeries.add(1f, 35, 4.3);
        sunSeries.add(2f, 35, 4.9);
        sunSeries.add(3f, 35, 5.9);
        sunSeries.add(4f, 35, 8.8);
        sunSeries.add(5f, 35, 10.8);
        sunSeries.add(6f, 35, 11.9);
        sunSeries.add(7f, 35, 13.6);
        sunSeries.add(8f, 35, 12.8);
        sunSeries.add(9f, 35, 11.4);
        sunSeries.add(10f, 35, 9.5);
        sunSeries.add(11f, 35, 7.5);
        sunSeries.add(12f, 35, 5.5);
        XYSeriesRenderer lightRenderer = new XYSeriesRenderer();
        lightRenderer.setColor(Color.YELLOW);

        XYSeries waterSeries = new XYSeries("Crete Water Temperature");
        waterSeries.add(1, 16);
        waterSeries.add(2, 15);
        waterSeries.add(3, 16);
        waterSeries.add(4, 17);
        waterSeries.add(5, 20);
        waterSeries.add(6, 23);
        waterSeries.add(7, 25);
        waterSeries.add(8, 25.5);
        waterSeries.add(9, 26.5);
        waterSeries.add(10, 24);
        waterSeries.add(11, 22);
        waterSeries.add(12, 18);
        XYSeries waterSeries2 = new XYSeries("Skiathos Water Temperature");
        waterSeries2.add(1, 15);
        waterSeries2.add(2, 14);
        waterSeries2.add(3, 14);
        waterSeries2.add(4, 15);
        waterSeries2.add(5, 18);
        waterSeries2.add(6, 22);
        waterSeries2.add(7, 24);
        waterSeries2.add(8, 25);
        waterSeries2.add(9, 24);
        waterSeries2.add(10, 21);
        waterSeries2.add(11, 18);
        waterSeries2.add(12, 16);
        renderer.setBarSpacing(0.3);
        XYSeriesRenderer waterRenderer1 = new XYSeriesRenderer();
        waterRenderer1.setColor(0xff0099cc);
        waterRenderer1.setChartValuesTextAlign(Paint.Align.CENTER);
        XYSeriesRenderer waterRenderer2 = new XYSeriesRenderer();
        waterRenderer2.setColor(0xff9933cc);
        waterRenderer2.setChartValuesTextAlign(Paint.Align.RIGHT);

        XYMultipleSeriesDataset dataset = buildDataset(titles, x, values);
        dataset.addSeries(0, sunSeries);
        dataset.addSeries(0, waterSeries);
        dataset.addSeries(0, waterSeries2);
        renderer.addSeriesRenderer(0, lightRenderer);
        renderer.addSeriesRenderer(0, waterRenderer1);
        renderer.addSeriesRenderer(0, waterRenderer2);
        waterRenderer1.setDisplayChartValues(true);
        waterRenderer1.setChartValuesTextSize(10);
        waterRenderer2.setDisplayChartValues(true);
        waterRenderer2.setChartValuesTextSize(10);

        CombinedXYChart.XYCombinedChartDef[] types = new CombinedXYChart.XYCombinedChartDef[]{
            new CombinedXYChart.XYCombinedChartDef(BarChart.TYPE, 0, 1), new CombinedXYChart.XYCombinedChartDef(BubbleChart.TYPE, 2),
            new CombinedXYChart.XYCombinedChartDef(LineChart.TYPE, 3), new CombinedXYChart.XYCombinedChartDef(CubicLineChart.TYPE, 4)};

        return ChartFactory.getCombinedXYChartView(context, dataset, renderer, types).getPeer();

    }

    /**
     * Builds a bar multiple series renderer to use the provided colors.
     *
     * @param colors the series renderers colors
     * @return the bar multiple series renderer
     */
    protected XYMultipleSeriesRenderer buildBarRenderer(int[] colors) {
        XYMultipleSeriesRenderer renderer = new XYMultipleSeriesRenderer();
        renderer.setAxisTitleTextSize(16);
        renderer.setChartTitleTextSize(20);
        renderer.setLabelsTextSize(15);
        renderer.setLegendTextSize(15);
        int length = colors.length;
        for (int i = 0; i < length; i++) {
            XYSeriesRenderer r = new XYSeriesRenderer();
            r.setColor(colors[i]);
            renderer.addSeriesRenderer(r);
        }
        return renderer;
    }

    /**
     * Builds an XY multiple series renderer.
     *
     * @param colors the series rendering colors
     * @param styles the series point styles
     * @return the XY multiple series renderers
     */
    protected XYMultipleSeriesRenderer buildRenderer(int[] colors, PointStyle[] styles) {
        XYMultipleSeriesRenderer renderer = new XYMultipleSeriesRenderer();
        setRenderer(renderer, colors, styles);
        return renderer;
    }

    protected void setRenderer(XYMultipleSeriesRenderer renderer, int[] colors, PointStyle[] styles) {
        renderer.setAxisTitleTextSize(16);
        renderer.setChartTitleTextSize(20);
        renderer.setLabelsTextSize(15);
        renderer.setLegendTextSize(15);
        renderer.setPointSize(5f);
        renderer.setMargins(new int[]{20, 30, 15, 20});
        int length = colors.length;
        for (int i = 0; i < length; i++) {
            XYSeriesRenderer r = new XYSeriesRenderer();
            r.setColor(colors[i]);
            r.setPointStyle(styles[i]);
            renderer.addSeriesRenderer(r);
        }
    }

    /**
     * Builds an XY multiple dataset using the provided values.
     *
     * @param titles the series titles
     * @param xValues the values for the X axis
     * @param yValues the values for the Y axis
     * @return the XY multiple dataset
     */
    protected XYMultipleSeriesDataset buildDataset(String[] titles, List<double[]> xValues,
            List<double[]> yValues) {
        XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
        addXYSeries(dataset, titles, xValues, yValues, 0);
        return dataset;
    }

    public void addXYSeries(XYMultipleSeriesDataset dataset, String[] titles, List<double[]> xValues,
            List<double[]> yValues, int scale) {
        int length = titles.length;
        for (int i = 0; i < length; i++) {
            XYSeries series = new XYSeries(titles[i], scale);
            double[] xV = xValues.get(i);
            double[] yV = yValues.get(i);
            int seriesLength = xV.length;
            for (int k = 0; k < seriesLength; k++) {
                series.add(xV[k], yV[k]);
            }
            dataset.addSeries(series);
        }
    }

}
