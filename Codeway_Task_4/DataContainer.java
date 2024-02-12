package Task_4;

import java.util.Map;

public class DataContainer {
	
    private Map<String,String> ques;
    private Map<String,String> ans;
    
    public DataContainer(Map<String,String> map1,Map<String,String> map2){
        this.ques=map1;
        this.ans=map2;
    }
    public Map<String,String> getQues(){
        return ques;
    }
    public Map<String,String> getAns(){
        return ans;
    }
}

	
