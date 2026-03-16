import java.util.ArrayList;

// Calculations Class
public class EnergyManager {
    private double sum = 0;
    private double max = 0;
    // Total power Method
    public double totalPower(ArrayList<Double> powerConsumptions) {
        for (int i = 0; i < powerConsumptions.size(); i++) {
            sum += powerConsumptions.get(i);
        }
        return sum;

        // Maximum consumption method
    }
    public double maxDevice (ArrayList<Double> maxDevice) {
        for (int i = 0; i < maxDevice.size(); i++) {
            double sum = maxDevice.get(i);
            if (max > sum)
            {
                return max;
            }
            else {max = sum;}
        }
        return max;
    }
}
