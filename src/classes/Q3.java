package classes;

public class Q3 {
    public String current_mode = "NORMAL";
    public String current_state = "TIME";
    public int m=0, h=0, D=27, M=5, Y=2001; //my birthdate XD
    public String[] input(char input){
        if(current_mode.equals("NORMAL")) {
            if (input == 'c') {
                current_mode = "UPDATE";
                current_state = "min";
            }
            if (input == 'b') {
                current_mode = "ALARM";
                current_state = "Alarm";
            }
            if (input == 'a') {
                if (current_state.equals("TIME")) {
                    current_state = "DATE";
                } else {
                    current_state = "TIME";
                }
            }
        }
        if(current_mode.equals("UPDATE")) {
            if (input == 'd') {
                current_mode = "NORMAL";
                current_state = "TIME";
            }
            if (input == 'a') {
                if (current_state.equals("year")) {
                    current_mode = "NORMAL";
                    current_state = "TIME";
                }
                if (current_state.equals("month")) {
                    current_state = "year";
                }
                if (current_state.equals("day")) {
                    current_state = "month";
                }
                if (current_state.equals("hour")) {
                    current_state = "day";
                }
                if (current_state.equals("min") ) {
                    current_state = "hour";
                }
            }
            if (input == 'b') { //reset each variable if exceed max limit
                if (current_state.equals("min")) {
                    m++;
                    if (m >= 60) {
                        m = 0;
                    }
                }
                if (current_state.equals("hour")) {
                    h++;
                    if (h >= 24) {
                        h = 0;
                    }
                }
                if (current_state.equals("day")) {
                    D++;
                    if (D > 31) {
                        D = 0;
                    }
                }
                if (current_state.equals("month")) {
                    M++;
                    if (M > 12) {
                        M = 0;
                    }
                }
                if (current_state.equals("year")) {
                    Y++;
                    if (Y > 2100) {
                        Y = 2000;
                    }
                }
            }
        }
        if(current_mode.equals("ALARM")){
            if (input == 'd') {
                current_mode = "NORMAL";
                current_state = "TIME";
            }
            if (input == 'a') {
                current_state = "Chime";
            }
        }
        return new String[]{current_mode, current_state, String.valueOf(Y) + "-" +
                String.valueOf(M) + "-" + String.valueOf(D), String.valueOf(h) + ":" +
                String.valueOf(m) };
    }
}
