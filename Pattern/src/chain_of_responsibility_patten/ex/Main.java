package chain_of_responsibility_patten.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputStr = "test";
        Map<String,Object> context = new HashMap<>();
        List<String> init =new ArrayList<>();
        init.add("testValue");
        context.put(inputStr,init);

      CommandFilterManager filterManager = new CommandFilterManager();
      filterManager.add(new AuthCommandFilter());
      filterManager.add(new DefaultCommandFilter());

      FilterChain filterChain = filterManager.getFilterChain();

        Request request = new Request(inputStr, context);

        // 필터들의 체인을 실행한다.
        if (filterChain != null) {
            filterChain.doFilter(request);
        }
    }
}
