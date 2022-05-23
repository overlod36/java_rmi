package client;

import compute.Task;

import java.io.Serializable;
import java.util.ArrayList;

public class Algo implements Task<ArrayList<Integer>>, Serializable {

    private String[] args;

    public Algo(String[] args){
        this.args = args;
    }

    public boolean checking(String str) {
        try {
            int x = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public ArrayList<Integer> execute() {
        ArrayList<Integer> res = new ArrayList();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i=1; i < args.length; i++){
            if (checking(args[i]) == false){
                continue;
            }
            if (Integer.parseInt(args[i]) < 0 && Integer.parseInt(args[i]) % 2 == 0){
                cnt1++;
            }
            else if (Integer.parseInt(args[i]) > 0 && Integer.parseInt(args[i]) % 2 != 0){
                cnt2++;
            } 
        }
        res.add(cnt1);
        res.add(cnt2);
        return res;
    }
}
