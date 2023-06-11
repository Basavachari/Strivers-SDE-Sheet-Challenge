import java.util.ArrayList;
public class SearchIn2DMatrix {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int i = mat.size()-1;
        int j = mat.get(0).size()-1;

        
        while(i>=0 && j>=0){
            if(mat.get(i).get(j) == target )
            return true;
            if (mat.get(i).get(j) < target)
                j--;
            else
                i--;
            
        }
        return false;
        
    }
}
