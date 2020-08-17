package design.chain;

public class UserD extends User {

    public UserD(User next) {
        super(next);
    }

    @Override
    public void chain(int level) {
        if (level>50&&level<61){
            System.out.println("[D级鉴定师]鉴定结果为:魂王境界");
        }else {
            if (this.getUser()!=null){
                getUser().chain(level);
            }else {
                System.out.println("年轻人，鉴定结束了努力每年再来吧。");
            }
        }
    }
}
