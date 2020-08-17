package design.chain;

public class UserB extends User {

    public UserB(User next) {
        super(next);
    }

    @Override
    public void chain(int level) {
        if (level>70&&level<81){
            System.out.println("[B级鉴定师]鉴定结果为:魂圣境界");
        }else {
            if (this.getUser()!=null){
                getUser().chain(level);
            }else {
                System.out.println("年轻人，鉴定结束了努力每年再来吧。");
            }
        }
    }

}
