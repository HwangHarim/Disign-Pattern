package chain_of_responsibility_patten.ex;

public interface FilterChain {
    void doFilter(Request request) throws Exception;
}
