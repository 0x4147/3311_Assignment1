import java.util.List;

public class SortingTechnique {
    static List<Shape> bubbleSort(List<Shape> shapesList)
    {
        int n = shapesList.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (shapesList.get(j).compareTo(shapesList.get(j+1)) > 0)
                {
                    Shape temp = shapesList.get(j);
                    shapesList.set(j, shapesList.get(j+1));
                    shapesList.set(j+1, temp);
                }
            }
        }
        return shapesList;	
    }
}
