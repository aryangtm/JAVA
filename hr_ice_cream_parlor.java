class Result {

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> l = new ArrayList();
        for(int i = 0;i<arr.size();i++){
            for(int j = i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j)==m){
                    l.add(i+1);
                    l.add(j+1);
                }
            }
            
        }
        return l;
        }
}
