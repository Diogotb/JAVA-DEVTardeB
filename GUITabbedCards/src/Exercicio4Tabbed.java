import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotType;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.StandardDialFrame;
import org.jfree.chart.plot.dial.StandardDialScale;
import org.jfree.chart.plot.dial.DialPointer.Pin;
import org.jfree.chart.plot.dial.DialPointer.Pointer;
import org.jfree.chart.plot.dial.DialBackground;
import org.jfree.chart.plot.dial.DialTextAnnotation;
import org.jfree.chart.plot.dial.DialValueIndicator;
import org.jfree.chart.plot.dial.DialCap;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio4Tabbed {
    public Exercicio4Tabbed() {
       
        JFrame frame = new JFrame("JTabbedPane with Charts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Tab 1: Bar Chart
        JPanel barChartPanel = createBarChartPanel();
        tabbedPane.addTab("Bar Chart", barChartPanel);

        // Tab 2: Pie Chart
        JPanel pieChartPanel = createPieChartPanel();
        tabbedPane.addTab("Pie Chart", pieChartPanel);

        // Tab 3: Line Chart
        JPanel lineChartPanel = createLineChartPanel();
        tabbedPane.addTab("Line Chart", lineChartPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
    

    private static JPanel createBarChartPanel() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Category 1", "Item 1");
        dataset.addValue(2.0, "Category 1", "Item 2");
        dataset.addValue(3.0, "Category 1", "Item 3");
        JFreeChart barChart = ChartFactory.createBarChart(
                "Bar Chart Demo",
                "Category",
                "Value",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Customize the appearance of the bar chart
        BarRenderer renderer = (BarRenderer) barChart.getCategoryPlot().getRenderer();
        renderer.setBarPainter(new StandardBarPainter());

        return new ChartPanel(barChart);
    }

    private static JPanel createPieChartPanel() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 50);
        dataset.setValue("Category 2", 30);
        dataset.setValue("Category 3", 20);
        JFreeChart pieChart = ChartFactory.createPieChart(
                "Pie Chart Demo",
                dataset,
                true,
                true,
                false
        );

        // Customize the appearance of the pie chart
        PiePlot plot = (PiePlot) pieChart.getPlot();
        plot.setSectionOutlinesVisible(false);
        plot.setLabelGenerator(null);

        return new ChartPanel(pieChart);
    }

    private static JPanel createLineChartPanel() {
        XYSeries series = new XYSeries("Random Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.random() * 100);
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart lineChart = ChartFactory.createXYLineChart(
                "Line Chart Demo",
                "X",
                "Y",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Customize the appearance of the line chart
        XYPlot plot = (XYPlot) lineChart.getPlot();
        XYSplineRenderer renderer = new XYSplineRenderer();
        plot.setRenderer(renderer);
        return null;

        
    }
}

