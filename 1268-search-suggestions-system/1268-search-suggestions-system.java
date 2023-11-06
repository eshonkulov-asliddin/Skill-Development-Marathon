class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        Arrays.sort(products);
        
        
        List<List<String>> res = new ArrayList<>();
        
        
        for (int i = 0; i < searchWord.length(); i++){
            
            String curPrefix = searchWord.substring(0, i+1);
            
            int count = 0;
            List<String> suggestedList = new ArrayList<>();
            for (String product : products){
                
                String productPrefix = product.substring(0, Math.min(i+1, product.length()));
                
                if (curPrefix.equals(productPrefix)){
                    suggestedList.add(product);
                    count++;
                }
                
                if (count == 3){
                    break;
                }
            }
            
            res.add(suggestedList);
            
        }
        
        return res;
        
        
    }
}