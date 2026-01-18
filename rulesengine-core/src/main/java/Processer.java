import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Processer {
    private List<Rule> rules = new ArrayList<>();


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rules: \n");
        for(Rule rule:rules){
            sb.append("\trule: ").append(rule.getRule()).append("\n").append("\tCredit Score: ").append(rule.getCredit_score()).append("\n").append("\tCredit History: ").append(rule.getCredit_history()).append("\n").append("\tStatus: ").append(rule.getStatus()).append("\n");
        }
        return sb.toString();
    }
}
