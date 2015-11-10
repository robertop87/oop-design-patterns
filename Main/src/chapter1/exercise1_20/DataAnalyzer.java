package chapter1.exercise1_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Administrator
 */
public class DataAnalyzer {
    
    Charset charset;
    double  minimum = 0.0;
    double  maximum = 0.0;
    double  average = 0.0;
    
    public DataAnalyzer(String path) {
        
        charset = Charset.forName("US-ASCII");
        readFile(path);
        
    }

    public DataAnalyzer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getMinimum() {
        return minimum;
    }
    
    public double getMaximum() {
        return maximum;
    }
    
    public double getAverage() {
        return average;
    }
    
    public void readFile(String path) {
        
        double  sumNumbers  = 0.0;
        int     counter     = 0;
        
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path), charset)) {
            String line = null;
            String[] strings;
            double readNumber = 0.0;
            
            while ((line = reader.readLine()) != null) {
                strings = line.split(" ");
                counter += strings.length;  // to get number of digits
                
                for (String string : strings) {
                    
                    try {
                        readNumber = Double.parseDouble(string);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                    if (readNumber < minimum) {
                        minimum = readNumber;
                    } else if (readNumber > maximum) {
                        maximum = readNumber;
                    }
                    
                    sumNumbers = sumNumbers + readNumber;
                }
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
            
        }
        
        average = sumNumbers / counter;
    }
    
}
