//Program name: (Assignment 12 Farenheit Calculator)

//Student name: (Luke Filipchuk)

//Date: (Oct 9)

//Program Description: Convert Celsius to Fahrenheit.
public class Fahrenheit {
            private double fahrenheit;
        
            public void setFahrenheit(double fahren)
            {
                fahrenheit = fahren;
            }
        
            public double getCelsius()
        {
                double celsius;
                celsius = (fahrenheit - 32.0)*(5/9);
                return celsius;
            }
        
            public void print()
            {
                System.out.println(getCelsius());
            }
        }