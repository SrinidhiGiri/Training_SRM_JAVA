//package Day12.com;
//
//import java.util.ArrayList;
//
//public class ques6 {
//
//    public static void minToFront(ArrayList intList) {
//        if (intList.isEmpty())
//            return;
//
//        int minValue = (int) intList.get(0);
//        int minIndex = 0;
//
//        for (int i = 1; i < intList.size(); i++) {
//            if (intList.get(i) < minValue) {
//                minValue = (int) intList.get(i);
//                minIndex = i;
//            }
//        }
//
//        intList.remove(minIndex);
//        intList.add(0, minValue);
//    }
//}