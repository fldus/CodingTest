import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> parking = new HashMap<>();
        HashMap<String, Integer> last = new HashMap<>();
        
        for(String str : records){
            String[] arr = str.split(" ");
            
            if(arr[2].equals("IN")){
                last.put(arr[1], getMinute(arr[0]));
            }else{
                int time = getMinute(arr[0]) - last.get(arr[1]);
                parking.put(arr[1], parking.getOrDefault(arr[1], 0) + time);
                last.remove(arr[1]);
            }
        }
        // 출차 기록 x
        for(String car : last.keySet()){
            int time = getMinute("23:59") - last.get(car);
            parking.put(car, parking.getOrDefault(car, 0) + time);
        }
        
        List<String> key = new ArrayList<>(parking.keySet());
        Collections.sort(key);
        
        int[] answer = new int[key.size()];
        for(int i=0; i<key.size(); i++){
            String car = key.get(i);
            int total = parking.get(car);
            
            answer[i] = fees[1];
            
            if(total > fees[0]){
                int over = total - fees[0];
                answer[i] += (int)Math.ceil((double)over / fees[2]) * fees[3];
            }
        }
        
        return answer;
    }
    
    int getMinute(String time){
        String[] tmp = time.split(":");
        return Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
    }
}