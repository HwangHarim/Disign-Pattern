package chain_of_responsibility_patten.ex;

public interface CommandFilter {
    void doFilter(Request request, FilterChain next) throws Exception;
}
