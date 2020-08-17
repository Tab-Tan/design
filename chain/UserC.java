package design.chain;

public class UserC extends User {

    public UserC(User next) {
        super(next);
    }

    @Override
    public void chain(int level) {
        if (level>60&&level<71){
            System.out.println("[C级鉴定师]鉴定结果为:魂帝境界");
        }else {
            if (this.getUser()!=null){
                getUser().chain(level);
            }else {
                System.out.println("年轻人，鉴定结束了努力每年再来吧。");
            }
        }
    }
}
