package chain_of_responsibility_patten.ex;

public class CommandFilterManager {

    Chain firstChain;
    Chain lastChain;

    public void add(CommandFilter filter){
        Chain chain = new Chain(filter);
        if(lastChain == null){
            firstChain = lastChain = chain;
            return;
        }
        lastChain.nextChain = chain;
        lastChain =chain;
    }

    public FilterChain getFilterChain() {
      return firstChain;
    }

    private static class Chain implements FilterChain{
        CommandFilter filter;
        Chain nextChain;

        public Chain(CommandFilter filter){
            this.filter = filter;
        }

       @Override
        public void doFilter(Request request)throws Exception {
          filter.doFilter(request, nextChain);
        }
    }
}