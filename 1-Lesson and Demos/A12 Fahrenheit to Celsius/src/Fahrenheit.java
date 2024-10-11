//Program name: (Assignment 12 Farenheit Calculator)

//Student name: (Luke Filipchuk)

//Date: (Oct 11)

//Program Description: Convert Fahrenheit to Celsius
public class Fahrenheit {
            private double fahrenheit,cels;
        
            public void setFahrenheit(double fahren)
            {
                fahrenheit = fahren;
            }
        
            public double getCelsius()
        {
                double celsius;
                celsius = (fahrenheit - 32.0)*(5.0/9.0);
                cels = (int)celsius;
                return cels;
            }
        
            public void print()
            {
                
                System.out.println(getCelsius() +" degrees Celsius");
            }
        }