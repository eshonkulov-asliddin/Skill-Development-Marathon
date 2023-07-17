class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int timeNeedToCollectPaper = this.collectGarbage(garbage, travel, "P");
        int timeNeedToCollectGlass = this.collectGarbage(garbage, travel, "G");
        int timeNeedToCollectMetal = this.collectGarbage(garbage, travel, "M");
        return timeNeedToCollectPaper + timeNeedToCollectGlass + timeNeedToCollectMetal;
    }
    
    public int collectGarbage(String[] garbage, int[] travel, String type){
        int timeNeedToCollectGarbage = 0;
        int timeNeedToTravel = 0;
        int start = 0;
        int end = 0;
        for (String house : garbage){
            for (char garbageType : house.toCharArray()){
                if (String.valueOf(garbageType).equals(type)){
                    timeNeedToCollectGarbage += (1 + timeNeedToTravel);
                    timeNeedToTravel = 0;
                    
                }
            }
            if (start < travel.length){
                timeNeedToTravel += travel[start++];
            }
        }
        
        return timeNeedToCollectGarbage;
    }
}