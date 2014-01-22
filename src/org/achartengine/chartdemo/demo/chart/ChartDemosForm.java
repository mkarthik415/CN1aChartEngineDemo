/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.achartengine.chartdemo.demo.chart;

import com.codename1.io.Log;
import com.codename1.ui.Command;
import com.codename1.ui.Form;
import com.codename1.ui.List;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;

import org.achartengine.compat.Context;
import org.achartengine.compat.Intent;

/**
 *
 * @author shannah
 */
public class ChartDemosForm extends Form {
    
    
    
    List formMenu;
    
    class ListOption {
        Class<AbstractDemoChart> chartClass;
        String name;
        
        ListOption(Class cls, String name){
            this.chartClass = cls;
            this.name = name;
        }
        
        public String toString(){
            return this.name;
        }
    }
    
    ListOption[] options = new ListOption[]{
        new ListOption(AverageCubicTemperatureChart.class, "Avg. Cubic Temperature"),
        new ListOption(AverageTemperatureChart.class, "Avg. Temperature"),
        new ListOption(BudgetDoughnutChart.class, "Budget Doughnut"),
        new ListOption(BudgetPieChart.class, "Budget Pie Chart"),
        new ListOption(CombinedTemperatureChart.class, "Combined Temperature"),
        new ListOption(MultipleTemperatureChart.class, "Multiple Temperature"),
        new ListOption(ProjectStatusBubbleChart.class, "Project Status Bubble Chart"),
        new ListOption(SalesBarChart.class, "Sales Bar Chart"),
        new ListOption(SalesComparisonChart.class, "Sales Comparison Chart"),
        new ListOption(SalesGrowthChart.class, "Sales Growth Chart"),
        new ListOption(SalesStackedBarChart.class, "Sales Stacked Bar Chart"),
        new ListOption(ScatterChart.class, "Scatter Chart"),
        new ListOption(SensorValuesChart.class, "Sensor Values Chart"),
        new ListOption(TemperatureChart.class, "Temperature Chart"),
        new ListOption(TrigonometricFunctionsChart.class, "Trigonometric Functions Chart"),
        new ListOption(WeightDialChart.class, "Weight Dial Chart")
    };
    
    public ChartDemosForm(){
        super("A Chart Engine Demo");
        formMenu = new List();
        for ( int i=0; i<options.length; i++){
            formMenu.addItem(options[i]);
        }
        
        formMenu.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                int sel = formMenu.getCurrentSelected();
                ListOption opt = options[sel];
                Class cls = opt.chartClass;
                try {
                    AbstractDemoChart demo = (AbstractDemoChart)cls.newInstance();
                    Context context = new Context();
                    context.setBackCommand(new Command("Menu"){

                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            ChartDemosForm.this.showBack();
                        }
                        
                    });
                    Intent intent = demo.execute(context);
                    
                    context.startActivity(intent);
                } catch (InstantiationException ex) {
                    Log.e(ex);
                } catch (IllegalAccessException ex) {
                    Log.e(ex);
                }
            }
            
        });
        
        setLayout(new BorderLayout());
        addComponent(BorderLayout.CENTER, formMenu);
        
    }
    
    
    
}
