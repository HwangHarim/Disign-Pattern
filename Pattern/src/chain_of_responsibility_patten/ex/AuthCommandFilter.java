package chain_of_responsibility_patten.ex;

public class AuthCommandFilter implements CommandFilter{
    @Override
    public void doFilter(Request request, FilterChain next) throws Exception {
        if(request.getCommandPath().equalsIgnoreCase("/login")
            || request.getContext().get("loginUser") != null) {
            next.doFilter(request);
        } else {
            System.out.println("로그인이 필요합니다.");
        }
    }
}
