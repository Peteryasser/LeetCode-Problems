class Solution {
   public int romanToInt(String s) {
        int result=0;
        StringBuilder x=new StringBuilder(s);
        Map<String ,Integer> m=new HashMap<>();
        m.put("I",1);
        m.put("V",5);
        m.put("X",10);
        m.put("L",50);
        m.put("C",100);
        m.put("D",500);
        m.put("M",1000);
        m.put("IV",4);
        m.put("IX",9);
        m.put("XL",40);
        m.put("XC",90);
        m.put("CD",400);
        m.put("CM",900);
        int l=x.length();
        for(int i=0;i<l;i++){
            if(i!=l-1&&m.containsKey(x.substring(i,i+2))){
                result+=m.get(x.substring(i,i+2));
                i++;
            }
            else {
                String c=x.substring(i,i+1);
                result+=m.get(c);
            }
        }
        return result;
    }
}